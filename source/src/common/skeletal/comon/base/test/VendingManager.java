package skeletal.comon.base.test;

import skeletal.comon.Ivending;
import skeletal.comon.base.impl.CandyVending;
import skeletal.comon.base.impl.DrinkVending;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/25 17:21
 */
public class VendingManager {
    public static void main(String[] args) {
        Ivending candy = new CandyVending();
        Ivending drink = new DrinkVending();
        candy.process();
        drink.process();
    }
}