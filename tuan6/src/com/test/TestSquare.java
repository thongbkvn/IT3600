package com.test;
import com.bean.Quadrangle;
import com.bean.Square;
import com.utils.Point;
import javax.swing.JOptionPane;

public class TestSquare {
    public static void main(String args[]) {
	Square s1 = new Square();
	s1.setP(2, new Point(-1, 1));
	s1.setP(3, new Point(-1, 0));
	s1.hienThi();

	Point p1 = new Point(0, 2);
	Point p2 = new Point(0, 3);
	Point p3 = new Point(1, 3);
	Point p4 = new Point(1, 2);

	Square s2 = new Square (p1, p2, p3, p4);
	s2.hienThi();

	Square s3 = new Square();
	s3.nhap();
	s3.hienThi();
    }
}
