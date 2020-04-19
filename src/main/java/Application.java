import logic.CalculadorDeDesconto;
import model.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Promocao> promocaos = Arrays.asList(new DiaDasCriancas(), new DiaDosPais(), new DiaDasMaes());

        Orcamento orcamento = new Orcamento(BigDecimal.valueOf(1000.0));

        CalculadorDeDesconto calculadorDeDesconto = new CalculadorDeDesconto();

        promocaos.forEach(promocao -> calculadorDeDesconto.realizaCalculo(orcamento, promocao));
    }
}
