import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteExcepion;

import static java.lang.IO.println;
import static java.lang.IO.readln;

void main(String[] args) throws Exception {
//    int saldo = 0;
//    while (true)
//    {
//        println("\n\n\n\n\nSaldo: " + saldo + "\nAzioni:\nAggiungi al saldo (1)\nTogli dal saldo (2)");
//        String scelta = readln("Scrivi scelta 1/2: ");
//        if (scelta.equals("1"))
//        {
//            Integer saldoadd = Integer.parseInt(readln("totale da aggiungere: "));
//            //if (saldoadd < 0)
//            //{
//            //    throw new ImportoNonValidoException();
//            //}
//            //saldo += saldoadd;
//        } else if (scelta.equals("2"))
//        {
//            //try {
//            //    Integer saldoless = Integer.parseInt(readln("totale da aggiungere: "));
//            //    if (saldo < saldoless)
//            //    {
//            //        throw new SaldoInsufficienteExcepion();
//        //}
//        //    } catch (Exception e)
//        //    {
//                println("Errore: " + e);
//            }
//        }
//    }
    int prelievoEccessivo = 100;
    int depositoNegativo = -1;
    int depositoValido = 100;
    int prelievoValido = 10;

    ContoBancario conto = new ContoBancario(50);
    try {
        conto.Preleva(prelievoEccessivo);
    } catch (SaldoInsufficienteExcepion e) {
        println(e.getMessage());
    }

    try {
        conto.Deposita(depositoNegativo);
    } catch (ImportoNonValidoException e) {
        println(e.getMessage());
    }

    try {
        conto.Preleva(prelievoValido);
        conto.Deposita(depositoValido);
    } catch (Exception e)
    {
        println(e.getMessage());
    }

}