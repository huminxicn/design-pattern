package com.design.pattern.adapter;

/**
 * 假设 AlternateCurrent 类是现在实际的情况。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 14:02
 */
public class AlternateCurrent {
    private int voltage;

    public AlternateCurrent(int voltage) {
        this.voltage = voltage;
    }

    public void use220V() {
        System.out.println("From " + voltage + " V");
    }

}
