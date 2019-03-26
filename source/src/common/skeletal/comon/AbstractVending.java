package skeletal.comon;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/25 17:24
 *
 * 接口问题：由于接口是一种约定且不包含方法体，因此每个实现都必须按照约定实现接口中的所有方法。
 * 在具体的实现中一些方法可能会重复。
 *
 * 抽象类问题：由于菱形继承问题，Java 不支持多重继承。假如我们能够同时利用接口和抽象类的优点就太好了。
 * 译注：菱形继承问题。两个子类继承同一个父类，而又有子类又分别继承这两个子类，产生二义性问题。
 */
public abstract class AbstractVending implements Ivending{

    @Override
    public void start() {
        System.out.println("Start Vending machine");
    }

    @Override
    public abstract void chooseProduct();

    @Override
    public void stop() {
        System.out.println("Stop Vending machine");
    }

    @Override
    public void process() {
        start();
        chooseProduct();
        stop();
    }
}