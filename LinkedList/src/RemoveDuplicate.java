public class RemoveDuplicate {
    public static void removeDuplicate(Node head){
       Node current = head;

       while(current != null){
           Node prev = current;
           Node second = current.next;
           while(second != null){
               if(second.data == current.data){
                   prev.next = second.next;
               }
               second = second.next;
               prev = prev.next;
           }
           current = current.next;
       }
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(15);
        LL2.append(16);
        LL2.append(16);
        LL2.append(18);
        LL2.append(18);
        LL2.append(19);
        LL2.append(20);
        LL2.append(19);
        LL2.append(11);

        removeDuplicate(LL2.head);
        LL2.print();
    }
}
