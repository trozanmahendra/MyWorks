package lombok1;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class test {
	String name;
	float sal;
	int id;
	public static void main(String[] args) {
		test t = new test();
		t.setId(123);
		t.setName("mahendra");
		t.setSal(123.345f);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getSal());

	}

}
