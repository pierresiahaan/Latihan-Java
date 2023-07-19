class Manusia{
   int umur=26;

   int tinggi=170;

   int beratBadan=90;
  
   void mengambil(int distance){
    System.out.println("Manusia ini mengambil uang sebanyak" + distance + "gepok");
  }
 
  void berjalan(int distance){
   System.out.println("Manusia tersebut berjalan sejauh" + distance + "km");
  }

  void memukul(int lari){
   System.out.println("Manusia bodok ini memukul pendeta" + lari + "pukulan");
  } 

  void menjambak(int joget){
   System.out.println("Manusia gila itu menjambak ibunya dengan" + joget + "sekali");
  }

 public static void main(String[] args) {
  Manusia manusia = new Manusia();
  manusia.menjambak (12);

 }


}