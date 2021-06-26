package com.abhi.algorithm.finder;

import java.util.HashMap;
import java.util.Map;

public class DuplicateIdentifier {
    public static void main(String[] args) {
        char [] ch = {'a', 'b', 'a', 'd'};

        Map<Character, Integer> res = new HashMap<Character, Integer>();

        for(int i = 0; i< ch.length ; i++) {
            // TODO : NPE
            if(ch[i] == ch[i++]) {
                res.put(ch[i], res.get(ch[i]) + 1 );
            }else{
                res.put(ch[i], res.get(ch[i]) + 1 );
            }
        }

        res.forEach((key, value) -> System.out.println(key + " " + value));
    }
}
