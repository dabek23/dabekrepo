package com.company.List;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        MyList myItems = new MyList();
        User u = new User("ddaddada");
        User us = new User("ddaddada");
        System.out.println(u.hashCode());
        System.out.println(u.equals(us));
        MyMap<Integer, String> map = new MyMap<>();
        map.add(3, "Mort");
        map.add(4, "Morty");
    }
    public String toSingleString(List<String> all){
        StringBuilder builder = new StringBuilder();
        for (String s : all)
            builder.append(s);
        return builder.toString();
    }
}