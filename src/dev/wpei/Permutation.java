package dev.wpei;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    private List<String> result;
    public Permutation() {
        result = new ArrayList();
    }

    public List<String> generate(String q, String ans) {
        if(q.length() <= 1) {
            result.add(ans + q);
        }
        else {
            for(int i = 0; i < q.length(); i++) {
                generate(q.substring(0, i) + q.substring(i+1), ans + q.charAt(i));
            }
        }
        if(ans.equals("")) return result;
        else return null;
    }
}
