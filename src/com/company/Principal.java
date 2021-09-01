package com.company;

import com.company.model.Entregador;
import com.company.model.Vendedor;

public class Principal {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Jose", "Vasos",8000d,7,8000d);
        Double total = vendedor.calculePlus();
        if(!total.equals(0d)){
            System.out.println("Vendedor: " + vendedor.getNome()+ " | Recebeu esse mês o valor de: " + total + "\n");
        }

        Entregador entregador = new Entregador("Lucas", "Quadros", 4000d,4,3);
        Double salarioTotal = entregador.calculePlus();
        if(!salarioTotal.equals(0d)){
            System.out.println("Entregador: " + entregador.getNome()+ " | Recebeu esse mês o valor de: " + salarioTotal + "\n");
        }

        Vendedor vendedor1 = new Vendedor("Josefina", "Vasos",8000d,6,0d);
        Double total1 = vendedor1.calculePlus();
        if(!total1.equals(0d)){
            System.out.println("Vendedor sem bonus: " + vendedor1.getNome()+ " | Recebeu esse mês o valor de: " + total1 + "\n");
        }

        Entregador entregador1 = new Entregador("Maria", "Quadros", 4000d,3,2);
        Double salarioTotal1 = entregador1.calculePlus();
        if(!salarioTotal1.equals(0d)){
            System.out.println("Entregador sem bonus: " + entregador1.getNome()+ " | Recebeu esse mês o valor de: " + salarioTotal1);
        }
    }
}
