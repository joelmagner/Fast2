package Utils;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/***
 *
 * Contains functions for sorting maps.
 *
 */

public class SortMap {


    /**
     *
     * ascending  = 1, descending = (!= 1).
     */
    public static <K, V extends Comparable<V>> Map<K, V> sortByValues (final Map<K, V> unsortedMap, int ascending) {
        Map<K,V> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue((Comparator<? super V>) (ascending == 1 ? Comparator.naturalOrder() : Comparator.reverseOrder())))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }

    /**
     *
     * ascending = 1, descending = (!= 1).
     */
    public static <K extends Comparable<? super K>, V> Map<K, V> sortByKey(Map<K, V> unsortedMap, int ascending) {
        Map<K,V> sortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey((Comparator<? super K>) (ascending == 1 ? Comparator.naturalOrder() : Comparator.reverseOrder())))
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));
        return sortedMap;
    }


}
