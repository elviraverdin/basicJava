package gNumericTypes;

import libs.Input;

public class Minutos {

    public static void main (String Args[])
    {
        int min;
        min = pedirDatos();
        System.out.println( "Gastaste " + min*12 + " botellas de agua.");

    }

    static int pedirDatos()
    {

        System.out.println("Introduce los minutos en número entero: ");
        int n = Input.get_int();
        return n;
    }

}
