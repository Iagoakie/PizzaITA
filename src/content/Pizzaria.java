package content;

import java.util.Map;

public class Pizzaria {

    public static void main(String[] args) {
        
        Pizza muzzarela = new Pizza();
        muzzarela.adicionaIngrediente("Tomate", 1);
        muzzarela.adicionaIngrediente("Queijo", 3);
        muzzarela.adicionaIngrediente("Azeitona", 5);

        Pizza margerita = new Pizza();
        margerita.adicionaIngrediente("Tomate", 1);
        margerita.adicionaIngrediente("Queijo", 3);
        margerita.adicionaIngrediente("Manjericao", 2);
        margerita.adicionaIngrediente("Azeitona", 2);

        Pizza portugueza = new Pizza();
        portugueza.adicionaIngrediente("Tomate", 1);
        portugueza.adicionaIngrediente("Queijo", 2);
        portugueza.adicionaIngrediente("Ovo", 2);
        portugueza.adicionaIngrediente("Azeitona", 5);
        portugueza.adicionaIngrediente("Prezunto", 2);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionaPizza(muzzarela);
        carrinho.adicionaPizza(margerita);
        carrinho.adicionaPizza(portugueza);

        System.out.println("Total do Preco do Carrinho: " + carrinho.getTotalPreco());
        System.out.println("");
        System.out.println("Qtde Ingredientes");
        System.out.println("=================");
        for(Map.Entry<String, Integer> entry : carrinho.getIngredientes().entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }


}
