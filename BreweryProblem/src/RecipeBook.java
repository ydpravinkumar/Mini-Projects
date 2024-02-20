import java.util.HashMap;

/**
 * Stores recipe names using the Recipe class
 */
public class RecipeBook {

    private HashMap<String,Recipe> recipes = new HashMap<String,Recipe>();

//    public void addRecipe(Recipe recipe){
//
//        recipes.put(recipe.getName(),recipe);
//
//    }

    public HashMap<String,Recipe> getRecipes(){
        return recipes;
    }
}
