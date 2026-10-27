import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")) {
            int pointRoll = 0;
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            IO.println("Die One rolled a " + die1 +  " and Die Two rolled a " + die2 + ". Therefore, your craps roll was " + crapsRoll + ".");

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                IO.println("You crapped out! So you lose!");
                IO.println("");
                IO.println("Would you like to play again [Y or N]?");
                playAgain = in.nextLine();

                while (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    IO.println("Invalid choice. Please enter Y or N.");
                    playAgain = in.nextLine();
                    IO.println("");

                }

            } else if (crapsRoll == 7 || crapsRoll == 11) {
                IO.println("You got a natural! You win!!!!");
                IO.println("");
                IO.println("Would you like to play again [Y or N]?");
                playAgain = in.nextLine();

                while (!playAgain.equalsIgnoreCase("Y")
                        && !playAgain.equalsIgnoreCase("N")) {
                    IO.println("Invalid choice. Please enter Y or N.");
                    playAgain = in.nextLine();
                }
            } else {
                IO.println("**********************");
                IO.println("Since you didn't roll a 2, 3, 7, 11, or 12 you now have to roll until you roll the point or a 7.");
                IO.println("Your craps roll now becomes the point you are trying to roll again!");
                IO.println("Roll the point and you will win.");
                IO.println("Roll a 7 and you will lose.");
                IO.println("**********************");

                while(pointRoll != 7 && pointRoll != crapsRoll) {
                    int reroll1 = rnd.nextInt(6) + 1;
                    int reroll2 = rnd.nextInt(6) + 1;
                    pointRoll = reroll1 + reroll2;
                    IO.println("Reroll One rolled a " + reroll1 + " and Die Two rolled a " + reroll2 + ". Therefore, your new roll was " + pointRoll + ".");

                    if (pointRoll == 7) {
                        IO.println("You rolled a 7 and lost!");
                    }

                    if (pointRoll == crapsRoll) {
                        IO.println("You rolled the point and won!");
                    }
                }
                    IO.println("Would you like to play again [Y or N]?");
                    playAgain = in.nextLine();
                    IO.println("");
                    while (!playAgain.equalsIgnoreCase("Y")
                                && !playAgain.equalsIgnoreCase("N")) {
                                IO.println("Invalid choice. Please enter Y or N.");
                                playAgain = in.nextLine();
                    }
                }
            }
        }
    }