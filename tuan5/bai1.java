//Cai tien lop MyDate tuan 4
import java.util.*;
import javax.swing.JOptionPane;

public class bai1 {
    public static void main(String args[]) {
	MyDate a = new MyDate();
	a.hienThi();
	JOptionPane.showMessageDialog(null, a.get(MyDate.DAY_OF_WEEK) + ", ngày " + a.get(MyDate.DAY_OF_MONTH) + " tháng " + a.get(MyDate.MONTH) + " năm " + a.get(MyDate.YEAR));
	MyDate b = new MyDate(1, 1, 1980);
	JOptionPane.showMessageDialog(null, a.before(b));
	JOptionPane.showMessageDialog(null, a.after(b));
	JOptionPane.showMessageDialog(null, a.compareTo(b));
	JOptionPane.showMessageDialog(null, a.toString(MyDate.DAY_OF_WEEK));
	JOptionPane.showMessageDialog(null, a.toString(MyDate.DAY_OF_MONTH, MyDate.MONTH, MyDate.YEAR));
	JOptionPane.showMessageDialog(null, a.toString(MyDate.DAY_OF_WEEK, MyDate.DAY_OF_MONTH, MyDate.MONTH, MyDate.YEAR));
    }
}

class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 1980;
    
    private static String[] DOTW = {"Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư",
				    "Thứ năm", "Thứ sáu", "Thứ bảy"};
    private static int A[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int B[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static final int SUNDAY = 0, MONDAY = 1, TUESDAY = 2, WEDNESDAY = 3, THURSDAY = 4,
	FRIDAY = 5, SATURDAY = 6;
    public static final int DAY_OF_MONTH = 5, MONTH = 2, YEAR = 1, DAY_OF_WEEK = 7;
    

    
    
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
	if (year>=1980) {
	    this.year = year;
	    return true;
	}
	return false;
    }

    public int get(int field) {
	switch (field) {
	case DAY_OF_MONTH:
	    return day;
	case MONTH:
	    return month;
	case YEAR:
	    return year;
	case DAY_OF_WEEK:
	    return dayOfTheWeek();
	default:
	    return -1;
	}
    }

    public boolean setMonth(int month) {
	if (month>=1 && month<=12) {
	    this.month = month;
	    return true;
	}
	System.out.println("Nhap sai thang");
	return false;
    }

   
    public boolean setDay(int day) {
	if (day>=1 && day<=dayOfTheMonth(this.month, this.year)) {
	    this.day = day;
	    return true;
	}
	System.out.println("Nhap sai ngay");
	return false;
    }

   
    
    public static int dayOfTheMonth(int month, int year) {
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
	JOptionPane.showMessageDialog(null,DOTW[dayOfTheWeek()] + " ngày " + day + " tháng " + month + " năm " + year);
    }

    public int dayOfTheWeek() {
	int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
	int y = year;
	if (month<3)
	    y -= 1;
	return (y + y/4 -y/100 + y/400 +t[month-1] +day) % 7;
    }	

    //Tra ve true neu tham so la ngay trong tuong lai
    public boolean before(MyDate otherDate) {
	if (year < otherDate.year)
	    return true;
	else if (year == otherDate.year && month < otherDate.month)
	    return true;
	else if (month == otherDate.month && day < otherDate.day)
	    return true;
	else return false;
    }

    public boolean isLeapYear() {
	if ((year%4==0 && year%100 != 0)  || year%400 == 0)
	    return true;
	return false;
    }

    //Chuyen MyDate ve so ngay tu ngay hien tai den 1/1/1980
    private int toInt() {
	int s = 0;
	for (int i=1980; i<year; i++)
	    if (i%4==0 && i%100!=0 || i%400==0)
		s += 366;
	    else
		s += 365;

	for (int i=1; i<month; i++)
	    if (i%4==0 && i%100!=0 || i%400==0)
		s += B[i];
	    else
		s += A[i];

	s += day - 1;
	return s;
    }

    public boolean after(MyDate otherDate) {
	if (!before(otherDate) &&
	    (year!=otherDate.year || month!=otherDate.month || day!=otherDate.day))
	    return true;
	return false;
    }

    public int compareTo(MyDate otherDate) {
	return toInt() - otherDate.toInt();
    }

    public String toString(int... fields) {
	if (fields.length==1 && fields[0] == DAY_OF_WEEK)
	    return DOTW[dayOfTheWeek()];
	else if (fields.length==3
		 && fields[0] == DAY_OF_MONTH
		 && fields[1] == MONTH
		 && fields[2] == YEAR)
	    return day+" / "+month+" / "+year;
	else if (fields.length==4
		 && fields[0] == DAY_OF_WEEK
		 && fields[1] == DAY_OF_MONTH
		 && fields[2] == MONTH
		 && fields[3] == YEAR)
	    return DOTW[dayOfTheWeek()] + ", " + day + " / " + month + " / " + year;
	else
	    return null;
    }
}
