package shapes;

import java.awt.Color;
import processing.core.PApplet;

public class Rectangle {

  PApplet p;
	private float x;
	private float y;
	private float width;
	private float height;
	private Color innerColor;

	public Rectangle(PApplet tempP, float tempX, float tempY, float tempW, float tempH){
		p = tempP;
		x = tempX;
		y = tempY;
		width = tempW;
		height = tempH;
		innerColor = new Color(255,255,255);
	}
}
