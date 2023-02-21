class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class StackAsLinkedList{
    Node top;
    int length;

    StackAsLinkedList(){
        top = null;
        length = 0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public Node pop(){
        if(top == null){
            System.out.println("stack underflow");
            return null;
        }
        else{
            Node temp = top;
            top = top.next;
            length--;
            return temp;
        }
    }

    public void peek(){
        if(top == null){
            System.out.println("stack underflow");
        }
        else{
            System.out.println(top.data);
        }
    }

    public boolean isEmpty(){
        if(top == null)
            return true;
        else return  false;
    }

}
public class LinkedListStack {
    public static void main(String[] args) {
        StackAsLinkedList stack1 = new StackAsLinkedList();
        stack1.push(3);
        stack1.push(2);
        stack1.push(1);
        stack1.peek();
        stack1.pop();
        stack1.peek();
        stack1.push(13);
        stack1.push(22);
        stack1.push(12);
        stack1.peek();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.peek();

    }

}
