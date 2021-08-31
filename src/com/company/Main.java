package com.company;

import com.company.model.Vendedor;

public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Jose", "Vasos",8000d,7,8000d);
        Double total = vendedor.calculePlus();
        if(!total.equals(0d)){
            System.out.println("Vendedor: " + vendedor.getNome()+ " | Recebeu esse mes o valor de: " + total);
        }
    }
}
