package logic;

import model.Orcamento;
import model.Promocao;

public class CalculadorDeDesconto {

    public void realizaCalculo(Orcamento orcamento, Promocao promocao) {
        System.out.println(String.format("A Promoção para o %s possuí desconto de $%.2f",
                promocao.getClass().getSimpleName(), promocao.aplicaDesconto(orcamento)));
    }
}
