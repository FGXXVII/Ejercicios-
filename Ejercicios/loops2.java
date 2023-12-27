import java.util.Scanner;

public class loops2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x , cantidad   , n;
        float largo ;
        cantidad = 0;
        x = 1;
        

        
        System.out.print("cuantas piezas va a procesar ");
        n= teclado.nextInt();


        while ( x <= n) {
            System.out.println("ingrese medidas de las piezas ");
            largo = teclado.nextInt();
            if(largo >=120 && largo<=130){
                cantidad = cantidad + 1;

            }x = x+1;



            
        }System.out.print("cantidad de piezas aptas " + cantidad 
        );

    
    }
}
