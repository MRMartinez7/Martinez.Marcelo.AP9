import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
       // Ejercicio1();
       // Ejercicio2();
       // Ejercicio3();
       // Ejercicio4();
       // Ejercicio5();
        Ejercicio6();
       // Ejercicio7();

    }
    public static void Ejercicio1(){
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
    }
    public static void Ejercicio2(){
         /*2 Realizar un pequeño programa que permita ingresar 3 números
e imprimir por consola cuál es el mayor.
*/      Scanner myScanner = new Scanner(System.in);
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
        }
    }
    public static void Ejercicio3(){
        /*3 Realizar un pequeño programa que permita el ingreso de un
número e imprimir por consola su paridad */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int numParidad = myScanner.nextInt();

        if (numParidad % 2 == 0){
            System.out.println("El numero "+numParidad+" es PAR ");
        } else {
            System.out.println("El numero "+numParidad+" es IMPAR ");
        }
    }
    public static void Ejercicio4(){
        /*4 Crear el código correspondiente que permita ingresar 2 cadenas
de caracteres e imprima por consola si son iguales o no*/
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Introduzca cadena 1");
        String cadena1 =myScanner.next();
        System.out.println("Introduzca cadena 2");
        String cadena2 =myScanner.next();
        if (cadena1.toLowerCase() == cadena2.toLowerCase()){
            System.out.println(cadena1+" y "+cadena2+" son iguales");
        }else {
            System.out.println(cadena1+" y "+cadena2+" no son iguales");
        }
    }
    public static void Ejercicio5(){
        /*5 Realizar un pequeño programa que permita el ingreso de
números, almacenarlos en una colección hasta ingresar un 0*/
        Scanner myScanner = new Scanner(System.in);
        List<Integer> numAlmacenado = new ArrayList<>();
        System.out.println("Ingrese un numero");
        int numeroIngresado = myScanner.nextInt();
        while (numeroIngresado != 0){
            numAlmacenado.add(numeroIngresado);
            System.out.println("Ingrese un numero o 0 para terminar");
            numeroIngresado = myScanner.nextInt();
        }
        for (int i = 0; i<numAlmacenado.size(); i++){
            System.out.println(i+": "+numAlmacenado.get(i));
        }
    }
    public static String Ejercicio6(){
        return "";

    }
    }