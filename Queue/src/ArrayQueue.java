class Queue{
    int[] array;
    int front;
    int tail;
    int size;
    int length;

    public Queue(int size){
        this.size = size;
        array = new int[size];
        front = -1;
        tail = -1;
        length = 0;
    }

    public void enqueue(int element){
        if(tail == -1){
            front++;
            tail++;
            array[tail] = element;
        }
        else if(tail == size-1){
            System.out.println("stack overflow");
        }
        else{
            tail++;
            array[tail] = element;
        }
        length++;
    }

    public int dequeue(){
        if(front == -1){
            System.out.println("stack underflow");
            return -1;
        }
        else if(front == tail){
            int temp = array[front];
            front = -1;
            tail = -1;
            length--;
            return temp;
        }
        else{
            int temp = array[front];
            front++;
            length--;
            return temp;
        }
    }

    public int peek(){
        if(front == -1){
            System.out.println("stack underflow");
            return -1;
        }
        else return array[front];
    }

    public boolean isEmpty(){
        if(front == -1)
            return true;
        else return false;
    }

    public boolean isFull(){
        if(length == size)
            return true;
        else return false;
    }
}

public class ArrayQueue {
    public static void main(String[] args) {
        Queue queue1 = new Queue(5);
        queue1.enqueue(10);
        queue1.enqueue(11);
        queue1.enqueue(12);
        queue1.enqueue(13);
        queue1.enqueue(14);
        System.out.println(queue1.dequeue());
        System.out.println(queue1.dequeue());
        queue1.enqueue(15);
        System.out.println(queue1.isFull());
    }

}
