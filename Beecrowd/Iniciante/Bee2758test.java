import java.text.DecimalFormat;
import java.util.Scanner;

//Exercicio simplesmente não funciona corretamente em Java
//pois o arredondamento dos valores é feito de forma diferente
//é necessário muita gambiarra para ter os mesmos resultados que o exercício pede
//como pode se ver neste arquivo Bee2758test

//desta forma, a solução desse exercício foi enviada em C

//acredito que até é valido para aprender as diferentes formas de impressão
//mas percebi diversos exercícios nesta lista do BeeCrowd em que tive que
//desperdiçar tempo "massageando" os valores para ficarem exatamente igual aos
//pedidos, coisas de literalmente um número de diferença por causa de arredondamentos
//diferentes, acho que realmente precisam analisar e rever alguns desses
//conceitos, pois isso não gera nenhum resultado a não ser irritar e desmotivar
//o aluno que está disposto a aprender

//os graus de dificuldade também devem ser revistos, o fato de um exercício desse
//onde meramente deve-se printar alguns valores na tela é considerado 4
//é francamente e absolutamente ridículo

public class Bee2758test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        double c =s.nextDouble();
        double d = s.nextDouble();
        DecimalFormat decimalFormat = new DecimalFormat("0");
        DecimalFormat decimalFormat1 = new DecimalFormat("0.00");
        DecimalFormat decimalFormat2 = new DecimalFormat("0.000");
        DecimalFormat decimalFormat3 = new DecimalFormat("0.0");
        DecimalFormat decimalFormat4 = new DecimalFormat("0.000000");
        DecimalFormat decimalFormat5 = new DecimalFormat("0.000E00");
        String aStr[] = decimalFormat5.format(a).toString().split("");
        String aStr2[] = new String[aStr.length+1];
        for(int i=0;i<aStr2.length;i++){
            if(a>0){
                if(i<=5){
                    aStr2[i]=aStr[i];
                }else if(i>6){
                    aStr2[i]=aStr[i-1];
                }
            }else{
                if(i<=6){
                    aStr2[i]=aStr[i];
                }else if(i>7){
                    aStr2[i]=aStr[i-1];
                }
            }
        }
        if(a>0){
            aStr2[6]="+";
        }else{
            if(Integer.parseInt(aStr[1])>0){
                aStr2[7]="-";
            }else{
                aStr2[7]="+";
            }
        }

        String bStr[] = decimalFormat5.format(b).toString().split("");
        String bStr2[] = new String[bStr.length+1];
        for(int i=0;i<bStr2.length;i++){
            if(b>0){
                if(i<=5){
                    bStr2[i]=bStr[i];
                }else if(i>6){
                    bStr2[i]=bStr[i-1];
                }
            }else{
                if(i<=6){
                    bStr2[i]=bStr[i];
                }else if(i>7){
                    bStr2[i]=bStr[i-1];
                }
            }
        }
        if(b>0){
            bStr2[6]="+";
        }else{
            if(Integer.parseInt(bStr[1])>0){
                bStr2[7]="-";
            }else{
                bStr2[7]="+";
            }
        }

        String cStr[] = decimalFormat5.format(c).toString().split("");
        String cStr2[] = new String[cStr.length+1];
        for(int i=0;i<cStr2.length;i++){
            if(c>0){
                if(i<=5){
                    cStr2[i]=cStr[i];
                }else if(i>6){
                    cStr2[i]=cStr[i-1];
                }
            }else{
                if(i<=6){
                    cStr2[i]=cStr[i];
                }else if(i>7){
                    cStr2[i]=cStr[i-1];
                }
            }
        }
        if(c>0){
            cStr2[6]="+";
        }else{
            if(Integer.parseInt(cStr[1])>0){
                cStr2[7]="-";
            }else{
                cStr2[7]="+";
            }
        }

        String dStr[] = decimalFormat5.format(d).toString().split("");
        String dStr2[] = new String[dStr.length+1];
        for(int i=0;i<dStr2.length;i++){
            if(d>0){
                if(i<=5){
                    dStr2[i]=dStr[i];
                }else if(i>6){
                    dStr2[i]=dStr[i-1];
                }
            }else{
                if(i<=6){
                    dStr2[i]=dStr[i];
                }else if(i>7){
                    dStr2[i]=dStr[i-1];
                }
            }
        }
        if(d>0){
            dStr2[6]="+";
        }else{
            if(Integer.parseInt(dStr[1])>0){
                dStr2[7]="-";
            }else{
                dStr2[7]="+";
            }
        }

        String stringA = String.join("", aStr2);
        String stringB = String.join("", bStr2);
        String stringC = String.join("", cStr2);
        String stringD = String.join("", dStr2);

        System.out.println("A = "+decimalFormat4.format(a)+", B = "+decimalFormat4.format(b));
        System.out.println("C = "+decimalFormat4.format(c)+", D = "+decimalFormat4.format(d));
        System.out.println("A = "+decimalFormat3.format(a)+", B = "+decimalFormat3.format(b));
        System.out.println("C = "+decimalFormat3.format(c)+", D = "+decimalFormat3.format(d));
        System.out.println("A = "+decimalFormat1.format(a)+", B = "+decimalFormat1.format(b));
        System.out.println("C = "+decimalFormat1.format(c)+", D = "+decimalFormat1.format(d));
        System.out.println("A = "+decimalFormat2.format(a)+", B = "+decimalFormat2.format(b));
        System.out.println("C = "+decimalFormat2.format(c)+", D = "+decimalFormat2.format(d));
        System.out.println("A = "+stringA+", B = "+stringB);
        System.out.println("C = "+stringC+", D = "+stringD);
        System.out.println("A = "+decimalFormat.format(a)+", B = "+decimalFormat.format(b));
        System.out.println("C = "+decimalFormat.format(c)+", D = "+decimalFormat.format(d));
        s.close();
    }
}