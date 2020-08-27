package com.training;

public class Day24 extends Thread {
    public static void main(String[] args) {
        Day24 day24 = new Day24();
        day24.start();
        day24.activeCountThread();
        //day24.checkAccessThread();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Method Thread is Running" + i);
        }

    }

    @Override
    public void run() {
        super.run();
    }

    private void activeCountThread() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Sub Main Method Running" + i);
        }
        System.out.println("Active Count thread is : "+activeCount());
    }



}
