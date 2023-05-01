public class FinfMiddle {
    public static Node findMiddle(Node head){
        Node slowPtr = head;
        Node fastPtr = head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();

        LL2.append(15);
        LL2.append(16);
        LL2.append(17);
        LL2.append(18);
        LL2.append(19);

        System.out.println(findMiddle(LL2.head).data);
    }
}
