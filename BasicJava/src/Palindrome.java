public class Palindrome {
    public static void checkPalindrome(int number){
        //Get the reverse of the number first
        if(number == ReverseNumber.reverse(number)){
            System.out.println("The number " + number + " is palindrome");
        }
        else{
            System.out.println("The number " + number + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome(1221);
        checkPalindrome(1421);
        checkPalindrome(1256521);
        checkPalindrome(41232981);
    }
}
