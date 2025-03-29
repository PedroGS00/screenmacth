/*public class Desafios {
    public static void main(String[] args) {
        double c = 30.4; // temperatura em Celsius
        double f = (c * 1.8) + 3; // conversão de Celsius para Fahrenheit

        String mensagem = String.format("A temperatura de %f Celsius é de 2.f% fahrenheit", c,f);
        System.out.println(mensagem);

        int fInteira = (int) c;
        System.out.println("A temperatura em Fahrenheit inteira é: " + fInteira);

    }
}*/

/* public class Desafios {
    public static void main(String[] args) {

        int nota1 = 10, nota2 = 8,media;

        media = (10 + 8) /2;

        System.out.println("A média das 2 notas foi de: " + media);
    }
}*/

 /*public class Desafios {
    public static void main(String[] args) {

        double nota1 = 6.7, nota2 = 8.8;

        int media; media = (int) (nota1 + nota2) /2;

        System.out.println("A média das 2 notas foi de: " + media);
    }
}
*/

/* public class Desafios {

    public static void main(String[] args) {
        int contador = 0;

        while(contador < 10) {
            contador++;
            System.out.println(contador);
        }
    }
}*/

/* import java.util.Random;
import java.util.Scanner;

    public class Desafios {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int numeroAleatorio = new Random().nextInt(100);
            int tentaivas = 0;
            int num = 0;



            while (tentaivas < 5) {
                System.out.println("Digite um número aleatório entre 0 e 100: ");
                num = sc.nextInt();
                tentaivas++;

                if (num == numeroAleatorio) {
                    System.out.println("Parabens você acertou!!! ");
                    break;
                } else if (num < numeroAleatorio) {
                    System.out.println("O numero digitado é menor que o numero aleatório");
                } else {
                    System.out.println("O numero digitado é maior que o numero aleatório");
                }

            }
            if (tentaivas == 5 && num != numeroAleatorio) {
                System.out.println("Você não conseguiu acertar o número aleatório");
                System.out.println("O numero aleatorio era: " + numeroAleatorio);

            }
        }
    }
*/

import java.util.Scanner;

/*public class Desafios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if(num > 0){
            System.out.println("Esse é um numero positivo! ");
        } else {
            System.out.println("Esse é um numero negativo! ");
        }
    }
}

*/

public class Desafios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2;

        System.out.println("Insira o valor do numero 1: ");
        num1 = sc.nextInt();

        System.out.println("Insira o valor do numero 2: ");
        num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("São numeros iguais: ");
        }
        else if(num1 > num2){
            System.out.println("O numero 1 é maior que o numero 2 ");
        } else {
            System.out.println("O numero 2 é maior que o numero 1");
        }
    }
}