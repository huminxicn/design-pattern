package com.adapter.delegate;

/**
 * 通过扮演适配器角色的 AlternateToDirect 类来实现使用 12 伏特直流电的目的。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 14:13
 */
public class Main {
    public static void main(String[] args) {
        DirectCurrent p = new AlternateToDirect(220);
        p.use12V();
    }
}
