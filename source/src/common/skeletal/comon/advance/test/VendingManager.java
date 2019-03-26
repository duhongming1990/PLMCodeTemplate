package skeletal.comon.advance.test;

import skeletal.comon.Ivending;
import skeletal.comon.advance.impl.CandyVending;
import skeletal.comon.advance.impl.DrinkVending;
import skeletal.comon.advance.impl.VendingService;

/**
 * @Author duhongming
 * @Email 19919902414@189.cn
 * @Date 2019/3/26 9:00
 */
public class VendingManager {
    public static void main(String[] args) {
        Ivending candy = new CandyVending();
        Ivending drink = new DrinkVending();
        candy.process();
        System.out.println("*********************");
        drink.process();
        if(drink instanceof VendingService)
        {
            VendingService vs = (VendingService)drink;
            vs.service();
        }
    }
}