package cajero;
import java.util.*;
public class Cajero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("%%% SISTEMA DE CAJERO %%%");
        System.out.println("Inicializando...");
        try {
            Thread.sleep(3000);
        }catch (Exception e) {
        }
        
        int encendido;
        int opcion;
        String usuario;
        usuario = null;
        String contra;
        contra = null;
        String op_volver;
        opcion = 0;
        encendido = 1;
        
        System.out.println("Bienvenido al Banco BBVB");
        do{
            System.out.println("#### Menu Principal ####");
            System.out.println("1. Abrir una cuenta");
            System.out.println("2. Consultar saldo");
            System.out.println("3. Retirar efectivo");
            System.out.println("4. Ingresar o depositar efectivo");
            System.out.println("5. Hacer transferencias");
            System.out.println("6. Informacion acerca de la cuenta");
            System.out.println("7. Salir");
            System.out.print("Ingrese la opcion deseada: ");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Crear / Abrir Cuenta");
                    System.out.print("Ingrese nuevo usuario: ");
                    usuario = entrada.next();
                    System.out.print("Ingrese nueva contrasena: ");
                    contra = entrada.next();
                    System.out.println("Usuario '" + usuario + "' creado correctamente");
                    break;
                case 2:
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                    }
                    else{
                        System.out.print("");
                    }
                    break;
                case 3:
                    
                case 4:
                    
                case 5:
                   
                case 6:
                    
                case 7:
                    encendido = 0;
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion valida en el menu");
                    break;
                    
                    
            }
            
        }while(encendido == 1);
    }
    
}
