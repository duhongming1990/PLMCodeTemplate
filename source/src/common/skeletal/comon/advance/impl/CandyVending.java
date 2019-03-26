package skeletal.comon.advance.impl;

import skeletal.comon.AbstractVending;
import skeletal.comon.Ivending;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/26 8:58
 */
public class CandyVending  implements Ivending {
    private class AbstractVendingDelegator extends AbstractVending
    {
        @Override
        public void chooseProduct() {
            System.out.println("Produce diiferent candies");
            System.out.println("Choose a type of candy");
            System.out.println("Pay for candy");
            System.out.println("Collect candy");
        }
    }

    AbstractVendingDelegator delegator = new AbstractVendingDelegator();

    @Override
    public void start() {
        delegator.start();
    }
    @Override
    public void chooseProduct() {
        delegator.chooseProduct();
    }
    @Override
    public void stop() {
        delegator.stop();
    }
    @Override
    public void process() {
        delegator.process();
    }
}