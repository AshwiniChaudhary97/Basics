class Node{
    public int data;
    public Node next;

    public Node(int value){
        this.data = value;
        this.next = null;
    }

}

class createList{
    private Node head;

    public createList(){
        this.head = null;
    }

    public void append(int value){
        Node newNode = new Node(value);

        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void insert(Node newElement){
        if(head == null){
            head = newElement;
        }
        else{
            Node current = head;
            Node previous = null;

            while(current != null){
                if(current.data > newElement.data){
                    if(previous == null){
                        newElement.next = current;
                        head = newElement;
                        return;
                    }
                    else{
                        newElement.next = current;
                        previous.next = newElement;
                        return;
                    }
                }
                else{
                    previous = current;
                    current = current.next;
                }
            }
            previous.next = newElement;
        }

    }
    public void print(){
        if(head == null){
            System.out.println("No node present");
            return;
        }
        else{
            Node current = head;
            while(current != null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public void delete(int targetValue){
        if(head == null){
            return;
        }
        else{
            Node current = head;
            Node previous = null;
            while(current != null){
                if(current.data == targetValue){
                    if(previous == null) {
                        head = null;
                        return;
                    }
                    else{
                        previous.next = current.next;
                        return;
                    }
                }
                else{
                    previous = current;
                    current = current.next;
                }
            }
        }
    }
}

public class LinkedList {
    public static void main(String[] args) {
        createList LL1 = new createList();
        LL1.append(10);
        LL1.append(11);
        LL1.append(12);
        LL1.append(13);

        LL1.print();
        Node newElement1 = new Node(14);
        System.out.println("After inserting");
        LL1.insert(newElement1);
        LL1.print();
        Node newElement2 = new Node(9);
        System.out.println("After inserting");
        LL1.insert(newElement2);
        LL1.print();
        LL1.delete(13);
        System.out.println("After deletion");
        LL1.print();
        LL1.delete(12);
        System.out.println("After deletion");
        LL1.print();
    }
}
