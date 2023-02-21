class StackImplementation{
    int[] array;
    int top;
    int size;

    public StackImplementation(int size){
        this.size = size;
        this.array = new int[size];
        this.top = -1;
    }

    public void push(int element){
        if(top == size-1){
            System.out.println("stack overflow");
        }
        else{
            top++;
            array[top] = element;
        }
    }

    public int pop(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            int temp = array[top];
            top--;
            return temp;
        }
    }

    public void peek(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        else{
            System.out.println(array[top]);
        }
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        else return false;
    }
    public boolean isFull(){
        if(top == size-1){
            return true;
        }
        else return false;
    }
}

public class ArrayStack {
    public static void main(String[] args) {
        StackImplementation stack1 = new StackImplementation(5);
        stack1.push(10);
        stack1.push(11);
        stack1.push(12);
        stack1.push(13);
        stack1.push(14);
        System.out.println("before popping");
        stack1.peek();
        System.out.println("the popped element is : " + stack1.pop());
        System.out.println("After popping");
        stack1.peek();
        stack1.push(14);
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.pop();
        System.out.println(stack1.isEmpty());
        stack1.peek();
        stack1.pop();
    }
}
