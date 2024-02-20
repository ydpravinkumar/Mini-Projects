import java.awt.desktop.SystemEventListener;

public class View {

    /**
     * View class used to print appropriate messages
     */

    Inventory inventory = new Inventory();
    boolean cleanContainers = false;

    public void ingredientsDetails(String ingredientName)
    {
    String message = "Please provide the ingredients details for " + ingredientName;
    System.out.println(message);
    }
    public void cleanContainersMessage(){

        if(!cleanContainers)
        {
            System.out.println("Container have been cleaned and are ready for beverage preparation!");
            cleanContainers = true;
        }
        else{
            System.out.println("Container are already clean");
        }
    }
    public void cupsReady(){
               System.out.println("Getting the cups ready for the order");
               System.out.println("Cups are ready!!!");
    }
    }
