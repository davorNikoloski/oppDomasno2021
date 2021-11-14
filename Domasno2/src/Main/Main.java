package Main;

class Covek {
    private String ime;
    private String prezime;
   
    public String getIme() {return ime;}
    public void setIme(String ime) {this.ime = ime;}
    public String getPrezime() {return prezime;}
    public void setPrezime(String prezime) {this.prezime = prezime;}

    public String toString() {
        return ime;
    }
}

class Student extends Covek {
	
	private int n = 0;
    private Ocenka[] oc = new Ocenka[5];
    private String index;
    
    public String getIndex() {return index;}
    public void setIndex(String index) {
    	this.index = index;
    }
    public void setOcenka(int ocenka, String predmet, String datum) {
        Ocenka newOcenka = new Ocenka();
        newOcenka.setOcenka(ocenka, predmet, datum);
        this.oc[n] = newOcenka;
        n ++ ;
    }

    public float getProsek() {
        float zbir = 0;
        for(int i=0; i<n; i++) {
            zbir += oc[i].getOcenka();
        }
        float rez = zbir / n;
        return rez;
    }
}

class Ocenka {
    private int ocenka;
    private String predmet;
    private String datum;

    public int getOcenka() {return ocenka;}
    public void setOcenka(int ocenka, String predmet, String datum) {
        this.ocenka = ocenka;
        this.predmet = predmet;
        this.datum = datum;
    }

    public String toString() {
        return Integer.toString(ocenka);
    }
}



public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        st.setIme("Andrej");
        st.setPrezime("Trpcev");
        st.setIme("INKI533");
        st.setOcenka(8, "Digitalna logika", "10.06.2021");
        st.setOcenka(5, "Matematika", "10.06.2021");
        st.setOcenka(10, "Programiranje", "10.06.2021");
        st.setOcenka(9, "Web tehnologii", "10.06.2021");

        System.out.printf("%.2f",st.getProsek());
    }
}