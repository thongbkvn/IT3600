import java.util.Date;

public class PrepaidCard extends Ticket implements ICard {
    public PrepaidCard(int value, Date date) {
	super(value, date);
    }

    public void add(int value) {
	adjustValue(value);
    }

    public boolean deduct(int value) {
	if (this.value < value)
	    return false;
	adjustValue(-value);
	return true;
    }

    public boolean isValid() {
	if (value < 9000)
	    return false;
	return true;
    }
}
