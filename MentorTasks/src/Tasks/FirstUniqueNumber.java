package Tasks;

import java.util.*;

public class FirstUniqueNumber {
    public char unique(String s){
        //Getting frequency of all characters
        HashMap<Character, Integer> d= new HashMap<>();
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
        ArrayList<Integer> min = new ArrayList<Integer>();
        //Adding all the values(frequencies) into arraylist
        Iterator<Map.Entry<Character, Integer>> itr = d.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<Character, Integer> entry = itr.next();
            min.add(entry.getValue());
        }

        //Getting the minimum value in the arraylist
        int m= Collections.min(min);

        ArrayList<String> s1 = new ArrayList<String>();

        //Getting the characters with minimum frequency
        Iterator<Map.Entry<Character, Integer>> ir = d.entrySet().iterator();
        while(ir.hasNext()){
            Map.Entry<Character, Integer> entry = ir.next();

            if (m==(entry.getValue())) {
                s1.add(Character.toString(entry.getKey()));

            }
        }



        //returning
        for (int i=0;i<s.length();i++){
            if( s1.contains(Character.toString(s.charAt(i)))) {
                return s.charAt(i);

            }
        }

        return 'a';


    }

}
