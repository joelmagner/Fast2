package Test;

import IO.JsonHandler;
import Utils.FilterMap;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

import static Types.NamesType.firstNames;

/** Basic testing, didn't want to spend too much time on this **/
class JUnitTest {
    /** data **/
    Map<String, List<String>> json = JsonHandler.readJson("C:\\Users\\A551297\\Desktop\\untitled\\assets\\names.json");;

    @org.junit.jupiter.api.Test
    void TestReadJsonData() {
        Assert.assertNotNull(json);
    }

    @org.junit.jupiter.api.Test
    void TestFilterByKey() {
        FilterMap filterMap = new FilterMap();
        Map<String, Integer> filterOutName = filterMap.filterByKey(firstNames, value -> value.matches("(?i).*lucas.*"));
        Assert.assertEquals("lucas", filterOutName);
    }


}