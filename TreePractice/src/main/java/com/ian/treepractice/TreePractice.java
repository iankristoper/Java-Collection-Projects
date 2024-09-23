
package com.ian.treepractice;


import java.util.Scanner;
import java.util.TreeSet;  //doesnt allow duplicates, it will sort the elements automatically




public class TreePractice 
{

    public static void main(String[] args) 
    {
        TreeSet <String> treeSet = new TreeSet<>();
        
        treeSet.add("dog");
        treeSet.add("z");
        treeSet.add("bat");
        treeSet.add("boy");
        treeSet.add("apple");
        
        System.out.println(treeSet);
    }
}
