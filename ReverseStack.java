import java.util.*;
public class ReverseStack{

     public static void pushAtBottom(Stack stack, int data){
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        
        int temp = stack.pop();
        pushAtBottom(stack, data);
        stack.push(temp);
    }

    public static void reverseStack( Stack stack){
        if(stack.isEmpty()){
            return;
        }

        int temp = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack,temp);
    }

    public static void main (String [] args){
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        reverseStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }


    }
}