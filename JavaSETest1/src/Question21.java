import java.sql.SQLOutput;

public class Question21 {
    public static void main(String[] args) {

        int a=0,num1=1,n3,i, num2=10;
        System.out.println(a+" "+num1);

        for(i=2;i<num2;++i) {

            n3=a+num1;
            System.out.print(" "+n3);
            a=num1;
            num1=n3;
        }


    }
}
