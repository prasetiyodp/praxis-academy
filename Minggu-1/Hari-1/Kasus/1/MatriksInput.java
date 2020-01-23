import java.util.Scanner;

public class MatriksInput {

    public static void main(String[] args) {
        int[][] matriks1 = new int[5][5];
        int[][] matriks2 = new int[5][5];
        int jumlah1 = 0;
        int jumlah2 = 0;
        Scanner keyboard = new Scanner(System.in);
        
        //matriks 1
        System.out.println("Matriks [1, 1]");        
        for (int x=0; x < 5; x++){
            System.out.println("Input Nilai Matriks 1 :");
            matriks1[x][0] = keyboard.nextInt(); 
        }
        System.out.println("Matriks [1, 2]");  
        for (int x=0; x < 5; x++){
            System.out.println("Input Nilai Matriks 1 :");
            matriks1[x][1] = keyboard.nextInt(); 
        }
        
        //matriks 2
        System.out.println("Matriks [2, 1]");        
        for (int x=0; x < 5; x++){
            System.out.println("Input Nilai Matriks 2 :");
            matriks2[x][0] = keyboard.nextInt(); 
        }
        System.out.println("Matriks [2, 2]");  
        for (int x=0; x < 5; x++){
            System.out.println("Input Nilai Matriks 2 :");
            matriks2[x][1] = keyboard.nextInt(); 
        }
        //menampilkan matriks
        System.out.println("Matriks 1");
        for (int x=0; x < 5; x++){
            System.out.print(matriks1[x][0]);
            System.out.println(" " + matriks1[x][1]);
        }
        System.out.println("Matriks 2");
        for (int x=0; x < 5; x++){
            System.out.print(matriks2[x][0]);
            System.out.println(" " + matriks2[x][1]);
        }
        //menghitung matriks
        System.out.println("================================================");
        System.out.println("Penjumlahan Matriks");
        for (int x=0; x < matriks1.length; x++){
            jumlah1 = matriks1[x][0] + matriks2[x][0];
            jumlah2 = matriks1[x][1] + matriks2[x][1];
            System.out.println(jumlah1 + " " + jumlah2);
        }
    }
}