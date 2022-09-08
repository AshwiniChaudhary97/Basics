public class Factorial {
    public static int fact(int number){
        int index = 1;
        int fact = 1;
        while(index <= number){
            fact = fact * index;
            index++;
        }
        return fact;
    }
    public static void main(String[] args) {
        int number = 5;
        System.out.println("the factorial of " + number + " is " + fact(number));

    }
}
