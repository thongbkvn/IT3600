package com.bean;
import javax.swing.JOptionPane;

public class ElectricFan extends Fan {
    private double electricCurrent;

    public ElectricFan(int speed, boolean on, double radius, String color, double electricCurrent) {
	super(speed, on, radius, color);
	setElectricCurrent(electricCurrent);
    }
    
    public void setElectricCurrent(double voltage) {
	electricCurrent = voltage;
    }

    public double getElectricCurrent() {
	return electricCurrent;
    }

    public void changeSpeed(int change) {
	if (on && speed+change > 0)
	    speed += change;
    }

    public void show() {
	String s;
	if (on)
	    s = ", Bật";
	else
	    s = ", Tắt";
	JOptionPane.showMessageDialog(null, "Tốc độ " + speed + s + ", Bán kính " + radius + ", Màu " + color + ", Điện áp " + electricCurrent);
    }
}
