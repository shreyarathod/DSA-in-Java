class Queue {
    int arr[] ;
    int size = 0;
    int rear = -1;

    Queue(int size){
        this.size = size;
        arr = new int[size];
    }
     
    public boolean isEmpty(){
        return rear == -1;
    }

    public boolean isFull(){
        return rear == size-1;
    }


    public void add (int data){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }

        arr[++rear] = data;

    }

    public int remove (){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int front = arr[0];
        for(int i =0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        return front;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");

        }

        return arr[0];
    }
}
public class QueueUsingArray{

    public static void main (String [] args){

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println(q.remove());
        System.out.println(q.peek());


    }
}