import javax.swing.JOptionPane;

public class Gate {
    private String name;
    private int distance;

    public Gate(String name, int distance) {
	setName(name);
	setDistance(distance);
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getName() {
	return name;
    }

    public void setDistance(int distance) {
	if (distance >=0)
	    this.distance = distance;
    }

    public int getDistance() {
	return distance;
    }

    public void enter(Ticket ticket) {
	if (ticket.isValid()) {
	    ticket.setOrigin(this);
	    open();
	}
	else
	    close();
    }

    public void exit(Ticket ticket) {
	int cost = Line.getFare(Math.abs(distance - ticket.getOrigin().distance));
	if (ticket.getValue() < cost)
	    close();
	else
	    open();
    }

    public void open() {
	JOptionPane.showMessageDialog(null, "Ga " + name + ": mở cửa");
    }

    public void close() {
	JOptionPane.showMessageDialog(null, "Ga " + name + ": đóng cửa");
    }
}
