import java.lang.runtime.SwitchBootstraps;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Controller controller = new Controller();   //Creating an object for our Controller class namely controller
        Scanner sc = new Scanner(System.in);        //Declaring a Scanner object in order to take input from the user
        String enterGame ="";                       //enterGame variable will take the user input and pass it in switch case below


        /*
        Running the While loop until the user either chooses "b" option or enters "quit". Until and unless either of
         the two options are not enabled the program will ask for input after every command
         */
        while(!enterGame.equals("quit")){
            System.out.println("Please choose an option:");
            System.out.println("Press a: Perform the appropriate tasks in a normal weekday");
            System.out.println("Press b: Take a Sick Leave");
            enterGame = sc.nextLine().toLowerCase(Locale.ROOT);
            switch (enterGame) {
                case "a":
                    controller.startController(); //call the startController method in the controller class in order to run the program
                    break;

                case "b":
                    enterGame = "quit";
                    controller.exitGame();
                    break;
                    /*
                    If the user enter quit or chooses the "b" option the game will end and we have to re-run the program
                     */
                default:
                    System.out.println("Please select either a or b option");
            }
        }
    }

}