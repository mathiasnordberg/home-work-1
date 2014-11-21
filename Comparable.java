/**
 * 
 * @author Mattias Nordberg
 */
public interface Comparable {
    /**
     * Gränssnittet används för att jämföra de olika hästarna.
     * @param other En andra häst som ska jämföras
     * @return returnerar en int.
     */
    public abstract int compareTo(AbstractHorse other);
}