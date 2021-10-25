package ryan;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public WriteFile(){
        JSONObject obj = new JSONObject();
        JSONArray array = new JSONArray();
        JSONObject innerObject = new JSONObject();
        innerObject.put("title", "Vougel can't connect to wifi");
        innerObject.put("issue", "I am noob");
        innerObject.put("author", "Vougel");
        for(int i=0; i<5; i++) {
            array.add(innerObject);
        }
        obj.put("To Do", array);

        try {
            FileWriter file = new FileWriter("tickets.json");
            file.write(obj.toJSONString());
            file.flush();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
