package FirstProgram;
import FirstProgram.FirstProgram;

public class Fungsi {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;
        int z = 10;
        int v = 5;

        FirstProgram.Indah("Erma");
        FirstProgram.Indah("Kalinda");

        tambah(x,y);
        tambah(y,z);
        tambah(x,z);
        tambah(z,v);
    }
    public static int tambah(int a, int b){
        int hasilTambah = a+b;
        System.out.println("Hasil tambah "+a+" dan "+b+" adalah : "+hasilTambah);
        return hasilTambah;
    }
}
