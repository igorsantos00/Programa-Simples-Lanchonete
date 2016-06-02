package projeto1;

import java.util.Scanner;

public class Projeto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float resultado = 0;

        System.out.println("Código          Especificação          Preço");
        System.out.println("1               Cachorro Quente        R4:00 ");
        System.out.println("2               X-Salada               R4:50 ");
        System.out.println("3               X-Bacon                R5:00 ");
        System.out.println("4               Torrada Simples        R2:00 ");
        System.out.println("5               Refrigerante           R1:50 ");

        System.out.println("Digite o Código do produto");
        int codi = leia.nextInt();

        System.out.println("Digite a Quantidade do Produto");
        int qnt = leia.nextInt();

        if ( qnt < 1) {
            
            
            System.out.println("Quantidade inválida");
            
           }else{
            if (codi == 1) {

                resultado = (qnt * 4.00f);

                System.out.println("O Valor Total é " + resultado);

            } else {
                if (codi == 2) {

                    resultado = (qnt * 4.50f);

                    System.out.println("O Valor Total é " + resultado);

                } else {
                    if (codi == 3) {

                        resultado = (qnt * 5.00f);

                        System.out.println("O Valor Total é " + resultado);

                    } else {
                        if (codi == 4) {

                            resultado = (qnt * 2.00f);

                            System.out.println("O Valor Total é " + resultado);

                        } else {
                            if (codi == 5) {

                                resultado = (qnt * 1.50f);

                                System.out.println("O Valor Total é " + resultado);

                            } else {

                                System.out.println("Código inexistente");

                            }

                        }

                    }

                }
            }

        }
    }
}
