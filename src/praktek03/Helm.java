package praktek03;
public class Helm {
    private String Merk;
    private String Warna;
    private String Jenis_Kaca;
    private double Harga;
    
    void cetakInfo(){
        System.out.println("Merk \t: "+Merk+"\n"+
                "Warna \t: "+Warna+"\n"+
                "Jenis_Kaca \t: "+Jenis_Kaca+"\n"+
                "Harga \t: "+Harga);
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getWarna() {
        return Warna;
    }

    public void setWarna(String Warna) {
        this.Warna = Warna;
    }

    public String getJenis_Kaca() {
        return Jenis_Kaca;
    }

    public void setJenis_Kaca(String Jenis_Kaca) {
        this.Jenis_Kaca = Jenis_Kaca;
    }

    public double getHarga() {
        return Harga;
    }

    public void setHarga(double Harga) {
        this.Harga = Harga;
    }
    
    
}
