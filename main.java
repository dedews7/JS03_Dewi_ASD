import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SportProt sportProt = new SportProt();

        boolean selesai = false;
        while (!selesai) {
            System.out.println("\n------------------------ MENU -------------------------\n");
            System.out.println("1. Pesan Lapangan Futsal");
            System.out.println("2. Pesan Lapangan Badminton");
            System.out.println("3. Lihat Riwayat Pemesanan");
            System.out.println("0. Keluar");
            System.out.println("\n-------------------------------------------------------\n");
            System.out.print("Pilih menu (1/2/3/0): ");

            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    sportProt.pesanLapangan(input, "Futsal", 100000);
                    break;
                case 2:
                    sportProt.pesanLapangan(input, "Badminton", 40000);
                    break;
                case 3:
                    sportProt.tampilkanRiwayatPemesanan();
                    break;
                case 0:
                    selesai = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            if (!selesai) {
                System.out.print("\nKembali ke menu utama? (y/n): ");
                char kembali = input.next().charAt(0);
                selesai = (kembali == 'n' || kembali == 'N');
            }
        }

        input.close();
    }
}
