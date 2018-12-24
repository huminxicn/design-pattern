package com.bridge.practice3;

import com.bridge.CountDisplay;
import com.bridge.DisplayImpl;

/**
 * 逐渐增加显示次数的功能类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/24 13:12
 */
public class IncreaseDisplay extends CountDisplay {
    private int step;

    public IncreaseDisplay(DisplayImpl impl, int step) {
        super(impl);
        this.step = step;
    }

    public void increaseDisplay(int level) {
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }

}
