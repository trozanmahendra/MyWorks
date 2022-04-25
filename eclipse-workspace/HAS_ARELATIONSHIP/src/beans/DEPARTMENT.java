package beans;

public class DEPARTMENT {
private String did;
private String dname;
 Employee[] emps;

public DEPARTMENT(String did,String dname,Employee[] emps) {
	
	this.did=did;
	this.dname=dname;
	this.emps=emps;	
}
public void getDepartmentdetails() {
	System.out.println("Department Details"+"\n-------------------------------");
	System.out.println("Department ID            :  "+did);
	System.out.println("Department NAME          :  "+dname);
	//System.out.println("Department EMPL0YEES     :  "+emps);
	System.out.println();
	System.out.println("Employee Details"+"\n------------------------------------------");
	System.out.println("EID\tENAME\t\tESAL\tEADDR");
	
	for(Employee emp : emps) {
		System.out.println(emp.eid+"\t"+emp.ename+"\t"+emp.esal+"\t"+emp.eaddr);
	}
}
}
