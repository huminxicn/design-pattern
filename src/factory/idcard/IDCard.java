package factory.idcard;

import factory.framework.Product;

/**
 * 表示 ID 卡的类。ID 卡类是产品 Product 类的子类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 14:40
 */
public class IDCard extends Product {
    private String owner;
    private int serial;

    //这里之所以没有用 public 关键字，因为想让 idcard 包外的类无法 new 出 IDCard 类的实例。这样就可以强迫外部必须通过 IDCardFactory 来生成 IDCard 的实例。
    IDCard(String name, int serial) {
        System.out.println("制作 " + name + ":" + serial + " 的ID卡。");
        this.owner = name;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用 " + owner + ":" + serial + " 的ID卡。");
    }

    public String getOwner() {
        return owner;
    }
}
