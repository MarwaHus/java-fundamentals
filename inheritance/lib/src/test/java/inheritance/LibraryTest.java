/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    @Test
    public void testAddReview() {
        Restaurant fancyPlace = new Restaurant("The Fancy Place", 4, "$$$");
        Review review1 = new Review("Great food and service!", "John Smith", 5,"The Fancy Place", 4, "$$$");
        Review review2 = new Review("Terrible experience.", "Jane Doe", 1,"The Fancy Place", 4, "$$$");
        fancyPlace.addReview(review1);
        fancyPlace.addReview(review2);
        assertEquals(2, fancyPlace.reviews.size());
    }

    @Test
    public void testAverageStars() {
        Restaurant fancyPlace = new Restaurant("The Fancy Place", 4, "$$$");
        Review review1 = new Review("Great food and service!", "John Smith", 5,"The Fancy Place", 4, "$$$");
        Review review2 = new Review("Terrible experience.", "Jane Doe", 1,"The Fancy Place", 4, "$$$");
        fancyPlace.addReview(review1);
        fancyPlace.addReview(review2);
        assertEquals(3, fancyPlace.stars);
    }

    @Test
    public void testToString() {
        Restaurant fancyPlace = new Restaurant("The Fancy Place", 4, "$$$");
        Review review1 = new Review("Great food and service!", "John Smith", 5,"The Fancy Place", 4, "$$$");
        fancyPlace.addReview(review1);
        assertEquals("The Fancy Place (5 stars, $$$ price)", fancyPlace.toString());
    }
    @Test
    public void testShopConstructor() {
        Shop shop = new Shop("Example Shop", "This is an example shop", 3);
        assertEquals(shop.getName(), "Example Shop");
        assertEquals(shop.getDescription(), "This is an example shop");
        assertEquals(shop.getDollarSigns(), 3);
    }

    @Test
    public void testShopToString() {
        Shop shop = new Shop("Example Shop", "This is an example shop", 3);
        String expected = "Example Shop - This is an example shop ($3)";
        assertEquals(expected, shop.toString());
    }
    @Test
    public void testShopAddReview() {
        Shop shop = new Shop("Example Shop", "This is an example shop", 3);
        Review review = new Review("Great shop!", "John Doe", 5,"The Fancy Place", 4, "$$$");
        shop.addReview(review);
        assertEquals(shop.reviews.size(), 1);
        assertEquals(shop.reviews.get(0), review);
    }
    @Test
    public void testAddReviewToShop() {
        Shop shop = new Shop("Example Shop", "This is an example shop", 3);
        Review review = new Review("Great shop!", "John Doe", 5,"The Fancy Place", 4, "$$$");
        shop.addReview(review);
        assertEquals(shop.reviews.size(), 1);
        assertEquals(shop.reviews.get(0), review);
    }
    @Test
    public void testAddReviewToRestaurant() {
        Restaurant restaurant = new Restaurant("Example Restaurant", 3, "$$$");
        Review review = new Review("Great food!", "John Doe", 5,"The Fancy Place", 4, "$$$");
        restaurant.addReview(review);
        assertEquals(restaurant.reviews.size(), 1);
        assertEquals(restaurant.reviews.get(0), review);
    }
    @Test
    public void testTheaterConstructor() {
        Theater theater = new Theater("Example Theater");
        assertEquals(theater.getName(), "Example Theater");
        assertEquals(theater.getMovies().size(), 0);
    }

    @Test
    public void testTheaterAddMovie() {
        Theater theater = new Theater("Example Theater");
        theater.addMovie("Movie 1");
        assertEquals(theater.getMovies().size(), 1);
        theater.addMovie("Movie 2");
        assertEquals(theater.getMovies().size(), 2);
        System.out.println(theater.getMovies());
    }

    @Test
    public void testTheaterRemoveMovie() {
        Theater theater = new Theater("Example Theater");
        theater.addMovie("Movie 1");
        theater.addMovie("Movie 2");
        theater.removeMovie("Movie 1");
        assertEquals(theater.getMovies().size(), 1);
        assertEquals(theater.getMovies().get(0), "Movie 2");
        System.out.println(theater.getMovies());
    }

    @Test
    public void testTheaterToString() {
        Theater theater = new Theater("Example Theater");
        theater.addMovie("Movie 1");
        theater.addMovie("Movie 2");
        String expected = "Example Theater - [Movie 1, Movie 2]";
        assertEquals(expected, theater.toString());
        System.out.println(theater.toString());
    }
    @Test
    public void testAddReviewToTheater() {
        Theater theater = new Theater("Example Theater");
        Review review1 = new Review("Great theater!", "John Doe", 5,"The Fancy Place", 4, "$$$");
        theater.addReview(review1);
        assertEquals(theater.reviews.size(), 1);
        assertEquals(theater.reviews.get(0), review1);

        Review review2 = new Review("Awesome popcorn!", "Jane Smith", 4, "Movie 1",4,"$$$");
        theater.addReview(review2);
        assertEquals(theater.reviews.size(), 2);
        assertEquals(theater.reviews.get(1), review2);
        System.out.println(theater.reviews.size());
    }
}

