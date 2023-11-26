package catch_java.test4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Collection {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20};
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        System.out.println(set);
        ArrayList<Integer> al = new ArrayList<>(set);
        Collections.sort(al);
        System.out.println(al);


    }


}
