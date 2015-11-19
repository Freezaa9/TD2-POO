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
        System.out.println("------Test de la classe Point : ------");
        Point p1 = new Point(-12, 0);
        Point p2 = new Point(5, 10);
        System.out.println("Affichage de la distance entre le point 1 et le point 2 :");
        System.out.println(p1.distance(p2));
        System.out.println("Affichage de la distance entre le point 2 et le point 1 :");
        System.out.println(p2.distance(p1));
        System.out.println("Test des get :");
        System.out.println("p1.getX()");
        System.out.println(p1.getX());
        System.out.println("p1.getY()");
        System.out.println(p1.getY());
        System.out.println("p2.getX()");
        System.out.println(p2.getX());
        System.out.println("p2.getY()");
        System.out.println(p2.getY());
        System.out.println(" Test de memeReel()");
        System.out.println("Valeur de x 3.999999999999 identique pour y");
        System.out.println(p1.memeReel(3.999999999999, 3.999999999999));
        System.out.println("Valeur de x 3.999999999998, valeur de y 3.999999999999");
        System.out.println(p1.memeReel(3.999999999998, 3.999999999999));
        System.out.println("Valeur de x 3.999999979998, valeur de y 3.999999999999");
        System.out.println(p1.memeReel(3.999999979998, 3.999999999999));
        System.out.println(" Test de toString()");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");
        System.out.println("------Test de la classe Polygone : ------");
        Point p3 = new Point(1, 2);
        Point p4 = new Point(3, 1);
        Point p5 = new Point(2, 4);
        Point p6 = new Point(3, 5);
        Point p7 = new Point(1, 1);
        try {
            Polygone poly1 = new Polygone((new Point[]{p1, p2, p3, p4, p5, p6}));
            //Polygone poly1 = new Polygone((new Point[]{p1, p2, p3, p4, p5, p6}));
            Polygone poly2 = new Polygone((new Point[]{p3, p6, p5, p2, p4, p1}));
            Polygone poly3 = new Polygone((new Point[]{p7, p6, p5, p2, p4, p1}));
            System.out.println(" Test de perimetre() :");
            System.out.println("Perimetre de poly1 :");
            System.out.println(poly1.perimetre());
            System.out.println("Perimetre de poly2");
            System.out.println(poly2.perimetre());
            System.out.println("Test de texteSommets() :");
            System.out.println("Sommets de poly1 :");
            System.out.println(poly1.texteSommets());
            System.out.println("Sommets de poly2 : ");
            System.out.println(poly2.texteSommets());
            System.out.println("Sommets de poly3 : ");
            System.out.println(poly3.texteSommets());
            System.out.println("Test de equals() :");
            System.out.println("poly1 equals() poly2 :");
            System.out.println(poly1.equals(poly2));
            System.out.println("poly1 equals() poly2 : ");
            System.out.println(poly1.equals(poly3));
            System.out.println("Test de toString() : ");
            System.out.println(poly1);

            System.out.println("");
            System.out.println("------Test de la classe Triangle : ------");
            Point p10 = new Point(1, 3);
            Point p11 = new Point(3, 3);
            Point p12 = new Point(2, 1);
            Point p13 = new Point(0, 0);
            Point p14 = new Point(2, 0);
            Point p15 = new Point(1, Math.sqrt(3));
            Triangle tri1 = new Triangle(p1, p2, p3);
            Triangle tri2 = new Triangle(p10, p11, p12);
            Triangle tri3 = new Triangle(p13, p14, p15);
            System.out.println("Test de surface() : ");
            System.out.println(" surface de tri1 :");
            System.out.println(tri1.surface());
            System.out.println("Test de triangle Scalène : ");
            System.out.println(tri1);
            System.out.println("Test de triangle isocèle :");
            System.out.println(tri2);
            System.out.println("Test de triangle équilatéral :");
            System.out.println(tri3);
            System.out.println("");
            System.out.println("------Test de la classe Rectangle : ------");
            Point pa = new Point(1, 1);
            Point pb = new Point(2, 0);
            Rectangle rec1 = new Rectangle(pa, pb);
            System.out.println("Test de surface() : ");
            System.out.println(rec1.surface());
            System.out.println("Test de toString : ");
            System.out.println(rec1);
            System.out.println("");
            System.out.println("------Test de la classe Carré : ------");
            Carre c1 = new Carre(p2, 10);
            System.out.println("Test de surface() : ");
            System.out.println(c1.surface());
            System.out.println("Test de toString : ");
            System.out.println(c1);
            System.out.println("");
            System.out.println("------Test de la classe ListePolygone : ------");
            ListePolygone lp = new ListePolygone();
            lp.ajoutPolygone(poly1);
            lp.ajoutPolygone(poly2);
            lp.ajoutPolygone(rec1);
            lp.ajoutPolygone(c1);
            lp.ajoutPolygone(tri1);
            lp.ajoutPolygone(tri2);
            System.out.println("Test de afficheInfos() :");
            lp.afficheInfos();
            System.out.println("Test de toString");
            System.out.println(lp);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Test de condition contructeur polygone :");
        try {
            Triangle triangle1 = new Triangle(p1, p1, p2);
            System.out.println(triangle1);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            Polygone polygone1 = new Polygone(new Point[]{p1, p2});
            System.out.println(polygone1);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
