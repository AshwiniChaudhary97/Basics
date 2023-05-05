import java.util.Stack;

public class ReverseStack {
    public static void insertAtBottom(Stack<Integer> stack, int item){
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int temp = stack.pop();
        insertAtBottom(stack, item);
        stack.push(temp);
    }
    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        else{
            int temp = stack.pop();
            reverse(stack);
            insertAtBottom(stack,temp);
        }
    }
    public static void main(String[] args) {
        StackImplementation stack1 = new StackImplementation(7);
        stack1.push(10);
        stack1.push(13);
        stack1.push(14);
        stack1.push(12);
        stack1.push(16);
        stack1.push(19);
        stack1.push(20);
        //reverse(stack1);
        while(!stack1.isEmpty()){
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();

        Stack<Integer> stacks = new Stack<>();
        stacks.push(10);
        stacks.push(20);
        stacks.push(30);
        System.out.println(stacks);
        reverse(stacks);
        System.out.println(stacks);

    }
}
