public class DeleteSumNodes {
    public static boolean deleteNodeSum( Node head,Node current,Node prev,int sum){
        if(current == null){
            if(sum == 0){
                return true;
            }
            return false;
        }
        if(deleteNodeSum(head,current.next,current,sum + current.data)){
            if(head.next == null){
                head = null;
            }
            else if(current == head){
                head = current.next;
            }
            else{
                prev.next = current.next;
            }
            return true;
        }
        else if(deleteNodeSum(head,current.next,current,sum)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CreateList LL2 = new CreateList();
        LL2.append(13);
        LL2.append(3);
        LL2.append(-3);
        LL2.append(-16);
        LL2.append(16);
        LL2.append(-8);
        LL2.append(8);
        LL2.append(-3);
        deleteNodeSum(LL2.head,LL2.head,null,0);
        LL2.print();

    }
}
