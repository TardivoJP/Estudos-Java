import java.util.Scanner;

public class Bee2632{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=0;i<n;i++){
            double w = s.nextDouble();
            double h = s.nextDouble();
            double x0 = s.nextDouble();
            double y0 = s.nextDouble();
            String element = s.next();
            int level = s.nextInt();
            double r = 0;
            int dano = 0;
            switch(element){
                case "fire": 
                dano = 200;
                switch(level){
                    case 1: r = 20; break;
                    case 2: r = 30; break;
                    case 3: r = 50; break;
                } break;
                case "water": 
                dano = 300;
                switch(level){
                    case 1: r = 10; break;
                    case 2: r = 25; break;
                    case 3: r = 40; break;
                } break;
                case "earth": 
                dano = 400;
                switch(level){
                    case 1: r = 25; break;
                    case 2: r = 55; break;
                    case 3: r = 70; break;
                } break;
                case "air": 
                dano = 100;
                switch(level){
                    case 1: r = 18; break;
                    case 2: r = 38; break;
                    case 3: r = 60; break;
                } break;
            }
            double x1 = s.nextDouble();
            double y1 = s.nextDouble();

            boolean intersects = false;

            double xDistance = Math.abs(x1 - (x0 + w/2));
            double yDistance = Math.abs(y1 - (y0 + h/2));

            if (xDistance > (w/2 + r) || yDistance > (h/2 + r)) {
                intersects = false;
            } else if (xDistance <= (w/2) || yDistance <= (h/2)) {
                intersects = true;
            } else {
                double cornerDistance = Math.pow(xDistance - w/2, 2) + Math.pow(yDistance - h/2, 2);
                intersects = (cornerDistance <= Math.pow(r, 2));
            }

            if (intersects) {
                System.out.println(dano);
            } else {
                System.out.println(0);
            }
        }
        s.close();
    }
}