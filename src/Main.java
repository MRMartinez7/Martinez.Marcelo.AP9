import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        /*1 Crear las variables correspondientes para leer tu nombre,
         apellido y edad e imprimirlos por consola en una oración.*/
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Ingresa tu Nombre");
        String myName = myScanner.next();
        System.out.println("Ingresa tu Apellido");
        String mySurname = myScanner.next();
        System.out.println("Ingresa tu Edad");
        int myAge = myScanner.nextInt();

        System.out.println("Mi nombre es "+myName+" "+mySurname+" y tengo "+myAge+" años");

        /*2 Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
*/
        System.out.println("Ingresa el primer valor");
        int num1= myScanner.nextInt();
        System.out.println("Ingresa el segundo valor");
        int num2= myScanner.nextInt();
        System.out.println("Ingresa el tercer valor");
        int num3= myScanner.nextInt();
        if ((num1>num2) && (num1>num3)){
            System.out.println("El valor mayor entre "+num1+"-"+num2+"-"+num3+" es: "+num1);
        } else if ((num2>num1) && (num2>num3)){
            System.out.println("El valor mayor entre "+num1+"-"+num2+"-"+num3+" es: "+num2);
        } else if ((num3>num1) && (num3>num2)){
            System.out.println("El valor mayor entre "+num1+"-"+num2+"-"+num3+" es: "+num3);

            /*3 Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad */
        System.out.println("Introduzca un numero");
            int numParidad = myScanner.nextInt();

            if (numParidad % 2 == 0){
                System.out.println("El numero "+numParidad+" es PAR ");
            } else {
                System.out.println("El numero "+numParidad+" es IMPAR ");
            }
/*4 Crear el código correspondiente que permita ingresar 2 cadenas
de caracteres e imprima por consola si son iguales o no*/
            System.out.println("Introduzca cadena 1");
            String cadena1 =myScanner.next();
            System.out.println("Introduzca cadena 2");
            String cadena2 =myScanner.next();
            if (cadena1.toLowerCase() == cadena2.toLowerCase()){
                System.out.println(cadena1+" y "+cadena2+" son iguales");
            }else {
                System.out.println(cadena1+" y "+cadena2+" no son iguales");
            }


            /*5 Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0*/
            System.out.println("Ingrese un numero");
            int numero = myScanner.nextInt();
            while (numero != 0){
                System.out.println("Ingrese un numero");
                numero = myScanner.nextInt();
            }
    }
    }
    }