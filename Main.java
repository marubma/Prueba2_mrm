
//PARTE 1
public class Main {
    public static void main(String[] args) {
        int numerolf = 0;

        if (numerolf > 0) {
            System.out.println("positivo");
        } else if (numerolf < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("cero");
        }
    }
}

//PARTE 2
 class While {
    public static void main(String[] args) {
        int numeroWhile = -10;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        }
    }

//PARTE 3
class DOWhile {
    public static void main(String[] args) {
        int numeroWhile = -10;
        do {
            numeroWhile = numeroWhile +1;
            System.out.println(numeroWhile);
        } while(numeroWhile < 3);
    }
}

//PARTE 4

class FOR {
    public static void main(String[] args) {
        for (int numeroFor = 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }
    }
}


//PARTE 5

class SWITCH {
    public static void main(String[] args) {
        var estacion = "OTOÑO";

        switch(estacion) {
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
                System.out.println(estacion);
        }
    }
}