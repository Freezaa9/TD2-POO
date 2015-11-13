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
public class Rectangle extends Polygone {

	/**
	 * 
	 * @param sg
	 * @param id
	 */
	public Rectangle(Point sg, Point id) {            
            super(new Point[]{sg, id});
	}

	public double surface() {
		// TODO - implement Rectangle.surface
		throw new UnsupportedOperationException();
	}

	public String toString() {
		// TODO - implement Rectangle.toString
		throw new UnsupportedOperationException();
	}

}