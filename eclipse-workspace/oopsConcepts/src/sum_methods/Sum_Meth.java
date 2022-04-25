package sum_methods;
class A{
	int add(int i,int j) {
		int result=i+j;
		return result;
	}
}
public class Sum_Meth {

	public static void main(String[] args) {
		A a=new A();
		int sum1=a.add(10,20);
		int sum2=a.add(10,20);
		int sum3=a.add(10,20);
		System.out.println(""+sum1+sum2+sum3);

	}

}
