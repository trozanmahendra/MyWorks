package entities;

public class Department {
private String did;
private String dname;
private Employee[] emps;
public String getDid() {
	return did;
}
public void setDid(String did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Employee[] getEmps() {
	return emps;
}
public void setEmps(Employee[] emps) {
	this.emps = emps;
}
public void getDepartmentdetails() {
	System.out.println("\tDepartment Details"+"\n------------------------------------");
	System.out.println("Department ID         : "+did);
	System.out.println("Department Name       : "+dname);
	System.out.println();
	System.out.println("\tEmployee Details"+"\n------------------------------------");
	System.out.println("EID\tENAME     \tESAL\tEADDR"+"\n----------------------------------------------------");
	for(Employee emp : emps) {
		System.out.print(emp.getEid()+"\t");
		System.out.print(emp.getEname()+"\t");
		System.out.print(emp.getEsal()+"\t");
		System.out.print(emp.getEaddr()+"\t\n");
	}
	
	
	
}
}
