package com.bridge;

/**
 * Display 类的功能是抽象的，负责显示一些东西。该类位于类的功能层次结构的最上层。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 09:46
 */
public class Display {
    private DisplayImpl impl;

    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    public void open() {
        impl.rawOpen();
    }

    public void print() {
        impl.rawPrint();
    }

    public void close() {
        impl.rawClose();
    }

    public final void display() {
        open();
        print();
        close();
    }
}
