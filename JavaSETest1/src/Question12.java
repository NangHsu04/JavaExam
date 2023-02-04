import java.util.Arrays;

public class Question12 {
    public static void main(String[] args) {

        int[] numbers={9,5,7,3,14,51,16,54,74,10};

        int num1=1;
        for (int i = num1; i < numbers.length; i++) {
            numbers[i]=numbers[i+1];

        }
        System.out.println("After removing a number "+ Arrays.toString(numbers));
    }
}

