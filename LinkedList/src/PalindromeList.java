public class PalindromeList {
    public static boolean palindromeList(Node head){
        Node current = head;
        int count = 0;
        boolean flag = false;
        while(current != null){
            current = current.next;
            count++;
        }
        int[] array = new int[count];
        current = head;
        for(int i = 0; i< array.length; i++){
            array[i] = current.data;
            current = current.next;
        }
        current = head;
        for(int j=array.length-1; j>=0; j--){
            if(current.data != array[j]){
                return false;
            }
            current = current.next;
        }
        return true;

    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(2);
        LL2.append(1);
        LL2.append(3);
        LL2.append(1);
        LL2.append(1);
        LL2.append(2);

        if(palindromeList(LL2.head)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
