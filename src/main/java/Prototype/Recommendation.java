package Prototype;

import java.util.ArrayList;

public class Recommendation implements Cloneable {
    private String targetAudience;
    private ArrayList<Book> recommendedBooks;

    public Recommendation(String targetAudience, ArrayList<Book> recommendedBooks) {
        this.targetAudience = targetAudience;
        this.recommendedBooks = recommendedBooks;
    }

    public void addBook(Book book) {
        recommendedBooks.add(book);
    }

    public void removeBook(Book book) {
        recommendedBooks.remove(book);
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public ArrayList<Book> getRecommendedBooks() {
        return recommendedBooks;
    }

    @Override
    public Recommendation clone() {
        try {
            Recommendation clonedRecommendation = (Recommendation) super.clone();
            clonedRecommendation.recommendedBooks = new ArrayList<>();
            for (Book book : this.recommendedBooks) {
                clonedRecommendation.addBook(book.clone());
            }
            return clonedRecommendation;
        } catch (CloneNotSupportedException e) {
            return new Recommendation(this.targetAudience, this.recommendedBooks);
        }
    }

    @Override
    public String toString() {
        return "Recommendation{" +
                "targetAudience='" + targetAudience + '\'' +
                ", recommendedBooks=" + recommendedBooks +
                '}';
    }

}
