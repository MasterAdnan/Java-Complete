package Data_Structure_Series;

public class Stack_Concepts {

//    int size;
//    int arr[];
//    int top;
//
//    Stack_Concepts(int size){
//        this.size = size;
//        this.arr = new int[size];
//        this.top = -1;
//    }
//
//
//    public void push(int element) {
//        if(!isFull()) {
//            top++;
//            arr[top] = element;
//            System.out.println("Pushed Element is : " + element);
//        }
//        else {
//            System.out.println("Stack is full now..");
//        }
//    }
//
//    public int pop() {
//        if(!isEmpty()) {
//            int returnedTop = top;
//            top--;
//            System.out.println("popped element is : " + arr[returnedTop]);
//            return arr[returnedTop];
//        }
//        else {
//            System.out.println("Stack is Empty");
//            return -1;
//        }
//    }
//
//    public int peek() {
//        if(!this.isEmpty()) {
//            return arr[top];
//        }
//        else {
//            System.out.println("Stack is Emptyyyy");
//            return -1;
//        }
//    }
//
//
//    public boolean isEmpty() {
//        return (top == -1);
//    }
//
//    public boolean isFull() {
//        return (size-1 == top);
//    }
//
//    public static void main(String[] args) {
//        Stack_Concepts stackimplement = new Stack_Concepts(10);
//        stackimplement.pop();
//        System.out.println("-------------");
//
//        stackimplement.push(100);
//        stackimplement.push(200);
//        stackimplement.push(300);
//        stackimplement.push(400);
//
//        System.out.println("-------------");
//
//        System.out.println(stackimplement.peek());
//
//
//        System.out.println(stackimplement.isEmpty());
//        System.out.println(stackimplement.isFull());
//
//
//        stackimplement.pop();
//        stackimplement.pop();
//        stackimplement.pop();
//        stackimplement.pop();
//        stackimplement.pop();
//
//        System.out.println("-------------");
//
//        System.out.println(stackimplement.isEmpty());
//        System.out.println(stackimplement.isFull());
//    }

    int size;
    int arr[];
    int top;
    Stack_Concepts(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push (int element) {
        if(!isFull()) {
            top++;
            arr[top] = element;
            System.out.println("Pushed Element is : " + element);
        }
        else {
            System.out.println("Stack is Full now");
        }
    }

    public int pop () {
        if(!isEmpty()) {
            int returnedTop = top;
            top--;
            System.out.println("Popped Element is : " + arr[returnedTop]);
            return arr[returnedTop];
        }
        else {
            System.out.println("Stack is Empty");
            return -1;
        }
    }

    public int peek() {
        if(!this.isEmpty()) {
            return arr[top];
        }
        else {
            System.out.println("Stack is not Full");
            return -1;
        }
    }


    public boolean isEmpty() {
            return (top == -1);
    }
    public boolean isFull() {
            return (size-1 == top);
    }

    public static void main(String[] args) {
        Stack_Concepts stackImplements = new Stack_Concepts(1);

        stackImplements.pop();
        System.out.println("------------");

        stackImplements.push(100);
        stackImplements.push(200);
        stackImplements.push(300);
        stackImplements.push(400);
        System.out.println("----------------");

        System.out.println(stackImplements.peek());
        System.out.println("------------");


        stackImplements.pop();
        stackImplements.pop();
        stackImplements.pop();

        System.out.println("------------");
        System.out.println(stackImplements.peek());

        System.out.println("------");
        System.out.println(stackImplements.isEmpty());

        System.out.println("------------");
        System.out.println(stackImplements.isFull());
    }
}