public class PalindromicNodeReversal {
    public static boolean isPalin(Node head){
        Node mid = FinfMiddle.findMiddle(head);
        Node left = mid.next;
        mid.next = null;
        Node end = left;
        left = ReverseList.reverseList(left);
        end.next = mid;
        Node i = head;
        Node j = left;
        while(i != null){
            if(i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(2);
        LL2.append(1);
        LL2.append(3);
        LL2.append(1);
        LL2.append(2);
        LL2.append(2);
        LL2.print();

        if(isPalin(LL2.head)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
}
