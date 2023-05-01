public class ReverseList {
    public static Node reverseList(Node head){
        Node prev = null;
        Node current = head;
        Node next = current.next;
        while(next != null){
            current.next = null;
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }
        if(next == null){
            current.next = prev;
        }
        head = current;
        return head;
    }
    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(13);
        LL2.append(3);
        LL2.append(-3);
        LL2.append(-13);
        LL2.append(43);
        LL2.append(93);
        LL2.print();
        LL2.head = reverseList(LL2.head);
        LL2.print();

    }
}
