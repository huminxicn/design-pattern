package com.bridge.practice3;

import com.bridge.DisplayImpl;

/**
 * 指定显示字符的实现类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 13:14
 */
public class CharDisplayImpl extends DisplayImpl {
    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head, char body, char foot) {
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.print(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(body);
    }

    @Override
    public void rawClose() {
        System.out.println(foot);
    }
}
