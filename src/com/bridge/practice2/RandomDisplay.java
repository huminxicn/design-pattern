package com.bridge.practice2;

import com.bridge.CountDisplay;
import com.bridge.DisplayImpl;

import java.util.Random;

/**
 * 习题1
 * <p>
 * 随机显示字符串若干次。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 11:12
 */
public class RandomDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomDisplay(DisplayImpl impl) {
        super(impl);
    }

    //随机显示 [0,times] 次
    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times + 1));
    }
}
