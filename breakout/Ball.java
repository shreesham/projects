package shapes;

import java.awt.Color;

import processing.core.PApplet;

public class Ball {

	private PApplet p;
	private float x;
	private float y;
	private float vx;
	private float vy;
	private float size;
	private Color color;

	public Ball(PApplet papp, float nx, float ny, float nsize, Color c){
		p = papp;
		x = nx;
		y = ny;
		size = nsize;
		color = c;

		vx = p.random(-3,3);
		vy = p.random(-3,3);
	}

	public void update(){
		x = x + vx;
		y = y + vy;

		if(x > p.width || x < 0){
			vx = -vx;
		}

		if(y > p.height || y < 0){
			vy = -vy;
		}
	}

	public void paint(){
		p.noStroke();
		p.fill(color.getRed(), color.getGreen(), color.getBlue());
		p.ellipse(x, y, size, size);
	}


	public float getX(){
		return x;
	}

	public float getY(){
		return y;
	}

	public float getVX(){
		return vx;
	}

	public float getVY(){
		return vy;
	}

	public float getSize(){
		return size;
	}

	public Color getColor(){
		return color;
	}


	public void setLocation(float nx, float ny){
		x = nx;
		y = ny;
	}

	public void setVelocity(float nvx, float nvy){
		vx = nvx;
		vy = nvy;
	}

	public void setColor(Color c){
		color = c;
	}

	public void setSize(float nsize){
		size = nsize;
	}



}
