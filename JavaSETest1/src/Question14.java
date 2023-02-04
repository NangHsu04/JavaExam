import java.util.Arrays;
import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        System.out.println("Size of array:");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        int array[]=new int[num];
        int num1=0;

        System.out.println("Enter the elements");

        for(int i=0;i<num;i++){
            array[i]=sc.nextInt();
            num1=num1+array[i];

        }
        System.out.println("Array: "+ Arrays.toString(array));
        System.out.println("Sum of all the elements: " +num1);
    }
}
