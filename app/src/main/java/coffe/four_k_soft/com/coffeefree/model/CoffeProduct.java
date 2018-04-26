package coffe.four_k_soft.com.coffeefree.model;

/**
 *
 * Created by goryanskiy on 18.04.18.
 */

public class CoffeProduct {

    private String titleName;
    private String price;
    private String imgUrl;

    public CoffeProduct(String titleName, String price, String imgUrl) {
        this.titleName = titleName;
        this.price = price;
        this.imgUrl = imgUrl;
    }
}