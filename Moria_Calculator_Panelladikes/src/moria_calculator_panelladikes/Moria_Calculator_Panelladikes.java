package moria_calculator_panelladikes;

import java.util.Scanner;

public class Moria_Calculator_Panelladikes {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer;

        do {
            System.out.println("\n===========================================");
            System.out.println("-- Ypologismos Moriwn Gia Tis Panelladikes --");
            System.out.println("===========================================");
            System.out.println("1. Thetikh Kateuthinsh");
            System.out.println("2. Thewritikh Kateuthinsh");
            System.out.println("3. Kateuthinsh Ygeias");
            System.out.println("4. Oikonomikh Kateuthinsh");
            System.out.println("0. Eksodos (Exit)");

            System.out.print("\nParakalw plhktrologiste ton arithmo ths kateuthinshs sas: ");
            answer = in.nextInt();

            if (answer == 0) {
                System.out.println("Kalo apotelesma! Termatismos programmatos...");
                break;
            }

            switch (answer) {
                case 1 -> calculateMoria(in, "Ekthesh", "Mathimatika", "Xhmeia", "Fysikh");
                case 2 -> calculateMoria(in, "Ekthesh", "Istoria", "Arxaia", "Latinika");
                case 3 -> calculateMoria(in, "Ekthesh", "Xhmeia", "Biologia", "Fysikh");
                case 4 -> calculateMoria(in, "Ekthesh", "Mathimatika", "Plhroforikh", "Oikonomia");
                default -> System.out.println("Mh egkyrh epilogh. Prospathiste ksana.");
            }

        } while (true); 
        
        in.close(); 
    }

    private static void calculateMoria(Scanner in, String sub1, String sub2, String sub3, String sub4) {
        System.out.println("\nParakalw eisagete thn baruthta twn mathimatwn ths sxolhs (se %): ");
        System.out.print("--" + sub1 + ": "); double w1 = in.nextDouble();
        System.out.print("--" + sub2 + ": "); double w2 = in.nextDouble();
        System.out.print("--" + sub3 + ": "); double w3 = in.nextDouble();
        System.out.print("--" + sub4 + ": "); double w4 = in.nextDouble();

        System.out.println("\nParakalw eisagete tous bathmous sas (0-20): ");
        System.out.print("--" + sub1 + ": "); double g1 = in.nextDouble();
        System.out.print("--" + sub2 + ": "); double g2 = in.nextDouble();
        System.out.print("--" + sub3 + ": "); double g3 = in.nextDouble();
        System.out.print("--" + sub4 + ": "); double g4 = in.nextDouble();

        double total_grade = (g1 * w1 / 100 + g2 * w2 / 100 + g3 * w3 / 100 + g4 * w4 / 100) * 1000;
        
        System.out.println("\n>>> Ta moria gia thn sxolh pou exete epileksei einai: " + total_grade);
    }
}