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
}