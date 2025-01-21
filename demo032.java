import java.util.HashSet;

class HashSetDemo2 {
    void stringHashSet() {
        
        HashSet<String> stringSet = new HashSet<>();

        
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Orange"); 

        
        System.out.println("HashSet contents: " + stringSet);

       
        for (String fruit : stringSet) {
            System.out.println(fruit);
        }
    }
}

public class demo032 {
    public static void main(String[] args) {
        
        HashSetDemo2 obj = new HashSetDemo2();
        obj.stringHashSet(); 
    }
}
