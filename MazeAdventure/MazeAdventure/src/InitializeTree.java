public class InitializeTree {

    Tree tree = new Tree();
    public void initializeTree(){

        tree.root = new Node("Enter the Maze");
        tree.root.left = new Node("You are in an abandoned House with an Attic");
        tree.root.right = new Node("You are on the coast of a sea with nobody in sight");
        tree.root.left.left = new Node("In the House there's an Attic with a star");
        tree.root.left.right = new Node("Dark Forest Behind the House. You were are in a duel with the monster");
        tree.root.right.left = new Node("Dark Cave behind the Sea. You are in a duel with the sea monster");
        tree.root.right.right = new Node("Stranded Boat on the Beach with a star");
        tree.root.left.left.left = new Node("You came out of the house and got killed by the monster");
        tree.root.left.left.right = new Node("Yayy!! You successfully escaped the maze");
        tree.root.left.right.left = new Node("You defeated the monster but cannot escape the maze");
        tree.root.left.right.right = new Node("You were killed by the monster");
        tree.root.right.left.left = new Node("You were killed by the sea monster");
        tree.root.right.left.right = new Node("You defeated the sea monster but cannot escape the maze");
        tree.root.right.right.left = new Node("The sea monster killed you");
        tree.root.right.right.right = new Node("Yayy!! You successfully escaped the maze");
    }
}
