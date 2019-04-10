/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa2;

/**
 *
 * @author hp
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = -4;
        double b = 3;
        double PM = (a + b) / 2;
        double i = 0;
        do {
            if (((PM*a)<0)|| (PM<0 && b<0 )){
                System.out.println("\n");
                System.out.println("i: " + i);

                System.out.println("PM : " + PM);
                b = PM;
                 System.out.println(" tomo a: " + a);
                 System.out.println("nuevo b: "+b);
                PM = (PM + a) / 2;
                System.out.println("PM+a/2: " + PM);
                i++;
                
            } else if (((PM*b)<0)|| (PM<0 && a<0 )) {
                 System.out.println("\n");
                System.out.println("i: " + i);
                System.out.println("PM: " + PM);
                a = PM;
                System.out.println("tomo b: " + b);
                System.out.println("nuevo a: "+a);
                PM = (PM + b) / 2;
                System.out.println("PM+b/2: " + PM);
                i++;
                
            }

        } while (i < 24);
        System.out.println("i: " + i);

    }

}
