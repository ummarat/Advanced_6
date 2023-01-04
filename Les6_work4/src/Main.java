import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        Class<?> cl = Sum.class;
        try {
            Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
            Math math = method.getAnnotation(Math.class);
            sum.mathSum(math.num1(), math.num2());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}

class Sum {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}