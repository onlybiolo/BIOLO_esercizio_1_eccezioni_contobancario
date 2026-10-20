package org.example;

import static java.lang.IO.println;

public class ContoBancario {
    private int saldo;

    public ContoBancario()
    {
        this.saldo = 0;
    }
    public ContoBancario(int saldo)
    {
        this.saldo = saldo;
    }

    public void Deposita (int importo) throws ImportoNonValidoException
    {
        if(importo < 0) { throw new ImportoNonValidoException(importo); }
        saldo += importo;
        println("Deposito di " + importo + "$ effettuato con successo");
    }

    public void Preleva (int importo) throws SaldoInsufficienteExcepion
    {
        if ((saldo - importo) < 0) { throw new SaldoInsufficienteExcepion(saldo - importo); }
        saldo -= importo;
        println("Prelievo di " + importo + "$ completato con successo.");
    }
}
