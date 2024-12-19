package com.neoteric.jdbcconnectionlatest.insertjdbc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonNum {

    public List<Integer> commonNumbers(List<Integer> a,List<Integer> b){
        Set<Integer> set=new HashSet<>(a);
        List<Integer> common=new ArrayList<>();
        for(int i:b){
            if(set.contains(i)){
                common.add(i);
            }
        }
        return common;
    }
}
