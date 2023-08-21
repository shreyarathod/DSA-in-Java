class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }
}

class SinglyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;
    public void add (int data){
        Node node = new Node(data);
        if(head==null){
            this.head = node;
            this.tail = node;
            size++;
        }else {
            tail.next = node;
            tail = node;
            size++;
        }

    }

    public  void traverse(){
        Node tempnode = head;
        for(int i =0;i<size;i++){
            System.out.println(tempnode.data);
            tempnode = tempnode.next;
        }

    }

    public  Node reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        tail = head;
        head = prev;
        return head;

    }


}
public class ReverseLinkedList {
    public static void main (String []args){
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.traverse();
        s1.reverse();
        s1.traverse();
        

    }
}