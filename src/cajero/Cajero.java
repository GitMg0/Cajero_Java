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
        
        //Variables menu
        int encendido;
        encendido = 1;
        int opcion;
        
        //Variables caso 1
        String usuario;
        usuario = null;
        String contra;
        contra = null;
        int dinero_cuenta;
        dinero_cuenta = 0;
        
        //Variables caso 2
        String usu_ingre;
        String contra_ingre;
        int intentos = 0;
        String seguir;

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
                    System.out.print("Cuanto dinero quiere ingresar a esta cuenta: ");
                    dinero_cuenta = entrada.nextInt();
                    System.out.println("Usuario '" + usuario + "' creado correctamente");
                    try {
                        Thread.sleep(3000);
                    }catch (Exception e) {}
                    break;
                    
                case 2:
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.println("El dinero en su cuenta es: " + dinero_cuenta);
                                System.out.print("Presione cualquier tecla para continuar");
                                try{
                                    seguir = entrada.next();
                                    
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(intentos < 4);
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
