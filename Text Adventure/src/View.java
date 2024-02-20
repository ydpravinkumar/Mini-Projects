public class View {


    /**
        * Defining the below method in the View container to print the outputs such as Nouns and Verbs as well as any other
        * outputs such as error message
        * The method uses an argument namely startResult which is used to store data coming from start() method in the model class.
        * Additionally this method check if the function is actually not returning an empty value or a Null value
     **/
    public void officePrep(){
        System.out.println("Preparing to head to my office");
        System.out.println("HELP SECTION");
        System.out.println("1) eat breakfast");
        System.out.println("2) drink coffee");
        System.out.println("3) wear shoes");
        System.out.println("4) drive to office");
    }
    public void inOffice(){
        System.out.println("I have reached Office now!!!");
        System.out.println("HELP SECTION");
        System.out.println("1) enter office");
        System.out.println("2) eat lunch");
        System.out.println("3) work on tasks");
        System.out.println("4) play ping-pong");
        System.out.println("5) interact with colleagues");
        System.out.println("6) lead a workshop");
        System.out.println("7) consume tea");
        System.out.println("8) chat with friends");
        System.out.println("9) leave workplace");
    }

    public void atHome(){
        System.out.println("I have reached Home now!!!");
        System.out.println("HELP SECTION");
        System.out.println("1) change clothes");
        System.out.println("2) cook dinner");
        System.out.println("3) sleep on bed");
    }
public void taskDone(){
    System.out.println("You are already done with this Task");
}
    public void taskAssigned(){
        System.out.println("Doesn't Match the tasks assigned. Please enter a correct input");
    }
public void printOutput(String startResult){

    if(!startResult.isEmpty() && startResult != null)
    {
        System.out.println(startResult);
    }
}
}
