package pack;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import pack.resource.SqlMapConfig;

//순수 자바에서 myBatis를 적용하기
public class DataDao {
	
	private static DataDao instance = new DataDao();
	
	public static DataDao getInstance() {
		return instance;  //singleton pattern 사용: 자기 스스로 new 했기 때문에 외부에서 DataDao.getInstance() 사용 가능
	}
	
	//SqlMapConfig.java -> Configuration.xml -> DataMapper.xml
	private SqlSessionFactory factory = SqlMapConfig.getSqlSession();  //factory로 DataMapper에 접근 가능
	
	//전체 읽기
	public List<SangpumDto> selectAll() throws SQLException{
		SqlSession session = factory.openSession();  //작업을 위해 session을 열고,
		List<SangpumDto> list = session.selectList("selectDataAll"); //DataMapper.xml의 id를 지적 가능
		session.close();  //작업이 끝나면 닫는다.
		return list;  //DataMapper의 selectDataAll이 복수 데이터를 리턴하므로 list로 반환.
	}
	
	public SangpumDto selectBubun(String keyCode) throws SQLException{
		SqlSession session = factory.openSession();  //작업을 위해 session을 열고,
		SangpumDto dto = session.selectOne("selectDataById", keyCode);  //select 하나만 읽을 때 사용하는 selectOne
		session.close();  //작업이 끝나면 닫는다.
		return dto;  //DataMapper의 selectDataById가 dto 하나의 데이터를 리턴하므로 dto로 반환.
	}
	
	
	public void insert(SangpumDto dto) throws SQLException{
		//commit이 수동인 경우
		SqlSession session = factory.openSession();  //작업을 위해 session을 열고,
		int re = session.insert("insertData", dto);  //DataMapper의 id와 파라미터 지정
		System.out.println(re + "행 추가했습니다.");
		session.commit(); //insert 후 commit한다. 반대로 session.rollback();도 가능하다.
		session.close();  //작업이 끝나면 닫는다.
	
	}
	public void update(SangpumDto dto) throws SQLException{
		SqlSession session = factory.openSession(true);  //commit이 자동
		session.update("updateData", dto);  //DataMapper의 id와 파라미터 지정
		session.close();  //작업이 끝나면 닫는다.
	}
	
	
	//삭제
		public int delete(String keyCode) throws SQLException{
			int result = 0;
			SqlSession session = factory.openSession();  //commit이 수동
			
			try {
				result = session.delete("deleteData", keyCode);  //DataMapper의 id와 파라미터 지정
				session.commit();  //성공하면 commit
			}catch (Exception e){
				System.out.println("delData err : " + e);
				session.rollback();  //실패하면 rollback
			}finally{
				if(session != null) session.close();  //성공하면 리턴값이 1이므로 닫는다.
			}
			
			return result;
		}
	
}