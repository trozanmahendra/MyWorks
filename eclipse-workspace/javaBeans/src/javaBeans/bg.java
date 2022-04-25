package javaBeans;

class bg {
	void bg() {
		Employee e1= new Employee();
		e1.setEname("BHARATH");
		e1.setEid("B2310");
		e1.setEsal(100000);
		e1.setEmail("tBHAERTG@gmail.com");
		System.out.println("\n\tBharath details\n"+"-----------------------------------------------");
		System.out.println("NAME         :  "+e1.getEname());
		System.out.println("ID           :  "+e1.getEid());
		System.out.println("SALARY       :  "+e1.getEsal());
		System.out.println("MAIL ADDRESS :  "+e1.getEmail());
		
	}
	
}
