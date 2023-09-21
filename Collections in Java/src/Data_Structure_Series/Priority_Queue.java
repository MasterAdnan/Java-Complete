package Data_Structure_Series;

import javax.lang.model.element.Name;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

class Employee{
    String name;
    int salary;

    public Employee(String Name, int Salary){
        this.name = Name;
        this.salary = Salary;
    }

    public String toString(){
        return "Employee [Name : " + name + ", Salary : " + salary + "]";
    }
}
//
class Empcomparitor implements Comparator<Employee> {
    public int compare(Employee a1, Employee a2){
        //Lowest to Highest
//        return a1.salary - a2.salary;

        //Highest to Lowest
        return a2.salary - a1.salary;

    }
}


class Empcomparator1 implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.length() - s2.length();
    }
}

public class Priority_Queue {
    public static void main(String[] args) {

//         Add() Method :-
//        PriorityQueue<Integer> p = new PriorityQueue<>();
//        p.add(13);
//        p.add(99);
//        p.add(100);
//        p.add(200);
//        p.add(199);
//        p.add(150);
//
//        System.out.println(p.poll());
//        System.out.println(p.peek());


        // Employment Salary :-
//        Empcomparitor ecom = new Empcomparitor();
//        PriorityQueue<Employee> Emp = new PriorityQueue<>(10,ecom);
//
//        Emp.add(new Employee("Apple",100));
//        Emp.add(new Employee("Ball",200));
//        Emp.add(new Employee("Cat",300));
//        Emp.add(new Employee("Dog",250));
//        Emp.add(new Employee("Elephant",150));
//        Emp.add(new Employee("Faluda",50));
//        Emp.add(new Employee("Gaadi",49));
//
//
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());
//        System.out.println(Emp.poll());

        //Print all :-
//        System.out.println(Emp);
//        System.out.println(Emp.size());
//        System.out.println(Emp.remove());
////        System.out.println(Emp.remove());
////        System.out.println(Emp.remove());
//        System.out.println(Emp.size());


        Empcomparator1 e = new Empcomparator1();
        PriorityQueue<String> pq = new PriorityQueue<>(10,e);
        pq.add("Adnan");
        pq.add("ad");
        pq.add("addu");
        pq.add("auo");
        pq.add("a");

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        




    }
}
