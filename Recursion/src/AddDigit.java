public class AddDigit {
    public static int addDigit(int num){
        if(num == 0){
            return 0;
        }
        return (num % 10) + addDigit(num/10);
    }

    public static void main(String[] args) {
        int num = 2691;
        System.out.println("Sum of digits in Number " + num + " is :" + addDigit(num));
    }
}
