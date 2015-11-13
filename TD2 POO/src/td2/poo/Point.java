/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2.poo;

import java.lang.Math;

/**
 *
 * @author Geoffrey
 */
public class Point {

    private double x;
    private double y;

    /**
     *
     * @param x
     * @param y
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    /**
     *
     * @param p
     */
    public double distance(Point p) {
        return Math.sqrt(Math.pow(this.getX() - p.getX(), 2) + Math.pow(this.getY() - p.getY(), 2));
    }

    /**
     *
     * @param x
     * @param y
     */
    public static boolean memeReel(double x, double y) {
        return (Math.abs(x - y) < 0.0000000001);
    }

    /**
     *
     * @param p
     */
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point p = (Point) obj;
        return (Point.memeReel(this.getX(), p.getX())) && (Point.memeReel(this.getY(), p.getY()));
    }

    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append('<');
        buff.append(this.getX());
        buff.append(',');
        buff.append(this.getY());
        buff.append('>');
        return buff.toString();
    }

}
