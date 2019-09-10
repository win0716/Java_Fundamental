package homeWork;

public class MemberDto {
	private int seq;
	private String id;
	private String password;
	
	public MemberDto(int seq, String id, String password) {
		super();
		this.seq =seq;
		this.id=id;
		this.password = password;
	}
	public int getSeq() {
		return seq;
	}
	
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id=id;
	}
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
