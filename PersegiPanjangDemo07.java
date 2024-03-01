import java.util.Scanner;

class PersegiPanjangDemo07 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Berapa kali ingin menghitung Persegi Panjang? ");
        int arrayLength = input.nextInt();

        PersegiPanjang07[] arrayOfPersegiPanjang07 = new PersegiPanjang07[arrayLength];
        int panjang, lebar;
        
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Persegi Panjang ke-" + (i + 1));
            System.out.println("Masukkan Panjang :");
            panjang = input.nextInt();
            System.out.println("Masukkan Lebar: ");
            lebar = input.nextInt();

            arrayOfPersegiPanjang07[i] = new PersegiPanjang07(panjang, lebar); 
        }

        for (int i = 0; i < arrayOfPersegiPanjang07.length; i++) {
           
            arrayOfPersegiPanjang07[i].hitungLuas();
            arrayOfPersegiPanjang07[i].hitungKeliling();
            arrayOfPersegiPanjang07[i].cetakInfo();
        }
    }
}
