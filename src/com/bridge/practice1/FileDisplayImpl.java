package com.bridge.practice1;

import com.bridge.DisplayImpl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 习题1
 * <p>
 * 可以打印文件的 DisplayImpl 实现类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 11:27
 */
public class FileDisplayImpl extends DisplayImpl {
    private String filename;
    private BufferedReader reader;
    private final int MAX_READ_AHEAD_LIMIT = 4096;//缓存大小限制

    public FileDisplayImpl(String filename) {
        this.filename = filename;
    }

    @Override
    public void rawOpen() {
        try {
            reader = new BufferedReader(new FileReader(filename));
            reader.mark(MAX_READ_AHEAD_LIMIT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("====" + filename + "====");
    }

    @Override
    public void rawPrint() {
        try {
            String line;
            reader.reset();
            while ((line = reader.readLine()) != null) {
                System.out.println("> " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rawClose() {
        System.out.println("==========");
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
