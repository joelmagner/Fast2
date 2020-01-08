package Utils;

import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * Contains functions for filtering maps using lambdas.
 *
 */
public class FilterMap {

    public FilterMap(){
        /** **/
    }

    public static <K, V> Map<K, V> filterByKey(Map<K, V> map, Predicate<K> predicate) {
        return map.entrySet()
                .stream()
                .filter(entry -> predicate.test(entry.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public static <K, V> Map<K, V> filterByValue(Map<K, V> map, Predicate<V> predicate) {
        return map.entrySet()
                .stream()
                .filter(entry -> predicate.test(entry.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }
}
