package Pekan2_2511531013;

public class Musik_2511531013 {
    String Judul_1013;
    String Penyanyi_1013;
    int Durasi_1013;

    // Constructor
    Musik_2511531013(String Judul_1013, String Penyanyi_1013, int Durasi_1013) {
        this.Judul_1013 = Judul_1013;
        this.Penyanyi_1013 = Penyanyi_1013;
        this.Durasi_1013 = Durasi_1013;
    }
    //Getter
    public String getJudul () {return Judul_1013;}
    public String getPenyanyi () {return Penyanyi_1013;}
    public int getDurasi () {return Durasi_1013;}

    //Setter
    public void setJudul (String judul_1013) {
    this.Judul_1013 = judul_1013;
    } 
    
    public void setPenyanyi (String penyanyi_1013) {
    	this.Penyanyi_1013 = penyanyi_1013;
    }
    
    public void setDurasi (int durasi_1013) {
    	this.Durasi_1013 = durasi_1013;
    }

    
    @Override
    public String toString() {
        return "Judul: " + Judul_1013 + 
               ", Penyanyi: " + Penyanyi_1013 + 
               ", Durasi: " + Durasi_1013;
    }
}