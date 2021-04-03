package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        keypadDemo();
    }
    public static void keypadDemo(){
        // Creating a HashMap
        int ax = 97;
        Map<Integer, ArrayList<Character>> hm = new HashMap<>();
        for(int i = 0; i < 10; i++){
            if(i == 0 || i == 1){
                hm.put(i, null);
            }else if(i == 7 || i == 9){
                hm.put(i, new ArrayList<>(Arrays.asList((char)ax, (char) ++ax, (char) ++ax, (char) ++ax)));
                ax++;
            }else {
                hm.put(i, new ArrayList<>(Arrays.asList((char) ax, (char) ++ax, (char) ++ax)));
                ax++;
            }
        }
       System.out.println(hm);
    }
}
