package model;

import java.math.BigDecimal;

public class DiaDasMaes implements Promocao {

    public BigDecimal aplicaDesconto(Orcamento orcamento) {
        return orcamento.getValor().multiply(BigDecimal.valueOf(0.30));
    }
}
