package Tasks;

import Utils.SortMap;

import java.util.Map;

import static Types.NamesType.firstNames;
import static Types.NamesType.surNames;
/**
 *
 * This class covers point nr 3-4 in the PDF.
 *
 * Sort names on a-Z
 * Features:
 * - Add ability to sort by ASC or DESC.
 * ASC = 1
 * DESC = !1
 * **/
public class Task2 {

    public Task2(){
        /** **/
    }

    public void solve(){
        Map<String, Integer> fn = SortMap.sortByKey(firstNames,-1);
        Map<String, Integer> sn = SortMap.sortByKey(surNames,1);
        System.out.println("Task2 - FirstNames Sorted:" + fn);
        System.out.println("Task2 - SurNames Sorted:" + sn);
    }
}
