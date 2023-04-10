import java.util.Scanner;

public class Bee2626{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String line = s.nextLine();
            String[] choices = line.split(" ");
            String choiceA = choices[0];
            String choiceB = choices[1];
            String choiceC = choices[2];
            
            if (choiceA.equals(choiceB) && choiceB.equals(choiceC)) {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            } else if (choiceA.equals("pedra") && choiceB.equals("tesoura") && choiceC.equals("tesoura")
                    || choiceA.equals("papel") && choiceB.equals("pedra") && choiceC.equals("pedra")
                    || choiceA.equals("tesoura") && choiceB.equals("papel") && choiceC.equals("papel")) {
                System.out.println("Os atributos dos monstros vao ser inteligencia, sabedoria...");
            } else if (choiceB.equals("pedra") && choiceA.equals("tesoura") && choiceC.equals("tesoura")
                    || choiceB.equals("papel") && choiceA.equals("pedra") && choiceC.equals("pedra")
                    || choiceB.equals("tesoura") && choiceA.equals("papel") && choiceC.equals("papel")) {
                System.out.println("Iron Maiden's gonna get you, no matter how far!");
            } else if (choiceC.equals("pedra") && choiceA.equals("tesoura") && choiceB.equals("tesoura")
                    || choiceC.equals("papel") && choiceA.equals("pedra") && choiceB.equals("pedra")
                    || choiceC.equals("tesoura") && choiceA.equals("papel") && choiceB.equals("papel")) {
                System.out.println("Urano perdeu algo muito precioso...");
            } else {
                System.out.println("Putz vei, o Leo ta demorando muito pra jogar...");
            }
        }
        s.close();
    }
}