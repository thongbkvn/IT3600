//Sap xep mang
import java.util.*;
public class bai5 {
    public static void main(String args[]) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.print("Nhap so phan tu: ");
	n = sc.nextInt();

	double A[] = new double[n];
	System.out.println("Nhap vao " + n + "so thuc: ");
	for (int i=0; i<n; i++) {
	    System.out.print("A["+i+"]: ");
	    A[i] = sc.nextDouble();
	}

	//Sap xep chon tang dan
	for (int i=n-1; i>=0; --i) {
	    int max = 0;
	    for (int j=1; j<=i; ++j)
		if (A[max] < A[j])
		    max = j;
	    if (max != i) {
		double tmp = A[i];
		A[i] = A[max];
		A[max] = tmp;
	    }
	}

	//In day da sap xep ra man hinh
	for (int i=0; i<n; i++)
	    System.out.print(A[i] + " ");
	System.out.println();
    }
}
