package com.test;
import com.utils.Point;
import com.bean.Quadrangle;

public class TestQuad {
    public static void main(String args[]) {
	Quadrangle a = new Quadrangle();
	a.hienThi();
	
	Point p1 = new Point(0, 2);
	Point p2 = new Point(0, 3);
	Point p3 = new Point(4, 3);
	Point p4 = new Point(2, 2);
	Quadrangle b = new Quadrangle(p1, p2, p3, p4);
	b.hienThi();

	Quadrangle c = new Quadrangle();
	c.nhap();
	c.hienThi();
    }
}
