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
public class Polygone {

    protected Point[] sommets;

    /**
     *
     * @param sommets
     */
    public Polygone(Point[] sommets) {
        this.sommets = sommets;
    }

    public Point[] getSommets() {
        return this.sommets;
    }

    public double perimetre() {
        double result = 0;
        for (int i = 0; i < getSommets().length; i++) {
            result += getSommets()[i].distance(getSommets()[(i+1) % getSommets().length]);
        }

        return result;
    }

    public double surface() {
        return -1;
    }

    public String texteSommets() {
        StringBuffer buff = new StringBuffer();
        for (Point p : getSommets()) {
            buff.append(p.toString());
            buff.append(' ');
        }
        return buff.toString();
    }

    /**
     *
     * @param p
     */
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Polygone)) {
            return false;
        }
        Polygone poly = (Polygone) obj;

        boolean b = false;
        for (int i = 0; i < this.getSommets().length; i++) {
            for (int j = 0; j < poly.getSommets().length; j++) {
                if ((this.getSommets()[i].equals(poly.getSommets()[j]))) {
                    b = true;
                }
            }
            if (b == false) {
                return false;
            }
            b = false;
        }
        return true;
    }

    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Polygone à ");
        buff.append(this.getSommets().length);
        buff.append(" sommets ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
