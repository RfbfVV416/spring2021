package albe;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static Set<Integer> except(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> uni = union(set1, set2);
        set1.removeAll(uni);
        set2.removeAll(uni);
        set1.addAll(set2);
        return set1;
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> res = new HashSet<Integer>(set1);
        res.retainAll(set2);
        return res;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 0; i < 10; i++){
            set1.add(i);
            set2.add(++i);
        }
        set2.add(2);
        set2.add(4);
        System.out.println(set1);
        System.out.println(set2);

        System.out.println(union(set1, set2));

        System.out.println(except(set1, set2));


    }
}
