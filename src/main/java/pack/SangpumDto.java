 package pack;

public class SangpumDto {
	private String code;
	private String sang;
	private String su;
	private String dan;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getSang() {
		return sang;
	}
	public void setSang(String sang) {
		this.sang = sang;
	}
	public String getSu() {
		return su;
	}
	public void setSu(String su) {
		this.su = su;
	}
	public String getDan() {
		return dan;
	}
	public void setDan(String dan) {
		this.dan = dan;
	}
	public SangpumDto(String code, String sang, String su, String dan) {
		super();
		this.code = code;
		this.sang = sang;
		this.su = su;
		this.dan = dan;
	}
	@Override
	public String toString() {
		return "SangpumDto [code=" + code + ", sang=" + sang + ", su=" + su + ", dan=" + dan + "]";
	}

	
	


 

}