package model;

import java.math.BigDecimal;

public class DiaDosPais implements Promocao {

    public BigDecimal aplicaDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.20));
    }
}
