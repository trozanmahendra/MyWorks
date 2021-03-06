package annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Inherited
@Retention(RUNTIME)
@Target(METHOD)
public @interface Institute {
	String InsName() default "DURGASOFT";
	String InsAdress() default "HYDERABAD";

}
