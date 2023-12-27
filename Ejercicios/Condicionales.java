import java.util.Scanner;

public class Condicionales {
    public static void main(String[]ar){
        Scanner teclado = new Scanner(System.in);
        
       float sueldo ;
       
       System.out.print("Ingresar sueldo");
       sueldo = teclado.nextFloat();

       if(sueldo>3000){
        System.out.print("El sueldo cumple los requisitos para corbrarle el impuesto");
       }else {
        System.out.print("No paga impuesto ");
       }
       
    }
}
