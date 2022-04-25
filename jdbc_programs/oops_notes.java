Agenda:
=======
Data Hiding
Abstraction 
Encapsulation
Tightly encapsulated class
IS-A relationship
HAS-A relationship
Method Signature
Overloading
Overriding
Method Hiding
static control flow
instance control flow
constructors
coupling
cohesion
object typecasting
=================








Our internal data should not go our directly. i.e outside person is not allowed  to access our internal data directly. This concept is nothing but data hiding.


eg:
Eventhough we are valid customer of ICICI Bank , after providing username and pwd only we can access our account information.


by    (variable) as private we can implement data hiding.



public class Account
{
	private double balance;
	;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
	public double getBalance()
	{
		// validation
		return balance;
	}
}

The main advantage of data hiding is security.


Note:
====
The recommonded modifier for data members(variables) is private.


Abstraction:
========










Highlate the set of services what we are offering is nothing but abstraction.


eg:
 though Bank ATM GUI Screen, bank  people are highlating the set of services what they are offering, without highlating internal implementation


The main advantages of abstraction are 
 
 1. We can achieve security b'z we are not highlating our internal implmentation
 
 2. ENHANCEMENT will become easy
 3. 




By using interfaces and abstract classes we can implement 


















Bank people will 









through interfaces and abstract classes we can 










class Student
{
	Student data(like name,rollno,marks etc..)
            +	
	Behaviour(Methods)
}














Java exception Hierarchy




An interface can extend any number of interfaces at a time.








It consists of method name follwed by 



























these things we are not required to check..































	                 
Encapsulation = Data Hiding + Abstraction






The main advantage of  























easyness to use our system...













































Tightly encapsulated class
======================


















getter and setter methods or not and whether these methods declared as public or not, we are not required to check..


















class Account
{
	private double balance;
	public double getBalance()
	{
		return balance;
	}
}














class A
{
	private int x = 10;
}
class B extends A
{
	int y = 20;
}
class C extends A
{
	private int z = 30;
}












class A
{
	 int x = 10;
}
class B extends A
{
	private int y = 20;
}
class C extends B
{
	private int z = 30;
}

Note :
















IS-A  Relationship:
===============


























================
class P
{
	public void m1()
	{
	}
}
class C extends P
{
	public void m2()
	{
	}
}
class Test
{
	public static void main(String[] args)
	{
		P p  = new P();
		p.m1();
		p.m2(); 

		C c = new C();
		c.m1();
		c.m2();

		P p1 = new C();
		p1.m1();
		p1.m2();  

		C c1 = new P();
	}
}
conclusions:
===========


Hence on the 
























============
class A  extends B
{
	
}
class B extends A
{
}
==============
class A  extends A
{
	
}
=============
Has-A Relationship:
===============
-- Composition or Aggregation
--  No specific keyword
--- Reusab
 















department. Hence university and dept 





Within the department there may be a chance of several professors will work. With








holds directly contained objects

Container object just holds references of Contained Objects



IS-A  vs  HAS-A
=============












Standard relations. But use-a relation is 
































Method name  followed by argument types


















 class Test 
{
	public void m1()
	{
	}
	public int m1()
	{
		return 10;
	}
}













CE:m1() is already defined in Test


























lack of overloading in C increases complexity of 


abs(int)   -----for int type
labs(long)   -----for long type
fabs(float)   -----for float type




















having overloading concept in java reduces complexity of programming...










































early binding



















whether matched method is available or not
If it is 





































class Test
{
	public void m1()
	{
		System.out.println("no-arg");
	}
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
		t.m1(10);
		t.m1(10.5f);
		t.m1('a'); 
		t.m1(10L); 
		t.m1(10.5);
    }
}



whether the matched method is 


then only we will get CE












class Test
{
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1(10);
		t.m1(10.5f);
		t.m1('a'); 
		t.m1(10L); 
				
    }
}






































