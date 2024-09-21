package com.ian.practice;


import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;




public class Practice 
{

    public static void main(String[] args) 
    {
        Set<String> set = new HashSet<String>();
        
        set.add("Ian");
        set.add("Rhina");
        set.add("Wow");
        set.add("Ian");
        
        System.out.println(set);
    }
}
