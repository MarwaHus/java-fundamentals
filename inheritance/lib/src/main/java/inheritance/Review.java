package restaurant;
import  restaurant.Restaurant;
public class Review {
    private String body;
    private String author;
    private int stars;
    private Restaurant restaurant;
    private Shop shop;
    private Theater theater;
    private String movie;

    public Review(String body, String author, int stars, String name, int restaurantStars, String priceCategory) {
        this.body = body;
        this.author = author;
        this.stars = stars;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getStars() {
        return stars;
    }

    public String toString() {
        return "\"" + body + "\" - " + author + " (" + stars + " stars) -- " + super.toString();
    }
}


