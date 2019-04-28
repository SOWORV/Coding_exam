package datastructure;
import java.util.*;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */
        List<String> name = new ArrayList();
        name.add("ahmed");
        name.add("imtiaz");
        name.add("sowrov");

        List<String> from = new ArrayList();
        from.add("NEW YORK");
        from.add("FLORIDA");
        from.add("BOSTON");

        List<String> job = new ArrayList();
        job.add("QA TESTER");
        job.add("DEVOLOPER");
        job.add("QA TESTER");


        Map<String, List<String>> map = new HashMap<String,List<String>>();
        map.put("name of the employees: ", name);
        map.put("they are from: ", from);
        map.put("their job title: ", job);

        //for each loop
        for(Map.Entry key: map.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }

        System.out.println("****************************************");
        //Iterator with for loop

        Iterator it =map.entrySet().iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }

}
