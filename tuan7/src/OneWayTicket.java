import java.util.Date;

public class OneWayTicket extends Ticket {
    private boolean valid = true;

    public OneWayTicket(int value, Date date) {
	super(value, date);
	if (value < 9000)
	    valid = false;
    }

    public boolean isValid() {
	return valid;
    }
}
