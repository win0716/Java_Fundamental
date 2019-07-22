package java_20190722_Practice;

public class Practice2 {
	public static void main(String[] agrs) {
		Practice p1 = new Practice();
		p1.setSeq(1);
		p1.setGroup(1);
		p1.setName("MBE");
		p1.setPrice(580);
		p1.setStatus("1");
		p1.setSdate("2019-07-22");
		p1.setEdate("2019-01-22");
		p1.setRegdate("2019-07-22");
		p1.setValid(true);
		
		System.out.println(p1.getSeq());
		System.out.println(p1.getGroup());
		System.out.println(p1.getName());
		System.out.println(p1.getPrice());
		System.out.println(p1.getStatus());
		System.out.println(p1.getSdate());
		System.out.println(p1.getEdate());
		System.out.println(p1.getRegdate());
		System.out.println(p1.isValid());
		
	}

}
