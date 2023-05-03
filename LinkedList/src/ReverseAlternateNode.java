public class ReverseAlternateNode {
    public static Node reverseAlt(Node start, int count, boolean flag){
        if(start == null){
            return null;
        }
        int i = 1;
        Node end = start;
        while(i != count && end != null){
            i++;
            end = end.next;
        }
        if(flag == false){
            if(end != null){
                Node left = end.next;
                end.next = null;
                end.next = reverseAlt(left,count,true);
            }
            else {
            }
        }
        else{
            if(end != null){
            Node left = end.next;
            end.next = null;
            end = start;
            start = ReverseList.reverseList(start);
            end.next = reverseAlt(left,count,false);
            }
            if(end == null){
                end = start;
                start = ReverseList.reverseList(start);
            }
        }
        return start;
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(13);
        LL2.append(3);
        LL2.append(-3);
        LL2.append(-13);
        LL2.append(43);
        LL2.append(93);
        LL2.append(43);
        LL2.append(93);
        LL2.print();
        LL2.head = reverseAlt(LL2.head,3,true
        );
        LL2.print();

    }
}
