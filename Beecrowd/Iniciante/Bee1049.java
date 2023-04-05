import java.util.Scanner;

public class Bee1049 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String primeiro = s.nextLine();
        String segundo, terceiro;
        segundo = terceiro = "";

        switch(primeiro){
            case "vertebrado": 
            segundo = s.nextLine();
            switch(segundo){
                case "ave": 
                terceiro = s.nextLine();
                switch(terceiro){
                    case "carnivoro": System.out.println("aguia"); break;
                    case "onivoro": System.out.println("pomba"); break;
                }
                break;
                case "mamifero":
                terceiro = s.nextLine();
                switch(terceiro){
                    case "onivoro": System.out.println("homem"); break;
                    case "herbivoro": System.out.println("vaca"); break;
                }
                break;
            } 
            break;
            case "invertebrado":
            segundo = s.nextLine();
            switch(segundo){
                case "inseto": 
                terceiro = s.nextLine();
                switch(terceiro){
                    case "hematofago": System.out.println("pulga"); break;
                    case "herbivoro": System.out.println("lagarta"); break;
                }
                break;
                case "anelideo":
                terceiro = s.nextLine();
                switch(terceiro){
                    case "hematofago": System.out.println("sanguessuga"); break;
                    case "onivoro": System.out.println("minhoca"); break;
                }
                break;
            } 
            break;
        }
        s.close();
    }
    
}
