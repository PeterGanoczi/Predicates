package sk.itsovy.ganoczi.predicate;

import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws IOException {

        String server="http://itsovy.sk:5000/data";

        URL url=new URL(server);
        URLConnection request=url.openConnection();
        request.connect();

        JSONObject data=new JSONObject(IOUtils.toString(url, StandardCharsets.UTF_8));
        JSONArray arr=data.getJSONArray("world_x");


        JSONObject obj;
        City city;
        List<City> cities=new ArrayList<>();
        for(int i=0; i<arr.length(); i++){
            obj=arr.getJSONObject(i);
            city=new City(obj.getInt("pop"), obj.getString("code"), obj.getString("district"),obj.getString("name"));
            cities.add(city);
           // System.out.println(city.getName());
        }

//        for(City c: cities){
//            if (c.getCode().equals("ITA"))
//            System.out.println(c.getName());
//        }

        System.out.println("LAMBDA\n");
        Predicate<City> byPopulation=city1 -> city1.getPopulation() > 100000;
        cities.stream().filter(byPopulation).forEach(System.out::println);

        System.out.println("\nCLASS\n");
        FromNetherland<City> nld=new FromNetherland<>();
        cities.stream().filter(nld).forEach(System.out::println);





    }
}
