import java.util.Scanner;
public class StudiKasusDemo07 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;
        System.out.print("Masukkan jumlah mahasiswa : ");
        length = sc.nextInt();

        StudiKasus07[] mahasiswa = new StudiKasus07[length];
        double ipk;
        String nama, nim, jenisKelamin;

       
        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            nama = sc.next();
            System.out.print("Masukkan NIM: ");
            nim = sc.next();
            System.out.print("Masukkan jenis kelamin: ");
            jenisKelamin = sc.next();
            System.out.print("Masukkan IPK: ");
            ipk = sc.nextDouble();

            mahasiswa[i] = new StudiKasus07(nama, nim, jenisKelamin, ipk);
            System.out.println();
        }
        StudiKasus07 mhs = new StudiKasus07();
        mhs.cetakInfo(mahasiswa);
        
    }
}