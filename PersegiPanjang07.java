class PersegiPanjang07 {
    public int panjang;
    public int lebar;
    public int keliling;
    public int luas;
    
public void cetakInfo() {
    System.out.println("Panjang: " + panjang + ", lebar: " + lebar + ", Keliling: " + keliling + ", Luas: " + luas);
}

public PersegiPanjang07(int p, int l){
    panjang = p;
    lebar = l;
}

public void hitungLuas() {
    luas = panjang * lebar;
}

public void hitungKeliling() {
    keliling = 2 * (panjang + lebar);
}
}