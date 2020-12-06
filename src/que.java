public class que {
    private int jumlah;
    private noda depan,tengah;

    public que(){
        jumlah=0;
        depan=tengah=null;
    }

    public void enque(int x){
        noda sementara = new noda(x);
        if (jumlah==0){
            depan=sementara;
        }else{
            tengah.setNext(sementara);
        }
        tengah=sementara;
        jumlah++;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int deque() {
        int data = 0;
        if(jumlah==0){
            System.out.println("queue kosong");
        }
        else {
            data=depan.getData();
            depan=depan.getNext();
            jumlah--;

            if(jumlah==0){
                tengah=null;
            }
        }
        return data;
    }

    public void printing(){
        noda sekarang= depan;
        while(sekarang!=null){
            System.out.println(sekarang.getData());
            sekarang=sekarang.getNext();
        }
    }
}
