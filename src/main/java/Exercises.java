import java.util.ArrayList;
import java.util.List;

public class Exercises {

    public String simpleTriangle(int number) {

        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++)
                output.append("*");
            output.append("\n");
        }
        return output.toString();


    }


    public String diamondTriangle(int number) {


        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= number - 1; i++) {
            for (int j = 1; j <= number - i; j++)
                output.append(" ");
            for (int j = 1; j <= i * 2 - 1; j++)
                output.append("*");
            output.append("\n");
        }

        output.append("Rainara\n");

        for (int i = number - 1; i > 0; i--) {
            for (int j = 1; j <= number - i; j++)
                output.append(" ");
            for (int j = 1; j <= i * 2 - 1; j++)
                output.append("*");
            output.append("\n");
        }

        return output.toString();
    }

    public String fizzBuzzExercise(int number) {


        StringBuilder output = new StringBuilder();

        for (int i = 1; i <= number; i++) {

            if (i % 15 == 0) {
                output.append("FizzBuzz");
            }
            else if (i % 3 == 0) {

                output.append("Fizz");
            } else if (i % 5 == 0) {
                output.append("Buzz");
            } else {
                output.append(i);
            }
            output.append("\n");

        }

        return output.toString();


    }

    public List<Integer> primeFactorsExercise(int number){

        List<Integer> output = new ArrayList<Integer>();

        for(int i=2;i<=number;i++){

            if(number%i==0){
                output.add(i);
                number /= i;
            }

        }

        return output;
    }


}
