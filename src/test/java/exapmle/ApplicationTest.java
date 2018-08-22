package exapmle;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {
    @Test
    void should_get_result_of_two_number() {
        Application a = new Application(4, 5);
        assertEquals("1 * 1 = 1  " ,a.getSingleLine(1, 1));
        assertEquals("2 * 3 = 6  " ,a.getSingleLine(2, 3));
        assertEquals("3 * 4 = 12 " ,a.getSingleLine(3, 4));
        assertEquals("4 * 5 = 20 " ,a.getSingleLine(4, 5));

    }

    @Test
    void should_get_generate_multiplication_table() {
        Application a = new Application(4, 9);
        String actual = a.generateMultiplicationTable();
        assertEquals("4 * 4 = 16  \n" +
                        "4 * 5 = 20  5 * 5 = 25  \n" +
                        "4 * 6 = 24  5 * 6 = 30  6 * 6 = 36  \n" +
                        "4 * 7 = 28  5 * 7 = 35  6 * 7 = 42  7 * 7 = 49  \n" +
                        "4 * 8 = 32  5 * 8 = 40  6 * 8 = 48  7 * 8 = 56  8 * 8 = 64  \n" +
                        "4 * 9 = 36  5 * 9 = 45  6 * 9 = 54  7 * 9 = 63  8 * 9 = 72  9 * 9 = 81  ",
                actual);
    }
}