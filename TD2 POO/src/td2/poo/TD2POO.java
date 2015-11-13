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
        Point p1 = new Point(0,0);
        Point p2 = new Point(2,0);
        Point p3 = new Point(1, Math.sqrt(3));
        Point p4 = new Point(-100, 20);
        Point p5 = new Point(2, 4);
        Point p6 = new Point(3, 5);
        Point p7 = new Point(1, 1);
        Polygone poly1 = new Polygone((new Point[]{p1, p2, p3, p4}));
        Polygone poly2 = new Polygone((new Point[]{p3, p6, p5, p2, p4, p1}));
        Triangle tri = new Triangle(p1,p2,p3);
        System.out.println(tri);

    }

}
