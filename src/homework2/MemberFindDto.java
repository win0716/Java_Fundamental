package homework2;

public class MemberFindDto {
	private int seq;
	private String email;
	private String code;
	private String sdate;
	private String edate;
	
	
	//생성자 만들기
	public MemberFindDto(int seq, String email, String code, String sdate, String edate) {
		super();
		this.seq = seq;
		this.email= email;
		this.code = code;
		this.sdate = sdate;
		this.edate = edate;
		

	}
		//seq에 대하 setter 만들기
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public int getSeq() {
		return seq;
	}
	
	public void setEmail(String email) {
		this.email =email;
		
	}
	public String getEmail() {
		return email;
		
	}
	
	public void setCode (String code) {
		this.code = code;
		
	}
	public String getCode() {
		return code;
		
	}
	public void setSdate(String sdate) {
		this.sdate =sdate;
		
	}
	public String getSdate() {
		return sdate;
	}
	public void setEdate (String edate) {
		this.edate = edate;
		
	}
	public String getEdate() {
		return edate;
	}
	
	
	//seq에 대한 getter 만들기
	

}
