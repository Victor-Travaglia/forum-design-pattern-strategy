package model;

import java.math.BigDecimal;

public class DiaDasCriancas implements Promocao {

    public BigDecimal aplicaDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.10));
    }
}
