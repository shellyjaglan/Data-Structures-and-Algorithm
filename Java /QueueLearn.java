import java.util.Scanner ;
import java.util.ArrayList;

class Queue{
    int front, rear, size, capacity;
    int[] array;
    ArrayList<Integer> list ;

    public Queue(int capacity){
        this.capacity = capacity;
        this.front = this.size = 0;
        rear = capacity-1;
        array = new int[this.capacity];
    }

    public boolean isFull(Queue queue){
        return (queue.size == queue.capacity);
    }

    public void enqueue(Queue queue, int item){
        if(isFull(queue))
            return;
        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println("here enqueued done: " + item)
    }

    public int dequeue(Queue queue){
        if(isFull(queue))
            return Integer.MIN_VALUE;

        int item = this.array[this.front];
        this.front = (this.front - 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }
}

class QueueLearn{
    public static void main(String[] args){
        Queue obj = new Queue();
        
        obj.enqueue 
    }
}