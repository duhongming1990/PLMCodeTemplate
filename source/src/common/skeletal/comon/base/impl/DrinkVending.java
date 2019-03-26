package skeletal.comon.base.impl;

import skeletal.comon.AbstractVending;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/25 17:20
 */
public class DrinkVending extends AbstractVending {

    @Override
    public void chooseProduct() {
        System.out.println("Produce diiferent soft drinks");
        System.out.println("Choose a type of soft drinks");
        System.out.println("pay for drinks");
        System.out.println("collect drinks");
    }

}