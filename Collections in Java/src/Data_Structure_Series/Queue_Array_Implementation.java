package Data_Structure_Series;

public class Queue_Array_Implementation {

    int capacity;
    int front;
    int rear;
    int current_Size;//length
    int array[];
    public Queue_Array_Implementation(int sizeOfQueue) {
        this.capacity = sizeOfQueue;
        this.front = 0;
        this.rear = -1;
        this.array = new int[sizeOfQueue];
    }


    public boolean isEmpty() {
        if(current_Size == 0){
            return true;
        }
        return false;
    }
    public boolean isFull() {
        if(current_Size == capacity){
            return true;
        }
        return false;
    }

    public void enQueue(int data) {
        if(isFull()){
            System.out.println("the queue is full");
        }
        else {
            rear++;
            if(rear == capacity-1) {
                rear = 0;
            }
                array[rear] = data;
                current_Size++;
                System.out.println(data + " added to the queue");
            }
        }

    public void deQueue() {
        if(isEmpty()) {
            System.out.println("The queue has some empty spaces");
        }
        else {
            front++;
            if(front == capacity-1){
                System.out.println(array[front-1] + " removed from the queue");
                front=0;
            }
            else {
                System.out.println(array[front-1] + " removed from the queue");
            }
            current_Size--;
        }
    }



    public static void main(String[] args) {

        Queue_Array_Implementation q = new Queue_Array_Implementation(10);

        q.enQueue(10);
        q.enQueue(70);
        q.enQueue(20);
        q.enQueue(60);
        q.enQueue(40);
        q.enQueue(30);
        q.enQueue(50);

        q.deQueue();
        q.enQueue(80);
        q.deQueue();
        q.deQueue();
        q.deQueue();
    }

}
