//import se.bjorknas.graphics.EventWindow;


public abstract class AbstractHorse implements Comparable{

    
    /**
     * En abstrakt klass som inplementerar gränssnittet Comparable och
     * innehåller metoder för subklasserna.
     */
    AbstractHorse(){
        
    }
    /**
     * Flyttar hästen framåt
     * @param speed så många steg flyttas hästen.
     */
    public abstract void forward(int speed);
    
    /**
     * Hämtar x-värdet från hästen
     * @return returnerar x-värdet.
     */
    public abstract int getX();
    
    /**
     * Hämtar y-värdet från hästen
     * @return returnerar y-värdet.
     */
    public abstract int getY();
    
    /**
     * Hämtar värdet för speed
     * @return returnerar speed:en.
     */
    public abstract int getSpeed();
    
}