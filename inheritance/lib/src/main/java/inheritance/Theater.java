package restaurant;
import java.util.ArrayList;
import java.util.List;

public class Theater implements Reviewable {
    private String name;
    private List<String> movies;
    private List<Review> reviews;

    public Theater(String name) {
        this.name = name;
        this.movies = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addMovie(String movie) {
        movies.add(movie);
    }

    public void removeMovie(String movie) {
        movies.remove(movie);
    }

    public void addReview(Review review) {
        if (!reviews.contains(review)) {
            review.setTheater(this);
            reviews.add(review);
        }
    }

    public String getName() {
        return name;
    }

    public List<String> getMovies() {
        return movies;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public String toString() {
        return name + " - " + movies.toString();
    }
}
