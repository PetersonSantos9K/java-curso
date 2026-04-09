package programacao_funcional_expressao_lambda.predicate;

import java.util.function.Predicate;

public class PredicateProduct implements Predicate<Product> {

    @Override
    public boolean test(Product p) {
        return p.getPrice() >= 100;
    }
}
