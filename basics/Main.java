package basics;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Main {
  public static void main(String[] args) {
int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
System.out.println("------------------------------------------------");
flipNHeads(2);
System.out.println("------------------------------------------------");
clock();
  }

  public static void flipNHeads(int n) {
    Random rand = new Random();
    int headsInARow = 0;
    int flips = 0;
    
    while (headsInARow < n) {
        double coin = rand.nextDouble();
        if (coin >= 0.5) {
            System.out.println("heads");
            headsInARow++;
        } else {
            System.out.println("tails");
            headsInARow = 0;
        }
        flips++;
    }
    
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
}
    public static String pluralize(String word, int number) {
        if (number == 0 || number > 1) {
            return word + "s";
        } else {
            return word;
        }
    }
 public static void clock() {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String current = now.format(formatter);

    int count = 0;
    long lastTime = System.nanoTime();

    while (true) {
        now = LocalDateTime.now();
        String next = now.format(formatter);

        if (!next.equals(current)) {
            double speed = count / ((System.nanoTime() - lastTime) / 1_000_000.0);

            System.out.printf("%s %.4f MHz \n", next, speed);
            current = next;
            lastTime = System.nanoTime();
            count = 0;
        }

        count++;
    }
}
  }