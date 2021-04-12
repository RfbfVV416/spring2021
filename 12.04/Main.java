package albe;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "Кадымка — посёлок в Озёрском городском округе Калининградской области. Входит в состав Гавриловского сельского поселения.";

        String mas[] = str.split(" ");
        Map<String, Integer> wordsCols = new HashMap<String, Integer>();
        for (int i = 0; i < mas.length; i++){
            Integer val = 0;
            if (wordsCols.containsKey(mas[i])) {
                val = wordsCols.get(mas[i]) + 1;
            }
            else{
                val = 1;
            }
            wordsCols.put(mas[i], val);
        }
        int x = 0;
    }
}
