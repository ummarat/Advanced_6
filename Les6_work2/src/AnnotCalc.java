import java.lang.annotation.*;

/**
 * The interface calculate.AnnotCalc.
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotCalc {
    /**
     * @return the int
     */
    int num1() default 0;

    /**
     * @return the int
     */
    int num2() default 0;
}