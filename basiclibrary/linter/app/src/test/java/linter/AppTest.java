/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App classUnderTest = new App();

    @Test
    void testNoErrors() throws IOException {
        Path file = Path.of("./app/src/test/resources/noErrors.js");
        String errors = classUnderTest.checkSemicolons(file);
        String expected = "";
        Assertions.assertEquals(expected, errors);
    }

    @Test
    void testOneError() throws IOException {
        Path file = Path.of("./app/src/test/resources/oneError.js");
        String errors = classUnderTest.checkSemicolons(file);
        String expected = "Line 3: Missing semicolon.\n";
        Assertions.assertEquals(expected, errors);
    }

    @Test
    void testFewErrors() throws IOException {
        Path file = Path.of("./app/src/test/resources/fewErrors.js");
        String errors = classUnderTest.checkSemicolons(file);
        String expected = "Line 3: Missing semicolon.\n"
                + "Line 11: Missing semicolon.\n"
                + "Line 16: Missing semicolon.\n"
                + "Line 22: Missing semicolon.\n";
        Assertions.assertEquals(expected, errors);
    }

    @Test
    void testManyErrors() throws IOException {
        Path file = Path.of("./app/src/test/resources/manyErrors.js");
        String errors = classUnderTest.checkSemicolons(file);
        String expected = "Line 3: Missing semicolon.\n"
                + "Line 5: Missing semicolon.\n"
                + "Line 11: Missing semicolon.\n"
                + "Line 13: Missing semicolon.\n"
                + "Line 15: Missing semicolon.\n"
                + "Line 26: Missing semicolon.\n"
                + "Line 28: Missing semicolon.";
        Assertions.assertEquals(expected, errors);
    }

    @Test
    void testEmptyFile() throws IOException {
        Path file = Path.of("./app/src/test/resources/empty.js");
        String errors = classUnderTest.checkSemicolons(file);
        String expected = "";
        Assertions.assertEquals(expected, errors);
    }
}