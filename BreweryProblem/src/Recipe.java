public class Recipe {

    /**
     * Recipe class stores recipe name along with the quantity of ingredients required to product single batch
     */
        private String name;
        public  Recipe(String name){
            this.name = name;
        }

    public Ingredients coffeePowder = new Ingredients("coffeePowder",0);
    public Ingredients teaPowder = new Ingredients("teaPowder",0);

    public Ingredients milk = new Ingredients("milk",0);

    public Ingredients sugar = new Ingredients("sugar",0);

    public Ingredients water = new Ingredients("water",0);

    public Ingredients orange = new Ingredients("oranges",0);

    public Ingredients apple = new Ingredients("apples",0);

    public Ingredients mixfruit = new Ingredients("mixfruit",0);


    public String getName(){
        return name;
    }

    /**
     * Below function stores recipe ingredients for specific recipe batch
     * @param water
     * @param teaPowder
     * @param sugar
     * @param milk
     * @param coffeePowder
     * @param apple
     * @param oranges
     * @param mixfruit
     */
    public void addRecipeIngredient(int water, int teaPowder, int sugar, int milk, int coffeePowder, int apple, int oranges, int mixfruit)
    {
        this.water.ingquantity = water;
        this.teaPowder.ingquantity = teaPowder;
        this.sugar.ingquantity = sugar;
        this.milk.ingquantity = milk;
        this.coffeePowder.ingquantity = coffeePowder;
        this.apple.ingquantity = apple;
        this.orange.ingquantity =oranges;
        this.mixfruit.ingquantity =mixfruit;
    }

}
