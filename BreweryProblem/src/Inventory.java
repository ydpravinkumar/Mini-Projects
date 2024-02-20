

public class Inventory {

    /**
     * Store all the ingrdients using HashMap from the Ingredients class
     */
    Ingredients coffeePowder = new Ingredients("coffeePowder",200);
    Ingredients teaPowder = new Ingredients("teaPowder",200);

    Ingredients milk = new Ingredients("milk",200);

    Ingredients sugar = new Ingredients("sugar",200);

    Ingredients water = new Ingredients("water",200);

    Ingredients orange = new Ingredients("oranges",50);

    Ingredients apple = new Ingredients("apples",50);

    Ingredients mixfruit = new Ingredients("mixfruit",50);

    /**
     * When an order is placed before production check the availability of ingredients if ingredients not available Say Insufficient Ingredients
     * @param recipe
     * @param beverageQuantity
     */
    public boolean ingredientsAvailability(Recipe recipe,int beverageQuantity){
        if(recipe.getName().equals("tea") && (milk.ingquantity < beverageQuantity*5 || water.ingquantity < beverageQuantity*5 || sugar.ingquantity < beverageQuantity*2 || teaPowder.ingquantity < beverageQuantity*2))
        {
                System.out.println("**For this order you don't have sufficient ingredients. Please update your inventory");
                return false;
            }
            else if(recipe.getName().equals("coffee") && (milk.ingquantity < beverageQuantity*5 || water.ingquantity < beverageQuantity*5 || sugar.ingquantity < beverageQuantity*2 || coffeePowder.ingquantity < beverageQuantity*2))
                {
                    System.out.println("For this order you don't have sufficient ingredients. Please update your inventory");
                    return false;
                }

        else if(recipe.getName().equals("orange juice") && (orange.ingquantity < beverageQuantity*5 || water.ingquantity < beverageQuantity*2 || sugar.ingquantity < beverageQuantity*2))
        {
            System.out.println("For this order you don't have sufficient ingredients. Please update your inventory");
            return false;
        }

        else if(recipe.getName().equals("apple juice") && (apple.ingquantity < beverageQuantity*5 || water.ingquantity < beverageQuantity*2 || sugar.ingquantity < beverageQuantity*2 || milk.ingquantity < beverageQuantity*2))
        {
            System.out.println("For this order you don't have sufficient ingredients. Please update your inventory");
            return false;
        }

        else if(recipe.getName().equals("mix fruit juice") && (mixfruit.ingquantity < beverageQuantity*5 || water.ingquantity < beverageQuantity*2 || sugar.ingquantity < beverageQuantity*2))
        {
            System.out.println("For this order you don't have sufficient ingredients. Please update your inventory");
            return false;
        }
        return true;
            }


    /**
     * Use the ingredients add function below to add the ingredients in the inventory
     * @param water
     * @param teaPowder
     * @param sugar
     * @param milk
     * @param coffeePowder
     * @param apple
     * @param oranges
     * @param mixfruit
     */

    public void inventoryUpdateAdd(int water,int teaPowder,int sugar, int milk,int coffeePowder,int apple,int oranges,int mixfruit){

        this.water.ingquantity += water;
        this.teaPowder.ingquantity += teaPowder;
        this.sugar.ingquantity += sugar;
        this.milk.ingquantity += milk;
        this.coffeePowder.ingquantity += coffeePowder;
        this.apple.ingquantity += apple;
        this.orange.ingquantity +=oranges;
        this.mixfruit.ingquantity +=mixfruit;
        String message = "POST INVENTORY UPDATE: Quantity of mix fruits Left:"+Integer.toString(this.mixfruit.ingquantity)+",Quantity of oranges Left:"+Integer.toString(this.orange.ingquantity)+",Quantity of Water Left:"+Integer.toString(this.water.ingquantity)+",Quantity of Milk Left:"+
                Integer.toString(this.milk.ingquantity)+",Quantity of Sugar Left:"+Integer.toString(this.sugar.ingquantity)+",Quantity of Tea Powder Left:"+
                Integer.toString(this.teaPowder.ingquantity)+",Quantity of Coffee Powder Left:"+Integer.toString(this.coffeePowder.ingquantity)+",Quantity of Apples Left:"+Integer.toString(this.apple.ingquantity);
System.out.println(message);
    }

    /**
     * Use the ingredients remove method below to remove ingredeints after successful order
     * @param water
     * @param teaPowder
     * @param sugar
     * @param milk
     * @param coffeePowder
     * @param apple
     * @param oranges
     * @param mixfruit
     */

    public void inventoryUpdateRemove(int water,int teaPowder,int sugar, int milk,int coffeePowder,int apple,int oranges,int mixfruit){

        this.water.ingquantity -= water;
        this.teaPowder.ingquantity -= teaPowder;
        this.sugar.ingquantity -= sugar;
        this.milk.ingquantity -= milk;
        this.coffeePowder.ingquantity -= coffeePowder;
        this.apple.ingquantity -= apple;
        this.orange.ingquantity -=oranges;
        this.mixfruit.ingquantity -=mixfruit;
        String message = "POST ORDER -- Quantity of mix fruits Left:"+Integer.toString(this.mixfruit.ingquantity)+",Quantity of oranges Left:"+Integer.toString(this.orange.ingquantity)+",Quantity of Water Left:"+Integer.toString(this.water.ingquantity)+",Quantity of Milk Left:"+
                Integer.toString(this.milk.ingquantity)+",Quantity of Sugar Left:"+Integer.toString(this.sugar.ingquantity)+",Quantity of Tea Powder Left:"+
                Integer.toString(this.teaPowder.ingquantity)+",Quantity of Coffee Powder Left:"+Integer.toString(this.coffeePowder.ingquantity)+",Quantity of Apples Left:"+Integer.toString(this.apple.ingquantity);
        System.out.println(message);
    }




}
