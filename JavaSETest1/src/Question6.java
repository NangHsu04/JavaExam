public class Question6 {
    public static void main(String[] args) {
        String fruit="Watermelon";
        switch(fruit){
            case "strawberry":
                System.out.println(fruit+ " is not my favourite fruit");
                break;
            case "banana":
                System.out.println(fruit+" is not my favourite" );
                break;
            case"Grape" :
                System.out.println(fruit+" is still not my favourite");
                break;
            case"Watermelon":
                System.out.println(fruit+ " is my favourite fruit");
                break;
            default:
                System.out.println("Not correct answer");
        }
    }
}
