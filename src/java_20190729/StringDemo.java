package java_20190729;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = new String ("test");
		String s2 = new String ("test");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s3 = "abc";
		String s4 = "abc";
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		String sql = "djalkdsjklm dsjdkjd, djlksjl, djskljdsl,";//xxxxxxxxxxxxxxxxx
		sql += "djsklajdajkl,ddsds,";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		sql += "";//xxxxxxxxxxxxxxxxx
		
				
				
		
		String ssn = "111111-1111118";
		char c =ssn.charAt(6);
		System.out.println(c);
		
		ssn = ssn.concat("abcd");// ssn+("abcd");
		System.out.println(ssn);
		
		String fileName = "abd.abc.abc.abc.dddddd.doc";
		if(fileName.endsWith("zip")) {
			System.out.println("압축파일 입니다.");
		}else if(fileName.endsWith("dos")) {
			System.out.println("워드 문서 입니다.");
		}else {
			System.out.println("파일 입니다.");
		}
		System.out.println(fileName.equalsIgnoreCase("ABD.Doc"));
		
		int index = ssn.indexOf("-");
		System.out.println(index);
		System.out.println(fileName.indexOf("."));
		System.out.println(fileName.lastIndexOf("."));
		
		//111111-1111118
		String first = ssn.substring(0,ssn.indexOf("-"));//뒤 6은 포함하지 않는다
		String second =  ssn.substring(ssn.indexOf("-")+1);// 특정한 기호를 기점으로 오른쪽 왼쪽으로 나눈다 
		System.out.println(first);
		System.out.println(second);
		
		String fil = fileName.substring(0,fileName.lastIndexOf("."));//뒤 6은 포함하지 않는다
		String se = fileName.substring(fileName.lastIndexOf(".")+1);// 특정한 기호를 기점으로 오른쪽 왼쪽으로 나눈다 
		System.out.println(fil);
		System.out.println(se);
		
	}
	
}


