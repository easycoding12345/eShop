package domain.exceptions;

public class UngueltigerPreisException extends RuntimeException {

    public UngueltigerPreisException(double preis) {
        super("Ungültiger Preis: " + preis + ". Der Preis darf nicht negativ sein.");
    }
}
