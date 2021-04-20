public class BicicletaElectrica extends Bicicleta{

    public final static int MAX_POTENCIA_X_BICICLETA = 250;

    private int potenciaWatts;

    public BicicletaElectrica(String ma, String mo, int km, int w){
        super(ma, mo, km);
        setPotenciaWatts(w);
    }

    public int getPotenciaWatts() {
        return potenciaWatts;
    }

    private void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public boolean retornarServicioPosible(BicicletaElectrica b){

        boolean pudo = false;

        if(b.getPotenciaWatts() <= MAX_POTENCIA_X_BICICLETA && super.getKm() < MAX_KM_X_BICICLETA){
            pudo = true;
        }
        return pudo;
    }
}
