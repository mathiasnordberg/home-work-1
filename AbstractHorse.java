//import se.bjorknas.graphics.EventWindow;


public abstract class AbstractHorse implements Comparable{

    static int nbrOfHorses;
    

    AbstractHorse(){
        
    }
    
    public abstract void forward(int speed);
    public abstract int getX();
    public abstract int getY();
    public abstract int getSpeed();
    
}