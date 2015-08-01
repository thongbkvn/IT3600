package com.bean;
import javax.swing.JOptionPane;

public class Fan {
    protected int speed = 8;
    protected boolean on = false;
    protected double radius = 20;
    protected String color = "White";

    public Fan() {}

    public Fan(int speed, boolean on, double radius, String color) {
	setSpeed(speed);
	setRadius(radius);
	setOn(on);
	setColor(color);
    }

    public void show() {
	String s;
	if (on)
	    s = ", Bật";
	else
	    s = ", Tắt";
	JOptionPane.showMessageDialog(null, "Tốc độ " + speed + s + ", Bán kính " + radius + ", Màu " + color);
    }
    
    public int getSpeed() {
	return speed;
    }

    public void setSpeed(int speed) {
	if (speed >=0)
	    this.speed = speed;
    }

    public boolean isOn() {
	return on;
    }

    public void setOn(boolean on) {
	this.on = on;
    }

    public void setRadius(double radius) {
	if (radius > 0)
	    this.radius = radius;
    }

    public double getRadius() {
	return radius;
    }

    public String getColor() {
	return color;
    }

    public void setColor(String color) {
	this.color = color;
    }
}
