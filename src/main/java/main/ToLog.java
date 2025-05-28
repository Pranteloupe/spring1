package main;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //allows to be intercepted during runtime
@Target(ElementType.METHOD) //targets set to only methods
public @interface ToLog {

}
