public class Question10 {
    public static void main(String[] args) {
        int[] numbers={8,5,6,4,7,9,2,3};
        int num1=0;

        for (int i = 0; i < numbers.length; i++) {
            for(int a= i+1; a<numbers.length;a++){
                if(numbers[i]<numbers[a]){
                    num1=numbers[i];
                    numbers[i]=numbers[a];
                    numbers[a]=num1;
                }
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
