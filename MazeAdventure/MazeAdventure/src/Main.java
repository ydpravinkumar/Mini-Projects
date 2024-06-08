import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        /**
         * The Maze game here allows you to navigate the binary tree and allows user to collect stars in order to escape the game
         * In case the user doesn't have enough stars they cannot exit the game
         */

        InitializeTree initializeTree = new InitializeTree();
        initializeTree.initializeTree();
        System.out.println("The game takes three inputs either the player navigates left, right or chooses to exit the game");
        System.out.println("The game has a total of 15 nodes and you start from the root node which is the point of entry");
        System.out.println("On the way if you choose the correct path you end up collecting stars on the way and if you have stars once you reach the end you can escape the maze successfully");
        System.out.println("Collection of stars is mandatory to escape the maze or else you would lose the game even if you reach at the end without being killed");

        Scanner scanner = new Scanner(System.in);

        String traverse;
        Tree tree = initializeTree.tree;
        System.out.println("Enter 'left', 'right' to navigate, or 'exit' to stop:");
        while(!(traverse = scanner.nextLine().toLowerCase()).equals("exit")){ // Read user input in the loop condition and check for "exit"
            tree.navigate(traverse);
            System.out.println("Enter 'left', 'right' to navigate, or 'exit' to stop:");
        }
        scanner.close(); // Close the scanner
    }


    }
