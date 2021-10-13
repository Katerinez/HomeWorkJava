import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class HomeWork6 {

    public static String get(String urlString) throws Exception {
        URL url = new URL(urlString);
        URLConnection conn = url.openConnection();
        InputStream is = conn.getInputStream();

        StringBuilder result = new StringBuilder();
        BufferedReader rd = new BufferedReader(new InputStreamReader(is));
        String line;
        while ((line = rd.readLine()) != null) {
            result.append(line);
        }
        rd.close();
        return result.toString();
    }

    public static void main(String[] args) throws Exception
    {

        String data = get("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=yQgeG3M1FU0NKHQGEI4k95k7uqNALKbf&language=en&details=false&metric=false");

        JsonParser parser = new JsonParser();
        JsonElement e = parser.parse(data);
        JsonObject json = e.getAsJsonObject();

        //String curDate = new SimpleDateFormat("yyyy-M-Mdd").format(Calendar.getInstance().getTime());

        System.out.println(json);
    }

}
