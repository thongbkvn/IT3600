package com.utils;
import javax.swing.JOptionPane;

public class Point {
    private String label;
    private double x;
    private double y;

    public Point() {
	setLabel("A");
	setX(0);
	setY(0);
    }

    public Point(double x, double y) {
	setLabel("A");
	setX(x);
	setY(y);
    }

    public Point(String label, double x, double y) {
	setLabel(label);
	setX(x);
	setY(y);
    }

    public Point(Point point) {
	label = point.label;
        x = point.x;
	y = point.y;
    }

    public void nhap() {
	setLabel(JOptionPane.showInputDialog(null, "Nhập tên điểm: ", "Nhập thông tin điểm", 3));
	setX(Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập hoành độ (x): ", "Nhập thông tin điểm", 3)));
	setY(Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập tung độ (y): ", "Nhập thông tin điểm", 3)));
    }

    public void hienThi() {
	JOptionPane.showMessageDialog(null, "Điểm " + label + "(" + x + ", " + y + ")");
    }
    
    public void setLabel(String label) {
	this.label = label;
    }

    public String getLabel() {
	return label;
    }

    public void setX(double x) {
	this.x = x;
    }

    public double getX() {
	return x;
    }

    public void setY(double y) {
	this.y = y;
    }

    public double getY() {
	return y;
    }
}
