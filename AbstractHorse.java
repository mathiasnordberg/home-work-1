
import java.awt.Point;
import se.bjorknas.graphics.EventWindow;


public abstract class AbstractHorse{

    static int nbrOfHorses;
    private int startNbr;
    private EventWindow win;
    private Point p;
    private int speed;
    private int nbrOfSteps;
    private int direction; //lagrar riktning som 1, 2, 3, 4.

    AbstractHorse(int x, int y, EventWindow win, int startNbr){
	
    }
      abstract void forward();
//    abstract void turnLeft();
//    abstract void turnRight();
//    abstract void turnNorth();
    abstract void speedUp();
    abstract void speedDown();
    public int getX(){
	return (int)p.getX();
    }
    public int getY(){
	return (int)p.getY();
    }
    public int getstartNbr(){
	return startNbr;
    }
    public int getNbrOfSteps(){
	return nbrOfSteps;
    }

}

