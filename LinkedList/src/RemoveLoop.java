import java.util.ArrayList;

public class RemoveLoop {
    public static boolean removeLoop(Node head){
        Node current = head;
        Node prev = null;
        ArrayList<Node> array = new ArrayList<>();
        while(current != null){
            for(Node i : array){
                if(current == i){
                    prev.next = null;
                    return true;
                }
            }
            array.add(current);
            prev = current;
            current = current.next;
        }
        return false;
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
        Node slowPtr = LL2.head;
        Node fastPtr = LL2.head;
        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        Node last = LL2.head;
        while(last.next != null){
            last = last.next;
        }
        last.next = slowPtr;

        System.out.println(removeLoop(LL2.head));
        LL2.print();
        System.out.println(removeLoop(LL2.head));
    }
}

