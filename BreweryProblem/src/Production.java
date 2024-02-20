public class Production {

    /**
     * This class takes care of the production aspect of the brewery
     * It takes two arguments recipe name and the quantity of recipe
     * Additionally it call the inventoryUpdateRemove method to deduct the appropriate ingredients from the inventory post order
     */

    Inventory inventory;
public Production(Inventory inventory){
    this.inventory = inventory;
}


    public void produceBeverage(Recipe recipe, int quantity){

        inventory.inventoryUpdateRemove(quantity*recipe.water.ingquantity,quantity*recipe.teaPowder.ingquantity,recipe.sugar.ingquantity *quantity,recipe.milk.ingquantity *quantity,recipe.coffeePowder.ingquantity *quantity,recipe.apple.ingquantity *quantity,recipe.orange.ingquantity *quantity,recipe.mixfruit.ingquantity *quantity);
    }






}
