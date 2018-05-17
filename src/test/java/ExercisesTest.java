import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

    @Test
    public void simpleTriangleTest() {

        Exercises triangle = new Exercises();

        assertEquals("*\n**\n***", triangle.simpleTriangle(3));

    }

    @Test
    public void diamondTriangleTest() {

        Exercises triangle = new Exercises();

        assertEquals("  *\n" +
                " ***\n" +
                "Rainara\n" +
                " ***\n" +
                "  *", triangle.diamondTriangle(3));

    }

}