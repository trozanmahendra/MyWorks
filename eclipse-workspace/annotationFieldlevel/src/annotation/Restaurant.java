package annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Inherited
@Documented
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface Restaurant {
	String rname() default "MG-Foods";
	String rtype() default "veg & non-veg";
	String rwebsite() default "www.mgfoods.in";

}
