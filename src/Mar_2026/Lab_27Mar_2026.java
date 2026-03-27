package March_2026;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class Lab_27Mar_2026
{
    public static void main(String[] args) {
        Map<String, Integer> mapobj = new HashMap<>();
        mapobj.put("Ravi", 123456);
        mapobj.put("Manoj", 1923456);
        mapobj.put("Harsh", 10023456);
        mapobj.put("Pery", 111123456);

        System.out.println(mapobj.get("Pery"));
    }
}