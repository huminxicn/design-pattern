package com.builder;

/**
 * TextBuilder 类是 Builder 类的子类。它的功能是使用纯文本编写文档，其返回结果是一个 String。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/17 14:21
 */
public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("============\n");
        buffer.append("[").append(title).append("]\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("#").append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("##").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("============\n");
    }

    public String getResult() {
        return buffer.toString();
    }
}
