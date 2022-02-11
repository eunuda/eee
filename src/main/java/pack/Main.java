package pack;

import java.util.List;

public class Main {
	public static void main(String args[]) throws Exception{
	
		
		System.out.println("전체 자료 읽기 ---");
		DataDao dataDao = DataDao.getInstance();
		List<SangpumDto> list = dataDao.selectAll();
		for(SangpumDto result:list) {
			System.out.println(result.getCode() + " "
					 		+ result.getSang() + " "
					 		+ result.getSu() + " "
					 		+ result.getDan());
		}
		System.out.println("부분 자료 1개 읽기 ---");
		String keyCode = "2";
		SangpumDto dto = DataDao.getInstance().selectBubun(keyCode);
		System.out.println(dto.getCode() + " "
					 	+ dto.getSang() + " "
					 	+ dto.getSu() + " "
					 	+ dto.getDan());
	}
}

//
//  System.out.println("자료 추가 ---");
//	SangpumDto dto = new SangpumDto();
//	dto.setCode("10");
//	dto.setSang("테이저건");
//	dto.setSu("38");
//	dto.setDan("1000");
//	dataDao.insert(dto);
//}
//
//System.out.println("자료 수정 ---");
//SangpumDto dto = new SangpumDto();
//dto.setCode("10");
//dto.setSang("장갑차");
//dataDao.update(dto);
//}
//
//System.out.println("자료 삭제 ---");
//String keyCode = "10";
//int imsi = dataDao.delete(keyCode);
//if(imsi > 0) {  //삭제 성공하면 리턴값이 1이므로
//	System.out.println("삭제 성공");
//}else {
//	System.out.println("삭제 실패");
//}
//}
//}
