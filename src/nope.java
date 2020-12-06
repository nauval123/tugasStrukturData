public class nope {
    private int tinggiBadan, beratBadan;
    private String nama;
    private nope next;

    public nope(String nama, int tinggiBadan, int beratBadan) {
        this.nama = nama;
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public nope(int x) {
    }

    public int getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(int tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public int getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(int beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public nope getNext() {
        return next;
    }

    public void setNext(nope next) {
        this.next = next;
    }
}


