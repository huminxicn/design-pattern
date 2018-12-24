package com.bridge;

/**
 * 实现了 DisplayImpl 中定义的 API。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 10:04
 */
public class StringDisplayImpl extends DisplayImpl {
    private String string;
    private int width;

    public StringDisplayImpl(String s) {
        this.string = s;
        this.width = s.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
