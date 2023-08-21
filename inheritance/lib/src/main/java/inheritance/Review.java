package restaurant;
import  restaurant.Restaurant;
public class Review  extends Restaurant {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;
    public Review(String body, String author, int stars, String name, int restaurantStars, String priceCategory) {
        super(name, restaurantStars, priceCategory);
        this.body = body;
        this.author = author;
        this.stars = stars;
    }
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
    public int getStars() {
        return stars;
    }
    public String toString() {
        return "\"" + body + "\" - " + author + " (" + stars + " stars) -- " + super.toString();
    }
}

