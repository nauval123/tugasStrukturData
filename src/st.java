public class st {
    private int jumlah;
    private noda kepala;

    public st(){
        jumlah=0;
        kepala= null;
    }

    public void push(int x){
        noda temp = new noda(x);
        temp.setNext(kepala);
        kepala = temp;
        jumlah++;
    }

    public int pop(){
        int data=0;
        if(jumlah==0){
            System.out.println("Stack kosong");
        }else {
            data = kepala.getData();
            kepala = kepala.getNext();
            jumlah--;
        }
        return data;
    }

    public void printing(){
        noda sekarang= kepala;
        while(sekarang != null){
            System.out.println(sekarang.getData());
            sekarang=sekarang.getNext();
        }
    }

    public int getJumlah() {
        return jumlah;
    }

    public void balik(st k){
        st sesaat = k;
        noda sess = k.kepala;
        que tem = new que();
        while(k.getJumlah() >=0){
            tem.enque(k.pop());
            jumlah--;
        }
        while (tem.getJumlah()>=0){
            sesaat.push(tem.deque());
            tem.setJumlah(tem.getJumlah()-1);
        }
        sesaat.printing();
    }
}
