 import java.util.*;
 public class PushAtBottom {
    public static void pushAtBottom(Stack stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        
        int temp = stack.pop();
        pushAtBottom(stack, data);
        stack.push(temp);
    }
    public static void main (String [] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        pushAtBottom(stack,4);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();

        }


    }
 }