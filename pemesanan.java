class Pemesanan {
    private String jenisLapangan;
    private String tanggal;
    private String jamBooking;
    private int durasi;
    private double totalBiaya;

    public Pemesanan(String jenisLapangan, String tanggal, String jamBooking, int durasi, double totalBiaya) {
        this.jenisLapangan = jenisLapangan;
        this.tanggal = tanggal;
        this.jamBooking = jamBooking;
        this.durasi = durasi;
        this.totalBiaya = totalBiaya;
    }

    public String getJenisLapangan() {
        return jenisLapangan;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getJamBooking() {
        return jamBooking;
    }

    public int getDurasi() {
        return durasi;
    }

    public double getTotalBiaya() {
        return totalBiaya;
    }
}