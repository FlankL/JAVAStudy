package com.flank.concurrent;

/**
 * 售票模拟
 * @author flank
 * @date 2021/3/29 20:23
 */
public class TicketTest {
    public static void main(String[] args) {
        TicketWindow window = new TicketWindow(50);

        new Thread(()->{
            for (int i = 0; i <50 ; i++) {
                window.sellTickets();
                try {
                    Thread.sleep(1*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i <50 ; i++) {
                window.sellTickets();
                try {
                    Thread.sleep(1*100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
