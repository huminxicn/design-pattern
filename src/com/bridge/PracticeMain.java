package com.bridge;

import com.bridge.practice1.FileDisplayImpl;
import com.bridge.practice2.RandomDisplay;
import com.bridge.practice3.CharDisplayImpl;
import com.bridge.practice3.IncreaseDisplay;

/**
 * 一句话概括功能
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 11:19
 */
public class PracticeMain {
    public static void main(String[] args) {
        RandomDisplay randomDisplay = new RandomDisplay(new StringDisplayImpl("Hello World"));
        randomDisplay.randomDisplay(5);

        CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl("resource/star.txt"));
        countDisplay.multiDisplay(3);

        IncreaseDisplay increaseDisplay = new IncreaseDisplay(new CharDisplayImpl('<', '*', '>'), 1);
        IncreaseDisplay increaseDisplay2 = new IncreaseDisplay(new CharDisplayImpl('|', '#', '|'), 2);
        increaseDisplay.increaseDisplay(4);
        increaseDisplay2.increaseDisplay(6);
    }
}
