//Tao lop MyDate theo ki thuat dong goi va che giau thong tin cua lap trinh huong doi tuong
import javax.swing.JOptionPane;

public class bai1 {
    public static void main(String args[]) {
	MyDate a = new MyDate();
	// a.setYear(2001);
	// a.setMonth(13);
	// a.setDay(29);
	a.nhap();
	a.hienThi();
    }
}

class MyDate {
    private int day = 1;
    private int month = 1;
    private int year;

    public void setYear(int year) {
	this.year = year;
    }

    public int getYear() {
	return year;
    }

    public boolean setMonth(int month) {
	if (month>=1 && month<=12) {
	    this.month = month;
	    return true;
	}
	System.out.println("Nhap sai thang");
	return false;
    }

    public int getMonth() {
	return month;
    }

    public boolean setDay(int day) {
	if (day>=1 && day<=dayOfTheMonth(this.month, this.year)) {
	    this.day = day;
	    return true;
	}
	System.out.println("Nhap sai ngay");
	return false;
    }

    public int getDay() {
	return day;
    }
    
    public static int dayOfTheMonth(int month, int year) {
	int A[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int B[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	if ((year%4==0 && year%100!=0) || (year%400==0))
	    return B[month];
	else
	    return A[month];
    }

    public void nhap() {
	String inputString;
	
	inputString = JOptionPane.showInputDialog(null, "Nhập vào năm: ", "Nhập ngày, tháng năm", 1);

	while (inputString==null || inputString.equals("")) {
	    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, mời nhập lại!");
	    inputString = JOptionPane.showInputDialog(null, "Nhập vào năm: ", "Nhập ngày, tháng năm", 1);
	}

	setYear(Integer.parseInt(inputString));

	inputString = JOptionPane.showInputDialog(null, "Nhập vào tháng: ", "Nhập ngày, tháng năm", 1);	
	while (inputString==null || inputString.equals("") || !setMonth(Integer.parseInt(inputString))) {
		JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, mời nhập lại!");
		inputString = JOptionPane.showInputDialog(null, "Nhập vào tháng: ", "Nhập ngày, tháng năm", 1);
	    }

	inputString = JOptionPane.showInputDialog(null, "Nhập vào ngày: ", "Nhập ngày, tháng năm", 1);
	while (inputString==null || inputString.equals("") || !setDay(Integer.parseInt(inputString))) {
 		JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, mời nhập lại!");
		inputString = JOptionPane.showInputDialog(null, "Nhập vào ngày: ", "Nhập ngày, tháng năm", 1);
	    }
    }

    public void hienThi() {
	JOptionPane.showMessageDialog(null, "Ngày " + day + " tháng " + month + " năm " + year);
    }
	
}
