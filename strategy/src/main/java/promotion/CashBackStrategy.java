package promotion;

/**
 * 返现活动
 * Created by Tom
 */
public class CashBackStrategy implements PromotionStrategy {

    public void doPromotion() {
        System.out.println("返现促销,返回的金额转到支付宝账号");
    }
}
