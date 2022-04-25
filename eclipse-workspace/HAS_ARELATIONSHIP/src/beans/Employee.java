package beans;

public class Employee {
	 String eid;
	 String ename;
	 float esal;
    String eaddr;

    public Employee(String eid,String ename,float esal,String eaddr) {
    	this.eid= eid;
    	this.ename= ename;
    	this.esal=esal;
    	this.eaddr=eaddr;
        }
    /*public void getEmployeeDetais() {
    	System.out.println("Employee Details"+"\n------------------------------------------");
    	System.out.println("Employee ID         : "+eid);
    	System.out.println("Employee NAME       : "+ename);
    	System.out.println("Employee SALARY     : "+esal);
    	System.out.println("Employee ADDRESS    : "+eaddr);
    	
    }*/
}
