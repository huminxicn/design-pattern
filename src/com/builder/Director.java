package com.builder;

/**
 * Director 类使用 Builder 类中声明的方法来编写文档。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/17 14:07
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString(" from morning to afternoon");
        builder.makeItems(new String[] {
                " Good morning!",
                " Good afternoon!"
        });
        builder.makeString(" night");
        builder.makeItems(new String[] {
                " Good night!",
                " Good night!",
                " See you!",
                " Bye!"
        });
        builder.close();
    }
}
