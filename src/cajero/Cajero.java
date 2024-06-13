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
        int seguir;
        seguir = 1;
        String tecla;
        int bloq_cuen;
        bloq_cuen = 0;
        
        //Variables caso 3
        int dinero_retirar;
        dinero_retirar = 0;
        
        //Variables caso 4
        int dinero_ingre;
        dinero_ingre = 0;
        
        //Variables caso 5
        String usu_transfer;

        //MENU
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
                    System.out.println("=== Crear / Abrir Cuenta ===");
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
                    
//Caso 2
                case 2:
                    System.out.println("=== Consultar Saldo ===");
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e) {}
                    }
                    else if(bloq_cuen == 1){
                        System.out.println("Usted no puede continuar, SU CUENTA HA SIDO BLOQUEADA. Dirijase a su banco para desbloquearla");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                        break;
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.println("El dinero en su cuenta es: " + dinero_cuenta);
                                System.out.println("Escriba 'ok' para continuar...");
                                try{
                                    tecla = entrada.next();
                                    seguir = 0;
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(2000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            else if(intentos == 3){
                                System.out.println("Tres intentos fallidos. SU CUENTA HA SIDO BLOQUEADA");
                                bloq_cuen = 1;
                                seguir = 0;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(seguir == 1);
                    }
                    break;
                    
//Caso 3
                case 3:
                    System.out.println("=== Retirar Efectivo ===");
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e) {}
                    }
                    else if(bloq_cuen == 1){
                        System.out.println("Usted no puede continuar, SU CUENTA HA SIDO BLOQUEADA. Dirijase a su banco para desbloquearla");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                        break;
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.print("Cuanto dinero desea retirar: ");
                                dinero_retirar = entrada.nextInt();
                                if(dinero_retirar > dinero_cuenta){
                                    System.out.println("Usted no tiene el suficiente saldo para hacer ese retiro");
                                }
                                else{
                                    dinero_cuenta -= dinero_retirar;
                                    System.out.println("$$$ Retiro Exitoso $$$");
                                    System.out.println("Usted ha retirado $" + dinero_retirar);
                                    System.out.println("El saldo actual de su cuenta es: $" + dinero_cuenta);
                                }
                                System.out.println("Escriba 'ok' para continuar...");
                                try{
                                    tecla = entrada.next();
                                    seguir = 0;
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(2000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            else if(intentos == 3){
                                System.out.println("Tres intentos fallidos. SU CUENTA HA SIDO BLOQUEADA");
                                bloq_cuen = 1;
                                seguir = 0;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(seguir == 1);
                    }
                    break;

//Caso 4
                case 4:
                    System.out.println("=== Ingresar / Depositar Dinero ===");
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e) {}
                    }
                    else if(bloq_cuen == 1){
                        System.out.println("Usted no puede continuar, SU CUENTA HA SIDO BLOQUEADA. Dirijase a su banco para desbloquearla");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                        break;
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.print("Ingrese cuanto dinero desea ingresar a su cuenta: ");
                                dinero_ingre = entrada.nextInt();
                                dinero_cuenta += dinero_ingre;
                                System.out.println("$$$ Deposito Exitoso $$$");
                                System.out.println("Su saldo actual es de: $" + dinero_cuenta);
                                System.out.println("Escriba 'ok' para continuar...");
                                try{
                                    tecla = entrada.next();
                                    seguir = 0;
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(2000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            else if(intentos == 3){
                                System.out.println("Tres intentos fallidos. SU CUENTA HA SIDO BLOQUEADA");
                                bloq_cuen = 1;
                                seguir = 0;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(seguir == 1);
                    }
                    break;
                    
//Caso 5
                case 5:
                    System.out.println("=== Transferir Dinero ===");
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e) {}
                    }
                    else if(bloq_cuen == 1){
                        System.out.println("Usted no puede continuar, SU CUENTA HA SIDO BLOQUEADA. Dirijase a su banco para desbloquearla");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                        break;
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.print("A que usuario desea transferir el dinero: ");
                                usu_transfer = entrada.next();
                                System.out.print("Cuanto dinero desea transferir: ");
                                dinero_retirar = entrada.nextInt();
                                if(dinero_retirar > dinero_cuenta){
                                    System.out.println("Usted no tiene el suficiente saldo para hacer esa transferencia");
                                }
                                else{
                                    dinero_cuenta -= dinero_retirar;
                                    System.out.println("$$$ Transferencia Exitoso $$$");
                                    System.out.println("Usted ha transferido $" + dinero_retirar + " al usuario '" + usu_transfer + "'");
                                    System.out.println("El saldo actual de su cuenta es: $" + dinero_cuenta);
                                }
                                System.out.println("Escriba 'ok' para continuar...");
                                try{
                                    tecla = entrada.next();
                                    seguir = 0;
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(2000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            else if(intentos == 3){
                                System.out.println("Tres intentos fallidos. SU CUENTA HA SIDO BLOQUEADA");
                                bloq_cuen = 1;
                                seguir = 0;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(seguir == 1);
                    }
                    break;
//Caso 6
                case 6:
                    System.out.println("=== Informacion de la Cuenta ===");
                    if (usuario == null){
                        System.out.println("DEBE CREAR UNA CUENTA PRIMERO");
                        try {
                            Thread.sleep(2000);
                        }catch (Exception e) {}
                    }
                    else if(bloq_cuen == 1){
                        System.out.println("Usted no puede continuar, SU CUENTA HA SIDO BLOQUEADA. Dirijase a su banco para desbloquearla");
                        try {
                            Thread.sleep(3000);
                        }catch (Exception e) {}
                        break;
                    }
                    else{
                        do{
                            System.out.print("Ingrese su usuario: ");
                            usu_ingre = entrada.next();
                            System.out.print("Ingrese su contrasena: ");
                            contra_ingre = entrada.next();
                            if(usu_ingre.equals(usuario) && contra_ingre.equals(contra)){
                                System.out.println("Cliente del banco BBVB");
                                System.out.println("Usuario: " + usuario);
                                System.out.println("Contrasena: *****");
                                System.out.println("Saldo actual de la cuenta: $" + dinero_cuenta);
                                System.out.println("Gracias por ser nuestro cliente");
                                System.out.println("Escriba 'ok' para continuar...");
                                try{
                                    tecla = entrada.next();
                                    seguir = 0;
                                }catch(Exception e){}
                            }
                            else{
                                System.out.println("USUARIO / CONTRASENA INCORRECTA");
                                intentos ++;
                                try {
                                    Thread.sleep(2000);
                                }catch (Exception e) {}
                            }
                            if(intentos == 2){
                                System.out.println("Dos intentos fallidos, si el siguiente intento es fallido su cuenta sera bloqueada");
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            else if(intentos == 3){
                                System.out.println("Tres intentos fallidos. SU CUENTA HA SIDO BLOQUEADA");
                                bloq_cuen = 1;
                                seguir = 0;
                                try {
                                    Thread.sleep(3000);
                                }catch (Exception e) {}
                            }
                            
                        }while(seguir == 1);
                    }
                    break;
                case 7:
                    encendido = 0;
                    break;
                    
                default:
                    System.out.println("Ingrese una opcion valida en el menu");
                    try {
                        Thread.sleep(2000);
                    }catch (Exception e) {}
                    break;

            }
            
        }while(encendido == 1);
    }
    
}
