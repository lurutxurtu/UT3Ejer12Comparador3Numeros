import java.util.Scanner;
public class Comparador {

    public int numero1;
    public int numero2;
    public int numero3;






    public Comparador(){
        Scanner miScanner = new Scanner(System.in);
        System.out.println("introduce tres numeros a comparar: ");
        int numero1 = miScanner.nextInt();
        int numero2 = miScanner.nextInt();
        int numero3 = miScanner.nextInt();
        miScanner.close();

        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;

    }



    public void mayorDeTres(){
        if ((this.numero1 > this.numero2)&&(this.numero1 > this.numero3)) {
            System.out.println("El numero mas grande es: "+ this.numero1);
        } else if ((this.numero2 > this.numero1)&&(this.numero2 > this.numero3)) {
            System.out.println("El numero mas grande es: "+ this.numero2);
        } else if ((this.numero3 > this.numero1)&&(this.numero3 > this.numero2)) {
            System.out.println("El numero mas grande es: "+ this.numero3);
        }
    }

}
