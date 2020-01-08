package Tasks;

import Utils.FilterMap;

import java.util.Map;

import static Types.NamesType.firstNames;
import static Types.NamesType.surNames;

/***
 *
 * This class covers point 5-6 in the PDF.
 *
 */

public class Task3 {

    public Task3(){
        /** **/
    }

    public void solve(){

        Map<String, Integer> filterNames = FilterMap.filterByKey(firstNames, value -> value.matches("(?i).*as.*"));
        Map<String, Integer> filterSurnames = FilterMap.filterByKey(surNames, value -> value.matches("(?i).*sson.*"));
        Map<String, Integer> filterUnevenNumbers = FilterMap.filterByValue(firstNames, value -> value % 2 == 0);
        Map<String, Integer> filterEvenNumbers = FilterMap.filterByValue(firstNames, value -> value % 2 == 1); /** for demo **/
        System.out.println("Task3: "+filterNames);
        System.out.println("Task3: "+filterSurnames);
        System.out.println("Task3: "+ filterUnevenNumbers);

    }

}
