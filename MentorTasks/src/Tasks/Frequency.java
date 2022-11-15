package Tasks;

import java.util.HashMap;
import java.util.Map;

public class Frequency {

    public Map<Character, Integer> mapTheThings(String s) {
        Map<Character, Integer> d = new HashMap<>();

        for(int i = 0; i < s.length(); i++)
        {
            if(d.containsKey(s.charAt(i)))
            {
                d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
            }
            else
            {
                d.put(s.charAt(i), 1);
            }
        }
        return d;



    }

}
