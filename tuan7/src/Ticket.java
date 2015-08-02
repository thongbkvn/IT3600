import java.util.Date;

public abstract class Ticket {
    protected Date issuedDate;
    protected int value = 9000;
    protected Gate origin;

    public Ticket(int value, Date date) {
	this.value = value;
	this.issuedDate = date;
    }

    public int getValue() {
	return value;
    }

    public void setOrigin(Gate origin) {
	this.origin = origin;
    }

    public Gate getOrigin() {
	return origin;
    }

    public void adjustValue(int value) {
	this.value += value;
    }

    public abstract boolean isValid();
	
}
