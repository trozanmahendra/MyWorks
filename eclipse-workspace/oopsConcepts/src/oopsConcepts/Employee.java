package oopsConcepts;
class employinfo{
	String name="1.Mahendra Goud";
	String  eid="m110";
	String email="trozanmahendra@gmail.com";
	String esal="1,00,000/-PM";
	public void getemployinfo() {
		System.out.println("EMPLOYEE INFORMATION\n"+"--------------------");
		System.out.println("NAME       :\t "+name);
		System.out.println("eid        :\t "+eid);
		System.out.println("email      :\t "+email);
		System.out.println("esal       :\t "+esal);
		
	}
	
}

public class Employee {

	public static void main(String[] args) {
		employinfo emp=new employinfo();
		emp.getemployinfo();

	}

}
