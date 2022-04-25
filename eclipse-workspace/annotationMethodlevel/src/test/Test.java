package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import annotations.Institute;
import entity.Student;

public class Test {

	public static void main(String[] args)throws Exception {
		Student s= new Student("MG-123","MAHENDRA","KURNOOL");
		s.getStudentDetails();
		Class<?> cls=s.getClass();
		Method m=cls.getMethod("getStudentDetails");
		Annotation ann = m.getAnnotation(Institute.class);
		Institute ins=(Institute)ann;
		System.out.println();
		
		System.out.println("Institute Details"+"\n----------");
		System.out.println("Institute Name    :  "+ins.InsName());
		System.out.println("Institute Address :  "+ins.InsAdress());
		System.out.println();
		
	}

}
