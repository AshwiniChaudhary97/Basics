class Nodes {
    int num;
    Nodes next;
    Nodes(int val) {
        num = val;
        next = null;
    }
}
public class TUf {
    //utility function to insert node at the end of the linked list
    static Nodes insertNode(Nodes head, int val) {
        Nodes newNode = new Nodes(val);

        if (head == null) {
            head = newNode;
            return head;
        }

        Nodes temp = head;
        while (temp.next != null) temp = temp.next;

        temp.next = newNode;
        return head;
    }

    public static Nodes intersectionPresent(Nodes head1, Nodes head2){
        Nodes ptr1 = head1;
        Nodes ptr2 = head2;
        int l1 = 1;
        int l2 = 1;
        while(ptr1 != null) {
            l1++;
            ptr1 = ptr1.next;
        }
        while(ptr2 != null){
            l2++;
            ptr2 = ptr2.next;
        }
        ptr1 = head1;
        ptr2 = head2;
        int dif = 0;
        if(l1 > l2){
            dif = l1-l2;
            while(dif != 0) {
                ptr1 = ptr1.next;
                dif--;
            }
        }
        else if(l1<l2){
            dif = l2-l1;
            while(dif != 0) {
                ptr2 = ptr2.next;
                dif--;
            }
        }

        while(ptr1 != null){
            if(ptr1 == ptr2) return ptr1;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return null;
    }

    //utility function to print linked list created
    static void printList(Nodes head) {
        while (head.next != null) {
            System.out.print(head.num + "->");
            head = head.next;
        }
        System.out.println(head.num);
    }

    public static void main(String args[]) {
        // creation of both lists
        Nodes head = null;
        head = insertNode(head, 1);
        head = insertNode(head, 3);
        head = insertNode(head, 1);
        head = insertNode(head, 5);
        head = insertNode(head, 4);
        Nodes head1 = head;
        head = head.next.next.next;
        Nodes headSec = null;
        headSec = insertNode(headSec, 3);
        Nodes head2 = headSec;
        headSec.next = head;
        //printing of the lists
        System.out.print("List1: ");
        printList(head1);
        System.out.print("List2: ");
        printList(head2);
        //checking if intersection is present
        Nodes answerNode = intersectionPresent(head1, head2);
        if (answerNode == null)
            System.out.println("No intersection\n");
        else
            System.out.println("The intersection point is " + answerNode.num);

    }
}