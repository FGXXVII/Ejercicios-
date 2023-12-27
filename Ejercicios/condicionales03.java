import java.util.Scanner;

public class condicionales03 {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

           
            String nombreApellido ;
              System.out.print("Ingresar Apellido y Nombre del alumno  ");
              nombreApellido = teclado.next();



            float  prueba1 , prueba2 , prueba3  ;
           System.out.print(" ingrese Nota de Prueba 1 ");
           prueba1 = teclado.nextFloat();
           System.out.print("ingrese Nota de Prueba 2 ");
           prueba2 = teclado.nextFloat();
           System.out.print("ingrese Nota de Prueba 2 ");
           prueba3 = teclado.nextFloat();

            float sumaPruebas = prueba1 + prueba2 + prueba3 ;
            float promedio = sumaPruebas / 3 ;

            if ( promedio > 7 ) {
           
                System.out.print(" El Alumno" + nombreApellido +"a completado sastifactoria mente el año trascurrido , Dando por finalizado la cursda en esta materia " );
                System.out.println("su promedio es de " + promedio);
                
            }else{
               

                System.out.print(" El Alumno " + nombreApellido +"es un pelotudo y se la lleva a marzo directo " );
                System.out.println("su promedio es de " + promedio);

            }
          
        
    }
    
}
