package restaurant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Restaurant implements Reviewable {
    private String name;
    private int stars;
    private String priceCategory;
    private List<Review> reviews;

    public Restaurant(String name, int stars, String priceCategory) {
        this.name = name;
        this.stars = stars;
        this.priceCategory = priceCategory;
        this.reviews = new ArrayList<>();
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            review.setRestaurant(this);
            reviews.add(review);
            int totalStars = 0;
            for (Review r : reviews) {
                totalStars += r.getStars();
            }
            stars = totalStars / reviews.size();
        }
    }

    public String getName() {
        return name;
    }

    public int getStars() {
        return stars;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String toString() {
        return name + " (" + stars + " stars, " + priceCategory + " price)";
    }
}
}