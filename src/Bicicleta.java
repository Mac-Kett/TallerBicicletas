public class Bicicleta {
 private String marca;
 private String modelo;
 private int km;
 public final static int MAX_KM_X_BICICLETA = 250;

    public Bicicleta(String ma, String mo, int km){
        setMarca(ma);
        setModelo(mo);
        setKm(km);
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getKm() {
        return km;
    }

    private void setKm(int km) {
        this.km = km;
    }

    public boolean retornarServicioPosible(Bicicleta b){

        boolean pudo = false;

        if(b.getKm() <= MAX_KM_X_BICICLETA){
            pudo = true;
        }
        return pudo;
    }
}
