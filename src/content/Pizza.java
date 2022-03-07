package content;

import java.util.HashMap;

public class Pizza {
	
	 private HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
	 
	public void adicionaIngrediente(String ingrediente, Integer qtde) {
		
		 // nao verifica se o mesmo ingrediente ja foi adicionado e vai substituir nesse caso
        ingredientes.put(ingrediente, qtde);
	}
	
	   // descobre se a pizza esta sem ingredientes
    public int getQtdeIngredientes() {
            return ingredientes.size(); 
    }

        // calcula o preco da pizza conforme a regra de qtde de ingredientes
    public int getPreco()
    {
            Integer total = 0;

            for (Integer value : ingredientes.values()) {
                Integer preco = 0;
                if (value <= 2) {
                        preco = 15;
                } else if (value <= 5) {
                        preco = 20;
                } else {
                        preco = 23;
                }
                total += preco;
            }

            return total;

    }

        // retorna os ingredientes para que possa fazer a soma dos ingredientes de todas as pizzas
        public HashMap<String, Integer> getIngredientes()
        {
            return ingredientes;
        }
}

/**
 *
 * @author Iagocaldas
 */

