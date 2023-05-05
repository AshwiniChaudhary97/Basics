class TwoStacks {
    int[] array;
    int size;
    int top1;
    int top2;

    TwoStacks(int size){
        this.size = size;
        this.array = new int[size];
        top1 = -1;
        top2 = this.size;
    }

    public void push1(int element){
        if((top2-top1) > 1){
            top1++;
            array[top1] = element;
        }
        else{
            System.out.println("stack overflow");
        }
    }

    public void push2(int element){
        if((top2-top1) > 1){
            top2--;
            array[top2] = element;
        }
        else{
            System.out.println("stack overflow");
        }
    }

    public int pop1(){
        if(top1 == -1){
            return -1;
        }
        else{
            return array[top1--];
        }
    }

    public int pop2(){
        if(top2 == size){
            return -1;
        }
        else{
            return array[top2++];
        }
    }
}

public class TwoStackArray {
    public static void main(String[] args) {
        TwoStacks stack = new TwoStacks(10);
        stack.push1(1);
        stack.push1(2);
        stack.push1(3);
        stack.push1(4);
        stack.push1(3);
        stack.push2(11);
        stack.push2(22);
        stack.push2(33);
        stack.push2(44);
        stack.push2(33);
        System.out.println(stack.pop1());
        System.out.println(stack.pop2());
        System.out.println(stack.pop2());
        stack.push2(33);
        stack.push2(44);
    }
}



