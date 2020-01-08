package Tasks;

import Utils.SortMap;

import java.util.List;
import java.util.Map;

import static Types.NamesType.firstNames;
import static Types.NamesType.surNames;

public class Task1 {

    /**
     * This class covers point 2 in the PDF.
     *
     * Two lists, one with firstname, one with surname
     *
     * return list of names with the highest occurrence.
     * ASC = 1
     * DESC = -1
     **/
    private Map<String, List<String>> data;

    public Task1(Map<String, List<String>> data){
        this.data = data;
    }

    private void countOccurrences(String name, Map<String, Integer> instances) {
        if(instances.keySet().contains(name))
            instances.put(name,instances.get(name)+1);
        else
            instances.put(name,1);
    }

    public void solve(){
        data.forEach((key,value) -> {
            if(key == "firstname")
                value.forEach(val -> countOccurrences(val, firstNames));
            if(key == "surname")
                value.forEach(val -> countOccurrences(val,surNames));
        });
        firstNames = SortMap.sortByValues(firstNames, -1);
        surNames = SortMap.sortByValues(surNames, -1);
        System.out.println("Task1: "+ firstNames);
        System.out.println("Task1: "+ surNames);
    }
}
