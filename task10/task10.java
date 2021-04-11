import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class task10 {

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        return map.containsKey(lastName) ? 1 : 0;
    }

    public static void union(HashSet<String> set,HashSet<String> set2){
        Set union = Stream.concat(set.stream(),set2.stream()).collect(Collectors.toSet());
        System.out.println("Union = " + union);
    }

    public static void intersect(HashSet<String> set,HashSet<String> set2){
        Set intersect = set.stream().filter(set2::contains).collect(Collectors.toSet());
        System.out.println("Intersect = " + intersect);
    }

    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        HashSet<String> secondSet = new HashSet<>();


        set.add("First");
        set.add("Second");
        set.add("Third");

        secondSet.add("Third");
        secondSet.add("Fourth");
        secondSet.add("Fifth");

        System.out.println("First set"  + set);
        System.out.println("Second set" + secondSet);

        union(set,secondSet);
        intersect(set,secondSet);

        //2

        Map<String,String> personMap = new HashMap<String, String>();
        personMap.put("Yura","Kuryan");
        personMap.put("Vira","Dovba");
        personMap.put("Andrii","Lunda");
        personMap.put("Some","Some");
        personMap.put("Andrii","Dorosh");
        personMap.put("Vlad","Burda");
        personMap.put("Sofia","Teslya");
        personMap.put("Serhii","Feduk");
        personMap.put("Arsen","Drach");
        personMap.put("One","More");

        Set<String> keys = personMap.keySet();

        for(Map.Entry<String, String> item : personMap.entrySet()){
            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue());
        }
        if (personMap.size()<10) System.out.println("There are two persons with the same name");

    }
}
