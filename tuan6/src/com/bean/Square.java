package com.bean;
import com.utils.Point;
import javax.swing.JOptionPane;

public class Square extends Quadrangle {
    private Point tamDX;

    public Square() {
	super();
	tamDX = new Point((p[1].getX() + p[3].getX())/2, (p[1].getY() + p[3].getY())/2);
    }

    public Square(Point... p) {
	super(p);
	tamDX = new Point((p[1].getX() + p[3].getX())/2, (p[1].getY() + p[3].getY())/2);
    }

    public void hienThi() {
	StringBuffer sbuf = new StringBuffer();
	
	for (int i=0; i<4; i++) 
	    sbuf.append(p[i].getLabel() + "(" + p[i].getX() + ", " + p[i].getY() + ") ");
	sbuf.append("\n Tâm đối xứng: " + "("+tamDX.getX() + ", " + tamDX.getY() + ") ");
	JOptionPane.showMessageDialog(null, sbuf);
    }

    
}
