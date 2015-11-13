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
public class Triangle extends Polygone {

    /**
     *
     * @param p1
     * @param p2
     * @param p3
     */
    public Triangle(Point p1, Point p2, Point p3) {
        super(new Point[]{p1, p2, p3});
    }

    public double surface() {
        double p = this.perimetre() / 2;
        double result = p;
        for (int i = 0; i < getSommets().length; i++) {
            result *= (p - (this.getSommets()[i].distance(this.getSommets()[(i + 1) % getSommets().length]))); //copié collé avec toString ? avoir avec méthode surface simplifié
        }
        return Math.sqrt(result);

    }

    public String toString() {
        double a = this.getSommets()[0].distance(this.getSommets()[1]);
        double b = this.getSommets()[1].distance(this.getSommets()[2]);
        double c = this.getSommets()[2].distance(this.getSommets()[0]);
        StringBuffer buff = new StringBuffer();
        buff.append("Triangle ");
        if (a == b && a == c) {
            buff.append("équilatèral ");
        }
        else if (a==b || a==c || b==c) {
            buff.append("isocèle ");
        }
        else{
            buff.append("scalène ");
        }
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
