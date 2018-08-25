package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Spark {
	private int size = 5;
	
	private int x;
	private int y;
	public int xVelocity;
	public int yVelocity;
	private Color color;
	
	public boolean fire = false;
	public boolean dead = false;
	
	public Spark(int x, int y) {
		this.x = x;
		this.y = y;
		Random r = new Random();
		color = new Color(r.nextInt(128) + 128, r.nextInt(128) + 128, r.nextInt(128) + 128);
		yVelocity = -30;
		xVelocity = 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public boolean isFire() {
		return fire;
	}

	public void setFire(boolean fire) {
		this.fire = fire;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}
}
