/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        int[][] nilai = {{70, 80},{60, 90},{70, 80},{80, 80},{90, 90}};
        int a = 0;
        for(int x=0; x < nilai.length; x++){
            a = nilai[x][0] + nilai[x][1];
            System.out.println("Total nilai Array ke " + x + ":" + a);
    }    
        System.out.println("");
}
}