class QueueCircular{
    int[] array;
    int size;
    int length;
    int front;
    int rear;

    QueueCircular(int size){
        this.size = size;
        array = new int[size];
        length = 0;
        front = -1;
        rear = -1;
    }

    public void enqueue(int element){
        if(length == size){
            System.out.println("Stack overflow");
        }
        else {
            if(rear == -1){
                front = 0;
                rear = 0;
            }
            else if(rear == size-1){
                rear = 0;
            }
            else {
                rear++;
            }
        }
        length++;
        array[rear] = element;
    }

    public int dequeue(){
        if(front == -1){
            System.out.println("Stack Underflow");
            return -1;
        }
        else if(front == rear){
            int temp = array[front];
            front = -1;
            rear = -1;
            length--;
            return temp;
        }
        else if(front == size-1){
            int temp = array[front];
            front = 0;
            length--;
            return temp;
        }
        else {
            int temp = array[front];
            front++;
            length--;
            return temp;
        }
    }

    public void peek(){
        if(front == -1){
            System.out.println("stack underflow");
        }
        else{
            System.out.println(array[front]);
        }
    }

    public boolean isEmpty(){
        if(front == -1)
           return  true;
        else return false;
    }

    public boolean isFull(){
        if(length == size)
            return  true;
        else return false;
    }
}

public class CircularQueue {
    public static void main(String[] args) {
        QueueCircular queue1 = new QueueCircular(5);
        queue1.enqueue(10);
        queue1.enqueue(11);
        queue1.enqueue(12);
        queue1.enqueue(13);
        queue1.enqueue(14);

        queue1.peek();
        System.out.println(queue1.dequeue());
        queue1.peek();
        System.out.println(queue1.isFull());
        queue1.enqueue(14);
        System.out.println(queue1.isFull());

        queue1.dequeue();
        queue1.peek();
        queue1.dequeue();
        queue1.peek();
        queue1.dequeue();
        queue1.peek();
        queue1.dequeue();
        queue1.peek();

    }

}
