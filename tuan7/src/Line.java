public class Line {
    private Gate[] gate = new Gate[4];

    public Line(Gate... gate) {
	if (gate.length == 4)
	    this.gate = gate;
    }
    
    public static int getFare(int distance) {
	if (distance <= 6)
	    return 9000;
	else
	    return 9000 + ((distance-6)/2 + (distance-6)%2)*2000;
    }
}
