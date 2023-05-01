public class RotateList {
    public static Node  rotateByK(Node head, int k){
        Node current = head;
        Node prev = current;
        while(k != 1){
            prev = prev.next;
            k--;
        }
        Node temp = prev.next;
        prev.next = null;
        Node end = temp;
        while(end.next != null){
            end = end.next;
        }
        end.next = current;
        head = temp;

        /*
        Here we have to return the head because this head is a parameter variable and not the same
        head variable of the List.Since list has got new head node its value needs to be updated.
         */
        return head;
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(2);
        LL2.append(1);
        LL2.append(3);
        LL2.append(9);
        LL2.append(10);
        LL2.append(12);
        LL2.print();
        LL2.head = rotateByK(LL2.head,5);
        LL2.print();
    }
}
