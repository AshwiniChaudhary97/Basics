public class AlternateMergingList {
    public static void mergeAlternatively(Node head1, Node head2){
        Node next = head1.next;
        while(head1.next != null && head2 != null){
            head1.next = head2;
            head2 = head2.next;
            head1.next.next = next;
            head1 = next;
            next = head1.next;
        }
        if(head1.next == null){
            head1.next = head2;
        }
    }
    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(0);
        LL2.append(2);
        LL2.append(4);
        LL2.append(6);

        CreateList LL3 = new CreateList();
        LL3.append(1);
        LL3.append(3);
        LL3.append(5);
        mergeAlternatively(LL3.head,LL2.head);
        LL3.print();

    }
}
