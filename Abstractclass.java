public abstract AbstractClass{

	static int nbrOfHorses;
	private int startNbr;
	private SimplerWindow win;
	private Point p;
	private int speed;
	private int nbrOfSteps;
	private int direction; //lagrar riktning som 1, 2, 3, 4.

	AbstractHorse(int x, int y, SimplerWindow win, int startNbr){
	abstract void forward()
	abstract void turnLeft()
	abstract void turnRight()
	abstract turnNorth()
	abstract void speedUp()
	abstract void speedDown()
	public double getX()
	public double getY()
	public int getstartNbr;
	public int getNbrOfSteps()
    }
}

