public class StudiKasus07 {
    public double ipk, countIpk;
    public String nama, nim, jenisKelamin;

    public StudiKasus07(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }
    
    public StudiKasus07()
    {
    }

    public void cetakInfo(StudiKasus07[] mahasiswa)
    {
        int i =1;
        for (Tugas108 mhs : mahasiswa) {
            countIpk += mhs.ipk;
        
            System.out.println("Data Mahasiswa ke-" + i);
            System.out.println("Nama: " + mhs.nama);
            System.out.println("Nim: " + mhs.nim);
            System.out.println("Jenis kelamin: " + mhs.JenisKelamin);
            System.out.println("IPK: " + mhs.ipk);
            System.out.println();
            i++;
        }
        System.out.println("Rata-rata IPK : "+ rataIPK(countIpk, mahasiswa.length));
    }

    public double rataIPK(double ipk, int mhs)
    {
        double rerata;
        rerata = ipk/Double.valueOf(mhs);
        return rerata;
    }

}