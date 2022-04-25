package oopsConcepts;
class employinfo1{
	static class emply{
		String name="Mahendra Goud....";
		String  eid="m110";
		String email="trozanmahendra@gmail.com";
		String esal="1,00,000/-PM";
		public void employ() {
			System.out.println("EMPLOYEE INFORMATION\n"+"--------------------");
			System.out.println("NAME       :\t "+name);
			System.out.println("eid        :\t "+eid);
			System.out.println("email      :\t "+email);
			System.out.println("esal       :\t "+esal);
			}	
	}
	}
class teacher extends employinfo1.emply{
	String name="BHARATH Goud....";
	String  eid="B510";
	String email="BARATH@gmail.com";
	String esal="1,00,000/-PM";
	public void employ1() {
		System.out.println("EMPLOYEE INFORMATION\n"+"--------------------");
		System.out.println("NAME       :\t "+name);
		System.out.println("eid        :\t "+eid);
		System.out.println("email      :\t "+email);
		System.out.println("esal       :\t "+esal);
		
		}
}
public class employ2 {
	public static void main(String[] args) {
		//employinfo1.emply emp=new employinfo1.emply();
		teacher emp1=new teacher();
		emp1.employ();
		emp1.employ1();
		}
	}


