package Proyecto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Login login = new Login();
        login.mostrarLogin(args);
        inventario.mostrarMenu();
        scanner.close();
    }
}