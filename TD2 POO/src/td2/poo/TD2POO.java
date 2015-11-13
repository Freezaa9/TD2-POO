/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.poo;

/**
 *
 * @author Geoffrey
 */
public class TD2POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1 = new Point(4, 0);
        Point p2 = new Point(5, 1);
        Point p3 = new Point(2, 0);
        Point p4 = new Point(3, 1);
        Point p5 = new Point(2, 4);
        Point p6 = new Point(3, 5);
        Point p7 = new Point(1, 1);
        Polygone poly1 = new Polygone((new Point[]{p1, p2, p3, p4, p5, p6}));
        Polygone poly2 = new Polygone((new Point[]{p3, p6, p5, p2, p4, p1}));
        System.out.println(poly1.perimetre());
        System.out.println(poly1);

    }

}
