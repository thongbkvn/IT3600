//Cai tien lop MyDate tuan 3
import java.util.*;
import javax.swing.JOptionPane;

public class bai1 {
    public static void main(String args[]) {
	MyDate a = new MyDate();
	a.hienThi();
	MyDate b = new MyDate(10, 10, 2010);
	b.hienThi();
	a = new MyDate(b);
	a.hienThi();
    }
}

class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 1;
    private static String[] DAY_OF_WEEK = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư",
					   "Thứ năm", "Thứ sáu", "Thứ bảy"};
    
    MyDate() {
	Calendar cal = Calendar.getInstance();
	day = cal.get(Calendar.DAY_OF_MONTH);
	month = cal.get(Calendar.MONTH) + 1;
	year = cal.get(Calendar.YEAR);
    }

    MyDate(int day, int month, int year) {
	setYear(year);
	setMonth(month);
	setDay(day);
    }

    MyDate(MyDate x) {
	this.day = x.day;
	this.month = x.month;
	this.year = x.year;
    }
	
    
    public boolean setYear(int year) {
	if (year>0) {
	    this.year = year;
	    return true;
	}
	return false;
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

	while (inputString==null || inputString.equals("") || !setYear(Integer.parseInt(inputString))) {
	    JOptionPane.showMessageDialog(null, "Đã xảy ra lỗi, mời nhập lại!");
	    inputString = JOptionPane.showInputDialog(null, "Nhập vào năm: ", "Nhập ngày, tháng năm", 1);
	}

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
	JOptionPane.showMessageDialog(null,dayOfTheWeek() + " ngày " + day + " tháng " + month + " năm " + year);
    }

    public String dayOfTheWeek() {
	int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	int y = year;
	if (month<3)
	    y -= 1;
	return DAY_OF_WEEK[(y + y/4 -y/100 + y/400 +t[month-1] +day) %7];
    }	
	
}
