///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package td2.poo;

/**
 *
 * @author Geoffrey
 */
public class Carre extends Rectangle {

        double l;
	/**
	 * 
	 * @param sg
	 * @param l
	 */
	public Carre(Point sg, double l) {
            super(sg, new Point (sg.getX() - l, sg.getY() + l));
            this.l=l;
	}
        
        @Override
	public double surface() {
            return l*2;
	}

        @Override
	public String toString() {
            StringBuffer buff = new StringBuffer();
            buff.append("Carré à plat ");
            buff.append(this.texteSommets());
            return buff.toString();
	}

}