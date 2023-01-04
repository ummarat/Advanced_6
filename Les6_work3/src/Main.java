import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            Feline feline = new Feline();
            Pet pet = new Pet();
            Wild wild = new Wild();

            String s = (char) 27 + "[31m";
            String s1 = (char) 27 + "[34m";

            if (feline.getClass().getAnnotations().length > 0) {
                System.out.println(s + "В класі 'Feline' застосовуються наступні анотації: ");
                for (Annotation annotation : feline.getClass().getAnnotations()) {
                    System.out.println(s1 + annotation);
                }
                Method[] methods = feline.getClass().getMethods();
                for (Method m : methods) {
                    Annotation[] methAnnot = m.getAnnotations();
                    for (Annotation annotation : methAnnot) {
                        System.out.println(" " + annotation);
                    }
                }
            } else {
                System.out.println(s + "В класі 'Feline' не застосовуються анотації");
            }

            if (pet.getClass().getAnnotations().length > 0) {
                System.out.println(s + "В класі 'Pet' застосовуються наступні анотації: ");
                for (Annotation annotation : pet.getClass().getAnnotations()) {
                    System.out.println(s1 + annotation);
                }
                Method[] methods = pet.getClass().getMethods();
                for (Method m : methods) {
                    Annotation[] methAnnot = m.getAnnotations();
                    for (Annotation annotation : methAnnot) {
                        System.out.println(" " + annotation);
                    }
                }
            } else {
                System.out.println("В класі 'Pet' не застосовуються анотації");
            }
            if (wild.getClass().getAnnotations().length > 0) {
                System.out.println(s + "В класі 'Wild' застосовуються наступні анотації: ");
                for (Annotation annotation : wild.getClass().getAnnotations()) {
                    System.out.println(s1 + annotation);
                }
                Method[] methods = wild.getClass().getMethods();
                for (Method m : methods) {
                    Annotation[] methAnnot = m.getAnnotations();
                    for (Annotation annotation : methAnnot) {
                        System.out.println(" " + annotation);
                    }
                }
            } else {
                System.out.println("В класі 'Wild' не застосовуються анотації");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}