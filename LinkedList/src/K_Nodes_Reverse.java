public class K_Nodes_Reverse {

    public static Node reverse_K_nodes(Node head){
        if(head == null){
            return null;
        }
        Node start = head;
        int count = 1;
        Node end = start;
        //we will first find the 4th node of the group
        while(count != 4 && end != null){
            count++;
            end = end.next;
        }

        if(end != null) {
            Node left = end.next;
            end.next = null;
            end = start;
            start = ReverseList.reverseList(start);
            end.next = reverse_K_nodes(left);
        }
        else if(end == null){
            end = start;
            start = ReverseList.reverseList(start);
        }
        return start;
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(1);
        LL2.append(2);
        LL2.append(3);
        LL2.append(4);
        LL2.append(8);
        LL2.append(9);

        LL2.head = reverse_K_nodes(LL2.head);
        LL2.print();
    }
}
