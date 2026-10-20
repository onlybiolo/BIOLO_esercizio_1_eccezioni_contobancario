package org.example;

public class ContoBancario {
    private int saldo;

    public ContoBancario()
    {
        this.saldo = 0;
    }

    public void Deposita (int importo) throws ImportoNonValidoException
    {
        if(importo < 0) { throw new ImportoNonValidoException(importo); }
        saldo += importo;
    }

    public void Preleva (int importo) throws SaldoInsufficienteExcepion
    {
        if ((saldo - importo) < 0) { throw new SaldoInsufficienteExcepion(saldo - importo); }
        saldo -= importo;
    }
}
