import java.util.Scanner;

public class Tree {
    Node root;
    Node current;
    // Constructor for an empty tree
    Tree() {
        root = null;
        current = null;
    }


    int count = 0;
    int countinput = 0;
    /**
     * Player object is within the Tree class itself
     * Navigate method to traverse through the maze based on the user's command
     * First we check if the current node has any data if yes we skip the condition, if it's actually null we assign the current node
     * as root node and start the game
     * If the current node is still null that means the tree is not initialized and is empty
     */

    public void navigate(String command) {
        if (current == null) {
            current = root;
            if (current == null) { // Check if the tree is still empty
                System.out.println("The tree is empty.");
                return;
            }
        }
        /**
         * Now that we have confirmed the maze has been initialized, based on the user input of left or right we start traversing through the maze
         * If ever the user comes across a node where the node contains data such as "killed" that means the played has been killed while traversing through the maze post which we just exit the game
         * If ever the user encounters a node with a star we increment the count variable to 1 and towards the end of the maze only if the count variable is atleast we allow user to successfully exit the game
         *
         */

            switch (command.toLowerCase()) {
                case "left":
                    countinput++;
                    if (current.left != null) {
                        current = current.left;
                        System.out.println(current.data);
                        if(current.data.contains("killed") || current.data.contains("cannot escape"))
                        {
                            System.exit(0);
                        }
                        if (current.data.contains("star")) {
                            count++;
                        }
                            if (count >= 1 && countinput >=3) {
                                System.exit(0);
                            }

                    }else {
                        System.out.println("You have reached the end of Maze");
                        System.exit(0);
                    }
                    break;

                case "right":
                    countinput++;
                    if (current.right != null) {
                        current = current.right;
                        System.out.println(current.data);

                        if(current.data.contains("killed") || current.data.contains("cannot escape"))
                        {
                            System.exit(0);
                        }
                        if (current.data.contains("star")) {
                            count++;
                        }
                            if (count >= 1 && countinput >=3) {
                                System.exit(0);
                            }

                    } else {
                        System.out.println("You have reached the end of Maze");
                        System.exit(0);
                    }
                    break;

                case "edit":
                     System.out.println("Please select the node you want to edit. Press left to edit left node, press right to edit right node");
                    Scanner sc = new Scanner(System.in);
                    String nodeselected = sc.nextLine();
                    System.out.println("Please input the new data for the" + nodeselected + "node");
                    String newData = sc.nextLine();
                    if(nodeselected.equals("left")) {
                        current.left.data = newData;
                    }
                    else if (nodeselected.equals("right")) {
                        current.right.data = newData;
                    }
                    break;
                default:
                    System.out.println("Invalid command. Use 'left', 'right' or 'exit'.");
                    break;

            }
        }


        }

