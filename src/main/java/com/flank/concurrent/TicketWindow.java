package com.flank.concurrent;

/**
 * 并发测试--售票
 *
 * @author flank
 * @date 2021/3/29 20:21
 */
public class TicketWindow {
    private int ticketNum;

    public TicketWindow(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    /**
     * 窗口卖票
     */
    public void sellTickets() {
        if (ticketNum > 0) {
            this.ticketNum--;
            System.out.println(Thread.currentThread().getName() + ":" + ticketNum);
        }
        return;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }
}
