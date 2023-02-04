import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Enter your score");

        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();

        if(score<40){
            System.out.println("Fail");
        }

        else if(score>40 || score<80){
            System.out.println("Pass");
        }
    }
}

