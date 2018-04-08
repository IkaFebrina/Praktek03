package praktek03;
public class HelmAksi {
    public static void main(String[] args) {
        Helm Dodo = new Helm();
        Dodo.Merk="GM";
        Dodo.Warna="Dark Blue";
        Dodo.Jenis_Kaca="Kaca Bening";
        Dodo.Harga=250000;
        
        Helm Dodi = new Helm();
        Dodi.Merk="KYT";
        Dodi.Warna="Black";
        Dodi.Jenis_Kaca="Kaca Gelap";
        Dodi.Harga=300000;
        
        Helm Dudu = new Helm();
        Dudu.Merk ="NKH";
        Dudu.Warna="Black";
        Dudu.Jenis_Kaca="Kaca Bening + Kaca Gelap (double)";
        Dudu.Harga=450000;
        
        Dodo.cetakInfo();
        Dodi.cetakInfo();
        Dudu.cetakInfo();
    }
}
