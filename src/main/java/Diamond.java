public class Diamond {

    public String createDiamond(int number) {


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

}
