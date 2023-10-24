/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harch
 */
public abstract class ComparableCircle extends Circle implements Comparable, Colorable {
    public ComparableCircle(double radius) {
        super(radius);
    }
    public int compareTo(Object obj) {
        ComparableCircle comparableCircle = (ComparableCircle) obj;
        if (getRadius() > comparableCircle.getRadius())
            return 1;
        else if (getRadius() < comparableCircle.getRadius())
            return -1;
        else
            return 0;
    }
    public void howToColor() {
        
    }
}