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
            double a = this.getSommets()[0].distance(this.getSommets()[1]);
            double b = this.getSommets()[1].distance(this.getSommets()[2]);
            double c = this.getSommets()[2].distance(this.getSommets()[0]);
            double p = this.perimetre()/2;
            double result = p;
            //result += getSommets()[i].distance(getSommets()[(i+1) % getSommets().length]);
            for (int i = 0; i < 2; i++) {
                
            }
            
            
            return Math.sqrt((p*(p-a)*(p-b)*(p-c)));
	}

	public String toString() {
            
	}

}