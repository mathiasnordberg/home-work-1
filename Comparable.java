/**
 * 
 * @author Mattias Nordberg
 */
public interface Comparable {
    /**
     * Gränssnittet används för att jämnföra de olika hästarna.
     * @param other En andra häst som ska jämnföras
     * @return returnerar en int.
     */
    public abstract int compareTo(AbstractHorse other);
}