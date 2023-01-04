import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface FelineAnnot {
    int speed();
    String size();
}
