package restaurant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Restaurant {
    private String name;
    int stars;
    private String priceCategory;
    List<Review> reviews;

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

    public String toString() {
        return name + " (" + stars + " stars, " + priceCategory + " price)";
    }


}