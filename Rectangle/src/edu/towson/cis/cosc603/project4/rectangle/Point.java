package edu.towson.cis.cosc603.project4.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** x and y coordinates. */
	public Double x, y;
	
	/**
	 * Instantiates a new point.
	 *
	 * @param x the x
	 * @param y the y
	 */
	Point(Double x, Double y) {
		//this.x = y;//This is the error in the code because it sets the x value to the y coordinate
		this.x = x;
		this.y = y;
	}
}
