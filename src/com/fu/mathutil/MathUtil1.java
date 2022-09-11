/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fu.mathutil;

/**
 *
 * @author Admin
 */
//ta viet cai class de cung cap tien ich cho noi khac xai
//khi ta cung cap tien ich cho noi khac xai, do la luc ta ko 
//can nho gi cho rieng ta, ham static giup lam dieu nay
public class MathUtil1 {
    // n! = 1.2.3.4.5....
    // quy uoc:0! = 1! 
    //ko tinh giai thuwa cho so am
    //20! la vuwa khop kieu long, kieu long toi da 18 so 0
    //neu dua voa am,21 giai thuwa la lo
    public static long getFactorial(int n){
        if(n < 0 || n > 21)
        {
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20.");
            // ham dung ko can return
        }
        if(n == 0 || n == 1)
            return 1;
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;
            
       return product; 
    }
}
