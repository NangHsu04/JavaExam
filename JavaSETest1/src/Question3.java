public class Question3 {
    public static void main(String[] args) {
        int[] numbers={16,41,26,34,98,12};

        int largestNum=0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>largestNum){
                largestNum=numbers[i];
            }

        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
        System.out.println("The largest number is "+ largestNum);
    }

}

