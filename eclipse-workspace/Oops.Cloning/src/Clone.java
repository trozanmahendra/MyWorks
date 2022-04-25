class Account{
	String accname;
	String accno;
	Account(String accname,String accno){
		this.accname=accname;
		this.accno=accno;
	}
}
class Employee implements Cloneable{
	String ename;
	String esal;
	Account acc;
	Employee(String ename,String esal,Account acc){
		this.ename=ename;
		this.esal=esal;
		this.acc=acc;
		}
	public void getempdetails() {
		System.out.println("Employee Name         : "+ename);
		System.out.println("Employee Salary       : "+esal);
		System.out.println();
		System.out.println("Employee Account Details "+"\n-------------------------------------------");
		System.out.println("Account no            : "+acc.accno);
		System.out.println("Account name          : "+acc.accname);
	}
	public Object clone()throws CloneNotSupportedException {
		Object obj=super.clone();
		return obj;
	}
}
public class Clone {
	public static void main (String[] asd)throws CloneNotSupportedException {
		
		Account originalacc= new Account("sbi-savings","33540642653");
		Employee originalemp = new Employee("Mahendra","60000",originalacc);
		System.out.println("original emplyoee obj is  : "+originalemp);
		System.out.println("original account obj is   : "+originalemp.acc);
		System.out.println("----------------------------------------------");
		originalemp.getempdetails();
		System.out.println("----------------------------------------------");
		Employee dupemp = (Employee)originalemp.clone();
		System.out.println("duplicate employee obj is  : "+dupemp);
		System.out.println("duplicate account obj is   : "+dupemp.acc);
		System.out.println("----------------------------------------------");
		dupemp.getempdetails();
		
	}

}
