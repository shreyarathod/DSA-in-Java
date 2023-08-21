class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class Stack {
    Node head = null;
    public boolean isEmpty (){
        return head == null;
    }

    public void push (int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = node;
        }else {
            node.next = head;
            head = node;
        }  
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        Node top = head;
        head = head.next;
        return top.data;
    }

    public int peek(){
     if(isEmpty()){
            return -1;
        } else {
            Node top = head;
            return top.data;
        }   
    }


}
public class StackLL {
    public static void main (String [] args){
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