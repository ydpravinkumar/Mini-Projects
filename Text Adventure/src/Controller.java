
public class Controller {

    /**
        * Declaring a Model & View Class object below namely model & view in order to call methods associated with those classes
        * within the startController method in this class
     **/
    Model model = new Model();
    View view = new View();

    /**
    *The start controller method below does two things firstly it calls the model.start() method from model class
    *and stores the data in a String variable namely startResult. Additionally, it also calls the view object of the
    *View class in order to call the method associated with View class namely printOutput which is used to print the values of
    *Nouns & Verbs if any or the appropriate error message
     **/
    public void startController()
    {
        String startResult = model.start();
        view.printOutput(startResult);
    }
    /**
    * Declaring the exitGame method below in case the user decides to exit the game
    * The below method calls the exit() method from the model class
     **/
    public void exitGame()
    {
        Model model = new Model();
        model.exit();
    }




}
