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

	/**
	 * 
	 * @param sg
	 * @param l
	 */
	public Carre(Point sg, double l) {
            super(sg, new Point (sg.getX() - l, sg.getY() + l));
	}

	public double surface() {
            return (this.getSommets()[0].distance(this.getSommets()[1]))*2;
	}

	public String toString() {
            StringBuffer buff = new StringBuffer();
            buff.append("Carré à plat ");
            buff.append(this.texteSommets());
            return buff.toString();
	}

}