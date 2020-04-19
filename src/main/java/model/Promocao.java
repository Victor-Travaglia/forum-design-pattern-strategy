package model;

import java.math.BigDecimal;

public interface Promocao {

    BigDecimal aplicaDesconto(Orcamento orcamento);
}
