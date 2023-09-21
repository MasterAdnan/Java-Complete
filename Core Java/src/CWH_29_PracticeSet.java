import java.util.Arrays;
public class CWH_29_PracticeSet {
    public static void main(String[] args) {

//        Question 1 :-
        float marks[] = {57.6f,99.3f,98.6f,86.5f,56.9f};
        float sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum+marks[i];
        }
        System.out.println(sum);


//        Question 2 :-
//        int marks[] = {45, 56, 78, 54, 78};
//        int num = 56;
//        boolean isinarray = false;
//
//        for(int elm : marks){
//            if(num == elm){
//                isinarray = true;
//            }
//        }
//        if(isinarray){
//            System.out.println("the given num is here");
//        }
//        else{
//            System.out.println("not here");
//        }



//        Question 3 :-
//        int marks[] = {34,56,78,90,56};
//        float sum = 0;
//        for (int i = 0; i < marks.length; i++) {
//            sum = sum+marks[i];
//        }
//        System.out.println("the avg percentage is " + sum / marks.length + "%");


//        Question 4 :-
//        int i;
//        int j;
//        for(i=1;i<=2;i++) {
//            for (j = 1; j <= 3; j++) {
//                System.out.println(i + " x " + j + " = " + i * j);
//            }
//        }

//        int matrices1[][] = {{2,2,2},{3,3,3}};
//        int matrices2[][] = {{4,4,4},{6,6,6}};
//        for(int i = 0; i<matrices1.length; i++) {
//            for (int j = 0; j < matrices2[i].length; j++) {
//                int mat =  matrices1[i][j] + matrices2[i][j];
//                System.out.print(mat + " ");
//            }
//            System.out.println("");
//        }

//        Question 5 :-
        int [] arr = {1,2,3,4,5,6};
        int length = arr.length;
        int temp;
        int n = Math.floorDiv(length, 2);
        for(int i=0; i<n;i++){
            temp = arr[i];
            arr[i] = arr[length-i-1];
            arr[length-i-1] = temp;
        }
        for(int elm: arr){
            System.out.println(elm);
        }


//        Question 6 :-
//        int []arr = {1,3,6,70,9};
//        int max = Integer.MIN_VALUE;
//
//        for(int e: arr){
//            if(e>max){
//                max = e;
//            }
//        }
//        System.out.println("The maximun number is " + max);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);


//        Question 7 :-
//        int arr[] = {3,2,4,7,9};
//
//        int min = Integer.MAX_VALUE;
//
//        for(int e : arr){
//            if(min > e){
//                min = e;
//            }
//        }
//        System.out.println(min);



//        Question 8 :-
//        int arr[]= {1,2,3,5,7};
//        boolean isSorted = true;
//
//        for(int i = 0;i<arr.length-1;i++){
//            if(arr[i] > arr[i+1]){
//                isSorted = false;
//                break;
//            }
//        }
//        if(isSorted){
//            System.out.println("the array is sorted");
//        }
//        else{
//            System.out.println("the aray is not sorted");
//        }




//        1
//        float [] a = {20.8f, 23.5f, 14.5f, 67.6f, 34.5f};
//        float sum = 0;
//
//        for(int i=0; i<a.length;i++){
//            sum = sum + a[i];
//        }
//        System.out.println(sum);


//        2

//        int marks[] = {1,2,3,4,5,6};
//        int num = 2;
//        boolean a = true;
//
//        for(int e : marks){
//            if(num == e) {
//                a = true;
//                break;
//            }
//        }
//        if(a==true){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }


//        3
//        int marks[] = {20,23,34,56,67};
//        int sum = 0;
//
//        for(int i=0; i<marks.length;i++){
//            sum += marks[i];
//        }
//        System.out.println(sum);

//        4

//        int matrices1[][] = {{2,2,2},{3,3,3}};
//        int matrices2[][] = {{4,4,4},{6,6,6}};
//        for(int i = 0; i<matrices1.length; i++) {
//            for (int j = 0; j < matrices2[i].length; j++) {
//                int mat =  matrices1[i][j] + matrices2[i][j];
//                System.out.print(mat + " ");
//            }
//            System.out.println("");
//        }




    }
}
