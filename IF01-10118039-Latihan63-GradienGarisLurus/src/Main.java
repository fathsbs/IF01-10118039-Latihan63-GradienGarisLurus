/*
 * NAMA              : FATAHILLAH SATRIA BIMA SENO
 * KELAS             : IF-01
 * NIM               : 10118039
 * DESKRIPSI PROGRAM : Program ini berisi program untuk mencari gradien dari beberapa titik   
 */

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Koordinat k1 = new Koordinat(2, 10, 5, 7);
        Koordinat k2 = new Koordinat(5, 1, 3, 12);
        System.out.println("       =====GRADIEN GARIS LURUS=====\n");
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%nmemiliki gradien sebesar %d%n", k1.getX1(), k1.y1, k1.getX2(), k1.getY2(), k1.hitungGradien());
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)%nmemiliki gradien sebesar %d%n%n", k2.getX1(), k2.y1, k2.getX2(), k2.getY2(), k2.hitungGradien());
    }

}
