package p1;

public class Emp1 {
	public String ID = "12236636";
	public String name = "mg   nhj  lk";

	public String getID() {
		if(ID.length() > 3) {
			throw new IllegalArgumentException();
		}
		return ID;
	}

	public void setID(String iD) {
		
		ID = iD;
	}

	public String getName() {
		if(!name.substring(3).equals("aaa")) {
			System.out.println(name.substring(3));
			throw new IllegalArgumentException();
		}
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
