import java.util.Scanner;
import java.util.Random;
public class JuegoIA
{
private String ingreso1 = new String();
private String ingreso2 = new String();
    
public static void Comparar(String ingreso1,String ingreso2){
       if(ingreso2.equals(ingreso1)){
          System.out.println( "empate");
          }else{
           if(ingreso1.equals("piedra")){
             if(ingreso2.equals("tijeras")){
                System.out.println("gana piedra"); 
               }
             } 
           else{
                      if(ingreso2.equals("papel")){
                         System.out.println("gana papel"); 
                     }else{
                           if(ingreso2.equals("lagarto")){
                            System.out.println("gana piedra");
                            }else{
                                 if(ingreso2.equals("spock")){
                                  System.out.println("gana spock"); 
                                  }
                                  }
                           }
                      }
           if(ingreso1.equals("papel")){
             if(ingreso2.equals("tijeras")){
                System.out.println("gana tijeras"); 
                }else{
                      if(ingreso2.equals("lagarto")){
                         System.out.println("gana lagarto"); 
                     }else{
                           if(ingreso2.equals("spock")){
                            System.out.println("gana papel");
                            }
                           }
                      }
             }
           if(ingreso1.equals("tijeras")){
             if(ingreso2.equals("lagarto")){
                System.out.println("gana tijeras"); 
                }else{
                      if(ingreso2.equals("spock")){
                         System.out.println("gana spock"); 
                     }
                      }
            }
           if(ingreso1.equals("spock")){
             if(ingreso2.equals("lagarto")){
                System.out.println("gana lagarto"); 
                }
}
       }
}
    
    
    public static void main (String[]args){
       Scanner t = new Scanner (System.in);
       Random r = new Random();
       String ingresarUsuario = new String();
       String ingresarMaquina = null;
       System.out.println("                              I N T R O D U C C I O N ");
       System.out.println("\n");
       System.out.println("Las tijeras cortan el papel, el papel cubre a la piedra, la piedra aplasta al lagarto, el lagarto \nenvenena a Spock, Spock destroza las tijeras, las tijeras decapitan al lagarto, el lagarto \nse come el papel, el papel refuta a Spock, Spock vaporiza la piedra, y, como es habitual… la \npiedra aplasta las tijeras.");
       System.out.println("\n");
       System.out.println("escoja entre :   ");
       System.out.println("       piedra, papel, tijeras,lagarto, spock");
       ingresarUsuario = t.next();
       System.out.println("\n");
       
       while(!(ingresarUsuario.equals("piedra")||ingresarUsuario.equals("papel")||ingresarUsuario.equals("tijeras")||ingresarUsuario.equals("lagarto")||ingresarUsuario.equals("spock"))){
       System.out.println("ERROR\n escoja entre: ");
       System.out.print("                       piedra, papel, tijeras,lagarto, spock");
       ingresarUsuario = t.next();
       }
       System.out.println("usuario:  "+ingresarUsuario);
             switch(r.nextInt(5)){
                case 0: ingresarMaquina = "piedra";
                break;
                case 1: ingresarMaquina = "papel";
                break;
                case 2: ingresarMaquina = "tijeras";
                break;
                case 3: ingresarMaquina = "lagarto";
                break;
                case 4: ingresarMaquina = "spock";
               
             }
            
       System.out.println("maquina:  "+ingresarMaquina);
       System.out.println("\n");
       Comparar(ingresarUsuario,ingresarMaquina);
    }
}
        


