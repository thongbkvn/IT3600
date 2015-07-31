import java.util.*;
public class bai2 {
    public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap vao 2 so nguyen a, b: ");
	int a, b;
	a = sc.nextInt();
	b = sc.nextInt();
	System.out.printf("Tong: %d\nHieu: %d\nTich: %d\nThuong: %d\n", a+b, a-b, a*b, a/b);
    }
}
