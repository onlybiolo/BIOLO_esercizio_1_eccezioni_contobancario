package org.example;

public class SaldoInsufficienteExcepion extends Exception {
    public SaldoInsufficienteExcepion(int differenza)
    {
        super("Il saldo è insufficiente, operazione annullata. Differenza: " + differenza);
    }
}
