import java.util.ArrayList;
import java.util.Collections;

public class Exerc05 {
    public static void main(String[] args) {
        String linguagem1 = "Python";
        String linguagem2 = "Javascript";
        String linguagem3 = "C#";
        String linguagem4 = "Java";

        ArrayList<String> linguagensList = new ArrayList<>();

        linguagensList.add(linguagem1);
        linguagensList.add(linguagem2);
        linguagensList.add(linguagem3);
        linguagensList.add(linguagem4);

        Collections.sort(linguagensList);

        for (String linguagem : linguagensList) {
            if (linguagem == "Javascript") {
                System.out.println(linguagem2 + " - Esta é minha linguagem favorita!");
            } else {
                System.out.println(linguagem);
            }
        }
    }
}
