package annitations;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Inherited
@Documented
@Retention(RUNTIME)
@Target(TYPE)
public @interface Bank {
	String bid() default "B111";

	String bname() default "SBI";

	String branch() default "KNL";

	String website() default "www.sbi.in/knl";

}
