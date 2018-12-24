package com.bridge;

/**
 * 类的功能层次结构。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 09:50
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    //循环显示 times 次。
    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
