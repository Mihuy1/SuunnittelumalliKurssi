package State;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("John", 0, 0, 100);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Current Status: ");
            System.out.println("Name: " + gameCharacter.getName());
            System.out.println("Level: " + gameCharacter.getLevel());
            System.out.println("Experience Points: " + gameCharacter.getExperiencePoints());
            System.out.println("Health: " + gameCharacter.getHealth());
            System.out.println("Available actions: ");

            switch (gameCharacter.getState().getClass().getSimpleName()) {
                case "Novice":
                    System.out.println("1. Train");
                    break;
                case "Intermediate":
                    System.out.println("1. Train");
                    System.out.println("2. Meditate");
                    break;
                case "Expert":
                    System.out.println("1. Train");
                    System.out.println("2. Meditate");
                    System.out.println("3. Fight");
                    break;
                default:
                    System.out.println("Something went wrong...");
                    return;
            }

            System.out.println("4. Quit");


            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    gameCharacter.getState().train();
                    break;
                case 2:
                    gameCharacter.getState().meditate();
                    break;
                case 3:
                    gameCharacter.getState().fight();
                    break;
                case 4:
                    System.out.println("Quitting...");
                    return;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            System.out.println(gameCharacter.getState().getClass().getSimpleName() + "Current state");
            if (gameCharacter.getState().getClass().getSimpleName().equals("Master")) {
                System.out.println("You won the game! You are now a master!");
                break;
            }


        }

    }


}
