package java_20190722;

public class Member {
	private String name;
	private String zipcode;
	private String addr1;
	private String addr2;
	private String ssn1;
	private String ssn2;
	private int age;
	private String regdate;
	
	//name => setter , getter 메서드
	//name에 대한 getter 메서드 => 인스턴스 name 정보를 가져올수 있는 메서드
	
	//name 에 대한 setter 메서드 => 인스턴스 name 정보를 변경할 수 있는 메서드 
	

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setAddr(String Addr1) {
		this.addr1 = addr1;
	}
	public String getAddr() {
		return addr1;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getSsn1() {
		return addr2;
	}
	public void setSsn1(String ssn1) {
		this.ssn1 = ssn1;
		
	}
	public String getSsn1() {
		return ssn1;
	}
	public void setSsn2(Sting Ssn2) {
		this.ssn2 = ssn2;
	}
	public String getSsn2() {
		return = ssn2;
	}
	public void setAge(int age) {
		this.age= age;
	
	}
	publoc String getAge() {
		return = age;
	}
}