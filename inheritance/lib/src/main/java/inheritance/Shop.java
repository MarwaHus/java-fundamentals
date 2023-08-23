package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Shop implements reviewable {
    private String name;
    private String description;
    private int dollarSigns;
    List<Review> reviews;

    public Shop(String name, String description, int dollarSigns) {
        this.name = name;
        this.description = description;
        this.dollarSigns = dollarSigns;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            review.setShop(this);
            reviews.add(review);
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getDollarSigns() {
        return dollarSigns;
    }

    public String toString() {
        return name + " - " + description + " ($" + dollarSigns + ")";
    }

    @Override
    public void reviewable(Review review) {

    }
}