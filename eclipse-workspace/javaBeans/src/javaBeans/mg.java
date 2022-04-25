package javaBeans;

class mg {
	void mg()
	{
		Employee e= new Employee();
		e.setEname("MAHENDRA");
		e.setEid("m110");
		e.setEsal(100000);
		e.setEmail("trozanmahendra@gmail.com");
		System.out.println("\tMahendra details\n"+"-----------------------------------------------");
		System.out.println("NAME         :  "+e.getEname());
		System.out.println("ID           :  "+e.getEid());
		System.out.println("SALARY       :  "+e.getEsal());
		System.out.println("MAIL ADDRESS :  "+e.getEmail());
	}
	
}
