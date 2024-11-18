package Prototype;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Recommendation> recommendations = new ArrayList<>();

        // Create some books
        Book book1 = new Book("Author A", "Title A", "Genre A", 2000);
        Book book2 = new Book("Author B", "Title B", "Genre B", 2005);
        Book book3 = new Book("Author C", "Title C", "Genre C", 2010);

        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        Recommendation recommendation = new Recommendation("Adults", books);

        Recommendation clonedRecommendation = recommendation.clone();
        clonedRecommendation.setTargetAudience("Teens");
        clonedRecommendation.addBook(book3);

        recommendations.add(recommendation);
        recommendations.add(clonedRecommendation);

        System.out.println("Original Recommendation:");
        System.out.println(recommendation);

        System.out.println("Cloned Recommendation:");
        System.out.println(clonedRecommendation);

        System.out.println("--------------------");

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. View Recommendations");
            System.out.println("2. Clone and Modify Recommendation");
            System.out.println("3. Delete latest Recommendation");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    for (Recommendation rec : recommendations) {
                        System.out.println(rec);
                    }

                    System.out.println("--------------------");

                    break;
                case 2:
                    System.out.print("Enter new target audience: ");
                    String newTargetAudience = scanner.nextLine();
                    Recommendation newRecommendation = clonedRecommendation.clone();
                    newRecommendation.setTargetAudience(newTargetAudience);

                    System.out.print("Enter new book author: ");
                    String newBookAuthor = scanner.nextLine();
                    System.out.print("Enter new book title: ");
                    String newBookTitle = scanner.nextLine();
                    System.out.print("Enter new book genre: ");
                    String newBookGenre = scanner.nextLine();
                    System.out.print("Enter new book publication year: ");
                    int newBookPublicationYear = scanner.nextInt();

                    Book newBook = new Book(newBookAuthor, newBookTitle, newBookGenre, newBookPublicationYear);
                    newRecommendation.addBook(newBook);

                    recommendations.add(newRecommendation);

                    System.out.println("New Recommendation:");
                    System.out.println(newRecommendation);

                    System.out.println("--------------------");

                    break;
                case 3:
                    if (recommendations.size() > 0) {
                        recommendations.remove(recommendations.size() - 1);
                        System.out.println("Latest recommendation deleted.");
                    } else {
                        System.out.println("No recommendations to delete.");
                    }

                    System.out.println("--------------------");

                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println("--------------------");
            }
        }
    }
}