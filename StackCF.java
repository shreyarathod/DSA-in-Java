import java.util.*;

public class StackCF{
   public static void main(String [] args){
     Stack stack = new Stack();
    stack.push(3);
    stack.push(6);
    stack.push(9);
    stack.push(12);

    while(!stack.isEmpty()){
        System.out.println(stack.peek());
        stack.pop();
    }
   }
}