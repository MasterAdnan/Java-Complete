import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int  NoofGuesses;
    Game(){
        Random r = new Random();
        this.number = r.nextInt(5);
    }

    public int getNoofGuesses() {
        return NoofGuesses;
    }

    public void setNoofGuesses(int noofGuesses) {
        this.NoofGuesses = noofGuesses;
    }

    int takeUserInput(){
        System.out.print("type any number : ");
        Scanner sc = new Scanner(System.in);
        int userenteringnumber= sc.nextInt();
        return inputNumber;
    }
    boolean isCorrectNumber(){
        NoofGuesses++;
        if (inputNumber == number){
            System.out.println("You guesses are right and u entered number is " + number + "You Guesssed it in " + NoofGuesses + " attempts");
            return true;
        }
        else if (inputNumber > number) {
            System.out.println("Too High..");
        }
        else if (inputNumber < number) {
            System.out.println("Too Low...");
        }
            return false;
    }
}

public class CWH_43_GuessTheNumber {
    public static void main(String[] args) {

        System.out.println("Guess the number game :-");
        boolean b = true;
        while(b){
            Game Game = new Game();
            Game.takeUserInput();
            Game.isCorrectNumber();
            System.out.println(b);
        }
    }
}
