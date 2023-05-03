public class DetectLoopStartNode {
    public static Node detectLoopBegining(Node head){
        if(head == null && head.next == null){
            return null;
        }
        Node sp = head;
        Node fp = head;
        while(fp != null && fp.next != null){
            sp = sp.next;
            fp = fp.next.next;
            if(sp == fp){
                sp = head;
                while(sp != fp){
                    sp = sp.next;
                    fp = fp.next;
                }
                return sp;
            }
        }
        return null;
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

        System.out.println(detectLoopBegining(LL2.head).data);

    }
}
