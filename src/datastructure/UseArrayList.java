package datastructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("ADNAN");
        arraylist.add("SOWROV");
        arraylist.add("OPU");
        arraylist.add("AMINUR");
        System.out.println(arraylist);
        System.out.println(arraylist);
        System.out.println(arraylist.remove(1));
        for(int a=0;a<arraylist.size();a++){
            System.out.println(a+" "+ arraylist.get(a));
        }




    }

}
