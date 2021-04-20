import java.util.ArrayList;

public class Taller {

    public int cantServiciosPosibles(ArrayList<Bicicleta> bicis) {

        int contador = 0;

        for (Bicicleta b : bicis) {
            boolean pudo = b.retornarServicioPosible(b);
            if (pudo == true) {
                contador++;
            }
        }
        return contador;
    }
}