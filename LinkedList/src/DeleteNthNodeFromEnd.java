public class DeleteNthNodeFromEnd {
    public static Node deleteFromEnd(Node head, int count){
        Node sp = head;
        Node fp = head;
        Node prev = null;
        while(count != 0){
            fp = fp.next;
            count--;
        }
        while(fp != null){
            prev = sp;
            sp = sp.next;
            fp = fp.next;
        }
        prev.next = sp.next;
        return head;
    }
    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(1);
        LL2.append(2);
        LL2.append(3);
        LL2.append(4);
        LL2.append(8);
        LL2.append(9);

        LL2.head = deleteFromEnd(LL2.head, 2);
        LL2.print();
    }
}
