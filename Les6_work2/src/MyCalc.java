import java.lang.reflect.Method;
/**
 * @author Olena Kyrpych
 * @version 1.0
 * @since 30-12-2022
 */

public class MyCalc {

    public static void main(String[] args) throws NoSuchMethodException {
        Math myCalc = new Math();
        Class<?> cl = Math.class;
        Method method = cl.getDeclaredMethod("add", int.class, int.class);
        AnnotCalc annotCalc = method.getAnnotation(AnnotCalc.class);
        myCalc.add(annotCalc.num1(), annotCalc.num2());
        myCalc.sub(annotCalc.num1(), annotCalc.num2());
        myCalc.mult(annotCalc.num1(), annotCalc.num2());
        myCalc.div(annotCalc.num1(), annotCalc.num2());

    }


}
