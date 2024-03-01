import java.util.Scanner;

class SportProt {
    Scanner input = new Scanner(System.in);
    private Pemesanan[] riwayatPemesanan;
    private int jumlahPemesanan;

    public SportProt() {
        riwayatPemesanan = new Pemesanan[100];
        jumlahPemesanan = 0;
    }

    public void pesanLapangan(Scanner input, String jenisLapangan, double harga) {
        System.out.println("\n-------- PESAN LAPANGAN " + jenisLapangan.toUpperCase() + " --------\n");

        input.nextLine(); 
        System.out.print("Masukkan Tanggal (dd/mm/yyyy): ");
        String tanggal = input.nextLine();

        System.out.print("Masukkan Jam Booking (HH:mm): ");
        String jamBooking = input.nextLine();

        System.out.print("Masukkan Durasi Booking (jam): ");
        int durasi = input.nextInt();

        if (durasi <= 0) {
            System.out.println("Durasi booking harus lebih dari 0 jam.");
            return;
        }

        double totalBiaya = harga * durasi;

        System.out.println("\n--- Konfirmasi Pesanan ---");
        System.out.println("Tanggal: " + tanggal);
        System.out.println("Jam Booking: " + jamBooking);
        System.out.println("Durasi Booking: " + durasi + " jam");
        System.out.println("Total Biaya: Rp. " + totalBiaya);

        input.nextLine(); 
        System.out.print("\nApakah Anda ingin melanjutkan pesanan? (y/n): ");
        char lanjut = input.next().charAt(0);

        if (lanjut == 'y' || lanjut == 'Y') {
            input.nextLine(); 
            System.out.print("\nPilih metode pembayaran (Transfer/Cash): ");
            String metodePembayaran = input.nextLine();

            System.out.println("\n--- Pembayaran ---");
            if (metodePembayaran.equalsIgnoreCase("Transfer") || metodePembayaran.equalsIgnoreCase("Cash")) {
                System.out.println("Silahkan lakukan pembayaran dengan metode " + metodePembayaran);
                System.out.println("Setelah pembayaran, pemesanan akan tercatat.");
                tambahkanPemesanan(new Pemesanan(jenisLapangan, tanggal, jamBooking, durasi, totalBiaya));
            } else {
                System.out.println("Metode pembayaran tidak valid.");
            }
        }
    }

    public void tambahkanPemesanan(Pemesanan pemesanan) {
        if (jumlahPemesanan < riwayatPemesanan.length) {
            riwayatPemesanan[jumlahPemesanan] = pemesanan;
            jumlahPemesanan++;
            System.out.println("\nPemesanan berhasil ditambahkan.");
        } else {
            System.out.println("\nKapasitas riwayat pemesanan sudah mencapai batas.");
        }
    }

    public void tampilkanRiwayatPemesanan() {
        System.out.println("\n-------- RIWAYAT PEMESANAN --------\n");
        if (jumlahPemesanan > 0) {
            for (int i = 0; i < jumlahPemesanan; i++) {
                System.out.println("Pemesanan ke-" + (i + 1));
                System.out.println("Jenis Lapangan: " + riwayatPemesanan[i].getJenisLapangan());
                System.out.println("Tanggal: " + riwayatPemesanan[i].getTanggal());
                System.out.println("Jam Booking: " + riwayatPemesanan[i].getJamBooking());
                System.out.println("Durasi: " + riwayatPemesanan[i].getDurasi() + " jam");
                System.out.println("Total Biaya: Rp. " + riwayatPemesanan[i].getTotalBiaya());
                System.out.println();
            }
        } else {
            System.out.println("Belum ada riwayat pemesanan.");
        }
    }
}