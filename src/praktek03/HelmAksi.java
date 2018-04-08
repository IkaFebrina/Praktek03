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
        System.out.println();
        
        System.out.print("Merknya \t: ");
        System.out.println(Dodo.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(Dodo.getWarna());
        System.out.print("Jenis Kacanya \t: ");
        System.out.println(Dodo.getJenis_Kaca());
        System.out.print("Harganya \t: ");
        System.out.println(Dodo.getHarga());
        System.out.println();
        
        System.out.print("Merknya \t: ");
        System.out.println(Dodi.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(Dodi.getWarna());
        System.out.print("Jenis Kacanya \t: ");
        System.out.println(Dodi.getJenis_Kaca());
        System.out.print("Harganya \t: ");
        System.out.println(Dodi.getHarga());
        System.out.println();
        
        System.out.print("Merknya \t: ");
        System.out.println(Dudu.getMerk());
        System.out.print("Warnanya \t: ");
        System.out.println(Dudu.getWarna());
        System.out.print("Jenis Kacanya \t: ");
        System.out.println(Dudu.getJenis_Kaca());
        System.out.print("Harganya \t: ");
        System.out.println(Dudu.getHarga());
    }
}
