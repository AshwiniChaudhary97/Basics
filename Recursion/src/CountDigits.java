public class CountDigits {
    public static int countDigit(int number){
        if(number == 0){
            return 0;
        }
        return 1 + countDigit(number/10);
    }
    public static void main(String[] args) {
        int number = 54653654;
        System.out.println("Number of digits in " + number + " is :" + countDigit(number));

    }
}
