package tp_securite1;

import java.util.Scanner;

/**
 *
 * @EJIBA Marco
 */
public class Tp_securite1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // lecture des élements de la clé K
        int tab1[] = new int[8];
        Scanner VAL = new Scanner(System.in);
        for (int i = 0; i < 8; i++) {
            System.out.print("ECRIRE LE BIT DE LA POSITION  " + i + ":");
            tab1[i] = VAL.nextInt();
        }
        //visualisation des élements de la clé K 
        for (int i = 0; i < 8; i++) {
            System.out.print(tab1[i] + "-");
        }
        System.out.println(" = K");

        // élèments de la fonction de permutation   
        int tab2[] = new int[8];
        for (int j = 0; j < 8; j++) {
            System.out.print("ENTREZ L'ELEMENT DE LA FONCTION POSITION " + j + ":");
            tab2[j] = VAL.nextInt();
        }
        //Affichage de données de la fonction de permutation 
        for (int j = 0; j < 8; j++) {
            System.out.print(tab2[j] + "-");
        }
        System.out.println(" = FONCTION DE PERMUTATION ");

        //utilisation de la fonction permutation 
        System.out.print("LA FONCTION DE PERMUTATION DEVIENT : " + tab1[6] + "-" + tab1[5] + "-" + tab1[2] + "-" + tab1[7] + "-" + tab1[4] + "-" +
                tab1[1] + "-" + tab1[3] + "-" + tab1[0]);
        System.out.println("");

        //recuperation de la clé K1
        System.out.print(" K1 = " + tab1[6] + "-" + tab1[5] + "-" + tab1[2] + "-" + tab1[7]);
        System.out.println("");
        // recuperation de la clé K2
        System.out.print(" K2 = " + tab1[4] + "-" + tab1[1] + "-" + tab1[3] + "-" + tab1[0]);
        System.out.println("");
        System.out.print("k'1 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(0 + "-");
        } else {
            System.out.print(1 + "-");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(0 + "-");
        } else {
            System.out.print(1 + "-");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(0 + "-");
        } else {
            System.out.print(1 + "-");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(0 + "-");
        } else {
            System.out.print(1 + "-");
            System.out.println("");
        }
        System.out.print(" K'2 = ");
        if (tab1[6] == tab1[4]) {
            System.out.print(1 + "-");
        } else if (tab1[6] == 0 && tab1[4] == 0) {
            System.out.print(0 + "-");
        } else {
            System.out.print(0 + "-");
        }
        if (tab1[5] == tab1[1]) {
            System.out.print(1 + "-");
        } else if (tab1[5] == 0 && tab1[1] == 0) {
            System.out.print(0 + "-");
        } else {
            System.out.print(0 + "-");
        }
        if (tab1[2] == tab1[3]) {
            System.out.print(1 + "-");
        } else if (tab1[2] == 0 && tab1[3] == 0) {
            System.out.print(0 + "-");
        } else {
            System.out.print(0 + "-");
        }
        if (tab1[7] == tab1[0]) {
            System.out.print(1 + "-");
        } else if (tab1[7] == 0 && tab1[0] == 0) {
            System.out.print(0 + "-");
        } else {
            System.out.print(0 + "-");
            System.out.println("");
        }
        //decalage à gauche de la clé K1
        System.out.println("K1 = G2(K1) = " + tab1[2] + "-" + tab1[7] + "-" + tab1[6] + "-" + tab1[5]);

        //decalage à droite de la clé K2
        System.out.println("K2 = D1(K2) = " + tab1[0] + "-" + tab1[4] + "-" + tab1[1] + "-" + tab1[3]);
    }

}
