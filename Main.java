import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Подзадание 1:");
        Calculator calc = new Calculator();
        int a = 2;
        int b = 7;
        String max = calc.max(a, b);
        System.out.println("a = " + a + " b = " + b);
        System.out.println(max);
        System.out.println(a + " + " + b + " = " + calc.addition(a, b));
        System.out.println(a + " - " + b + " = " + calc.subtraction(a, b));
        System.out.println(a + " * " + b + " = " + calc.multiplication(a, b));
        System.out.println(a + " / " + b + " = " + calc.division(a, b));

        System.out.println("Подзадание 2:");
        St string = new St();
        String firstLine = "Нижний";
        String secondLine = "Новгород";
        String thirdLine = "Нижний";
        System.out.println(firstLine + " - " + secondLine);
        System.out.println(string.compare(firstLine, secondLine));
        System.out.println(firstLine + " - " + thirdLine);
        System.out.println(string.compare(firstLine, thirdLine));
    
        System.out.println("Подзадание 3:");
        ArrayService array = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array.getEvenNumbers(arr)));
}
}