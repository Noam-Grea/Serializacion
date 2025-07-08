package serializationandfilehandler;

import java.io.IOException;

public interface Deberes {
    void serializar(String archivo) throws IOException;
    void deserializar(String archivo) throws IOException, ClassNotFoundException;
    void escribirEnArchivoTexto(String archivo) throws IOException;
    void leerDesdeArchivoTexto(String archivo) throws IOException;
}