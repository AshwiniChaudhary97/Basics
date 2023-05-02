import java.util.ArrayList;

public class DetectLoop {
    public static boolean detectLoop(Node head){
        Node current = head;
        ArrayList<Node> array = new ArrayList<>();
        while(current != null){
            for(Node i : array){
                if(current == i){
                    return false;
                }
            }
            array.add(current);
            current = current.next;
        }
        return true;
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
        System.out.println(detectLoop(LL2.head));
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

        System.out.println(detectLoop(LL2.head));

    }
}
