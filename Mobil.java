class Mobil {
    int jumlahPintu=5;

    int jumlahBan=5;

    int jumlahKursi=6;

  
    void dicuci(int times){
     System.out.println("Mobil ini dicuci sebanyak" + times + "kali dalam setahun");
    }

    void dibawa(int times){
        System.out.println("Mobil ini dibawa dengan kecepatan" + times + "km/jam");

    }

    void dipakai(int times){
        System.out.println("Mobil ibu dipakai " + times + " kali dalam seminggu");

    }
    
    void tampilanJumlahBan(){
        System.out.println("Mobil ibu mempunyai " + jumlahBan  + " ban dimobilnya");
    
    }

    void tampilanJumlahPintu(){
        System.out.println("Mobil ayah mempunyai " + jumlahPintu + " pintu pada mobilnya");
    }
 
    void tampilanJumlahKursi(){
        System.out.println("Mobil kakak mempunyai " + jumlahKursi + " kursi dalam mobilnya");
    }

    void ubahJumlahKursi(int kursiBaru){
       jumlahKursi = kursiBaru ;
    }

    void ubahJumlahBan(int banBaru){
        jumlahBan = banBaru ;
    }

    void ubahJumlahPintu(int pintuBaru){
        jumlahPintu = pintuBaru ;
    }

    public static void main(String[] args){
    Mobil mobil = new Mobil ();
    mobil.ubahJumlahPintu (10);
    mobil.tampilanJumlahPintu ();
    }

}


