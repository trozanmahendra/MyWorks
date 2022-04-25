package javaBeans;

class Employee {
private String Ename;
private int Esal;
private String Eid;
 private String Email;
 
//Mutator methods
 
public void setEname(String Enam) {
	Ename = Enam;	
}
public void setEsal(int Esa) {
	Esal = Esa;
}
public void setEid(String Ei) {
	Eid = Ei;
}
public void setEmail(String Emai) {
	Email = Emai;
}

//Accessor methods

public String getEname() 
{
	return Ename;
}
public int getEsal()
{
	return Esal;
}
public String getEid() 
{
	return Eid;
}
public String getEmail() {
	return Email;
}
}
