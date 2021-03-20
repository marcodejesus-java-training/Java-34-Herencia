public class Bicicleta {
    public int numeroDeEstrellas;
    public int velocidad;

    public Bicicleta(int numeroDeEstrellas, int velocidad){
        this.numeroDeEstrellas = numeroDeEstrellas;
        this.velocidad = velocidad;
    }

    public void frenar(int decrementar){
        this.velocidad -= decrementar;
    }

    public void acelerar(int incrementar){
        this.velocidad += incrementar;
    }

    @Override
    public String toString(){
        return ("El número de Estrellas son: " + numeroDeEstrellas + "\n"
                + "Velocidad de la Bicicleta es: " + velocidad);
    }
}
