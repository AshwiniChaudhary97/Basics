public class PrimeNumber {
    public static boolean isPrime(int number){
        int index = 2;
        boolean flag = true;
        while(index <= number/2){
            if(number % index == 0){
                flag = false;
                return flag;
            }
            index++;
        }
        return flag;

    }

    public static void main(String[] args) {
        int number = 26479;
        if(isPrime(number)){
            System.out.println(number + " is prime");
        }
        else System.out.println(number + " not a prime");

    }
}
