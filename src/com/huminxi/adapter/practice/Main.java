package com.huminxi.adapter.practice;

import java.io.File;
import java.io.IOException;

/**
 * 实际情况=Properties
 * <p>
 * 需求=FileIO
 * <p>
 * 转换装置=FileProperties
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 15:23
 */
public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();
        try {
            System.out.println(new File(".").getAbsolutePath());
            f.readFromFile("./resource/adapter.txt");
            System.out.println(f.getValue("year"));
            f.setValue("year", "2018");
            f.setValue("month", "12");
            f.setValue("day", "10");
            f.writeToFile("./resource/newAdapter.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
