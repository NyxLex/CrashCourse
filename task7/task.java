package com.task;

public class task {
    public static  void main(String[ ] args){

        Bird bird[] = new Bird[4];
        bird[0] = new Swallow();
        bird[1] = new Eagle();
        bird[2] = new Penguin();
        bird[3] = new Chicken();
     //   bird[3].fly();
        for (int i = 0 ;i < bird.length ;i++){
            bird[i].fly();

        }


    }
}