class Test
{
	public void m1(String s)
	{
		System.out.println("String version");
	}
	public void m1(Object o)
	{
		System.out.println("Object version");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1("durga"); 
		t.m1(new Object()); 
		t.m1(null); 
	}
}























1. In overloading exact match will get high priority
2. In overloading child class argument will get more priority than parent class argument


















===================
class Test
{
	public void m1(String s)
	{
		System.out.println("String version");
	}
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer version");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1("durga");
		t.m1(new StringBuffer("durga")); 
		t.m1(null); 
	}
}
================================






class Test
{
	public void m1(int i,float f)
	{
		System.out.println("int-float version");
	}
	public void m1(float f, int i)
	{
		System.out.println("float-int version");
	}
	public static void main(String[] args)
	{
	    Test t = new Test();
		t.m1(10,10.5f); 
		t.m1(10.5f,10); 
		t.m1(10,10); 
		t.m1(10.5f,10.5f); 			                               
	}
}
=============================











class Test
{
	public void m1(int i)
	{
		System.out.println("General Method");
	}
	public void m1(int... i)
	{
		System.out.println("Var-arg Method");
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1(); 
		t.m1(10,20);
		t.m1(10);
	}
}



least priority. i.e if no other method matched then only var-arg method will get the chance.
It is exactly same as default 









Compile Time polymorphism
Static
early binding





















to redefine that method based on its requirement. 
Overriding 



















Runtime polymorphism
Dynamic Polymorphism
Late Binding





















Dynamic Method Dispatch






































method signatures must be same 



































co-varient 











































stop availability of parent method implementation to the next level child classes...

























wont keep any restrictions in overriding 


synchronized
native
strictfp




















==========================
class P 
{
	public Object m1()
	{
		return null;
	}
}
class C extends P 
{
	public String m1()
	{
		return null;
	}
}
=================
	 class P 
{
	public  void m1()
	{
	}
}
abstract class C extends P 
{
	public abstract void m1();
}
=========
class P 
{
	public  void m1()
	{
	}
}
 class C extends P 
{
	protected  void m1()
	{
	}
}











It seems overriding concept is applicable for 
 and it is method hiding...




















================= 
class P 
{
	public static void m1() 
	{
	}
}
 class C extends P 
{
	public static void m1()	 
	{
	}
}
=====================
class P 
{
	public  void m1(int... i) 
	{
		System.out.println("parent");
	}
}
 class C extends P 
{
	public  void m1(int i) 
	{
		System.out.println("child");
	}
}
class Test
{
	public static void main(String[] args)
	{
		P p = new P();
		p.m1(10);

		C c = new C();
		c.m1(10);

		P p1 = new C();
		p1.m1(10);
	}

}
==================
class P 
{
	 int x = 888;
}
 class C extends P 
{
	 int x = 999;
}
class Test
{
	public static void main(String[] args)
	{
		P p = new P();
		System.out.println(p.x);

		C c = new C();
		System.out.println(c.x);

		P p1 = new C();
		System.out.println(p1.x);
	}

}		


only method names (Must be same) and Argument Types(Must be different).The remaining things like return type, access modifiers etc are not required to check..

        But in overriding every thing we have to check like method names,argument types,return type etc..


         

















Q: Consider the following method declaration in parent class 


P: public void m1(int i) throws IOException

which of the following methods we can take in child class


1. public void m1(int i) 
2. private void m1(int i) throws IOException
3.public void m1(int i) throws Exception
4. private long m1() throws Exception
5. public static void m1(double d) throws IOException
6.public abstract static void m1() ;












































A BOY starts LOVE with the word FRIENDSHIP, but GIRL ends LOVE with the same word FRIENDSHIP. Word is the same but   attitude is different. This beautiful  concept of OOPS is nothing but polymorphism...




















static control flow:
================
























as part of static control flow




