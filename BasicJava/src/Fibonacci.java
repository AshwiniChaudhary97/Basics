public class Fibonacci {
  /*   -----------------------------  using a method -----------------------------
      public static long fibo(int targetTerm){
            int fiboTermCounter = 2;
            long first = 0;
            long last = 1;
            long current = 0;
            while(fiboTermCounter <= targetTerm) {
                current = first + last;
                first = last;
                last = current;
                fiboTermCounter++;
            }
            return current;
        }
   */

    /*   -----------------------------  using a method -----------------------------
         ------------------ Print fibonacci series till nth term --------------------
      public static void fibo(int targetTerm){
            int fiboTermCounter = 2;
            long first = 0;
            long last = 1;
            long current = 0;
            while(fiboTermCounter <= targetTerm) {
                current = first + last;
                first = last;
                last = current;
                fiboTermCounter++;
                System.out.println(current + " ");
            }
        }
   */

    public static void main(String[] args) {
    // ----------------------------------- without a method -------------------------------------
        int targetTerm = 50;
        int fiboTermCounter = 2;
        long first = 0;
        long last = 1;
        long current = 0;
        while(fiboTermCounter <= targetTerm) {
            current = first + last;
            first = last;
            last = current;
            fiboTermCounter++;
        }
        System.out.println("The " + targetTerm + "th fibo term " + "is " + current);
    }
}
