/**
 * Matriks
 */
public class Matriks {

    public static void main(String[] args) {
        int[][] matriks1 = {{70, 80},{60, 90},{70, 80},{80, 80},{90, 90}};
        int[][] matriks2 = {{10, 20},{30, 40},{50, 60},{70, 80},{90, 10}};
        int jumlah1 = 0;
        int jumlah2 = 0;

        System.out.println("Matriks 1");
        for (int x=0; x < matriks1.length; x++){
            System.out.print(matriks1[x][0]);
            System.out.println(" " + matriks1[x][1]);
        }
        System.out.println("Matriks 2");
        for (int x=0; x < matriks2.length; x++){
            System.out.print(matriks2[x][0]);
            System.out.println(" " + matriks2[x][1]);
        }
        System.out.println("Penjumlahan Matriks");
        for (int x=0; x < matriks1.length; x++){
            jumlah1 = matriks1[x][0] + matriks2[x][0];
            jumlah2 = matriks1[x][1] + matriks2[x][1];
            System.out.println(jumlah1 + " " + jumlah2);
            
        }
        
    }
}