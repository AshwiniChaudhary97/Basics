class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Queue_LL{
    Node front ;
    Node tail ;

    Queue_LL(){
        front =null;
        tail = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if(tail == null){
            front = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Node dequeue(){
        if(front == null){
            System.out.println("Stack underflow");
            return null;
        }
        else if(front == tail){
            Node temp = front;
            front = null;
            tail = null;
            return temp;
        }
        else {
            Node temp = front;
            front = front.next;
            return temp;
        }
    }

    public boolean isEmpty(){
        if(front == null)
            return true;
        else return false;
    }
}

public class LinkedListArray {
    public static void main(String[] args) {
        Queue_LL queue1 = new Queue_LL();
        queue1.enqueue(10);
        queue1.enqueue(12);
        queue1.enqueue(13);
        queue1.enqueue(14);

        System.out.println(queue1.dequeue().data);
        System.out.println(queue1.dequeue().data);
        System.out.println(queue1.dequeue().data);
        System.out.println(queue1.dequeue().data);
        System.out.println(queue1.isEmpty());
        queue1.enqueue(14);
        System.out.println(queue1.isEmpty());
        System.out.println(queue1.dequeue().data);
    }
}
