package com.strings;

import java.io.*;
import java.util.*;
public class DuplicateChars{
    public static ArrayList<Character> duplicateChars(String s){
        s = s.toLowerCase();
        HashSet<Character> set = new HashSet();
        ArrayList<Character> al = new ArrayList<>();
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                al.add(c);
            }else{
                set.add(c);
            }
        }
        System.out.println(al.size()+"----"+al);
        return al;
    }

    public static void main(String[] args) {
        duplicateChars("Aravinda");
    }
}