package skeletal.comon.base.impl;

import skeletal.comon.AbstractVending;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/25 17:20
 */
public class CandyVending extends AbstractVending {

    @Override
    public void chooseProduct() {
        System.out.println("Produce different candies");
        System.out.println("Choose a type of candy");
        System.out.println("Pay for candy");
        System.out.println("Collect candy");
    }

}