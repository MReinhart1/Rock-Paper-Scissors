import java.util.Scanner;
/**
 * Write a description of class RPS here.
 * Generates a rock paper scissor game so a user can play against the computer. Also it records the score of the game by telling the user how many times he 
 * has won, lost and tied.
 * 
 * Michael Reinhart 
 * @version (a version number or a date)
 */   //10/6/2015 
public class RPS
{
    public static void main(String [] args){
        int x = 2;
        // used for score keeping
        int win = 0;
        int loss = 0;
        int tie = 0;
            
        while(x == 2){

            int rock = 1;
            int paper = 2;
            int scissor = 3;
            int pc;
            int user = 0;
            Scanner scanner = new Scanner(System.in);
            String scanrps;
            

            pc = (int)(Math.random()*3+1);
            System.out.println("Enter rock, paper or scissors. Enter no to quit, or score to see your wins, ties and losses!!!");
            scanrps = scanner.next();
            if(scanrps.equalsIgnoreCase("rock"))
                user = 1;
            if ((scanrps.equalsIgnoreCase("paper")))
                user = 2;
            if (scanrps.equalsIgnoreCase("scissors"))
                user = 3;
            if (scanrps.equalsIgnoreCase("no"))
             x = 0;
             if(scanrps.equalsIgnoreCase("Score")){
             System.out.println("You have- " + win + " wins");           
             System.out.println("You have- " + tie + " ties");
             System.out.println("You have- " +loss + " losses");
            }
            // the pc enters rock
            if(pc == 1 && user == 1){
                System.out.println("Its a tie!!! You entered rock and so did the computer" );
                 tie += 1;
            }
            if(pc == 1 && user == 2){
                System.out.println("You win!!! You entered paper and the computer entered rock");
                win += 1;
            }
            if(pc ==1 && user == 3){
                System.out.println("You loose!!! You entered scissors and the computer entered rock");
                loss += 1;
            }
            // the pc enters paper
            if(pc == 2&& user == 1){
                System.out.println("You loose!!! You entered rock and the computer entered paper");
                loss += 1;
            }
            if(pc == 2 && user == 2){
                System.out.println("Its a tie!!! You entered paper and the computer entered paper");
                tie += 1;
            }
            if(pc == 2 && user == 3){
                System.out.println("You win!!! You entered scissors and the computer entered paper");
                win += 1;
            }
            // the pc enters scissors
            if (pc == 3 && user == 1){
                System.out.println("You win!!! You entered rock and the computer entered scissors");
                win += 1;
            }
            if(pc == 3 && user == 2){
                System.out.println("You loose!!! You entered paper and the computer entered scissors");
                loss += 1;
            }
            if(pc == 3 && user == 3){
                System.out.println("You tie!!! You entered scissors and the computer entered scissors");
                tie += 1;
            }
        }
    }   
}
