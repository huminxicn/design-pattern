package adapter.extend;

import adapter.AlternateCurrent;

/**
 * 使用继承的适配器。
 * <p>
 * AlternateToDirect 扮演适配器的角色。既继承了 AlternateCurrent 类，又实现了 DirectCurrent 接口。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/10 14:10
 */
public class AlternateToDirect extends AlternateCurrent implements DirectCurrent {

    public AlternateToDirect(int v) {
        super(v);
    }

    @Override
    public void use12V() {
        use220V();
    }

}
