package com.neoteric.jdbcconnectionlatest.insertjdbc;

import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MainTest {

    public static void main(String[] args) {
        ArrayList<Integer>arrayList1=new ArrayList<>();
        for(int i=0;i<100;i++){
            arrayList1.add(i);
        }
        ArrayList<Integer>arrayList2=new ArrayList<>();
        for(int i=50;i<150;i++) {
            arrayList2.add(i);
        }
        CommonNum commonNum=new CommonNum();
        List<Integer> commonNumbers=commonNum.commonNumbers(arrayList1,arrayList2);
        System.out.println(commonNumbers);

        }

    }

