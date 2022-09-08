public class ReverseNumber {
    public static int reverse(int number){
        int reverse = 0;
        int temp = number;
        while(temp != 0){
            int remainder = temp % 10;
            reverse = reverse*10 + remainder;
            temp = temp/10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int number =2574625;
        System.out.println("the reverse of " + number + " is " + reverse(number));
    }
}
