//In tam giac vuong va tam giac can
import java.util.*;
public class bai4 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int h;
	System.out.print("Nhap vao chieu cao tam giac: ");
	h = sc.nextInt();

	//in tam giac vuong
	System.out.println("Tam giac vuong");
	for (int i=0; i<h; ++i) {
	    for (int j=0; j<=i; ++j)
		System.out.print('*');
	    System.out.println();
	}

	
	//in tam giac can
	System.out.println("\nTam giac can");
	for (int i=0; i<h; ++i) {
	    for (int j=h; j>i; --j)
		System.out.print(' ');
	    for (int j=0; j<2*i+1; ++j)
		System.out.print('*');
	    System.out.println();
	}
		     
	
    }
}
