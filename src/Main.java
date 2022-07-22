public class Main {
    public static void main(String[] args) {

        int numeroif = 5;
        if(numeroif > 0 ){
            System.out.println("es positivo");
        }
        else if (numeroif == 0 )  {
            System.out.println("es 0");
        }
        else if(numeroif < 0 ){

            System.out.println("es negativo");
        }




        int numeroWhile = 0;
        while (numeroWhile < 3){
            numeroWhile = numeroWhile +1;
            System.out.println("numero while es:"+numeroWhile);
        }

        do {
            numeroWhile = numeroWhile +1;
            System.out.println("numero do es:"+numeroWhile);
        }while (numeroWhile <1);

        for ( int numerofor=0; numerofor <=3; numerofor++){
            System.out.println("numero for es:" + numerofor);
        }

        var estacion = "gil";
        switch (estacion){
            case "verano":
                System.out.println("es verano");
                break;
            case "invierno" :
                System.out.println("es invierno");
                break;

            case "otoño":
                System.out.println("es otoño");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("no es una estación");
        }

    }

}









