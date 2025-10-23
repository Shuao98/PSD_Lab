package Lab7;
import java.util.Scanner;
public class GameMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many rounds you want to play? ");
        int ans =scan.nextInt();
        scan.nextLine();
        
        int userWins =0;
        int compWins =0;
        GamePlayer player = new GamePlayer();
        for (int i =0; i<ans  ;i++){
            System.out.println("Enter your choice (Scissors, Rock, Paper):");
            String user = scan.nextLine();
            Symbol userChoice = Symbol.valueOf(user.toUpperCase());
            Symbol compChoice = player.getSymbol();
            System.out.println("User chose " + userChoice + ",computer chose " + compChoice);
            if (userChoice.getResult(compChoice) == GameResult.WIN){
                System.out.println("User Wins");
                userWins++;
            }else if (userChoice.getResult(compChoice) == GameResult.LOSE){
                System.out.println("Computer Wins");
                compWins++;
            } else if (userChoice.getResult(compChoice) == GameResult.DRAW){
                System.out.println("Draw!");
                
            }else{
                System.out.println("Wrong input!");
            }

        }
        System.out.println("User wins "+userWins+" rounds, computer wins "+ compWins+" rounds");
    }
}
