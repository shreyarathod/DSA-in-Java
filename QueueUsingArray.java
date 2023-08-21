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
        rear--;
        return front;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }

        return arr[0];
    }
}


class CircularQueue {

    int arr[] ;
    int size = 0;
    int front = -1;
    int rear = -1;

    CircularQueue(int size){
        this.size = size;
        arr = new int[size];
    }

     public boolean isEmpty(){
        return front == rear;
    }

    public boolean isFull(){
        return front == (rear+1)%size ;
    }

     public void add (int data){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }else if(isEmpty()){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public int remove (){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        int first = arr[front];
        front = (front+1)%size;
      
        return first;

    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }

        return arr[front];
    }


}
public class QueueUsingArray{

    public static void main (String [] args){

        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q.remove());
        System.out.println(q.peek());
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        

        CircularQueue cq = new CircularQueue(5);
        cq.add(1);
        cq.add(2);
        cq.add(3);
        cq.add(4);
        cq.add(5);
        cq.add(6);
       
        System.out.println(cq.remove());
        System.out.println(cq.peek());
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();
        cq.remove();



    }
}

