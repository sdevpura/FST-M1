package activities;

import org.apache.poi.ddf.EscherColorRef;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Obj1");
        hs.add("Obj2");
        hs.add("Obj3");
        hs.add("Obj4");
        hs.add("Obj5");
        hs.add("Obj6");
        System.out.println("HashSet is: " + hs);
        System.out.println("Size of HashSet is: " + hs.size());
        hs.remove("Obj1");
        if (hs.remove("Obj7")) {
            System.out.println("Obj7 removed from hash set");
        } else {
            System.out.println("Obj7 is not present in Hash set");
        }
        System.out.println("Obj1 present in Hash Set: "+hs.contains("Obj1"));
        System.out.println("Updated hash set: " + hs);


    }
}
