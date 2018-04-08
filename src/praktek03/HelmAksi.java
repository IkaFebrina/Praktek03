package praktek03;
public class HelmAksi {
    public static void main(String[] args) {
        Helm Dodo = new Helm();
        Dodo.setMerk("GM");
        Dodo.setWarna("Drk Blue");
        Dodo.setJenis_Kaca("Kaca Bening");
        Dodo.setHarga(250000);
        
        Helm Dodi = new Helm();
        Dodi.setMerk("KYT");
        Dodi.setMerk("Black");
        Dodi.setJenis_Kaca("Kaca Gelap");
        Dodi.setHarga(300000);
        
        Helm Dudu = new Helm();
        Dudu.setMerk("NHK");
        Dudu.setWarna("Black");
        Dudu.setJenis_Kaca("Kaca Bening + Kaca Gelap (double)");
        Dudu.setHarga(450000);
        
        Dodo.cetakInfo();
        System.out.println();
        Dodi.cetakInfo();
        System.out.println();
        Dudu.cetakInfo(); 
    }
}
