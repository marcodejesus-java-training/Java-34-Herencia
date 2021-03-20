public class BicicletaDeMontana extends Bicicleta{

    private int alturaDelAsiento;

    public BicicletaDeMontana(int numeroDeEstrellas, int velocidad, int alturaDelAsiento) {
        super(numeroDeEstrellas, velocidad);
        this.alturaDelAsiento = alturaDelAsiento;
    }

    public void setAlturaDelAsiento(int alturaDelAsiento){
        this.alturaDelAsiento = alturaDelAsiento;
    }

    @Override
    public String toString(){
        return (super.toString() + "\nLa altura del asiento es: " + this.alturaDelAsiento);
    }
}
