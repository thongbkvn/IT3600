package com.bean;
import com.utils.*;
import javax.swing.JOptionPane;

public class Quadrangle {
    protected Point[] p = new Point[4];

    public Quadrangle() {
	p[0] = new Point("A", 0, 0);
	p[1] = new Point("B", 0, 1);
	p[2] = new Point("C", 1, 1);
	p[3] = new Point("D", 1, 0);
    }

    public Quadrangle(Point... p) {
	if (p.length == 4) 
	    for (int i=0; i<4; i++)
		this.p[i] = p[i];
    }
    
    public void setP(int i, Point pi) {
	p[i] = pi;
    }

    public Point getP(int i) {
	return p[i];
    }

    public void nhap() {
	JOptionPane.showMessageDialog(null, "Nhap thong tin cho 4 diem cua tu giac");
	for (int i=0; i<4; i++) 
	    p[i].nhap();
    }

    public void hienThi() {
	StringBuffer sbuf = new StringBuffer();
	for (int i=0; i<4; i++) 
	    sbuf.append(p[i].getLabel() + "(" + p[i].getX() + ", " + p[i].getY() + ") ");
	JOptionPane.showMessageDialog(null, sbuf);
    }
    
}
