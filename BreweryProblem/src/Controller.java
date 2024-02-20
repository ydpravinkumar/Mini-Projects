import java.util.HashMap;
import java.util.Scanner;

public class Controller {


    public void menuController(){
        /**
         * Initilizing various objects such as Recipes, inventory, production etc so that we could call them as required
         * Running the while loop until the user types quit and quits the program
         */
        Scanner scanner = new Scanner(System.in);
        String input = "";
        RecipeBook recipeBook = new RecipeBook();
        HashMap<String,Recipe> recipes = recipeBook.getRecipes();
        Inventory inventory = new Inventory();
        View view = new View();
        Production production = new Production(inventory);
        while (!input.equals("quit"))
        {

/**
 * Displaying the initial Menu
 * Firstly the user has to add a recipe without which they wouldn't be able to order a recipe
 * If there are not enough ingredients available the user can always update the inventory as required
 * Post choosing place order option, the user will be provided with all the recipes that were added
 * The user can at any given time clean the containers in order to prepare the beverage
 * Initially the user has to provide a name for the recipe post which the user will be asked for all the ingredients that will be a part
 * of this specific recipe
 * This recipe then gets stored in our recipe book for further use
 */
            System.out.println("Please select an option");
            System.out.println("a: Add Recipe");
            System.out.println("b: Update the Inventory");
            System.out.println("c: Place Your Order");
            System.out.println("d: Clean Containers");
            input =  scanner.nextLine().toLowerCase();
            /**
             * Initializing all the ingredients variables as 0
             */
            int water = 0;
            int teaPowder = 0;
            int sugar = 0;
            int milk = 0;
            int coffeePowder = 0;
            int oranges = 0;
            int apples = 0;
            int mixfruit = 0;


            switch (input)
            {
                case "a":
                    System.out.println("Please provide recipe name");
                    String newRecipe = scanner.nextLine().toLowerCase();
                    Recipe recipe = new Recipe(newRecipe);

                    view.ingredientsDetails("water");
                    water = scanner.nextInt();

                    view.ingredientsDetails("tea powder");
                    teaPowder = scanner.nextInt();

                    view.ingredientsDetails("sugar");
                    sugar = scanner.nextInt();

                    view.ingredientsDetails("milk");
                    milk = scanner.nextInt();

                    view.ingredientsDetails("coffee powder");
                    coffeePowder = scanner.nextInt();

                    view.ingredientsDetails("apples");
                    apples = scanner.nextInt();

                    view.ingredientsDetails("oranges");
                    oranges = scanner.nextInt();

                    view.ingredientsDetails("mix fruit");
                    mixfruit = scanner.nextInt();

                    recipe.addRecipeIngredient(water,teaPowder,sugar,milk,coffeePowder,apples,oranges,mixfruit);
                    recipes.put(newRecipe,recipe);
                    break;
                case "b":

                    view.ingredientsDetails("water");
                    water = scanner.nextInt();

                    view.ingredientsDetails("tea powder");
                    teaPowder = scanner.nextInt();

                    view.ingredientsDetails("sugar");
                    sugar = scanner.nextInt();

                    view.ingredientsDetails("milk");
                    milk = scanner.nextInt();

                    view.ingredientsDetails("coffee powder");
                    coffeePowder = scanner.nextInt();

                    view.ingredientsDetails("apples");
                    apples = scanner.nextInt();

                    view.ingredientsDetails("oranges");
                    oranges = scanner.nextInt();

                    view.ingredientsDetails("mix fruit");
                    mixfruit = scanner.nextInt();

                    inventory.inventoryUpdateAdd(water,teaPowder,sugar,milk,coffeePowder,apples,oranges,mixfruit);

                    System.out.println("Inventory Updated");
                    break;

               /**
                 * Post this the user can enter case b and choose any recipe as desired along with the quantity. The quantity here is based on batches
                 * Assume each batch has 10 cups of hot beverage such as tea & coffee. Also 10 cups of fresh juices
                 *
                 * Once the recipe is prepared based on the quantity that was opted. The inventory will be a+updated accordingly
                 */
                case "c":
                    System.out.println("Please select an option from the things offered below:");

                    for(String i:recipes.keySet()){
                        System.out.println("# " + i);
                    }
                    System.out.println("Please select a beverage option from the list above");
                    String beverages = scanner.nextLine().toLowerCase();

                    Recipe drinktomake = recipes.get(beverages);
                    System.out.println("Quantity of " + beverages);
                    int quant = scanner.nextInt();
                    if(inventory.ingredientsAvailability(drinktomake,quant)){
                        view.cupsReady();
                        production.produceBeverage(drinktomake,quant);
                    }
                    else{
                        inventory.ingredientsAvailability(drinktomake,quant);
                    }

                    break;
                case "d":
                    view.cleanContainersMessage();
                    break;
                default:
                    break;
            }
    }

    }
}
