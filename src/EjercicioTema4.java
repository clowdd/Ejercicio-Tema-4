public class EjercicioTema4 {

    public static void main(String[] args) {

        int numero = -1;
        if (numero < 0) {
            System.out.println("numero negativo");
        }else if (numero > 0) {
            System.out.println("numero positivo");
        }else {
            System.out.println("igual a cero");
        }

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println("mostrar: " + numeroWhile);
            numeroWhile++;
        }

        numeroWhile = 2;
        do {
            System.out.println("mostrar DoWhile: " + numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);

        for (int numeroFor =0; numeroFor <=3; numeroFor++) {
            System.out.println("mostrar For: " + numeroFor);
        }

        var estacion = "LUNES";
        switch (estacion) {
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("NO es una estacion");
        }
    }
}