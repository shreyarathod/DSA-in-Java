class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}


class Queue {
    Node head = null;
    Node tail = null;
    public boolean isEmpty(){
        return head == null && tail == null;
    }

    public void add (int data){
        Node node = new Node(data);
        if(isEmpty()){
            head = tail = node;
            return;
        }
            tail.next = node;
            tail = node;
        }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        } 
        Node front = head;
        head = head.next;
        return front.data;
    }


    public int peek(){
         if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        } 
         Node front = head;
        return front.data;
    }


    }


 

public class QueueUsingLL {
    public static void main (String [] args){
        Queue qu = new Queue();
         qu.add(1);
         qu.add(2);
         qu.add(3);
         qu.add(4);
         System.out.println(qu.remove());
         System.out.println(qu.peek());




    }
}