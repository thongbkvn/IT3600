//Hien thi so ngay cua thang da nhap
import java.util.*;

public class bai3 {
    private static int A[] = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int B[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    private static boolean namNhuan(int nam) {
	if ((nam%4 == 0 && nam%100 != 0) || (nam%400==0))
	    return true;
	return false;
    }
    
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int ngay, thang, nam;
	System.out.println("Nhap vao thang, nam: ");
	thang = sc.nextInt();
	nam = sc.nextInt();

	if (thang>=12 || thang<=0) {
	    System.out.println("Ban nhap thang khong hop le!");
	    System.exit(0);
	}

	if (namNhuan(nam))
	    ngay = A[thang];
	else
	    ngay = B[thang];

	System.out.println("So ngay cua thang, nam vua nhap la: " + ngay);
	
    }
}
