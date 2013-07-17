/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class Ejercicio1 {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ELIGA UNA OPERACION: ");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");


        int serie = Integer.parseInt(lectura.readLine());
        switch (serie) {
            case 1:
                Suma();
                break;
            case 2:
                Resta();
                break;
            case 3:
                Multiplicacion();
                break;
            case 4:
                Division();
                break;

            default:
                System.out.println("Eleccion Incorrecta");
        }
    }

    public static void Suma() throws NumberFormatException, IOException {
        Scanner reader = new Scanner(System.in);


        int num1;
        int num2;
        int suma;
        int result;
        System.out.println("Ingrese el número 1:");
        num1 = reader.nextInt();

        System.out.println("Ingrese el número 2:");
        num2 = reader.nextInt();

        System.out.println("Ingreseel resultado de la suma:");
        result = reader.nextInt();

        suma = num1 + num2;
        System.out.println("La suma es " + num1 + " + " + num2 + " = " + suma);

        if (result == suma) {
            System.out.println("Suma exitosa");
        } else {
            System.out.println("Suma mal");
        }

    }

    public static void Resta() throws NumberFormatException, IOException {
        Scanner reader = new Scanner(System.in);


        int num1;
        int num2;
        int resta;
        int result;
        System.out.println("Ingrese el número 1:");
        num1 = reader.nextInt();

        System.out.println("Ingrese el número 2:");
        num2 = reader.nextInt();

        System.out.println("Ingrese el resultado de la resta:");
        result = reader.nextInt();

        resta = num1 - num2;
        System.out.println("La resta es " + num1 + " - " + num2 + " = " + resta);

        if (result == resta) {
            System.out.println("Resta exitosa");
        } else {
            System.out.println("Resta mal");
        }

    }

    public static void Multiplicacion() throws NumberFormatException, IOException {
        Scanner reader = new Scanner(System.in);

        int num1;
        int num2;

        int multp;
        int result;
        System.out.println("Ingrese el número 1:");
        num1 = reader.nextInt();

        System.out.println("Ingrese el número 2:");
        num2 = reader.nextInt();

        System.out.println("Ingrese el resultado de la multiplicacion:");
        result = reader.nextInt();

        multp = num1 * num2;
        System.out.println("La multiplicacion es " + num1 + " * " + num2 + " = " + multp);

        if (result == multp) {
            System.out.println("Multiplicacion exitosa");

        } else {
            System.out.println("Multiplicacion mal");
        }

    }

    public static void Division() throws NumberFormatException, IOException {
        Scanner reader = new Scanner(System.in);
        int num1;
        int num2;
        int div;
        int result;

        System.out.println("Ingrese el número 1:");
        num1 = reader.nextInt();

        System.out.println("Ingrese el número 2:");
        num2 = reader.nextInt();

        System.out.println("Ingrese el resultado de la division:");
        result = reader.nextInt();

        div = num1 / num2;
        System.out.println("La division es " + num1 + " / " + num2 + " = " + div);

        if (result == div) {
            System.out.println("Division exitosa");
        } else {
            System.out.println("Division mal");
        }

    }
}
