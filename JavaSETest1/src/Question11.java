import java.util.Arrays;

public class Question11 {
    public static void main(String[] args) {
        int[] numbers={11,12,13,14,15};
        int[] array=new int[numbers.length];

        int a=14;
        int j=0;

        for (int i=0; i < numbers.length; i++) {
            if(numbers[i]!=a){
                array[j]=numbers[i];
                j++;
            }
        }
        System.out.println("After deleting a number "+ Arrays.toString(array));
    }
}