1. Identification of static members from top to bottom(1 to 6)
2. Execution of static variable assignments and static blocks from top to bottom(7 to 12)
3. Execution of main method (13 to 15)















































1. Identification of static members from parent to child(1 to  11)
2. Execution of Static variable assignments and static blocks from Parent to child (12 to 22)
3. Execution of only child class main method (23 to 25)


---





























1. Identification of instance members from top to bottom(3 to 8)
2. Execution of instance variable assignments and instance blocks from top to bottom ( 9 to 14)
3. Execution of constructor(15)







Instance control flow in Parent to child relation:
======================================= 




































1. Identification of instance members from Parent to Child( 4 to 14)
2. Execution of instance variable assignments and instance blocks only in Parent class (15 to 19)
3. Execution of Parent class constructor(20)
4. Execution of instance variable assignments and instance blocks  in Child class(21 to 26)
5. Execution of Child class constructor(27)






	









In How Many ways we can get Object in java????
=========================================

































(like incrementing count variable, update one entry in the db etc..)





to track number of objects created for  a class
(To describe importance of instance block)



















1. The main purpose of the constructor is to create object
2. The main purpose of the constructor is to initialize object
3. After creating object imme....
4.The name of the constructor need not be class name
5. return type concept applicable for constructor but only void
6. If we declare return type for the constructor then we will get CE
7. We can apply any modifier for constructor
8. 











this()






























Object o = new String("durga");
StringBuffer sb = (StringBuffer)o;



String s = new String("durga");
StringBuffer sb = (StringBuffer)s;











Singleton classes:
================






















Runtime
BusinessDelegate
ServiceLocator
ActionServlet




Advantage of Singleton classes:
===========================


































class Test
{
	private static Test t = null;
	private Test(){}
	public static Test getTest()
	{
		if(t == null)
			t = new Test();
		return t;
	}
}
class Client 
{
	public static void main(String[] args) 
	{
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}
}






class Test
{
	private static Test t1 = null;
	private static Test t2 = null;
	private Test(){}
	public static Test getTest()
	{
		if(t1 == null)
		{
			t1 = new Test();
			return t1;
		}
		else if(t2 == null)
		{
			t2 = new Test();
			return t2;
		}
		else if(Math.random()<0.5)
			return t1;
		else
			return t2;
	}
}

class Client 
{
	public static void main(String[] args) 
	{
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
		System.out.println(Test.getTest().hashCode());
	}
}




any xxxton classes(like tripleton, tenton etc..)





connection pools  and thread pools 








































Coupling:
========



























1. The name of the constructor need not be same as name of the class.
2. 





















Type Casting:
===========






















singleton





import java.io.*;
import java.lang.reflect.*;
class Demo implements Cloneable,Serializable
{
	private static Demo d = null;
	private Demo()
	{
		if( d != null)
		{
			throw new IllegalStateException("Object already created");
		}
	}
	public synchronized static Demo getInstance()
	{
		if(d == null)
		{
			d = new Demo();
		}
		return d;
	}
	public Object clone()
	{
		return d;
	}
	public Object readResolve()
	{
		return d;
	}
}
class Test 
{
	public static void main(String[] args)  throws Exception
	{
		//Demo d1 = new Demo();--->CE:

		Demo d1 = Demo.getInstance();
		System.out.println(d1.hashCode());
		Demo d2 = Demo.getInstance();
		System.out.println(d2.hashCode());

		Demo d3 = (Demo)d1.clone();
		System.out.println(d3.hashCode());

		FileOutputStream fos= new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);

		FileInputStream fis= new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
        Demo d4 = (Demo)ois.readObject();
		System.out.println(d4.hashCode());

		
		Class c = Class.forName("Demo");
		Constructor[] c1 = c.getDeclaredConstructors();
		Constructor c2 = c1[0];
		c2.setAccessible(true);
		Demo d5 = (Demo)c2.newInstance();
		System.out.println(d5.hashCode());
	}
}

























