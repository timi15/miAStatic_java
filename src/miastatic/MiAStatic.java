package miastatic;

public class MiAStatic {

     public static void main(String[] args) {

          System.out.println("Ennyi term�k�nk van: " + Teszt.termekekSzama);
          Teszt.erdekes();
          Teszt elso = new Teszt("asztal", 100);
          Teszt masodik = new Teszt("sz�k", 110);

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
          if (termekekSzama == 0) { // m�g nem p�ld�nyos�tottam
               System.out.println("Nincs term�k");
          } else {
               System.out.println("Van legal�bb egy term�k");
          }
     }

}
