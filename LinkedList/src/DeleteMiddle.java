public class DeleteMiddle {
    public static void deleteMiddle(Node head){
        if(head ==null){
        }
        else if(head.next == null){
            head = null;
        }
        else {
            Node prev = null;
            Node slowPtr = head;
            Node fastPtr = head;
            while (fastPtr != null && fastPtr.next != null) {
                prev = slowPtr;
                slowPtr = slowPtr.next;
                fastPtr = fastPtr.next.next;
            }
            prev.next = slowPtr.next;
        }
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(15);
        LL2.append(16);
        LL2.append(17);
        LL2.append(18);
        LL2.append(19);

        deleteMiddle(LL2.head);
        LL2.print();
    }
}
