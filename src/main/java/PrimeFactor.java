import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {

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
