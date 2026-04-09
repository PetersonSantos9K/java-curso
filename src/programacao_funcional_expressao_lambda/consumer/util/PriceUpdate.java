package programacao_funcional_expressao_lambda.consumer.util;

import programacao_funcional_expressao_lambda.consumer.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        double priceUpdate = product.getPrice() * 0.1;
        product.increasePrice(priceUpdate);
    }
}
