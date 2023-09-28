import java.util.*;

class Guesser{
    int guessNum;

    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! kindely guess the number 1 to 100");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class player{
    int guessNum;

    int guessingNumber(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Player ! kindely guess the number 1 to 100");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer(){
        player p1 = new player();
        player p2 = new player();
        player p3 = new player();

        numFromPlayer1 = p1.guessingNumber();
        numFromPlayer2 = p2.guessingNumber();
        numFromPlayer3 = p3.guessingNumber();
    }

    void compare(){
        if(numFromGuesser == numFromPlayer1 ){
            if(numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3){
            System.out.println("All players win");
            }else if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2){
                System.out.println("player 1 and 2 is won");
            }else if(numFromGuesser == numFromPlayer3 && numFromGuesser == numFromPlayer2){
                System.out.println("player 2 and 3 is won");
            }else if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3){
                System.out.println("player 1 and 3 is won");
            }else{
                System.out.println("player 1 is won");
            }
        }else if(numFromGuesser == numFromPlayer2){
            if(numFromGuesser == numFromPlayer3){
                System.out.println("player 2 and 3 is won");
            }else if(numFromGuesser == numFromPlayer1){
                System.out.println("player 1 and 2 is won");
            }else{
                System.out.println("player 2 is won");
            }
        }
        else if(numFromGuesser == numFromPlayer3) {
            System.out.println("player 3 is won");
        } else {
            System.out.println("No one win game");
        }
        }
    }


public class GusserGame {
    public static void main(String[] args) {
        System.out.println("Game start");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }
    

