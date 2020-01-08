package IO;

import Types.NamesType;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class JsonHandler {

    public static Map<String, List<String>> readJson(String filePath){
        Map<String, List<String>> result = new HashMap<>();
        NamesType person = new NamesType();
        try {
            JsonElement e = new JsonParser().parse(new FileReader(filePath));
            if (e.isJsonObject()) {
                JsonObject obj = e.getAsJsonObject();
                JsonArray entryArray = obj.get("names").getAsJsonArray();
                for(JsonElement o : entryArray){
                    JsonObject p = o.getAsJsonObject();
                    person.firstname.add(p.get("firstname").getAsString());
                    person.surname.add(p.get("surname").getAsString());
                    person.gender.add(p.get("gender").getAsString());
                }

                result.put("firstname", person.firstname);
                result.put("surname",  person.surname);
                result.put("gender",  person.gender);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

}
