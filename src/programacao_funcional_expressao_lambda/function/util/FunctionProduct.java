package programacao_funcional_expressao_lambda.function.util;

import programacao_funcional_expressao_lambda.function.Product;

import java.util.function.Function;

public class FunctionProduct implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
}
