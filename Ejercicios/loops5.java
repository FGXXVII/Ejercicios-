import java.util.Scanner;

public class loops5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         
        int par , impar , x , n , z ;
        x = 1;// contador
        z = 1;// la cantidad de numeros a escribir osea repeticiones del bucle 
        n = 0;// es el valor de los numeros a ingresar 
        par =0;
        impar =0;
        System.out.print("Te pido la cantidad de numeros a ingresar ");
        z = teclado.nextInt();
        while (x <= z) {
          System.out.println("ingresa el valor del numero ");
          n = teclado.nextInt();
            if ( n %2 == 0) {
                par = par + 1 ;
                
            }else {
                impar = impar + 1;
            }

            x = x + 1;
            
        }

        System.out.println(" [ La cantidad de numeros pares fueron ] :" + par );
        System.out.println(" [ La cantidad de numeros impares fueron ] :" + impar );
        System.out.println(" [ el total de numero fue el programa concluce con exito  ] :" + z );
        






    }
}
