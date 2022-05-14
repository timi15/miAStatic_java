package miastatic;

public class MiAStatic {

     public static void main(String[] args) {

          System.out.println("Ennyi termékünk van: " + Teszt.termekekSzama);
          Teszt.erdekes();
          Teszt elso = new Teszt("asztal", 100);
          Teszt masodik = new Teszt("szék", 110);

          System.out.println(Teszt.termekekSzama);
          System.out.println(elso.termekekSzama);
          masodik.erdekes();
     }

}

class Teszt {

     String termek;
     int ar;
     static int termekekSzama = 0;

     public Teszt(String termek, int ar) {
          this.termek = termek;
          this.ar = ar;
          termekekSzama++;
     }

     public static void erdekes() {
          if (termekekSzama == 0) { // még nem példányosítottam
               System.out.println("Nincs termék");
          } else {
               System.out.println("Van legalább egy termék");
          }
     }

}
