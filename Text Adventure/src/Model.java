import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Model {

    String totalVerb, totalNoun; //Setting the two String variable to collect and store Verb And Noun of each command within a scenario

    /*
    Setting various boolean values as false to make sure each command executes only once during the runtime of program
     */
    boolean leaveOffice = false;
    boolean enteredOffice = false;  boolean eatLunch = false; boolean workTasks = false;  boolean pingPong = false;
    boolean chatFriends = false; boolean consumeTea = false; boolean leadWorkshop = false; boolean interaction = false;
    boolean hadBreakfast = false; boolean wearShoes = false; boolean drinkCoffee = false; boolean driveWork = false;
    //boolean officeDeparture = false;

    boolean sleep = false; boolean returnHome = false; boolean cookDinner = false;
    /**
     * Using the Model Class to set all my Nouns and Verbs inside a HashSet that I am going to run this program
     *  The Nouns and Verbs refer to a day in a life of a corporate employee
     *  Defined two methods for Noun and Verb which will return a HashSet datatype
     */
    public HashSet<String> hashSetNouns() {
        HashSet nouns = new HashSet();
        /**Preparing to go to office
         *The below set of nouns which deal with the "Preparation to head to the office" are added to the HashSet
         **/
        nouns.add("breakfast");
        nouns.add("shoes");
        nouns.add("coffee");
        nouns.add("office");

        /**
        *Things to do in office
        *The below set of nouns which deal with the "Things we do in office" are added to the HashSet
         **/
        nouns.add("lunch");
        nouns.add("tea");
        nouns.add("ping-pong");
        nouns.add("tasks");
        nouns.add("colleagues");
        nouns.add("friends");
        nouns.add("workshop");
        nouns.add("workplace");

        /**Post returning home from office
        *The below set of nouns which deal with the tasks performed post returning home are added to the HashSet
         **/
        nouns.add("clothes");
        nouns.add("dinner");
        nouns.add("bed");
        return nouns;
    }

    public HashSet<String> hashSetVerbs() {

        HashSet verbs = new HashSet();
        /**Preparing to go to office
        *   The below set of verbs which deal with the "Preparation to head to the office" are added to the HashSet
         **/
        verbs.add("drink");
        verbs.add("eat");
        verbs.add("wear");
        verbs.add("drive");

        /**
        *Things to do in office
        *The below set of verbs which deal with the "Things we do in office" are added to the HashSet
         **/

        verbs.add("enter");
        verbs.add("work");
        verbs.add("interact");
        verbs.add("play");
        verbs.add("lead");
        verbs.add("take");
        verbs.add("consume");
        verbs.add("chat");
        verbs.add("leave");

        /**
        *Post returning home from office
        *The below set of verbs which deal with the tasks performed post returning home are added to the HashSet
         **/

        verbs.add("change");
        verbs.add("cook");
        verbs.add("sleep");
        return verbs;
    }

    /**
 *Once the user provides the input of either a or b the game starts with the start() function where we take the input value
 *and parse it by splitting it as an array and then comparing each value of the array to the words in our HashSet
 **/

    public String start() {

        String departureVerb = "", departureNoun = "";
        String inOfficeVerb = "", inOfficeNoun = "";
        String homeVerb = "", homeNoun = "";

        if (!driveWork) {
    /**
    *Starting with an if condition to make sure once the last task is performed the setting exits and we move on to the next
    *setting for example once i command "drive to office" that means the code will directly move to things we can do in office
    *assuming that wear shoes, eat breakfast and drink coffee are already done before the user decided to drive to office
    *Additionally, I have also added a Help section where it gives instructions on the expected input for a particular setting
    **/
            View view = new View();
            view.officePrep();


                /**
                *Once the HashSet function runs and the values are stored.
                *We ask the user for an input String which will be in the form of a sentence
                *Once the input is given we split the input string based on spaces
                *in order to get individual words in the form of an array
                **/

                Scanner input = new Scanner(System.in);
                String inputString = input.nextLine().toLowerCase();
                String[] inputStringSplit = inputString.split(" ", 0);
                /**
                *Once the array is set with individual words we run the for loop in order to compare both nouns and verbs with
                *each element of the array and if a noun or a verb is matched we print verb/noun found and push the word in a variable specific to this condition
                **/
                for (String word : inputStringSplit) {
                    if (hashSetVerbs().contains(word)) {


                                departureVerb = word;
                            }
                    else if (hashSetNouns().contains(word)) {

                            departureNoun =  word;

                    }
                }

                /**
                *Setting the if conditions to make sure the combination of nouns and verbs are used together in order to avoid
                *weird combinations which don't make sense
                *additionally keeping a boolean for each task that can be performed in order to make sure a task cannot be repeated twice
                 **/

                if(departureNoun.equals("breakfast") && departureVerb.equals("eat"))
                {
                    if(!hadBreakfast){
                        hadBreakfast = true;

                    }
                    else{
                        view.taskDone();
                    };
                    totalVerb = departureVerb;
                    totalNoun = departureNoun;
                }
                else if(departureNoun.equals("office") && departureVerb.equals("drive"))
                {

                    if(!driveWork){
                        driveWork = true;

                    }
                    else {
                        view.taskDone();
                    }
                }
                else if(departureNoun.equals("shoes") && departureVerb.equals("wear"))
                {
                    if(!wearShoes)
                    {
                        wearShoes = true;

                    }
                    else{
                        view.taskDone();
                    }
                    totalVerb = departureVerb;
                    totalNoun = departureNoun;
                } else if (departureNoun.equals("coffee") && departureVerb.equals("drink")) {
                    if(!drinkCoffee)
                    {

                        drinkCoffee = true;
                    }
                    else {
                        view.taskDone();
                    }

                }
                else{

                    view.taskAssigned();
                }


                if(departureNoun.equalsIgnoreCase("") && departureVerb.equalsIgnoreCase(""))
                {
                    view.taskAssigned();

                }

            totalVerb = departureVerb;
            totalNoun = departureNoun;

        }

        else if (!leaveOffice) {
            /**
            *Using leaveOffice boolean to run the else if instance as that is associated to the last task that can be performed for this setting
            *which is leave workplace once the user enters leave workplace the setting will change and it will move to a next setting
            **/
            /**
            *Additionally, I have also added a Help section where it gives intructions on the expected input for a particular setting
             **/
            View view = new View();
            view.inOffice();


               /**
                * Once the user is done with the previous setting of preparing to go to office it moves to the next setting
                * which is things you can do in office. This process is archived by an else if condition

                * We ask the user for an input String which will be in the form of a sentence
                * Once the input is given we split the input string based on spaces
                * in order to get individual words in the form of an array
                **/

            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine().toLowerCase();
            String[] inputStringSplit = inputString.split(" ", 0);
                /**
                * Once the array is set with individual words we run the for loop in order to compare both nouns and verbs with
                * each element of the array and if a noun or a verb is matched we print verb/noun found and push the word in a variable specific to this condition
                **/
            for (String word : inputStringSplit) {
                if (hashSetVerbs().contains(word)) {


                    inOfficeVerb = word;
                } else if (hashSetNouns().contains(word)) {

                    inOfficeNoun = word;

                }
            }

             /**
                * Setting the if conditions to make sure the combination of nouns and verbs are used together in order to avoid
                * weird combinations which don't make sense
                * additionally keeping a boolean for each task that can be performed in order to make sure a task cannot be repeated twice
              **/
            if (inOfficeVerb.equals("enter") && inOfficeNoun.equals("office")) {

                if (!enteredOffice) {
                    enteredOffice = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("eat") && inOfficeNoun.equals("lunch")) {


                if (!eatLunch) {
                    eatLunch = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("work") && inOfficeNoun.equals("tasks")) {

                if (!workTasks) {
                    workTasks = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("play") && inOfficeNoun.equals("ping-pong")) {

                if (!pingPong) {
                    pingPong = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("interact") && inOfficeNoun.equals("colleagues")) {
                if (!interaction) {
                    interaction = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("lead") && inOfficeNoun.equals("workshop")) {
                if (!leadWorkshop) {
                    leadWorkshop = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("consume") && inOfficeNoun.equals("tea")) {
                if (!consumeTea) {
                    consumeTea = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("chat") && inOfficeNoun.equals("friends")) {
                if (!chatFriends) {
                    chatFriends = true;

                } else {
                    view.taskDone();
                }
            } else if (inOfficeVerb.equals("leave") && inOfficeNoun.equals("workplace")) {
                if (!leaveOffice) {
                    leaveOffice = true;

                } else {
                    view.taskDone();
                }
            } else {

                view.taskAssigned();
            }
            if (inOfficeNoun.equalsIgnoreCase("") && inOfficeVerb.equalsIgnoreCase("")) {

                view.taskAssigned();
            }
            totalVerb = inOfficeVerb;
            totalNoun = inOfficeNoun;


        }

        else if (!sleep) {

            /**
            * Using sleep boolean to run the else if instance as that is associated to the last task that can be performed for this setting
            * which is sleep on bed once the user enters sleep on bed the setting will change and this will end the game
            **/
            /**
            * Additionally, I have also added a Help section where it gives intructions on the expected input for a particular setting
             **/
            View view = new View();
            view.atHome();

            /**
             * Once the user is done with the previous setting of performing the tasks in office it moves to the next setting
             * which is things we do post returning home. This process is achieved by an else if condition

             * We ask the user for an input String which will be in the form of a sentence
             * Once the input is given we split the input string based on spaces
             * in order to get individual words in the form of an array
                **/

            Scanner input = new Scanner(System.in);
            String inputString = input.nextLine().toLowerCase();
            String[] inputStringSplit = inputString.split(" ", 0);

            for (String word : inputStringSplit) {
                if (hashSetVerbs().contains(word)) {


                    homeVerb = word;
                } else if (hashSetNouns().contains(word)) {

                    homeNoun = word;

                }
            }
             /**
              * Setting the if conditions to make sure the combination of nouns and verbs are used together in order to avoid
              * weird combinations which don't make sense
              * additionally keeping a boolean for each task that can be performed in order to make sure a task cannot be repeated twice
                 **/

            if (homeVerb.equals("change") && homeNoun.equals("clothes")) {

                if (!returnHome) {
                    returnHome = true;

                } else {
                    view.taskDone();
                }
            } else if (homeVerb.equals("cook") && homeNoun.equals("dinner")) {
                if(!cookDinner)
                {
                    cookDinner = true;

                }
                else{
                    view.taskDone();
                }
            }
            else if(homeVerb.equals("sleep") && homeNoun.equals("bed"))
            {
                if (!sleep) {
                    sleep = true;
                    exit();
                }
                else{
                    view.taskDone();
                }
            }
            else {

                view.taskAssigned();
            }
            if (homeVerb.equalsIgnoreCase("") && homeNoun.equalsIgnoreCase("")) {

                view.taskAssigned();
            }
            totalVerb = homeVerb;
            totalNoun = homeNoun;
        }

        return "NOUN : " + totalNoun + ",VERB : " + totalVerb;

    }


    /**
    * Defining the below method called exit() where it will be useful if the user decides to exit the game at any given point
    * of the journey
    * As the user decides to exit the game the method will instruct the user to "Please start the game again"
    * and then the program will exit the game
     **/
    public void exit()
    {
        System.out.println("Please start the game again!");
        System.exit(0);
    }
}
