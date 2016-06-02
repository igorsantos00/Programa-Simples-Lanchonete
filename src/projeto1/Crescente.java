/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto1;

import java.util.Scanner;

/**
 *
 * @author igor.rrsantos
 */
public class Crescente {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        float troca = 0;

        System.out.println("Digite Um Número");
        float n1 = leia.nextFloat();

        System.out.println("Digite Outro Número");
        float n2 = leia.nextFloat();

        System.out.println("Digite Mais um Número");
        float n3 = leia.nextFloat();

        if (n1 > n2) {

            troca = n1;
            n1 = n2;
            n2 = troca;

        }
        if (n1 > n3) {

            troca = n1;
            n1 = n3;
            n3 = troca;

        }

        if (n2 > n3) {

            troca = n2;
            n2 = n3;
            n3 = troca;

        }

        System.out.println("Os Números São");
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}

