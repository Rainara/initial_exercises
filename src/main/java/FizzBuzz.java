public class FizzBuzz {

    public String createFizzBuzzOutput(int number) {


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

}
