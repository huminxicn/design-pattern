package factory.framework;

/**
 * Factory 类中，我们使用了 Template Method 模式(在父类中定义处理流程，在子类中实现具体的处理内容)。
 * <p>
 * Factory 类是用来『调用 create 方法生成 Product 实例』的。
 * <p>
 * Factory 类中还声明了生成产品的 createProduct 方法和注册产品的 registerProduct 方法，但生成产品和注册产品的具体处理则被交给了 Factory 类的子类。
 *
 * @author hf huminxi2017@gmail.com
 * @version on 2018/12/11 14:22
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
