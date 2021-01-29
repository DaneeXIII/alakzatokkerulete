/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahf_0128_kerulet;

/**
 *
 * @author szark
 */
import java.util.Scanner;
public class Javahf_0128_kerulet {
    static int teglalapK(int teglalapA, int teglalapB) {
        return (teglalapA + teglalapB) * 2;
    }

    static double korSugar(int r) {
        return (2 * (r * Math.PI));
    }

    static int haromszogK(int haromszogA, int haromszogB, int haromszogC) {
        return haromszogA + haromszogB + haromszogC;
    }

    static int otszog(int otszogOldal) {
        return 5 * otszogOldal;
    }

    static int hatszog(int hatszogOldal) {
        return 6 * hatszogOldal;
    }

    public static void main(String[] args) {
        System.out.print("\t\t\tAlakzatok kerületének számítása, menüvel\n\t\t\tSzarka Dániel 113C\n\t\t\t2020.01.28");
        Scanner sc = new Scanner(System.in);
        char valasz;
        do {
            System.out.print("\nVálassza ki a kívánt alakzatot a megfelelő szám lenyomásával.\n1-Téglalap\n2-Kör\n3-Háromszög\n4-Szabályos ötszög\n5-Szabályos hatszög");
            System.out.print("\nVálasz: ");
            int menupont = sc.nextInt();
            while (menupont > 5 || menupont < 1) {
                System.out.print("Ilyen opció nincs. 1-től 5-ig választhat:");
                menupont = sc.nextInt();
            }
            switch (menupont) {
                case 1:
                    System.out.println("Téglalap");
                    System.out.print("Adja meg az 'A' oldalt!: ");
                    int tA = sc.nextInt();
                    System.out.print("Adja meg a 'B' oldalt!: ");
                    int tB = sc.nextInt();
                    System.out.println("A téglalap kerülete " + teglalapK(tA, tB) + " cm.");
                    break;
                case 2:
                    System.out.println("Kör");
                    System.out.print("Adja meg a kör sugarát!: ");
                    int sugar = sc.nextInt();
                    System.out.println("A kör területe " + korSugar(sugar) + "cm.");
                    break;
                case 3:
                    System.out.println("Háromszög");
                    System.out.print("Adja meg az 'A' oldalt!: ");
                    int hszA = sc.nextInt();
                    System.out.print("Adja meg a 'B' oldalt!: ");
                    int hszB = sc.nextInt();
                    System.out.print("Adja meg a 'C' oldalt!: ");
                    int hszC = sc.nextInt();
                    System.out.println("A háromszög kerülete " + haromszogK(hszA, hszB, hszC) + " cm.");
                    break;
                case 4:
                    System.out.println("Szabályos ötszög");
                    System.out.print("Adja meg az ötszög oldalát!: ");
                    int oldal5 = sc.nextInt();
                    System.out.println("Az ötszög kerülete " + otszog(oldal5) + " cm.");
                    break;
                case 5:
                    System.out.println("Szabályos hatszög");
                    System.out.print("Adja meg a hatszög oldalát!: ");
                    int oldal6 = sc.nextInt();
                    System.out.println("A hatszög kerülete " + hatszog(oldal6) + " cm.");
                    break;
                default:
                    break;
            }
            System.out.print("Amennyiben szeretne még továbbb számol(tat)ni, nyomja meg az 'i' billentyűt!");
            valasz = sc.next().charAt(0);
        } while (valasz == 'i');
    }
}