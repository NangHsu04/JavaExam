import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] numbers=new int[8];

        int num1=2;
        int num2;

        for (int i = 1; i < numbers.length; i++) {
            num2=num1*i;

            System.out.println(numbers[i]=num2);
        }
        System.out.println("The result is "+ Arrays.toString(numbers));
    }
}
