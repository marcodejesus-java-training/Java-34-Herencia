public class Main {
    public static void main (String args[]){
        BicicletaDeMontana bicicletaDeMontana = new BicicletaDeMontana(3, 100, 25);
        System.out.println(bicicletaDeMontana.toString());
        System.out.println();

        bicicletaDeMontana.acelerar(150);
        bicicletaDeMontana.frenar(50);
        System.out.println(bicicletaDeMontana.toString());
        System.out.println();

        // BiciletaDeMontana es de tipo Object y por lo tanto puedo convertirlo a Object
        // Ahora objBicletaDeMontana es de tipo Object y BicicletaDeMontana (Solo hasta que sea asignado a un tipo de
        // BicicletaDeMontana)
        // Implicit Casting (Conversion Implícita)
        Object objBicletaDeMontana = new BicicletaDeMontana(3, 0, 10);

        //También podemos convertir ahora objBicicletaDeMontana al tipo BicicletaDeMontana
        // Explicit Casting (Conversion Explícita)
        BicicletaDeMontana bicicletaDeMontana1 = (BicicletaDeMontana) objBicletaDeMontana;
        System.out.println(bicicletaDeMontana1.toString());
    }
}
