import java.util.Scanner;

//Exercicio simplesmente não funciona corretamente em Java
//pois o arredondamento dos valores é feito de forma diferente
//é necessário muita gambiarra para ter os mesmos resultados que o exercício pede
//como pode se ver no arquivo Bee2758test

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

public class Bee2758 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        double c =s.nextDouble();
        double d = s.nextDouble();
        System.out.printf("A = %.6f, B = %.6f\n",a,b);
        System.out.printf("C = %.6f, D = %.6f\n",c,d);
        System.out.printf("A = %.1f, B = %.1f\n",a,b);
        System.out.printf("C = %.1f, D = %.1f\n",c,d);
        System.out.printf("A = %.2f, B = %.2f\n",a,b);
        System.out.printf("C = %.2f, D = %.2f\n",c,d);
        System.out.printf("A = %.3f, B = %.3f\n",a,b);
        System.out.printf("C = %.3f, D = %.3f\n",c,d);
        System.out.printf("A = %.3E, B = %.3E\n",a,b);
        System.out.printf("C = %.3E, D = %.3E\n",c,d);
        System.out.printf("A = %d, B = %d\n",(int) Math.floor(a),(int) Math.floor(b));
        System.out.printf("C = %d, D = %d\n",(int) Math.floor(c),(int) Math.floor(d));
        s.close();
    }
}