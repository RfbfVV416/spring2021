package albe;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        LinkedList<Integer> linkList = new LinkedList<>();
	    long startArrAdd = new Date().getTime();
	    for (int i = 0; i < 100000; i++){
	            arrList.add(i);
        }
	    long endArrAdd = new Date().getTime();
	    System.out.println(endArrAdd - startArrAdd);

        long startLink = new Date().getTime();
        for (int i = 0; i < 100000; i++){
            linkList.add(i);
        }
        long endLink = new Date().getTime();
        System.out.println(endLink - startLink);



        long startArrFind = new Date().getTime();
        for (int i = 0; i < 100000; i++){
            arrList.get(i);
        }
        long endArrFind = new Date().getTime();
        System.out.println(endArrFind - startArrFind);

        long startLinkFind = new Date().getTime();
        for (int i = 0; i < 100000; i++){
            linkList.get(i);
        }
        long endLinkFind = new Date().getTime();
        System.out.println(endLinkFind - startLinkFind);



        long startArrDel = new Date().getTime();
        for (int i = 0; i < 100000; i++){
            arrList.remove((Integer)i);
        }
        long endArrDel = new Date().getTime();
        System.out.println(endArrDel - startArrDel);

        long startLinkDel = new Date().getTime();
        for (int i = 0; i < 100000; i++){
            linkList.remove((Integer)i);
        }
        long endLinkDel = new Date().getTime();
        System.out.println(endLinkDel - startLinkDel);

//        9
//        14
//        2
//        4603
//        481
//        7

    }
}
