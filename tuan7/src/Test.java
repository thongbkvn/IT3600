import java.util.Date;
public class Test {
    public static void main(String args[]) {
	Gate[] gate = new Gate[4];
	gate[0] = new Gate("A", 0);
	gate[1] = new Gate("B", 17);
	gate[2] = new Gate("C", 22);
	gate[3] = new Gate("D", 33);
	Line dsvn = new Line(gate);

	OneWayTicket t1 = new OneWayTicket(6000, new Date());
	OneWayTicket t2 = new OneWayTicket(20000, new Date());
	OneWayTicket t3 = new OneWayTicket(9000, new Date());
	
	gate[0].enter(t1); //Khong duoc vao ga
	
	gate[0].enter(t2); //Duoc vao ga
	gate[3].exit(t2); //Khong duoc ra ga

	gate[1].enter(t3); //Duoc vao ga
	gate[2].exit(t3); //Duoc ra ga
	
	PrepaidCard p1 = new PrepaidCard(5000, new Date());
	PrepaidCard p2 = new PrepaidCard(20000, new Date());
	PrepaidCard p3 = new PrepaidCard(9000, new Date());

	gate[3].enter(p1); //Khong duoc vao ga
	
	gate[3].enter(p2); //Vao duoc ga
	gate[0].exit(p2); //Khong ra duoc ga

	gate[2].enter(p3); //Vao duoc ga
	gate[1].exit(p3); //Ra duoc ga
    }
}
