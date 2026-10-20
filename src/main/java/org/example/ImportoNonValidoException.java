package org.example;

public class ImportoNonValidoException extends RuntimeException {
    public ImportoNonValidoException(int importo)
    {
        super("L'importo inserito non è valido. Importo: " + importo);
    }
}
