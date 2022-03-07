package content;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarrinhoDeCompras {
	
	   // lista de pizzas que foram adicionadas no carrinho
    private List<Pizza> pizzas = new ArrayList<Pizza>();

    public void adicionaPizza(Pizza pizza) {
            if (pizza.getQtdeIngredientes() > 0) {
                pizzas.add(pizza);
            }

    }

        // calcula o preco total das pizzas do carrinho
    public Integer getTotalPreco() {
            Integer total = 0;
            for (Pizza item : pizzas) {
                total += item.getPreco();   
            }
            return total;
    }

        // contabiliza as quantidades de todos os ingredientes de todas as pizzas        
    public HashMap<String, Integer> getIngredientes() {
            HashMap<String, Integer> cesta = new HashMap<String, Integer>();
            for (Pizza item : pizzas) {
                HashMap<String, Integer> ingredientes = item.getIngredientes();
                for (String key : ingredientes.keySet()) {
                    Integer total = ingredientes.get(key);
                    if (cesta.containsKey(key)) {
                        total += cesta.get(key);
                    }
                    cesta.put(key, total);
                }
            }

            return cesta;
    }

}
