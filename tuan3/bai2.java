//Tao lop so phuc
import java.util.*;
public class bai2 {
    public static void main(String args[]) {
	Complex a = new Complex();
	Complex b = new Complex();
	a.nhap();
	b.nhap();
	Complex s;
	s = a.add(b);
	System.out.print("\nTong: ");
	s.hienThi();
	s = a.sub(b);
	System.out.print("\nHieu: ");
	s.hienThi();
	s = a.mult(b);
	System.out.print("\nTich: ");
	s.hienThi();
	s = a.div(b);
	System.out.print("\nThuong: ");
	s.hienThi();
	System.out.println();
    }
}

class Complex {
    private double a;
    private double b;

    public void setA(double a) {
	this.a = a;
    }

    public double getA() {
	return a;
    }

    public void setB(double b) {
	this.b = b;
    }

    public double getB() {
	return b;
    }

    public void nhap() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao phan thuc, phan ao: ");
	a = sc.nextDouble();
	b = sc.nextDouble();
	sc = null;
    }

    public Complex add(Complex x) {
	Complex tmp = new Complex();
	tmp.a = this.a + x.a;
	tmp.b = this.b +x.b;
	return tmp;
    }

    public Complex sub(Complex x) {
	Complex tmp = new Complex();
	tmp.a = this.a - x.a;
	tmp.b = this.b - x.b;
	return tmp;
    }

    public Complex mult(Complex x) {
	Complex tmp = new Complex();
	tmp.a = this.a*x.a - this.b*x.b;
	tmp.b = this.b * x.a + this.a * x.b;
	return tmp;
    }

    public Complex div(Complex x) {
	if (x.a==0 && x.b==0)
	    return null;
	Complex s;
	Complex tmp = new Complex();
	tmp.a = x.a; tmp.b = x.b;
	s = this.mult(tmp);
	s.a = s.a/(x.a*x.a + x.b*x.b);
	s.b = s.b/(x.a*x.a + x.b*x.b);
	tmp = null;
	return s;
    }

    public void hienThi() {
	System.out.print(a + " + " + b + "i");
    }
}
