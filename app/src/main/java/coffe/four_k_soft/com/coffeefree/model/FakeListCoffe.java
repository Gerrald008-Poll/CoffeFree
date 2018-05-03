package coffe.four_k_soft.com.coffeefree.model;

import java.util.List;

/**
 *
 * Created by goryanskiy on 26.04.18.
 */

public class FakeListCoffe {

    public FakeListCoffe() {}

    public List<CoffeProduct> AddCard(List<CoffeProduct> products){
        CoffeProduct coffeProduct = new CoffeProduct("Capyshino", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "150", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "75", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "80", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "120", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "100", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "666", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        coffeProduct = new CoffeProduct("Capyshino", "798", "https://womenscyberjutsu.org/global_graphics/default-store-75x75.jpg");
        products.add(coffeProduct);
        return products;
    }
}
