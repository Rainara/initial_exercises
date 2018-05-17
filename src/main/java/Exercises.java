public class Exercises {

    public String simpleTriangle(int number) {

        StringBuilder output = new StringBuilder();

        for (int i=1 ;i<=number ; i++) {
            for (int j=1 ;j<=i ;j++)
                output.append("*");
            output.append("\n");
        }
        return output.toString();



    }

    public String diamondTriangle(int i) {

        return "";
    }
}
