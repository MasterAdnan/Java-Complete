public class CWH_27 {
    public static void main(String[] args) {


        int marks[] = {50,34,78,90,99};


//        System.out.println("THis method is called naive way");
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);


//        System.out.println("this method is called Array Traversal");
//        for(int i=0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }


//        System.out.println("this method is called Array Traversal in reverse order");
//        for(int i= marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }


//        for each loop
        for(int element : marks) {
            System.out.println(element);
        }
    }
}
