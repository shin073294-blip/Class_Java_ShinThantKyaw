package com.talent.batch11.day5.homeworkDay5;

import org.w3c.dom.css.Counter;

public class counter {
    public int instanceCount = 0;
    public static int globalCount = 0;

   public counter(){
       instanceCount++;
       globalCount++;
   }

    public static void main(String[] args) {
        counter c1 = new counter();
        counter c2 = new counter();
        counter c3 = new counter();

        System.out.println("c3.instanceCount" + c3.instanceCount);
        System.out.println("Global Count: " + counter.globalCount);
    }



}
