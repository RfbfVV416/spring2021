package albe;

import albe.NoStreamAPI.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	    //int randoms [] = new int[100];
        ArrayList<Integer> randoms = new ArrayList<>();
	    for (int i = 0; i < randoms.size(); i++){
	        randoms.add((Integer) (int)Math.random()+ 1000);
        }

	   Collections.sort(randoms);

        for (int i = 0; i < 16; i++) {
            randoms.remove(i);
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < 31; i++) {
            res.add(randoms.get(i));
        }

        Set<Integer> distinct = new HashSet<>(res);
        Set<Color> colorSet = new HashSet<>();

        for (Integer el: distinct) {
            Color color = new Color(el);
            colorSet.add(color);
        }

        Set<String> colorString = new HashSet();
        for (Color el: colorSet) {
            String string = el.toString();
            colorString.add(string);
        }





    }
}
