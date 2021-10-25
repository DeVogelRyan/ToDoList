package ryan;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

    private JSONArray data = new JSONArray();

    public ReadFile(){
        JSONParser jsonParser = new JSONParser();
        try {
            Object o = jsonParser.parse(new FileReader("tickets.json"));
            JSONObject jsonObject = (JSONObject) o;
            JSONArray array = (JSONArray) jsonObject.get("tickets");

            for(int i=0; i<array.size(); i++){
                JSONObject tickets = (JSONObject) array.get(i);//the object = {}
                this.data.add(tickets);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public JSONArray getData() {
        return data;
    }
}
