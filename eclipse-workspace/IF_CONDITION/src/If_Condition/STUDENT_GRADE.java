package If_Condition;
import java.util.*;

public class STUDENT_GRADE {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("\tSTUDENT GRADE ANALYSIS\n"+"---------------------------------------------");
		System.out.println("enter the student percentage");
		double p=s.nextDouble();
		if (p<55) {
			System.out.println("FAILED");
			
		}else if(p>=55 && p<60) {
			System.out.println("grade of the student for the given ----- "+p+"% --- is   D");
		}else if(p>=60 && p<70) {
			System.out.println("grade of the student for the given  ------"+p+"%----  is   C");
		}else if(p>=70 && p<85) {
			System.out.println("grade of the student for the given ---- "+p+"% ---- is   B");
		}else if(p>=85 && p<90) {
			System.out.println("grade of the student for the given ---- "+p+"%----- is   A2");
		}else if(p>=90 && p<=100) {
			System.out.println("grade of the student for the given  ----"+p+"% ------ is   A1");
		}else {
			System.out.println("GIVEN PERCENTAGE OF STUDENT IS INVALID PLEASE GIVE THE CORRECT ONE IN BETWEEN 0 & 100 ONLY");
		}
		

	}

}
