package Proyecto;

import java.util.*;

public class Login {


		public static void mostrarLogin(String[] args) 
		{

			        Map<String, String> cuentas = new HashMap<>();
			        
			        Scanner scanner = new Scanner(System.in);
			        
			
			        System.out.println("CREACIÓN DE CUENTA");
			        System.out.print("Ingrese su nombre de usuario: ");
			        String usuario = scanner.nextLine();
			        
			        System.out.print("Ingrese su contraseña: ");
			        String contrasena = scanner.nextLine();
			        
			        cuentas.put(usuario, contrasena); 
			        
			  
			        System.out.println("\nINICIO DE SESIÓN");
			        System.out.print("Nombre de usuario: ");
			        String usuarioLogin = scanner.nextLine();
			        
			        System.out.print("Contraseña: ");
			        String contrasenaLogin = scanner.nextLine();
			        

			        if (cuentas.containsKey(usuarioLogin) && cuentas.get(usuarioLogin).equals(contrasenaLogin)) {
			            System.out.println("Inicio de sesión exitoso.");
			        } else {
			            System.out.println("Nombre de usuario o contraseña incorrectos.");
			        }
			        
			        
			    }
			}