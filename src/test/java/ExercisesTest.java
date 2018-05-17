import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExercisesTest {

    @Test
    public void isoscelesTriangleTest() {

        Exercises triangle = new Exercises();

        assertEquals("*\n***\n*****", triangle.isoscelesTriangle(3));




    }

}