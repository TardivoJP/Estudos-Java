import java.util.Scanner;

public class Bee2313 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String arr[] = s.nextLine().split(" ");
        double[] arraydesc = new double [arr.length];
        for(int i=0;i<arr.length;i++){
            arraydesc[i]=Double.parseDouble(arr[i]);
        }
        int cont = 0;
        double aux = 0;
        boolean equilatero,forma;
        equilatero = forma = false;

        for(int i=0;i<arraydesc.length*(arraydesc.length-1);i++){
            if(cont>0){
                if(arraydesc[cont]>arraydesc[cont-1]){
                    aux = arraydesc[cont-1];
                    arraydesc[cont-1]=arraydesc[cont];
                    arraydesc[cont]=aux;
                }
            }
            cont++;
            if(cont>(arraydesc.length-1)){
                cont=0;
            }
        }

        if(arraydesc[0]>=(arraydesc[1]+arraydesc[2])){
            System.out.println("Invalido");
            forma = true;
        }
        if(!forma){
			if(arraydesc[0]==arraydesc[1] && arraydesc[1]==arraydesc[2]){
                System.out.println("Valido-Equilatero");
                equilatero = true;
            }
			if((arraydesc[0]==arraydesc[1] || arraydesc[0]==arraydesc[2] || arraydesc[1]==arraydesc[2]) && equilatero == false){
                System.out.println("Valido-Isoceles");
            }
			if(arraydesc[0]!=arraydesc[1] && arraydesc[1]!=arraydesc[2] && equilatero == false){
                System.out.println("Valido-Escaleno");
            }
            if(Math.pow(arraydesc[0], 2)==(Math.pow(arraydesc[1], 2)+Math.pow(arraydesc[2], 2))){
                System.out.println("Retangulo: S");
            }else{
				System.out.println("Retangulo: N");
			}
        }
        
        s.close();
    }
}