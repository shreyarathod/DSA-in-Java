import java.util.*;
class Stack {
   ArrayList <Integer> list = new ArrayList<>();
   public boolean isEmpty(){
    return list.size() == 0 ;
   } 

   public void push (int data){
    list.add(data);
   }

   public int pop (){
    if(isEmpty()){
        return -1;
    }else {
    int top = list.remove(list.size()-1);
    return top;
    }
   }

   public int peek (){
    if(isEmpty()){
        return -1;
    } else {
        return list.get(list.size()-1);
    }
   }

}
public class StackAL {
    public static void main (String [] args ){
        Stack stack = new Stack();
        stack.push(2);
        stack.push(1);
        stack.push(3);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }


    }
}