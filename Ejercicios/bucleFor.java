import java.util.Scanner;

public interface bucleFor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        int n , z ;
        n = 0 ;
        z = 0 ;
        System.out.println(" [ Dame el numero a Multiplicar ]"  );
        n =teclado.nextInt();
        z = n;
        

        for( int f=1; f<=13; f++ ){

            System.out.print(n + " - ");
            n = n + z;

        
        }
    }
}
