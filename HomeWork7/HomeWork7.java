import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.net.*;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;

public class HomeWork7 {

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
        String data = get("http://dataservice.accuweather.com/forecasts/v1/daily/5day/295212?apikey=yQgeG3M1FU0NKHQGEI4k95k7uqNALKbf&language=en&details=false&metric=true");

        JsonParser parser = new JsonParser();
        JsonElement e = parser.parse(data);
        JsonObject json = e.getAsJsonObject();

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode date = objectMapper.readTree(json.toString());

        System.out.println("В городе Санкт-Петербург");
        System.out.println("на дату " +date.get("DailyForecasts").get(0).get("Date")
                +" ожидается от "+date.get("DailyForecasts").get(0).get("Temperature").get("Minimum").get("Value")
                +" до "+date.get("DailyForecasts").get(0).get("Temperature").get("Maximum").get("Value") +"  C, "
                +date.get("DailyForecasts").get(0).get("Day").get("IconPhrase"));

        System.out.println("на дату " +date.get("DailyForecasts").get(1).get("Date")
                +" ожидается от "+date.get("DailyForecasts").get(1).get("Temperature").get("Minimum").get("Value")
                +" до "+date.get("DailyForecasts").get(1).get("Temperature").get("Maximum").get("Value") +"  C, "
                +date.get("DailyForecasts").get(1).get("Day").get("IconPhrase"));

        System.out.println("на дату " +date.get("DailyForecasts").get(2).get("Date")
                +" ожидается от "+date.get("DailyForecasts").get(2).get("Temperature").get("Minimum").get("Value")
                +" до "+date.get("DailyForecasts").get(2).get("Temperature").get("Maximum").get("Value") +"  C, "
                +date.get("DailyForecasts").get(2).get("Day").get("IconPhrase"));

        System.out.println("на дату " +date.get("DailyForecasts").get(3).get("Date")
                +" ожидается от "+date.get("DailyForecasts").get(3).get("Temperature").get("Minimum").get("Value")
                +" до "+date.get("DailyForecasts").get(3).get("Temperature").get("Maximum").get("Value") +"  C, "
                +date.get("DailyForecasts").get(3).get("Day").get("IconPhrase"));

        System.out.println("на дату " +date.get("DailyForecasts").get(4).get("Date")
                +" ожидается от "+date.get("DailyForecasts").get(4).get("Temperature").get("Minimum").get("Value")
                +" до "+date.get("DailyForecasts").get(4).get("Temperature").get("Maximum").get("Value") +"  C, "
                +date.get("DailyForecasts").get(4).get("Day").get("IconPhrase"));
    }

}

