/*   Question 1 and 2 :-
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write() {
        System.out.println("writing...");
    }
    void refill() {
        System.out.println("refilling....");
    }

    void changeNib(){
        System.out.println("Changing nib..");
    }
}
 */

/*   Question 3 :-
class Monkey{
    public void Jump(){
        System.out.println("Jump");
    }
    public void Bite(){
        System.out.println("Bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
 */

/*   Question 4 :-
abstract class Telephone{
    abstract void Ring();
    abstract void Lift();
    abstract void Disconnect();

}
class smartTelephone extends Telephone{
    public void Ring(){
        System.out.println("Ring");
    }
    public void Lift(){
        System.out.println("Lift");
    }
    public void Disconnect(){
        System.out.println("Disconnect");
    }
}
 */

/*   Question 5 :-
//     Demonstrate Polymorphism using Question 3

class Monkey{
    public void Jump(){
        System.out.println("Jump");
    }
    public void Bite(){
        System.out.println("Bite");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
 */




/*   Question 6 and 7 :-
interface TVRemote{
    void tvremote();
}
interface SmartTVRemote extends TVRemote{
    void smarttvremote();
}
class TV implements SmartTVRemote{
    public void tvremote(){
        System.out.println("tv-remote");
    }
    public void smarttvremote(){
        System.out.println("smart-tv-remote");
    }
}
*/


public class CWH_60_Practice_Set {
    public static void main(String[] args) {






/*    Question 1 and 2 :-
        FountainPen fp = new FountainPen();

        fp.write();
        fp.refill();
        fp.changeNib();
 */


/*   Question 3 :-
        Human h = new Human();
        h.Jump();
        h.Bite();
        h.eat();
        h.sleep();
 */


/*  Question 4 :-
        smartTelephone st = new smartTelephone();
        st.Ring();
        st.Lift();
        st.Disconnect();
 */

/*   Question 5 :-
        Monkey m = new Human();
        m.Jump();
        m.Bite();
        BasicAnimal b = new Human();
        b.eat();
        b.sleep();
 */


/*    Question 6 and 7 :-
        TV tv = new TV();
        tv.tvremote();
        tv.smarttvremote();
*/


    }
}
