
package com.ian.lotterynumbergenerator;

/*
 *Objective: Develop a system that generates unique lottery numbers in sorted order. 
 *The system will ensure that each lottery number is unique and that the numbers are always presented in their natural, ascending order.
 */


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Random;




public class LotteryNumberGenerator 
{
    Scanner scanner = new Scanner(System.in);
    static Set<Integer> set = new TreeSet<>();
    static Random random = new Random();
    
    static int number;
    
    
    //this method is for generating the random number
    public static void randomGenerator() {
        
        for(int i = 0; i <= 5; i++) {
            number = random.nextInt(100);
            set.add(number);     
        }
        
        System.out.println(set);
           
    }

    
    public static void main(String[] args) {
        
        randomGenerator();
        
    }
}
