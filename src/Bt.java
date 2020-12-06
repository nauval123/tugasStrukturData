public class Bt {
    private Node akar;

    public Bt(){
       this.akar=null;
    }

    public boolean kosongKah(){
        return akar==null;
    }

    public void masukinData(int data){
        akar = masukinData(akar ,data);
    }
    private Node masukinData(Node node, int data){
        if(node == null){
            node = new Node(data);
        }
        else {
            if(data <= node.getData()){
                node.setKiri(masukinData(node.getKiri(),data));
            }
            else {
                node.setKanan(masukinData(node.getKanan(),data));
            }
        }
        return node;
    }
    public void hapusData(int data){
        if(kosongKah()){
            System.out.println("Tree Kosong");
        }
        else if(adaKah(data)==false){
            System.out.println("data tidak ditemukan");
        }
        else {
            akar=hapusData(akar,data);
            System.out.println(data + "" + "telah dihapus dari Tree");
        }
    }

    private Node hapusData(Node node,int data){
        Node p,p2,n;
        if(node.getData()== data){
            Node kr,kn;
            kr =node.getKiri();
            kn= node.getKanan();
            if (kr==null && kn==null){
                return null;
            }
            else if(kr==null){
                p=kn;
                return p;
            }
            else if(kn == null){
                p=kr;
                return  p;
            }
            else{
                p2=kn;
                p=kn;
                while (p.getKiri()!=null){
                    p=p.getKiri();
                }
                p.setKiri(kr);
                return p2;
            }
        }
        if(data < node.getData()){
            n=hapusData(node.getKiri(),data);
            node.setKiri(n);
        }
        else {
            n=hapusData(node.getKanan(),data);
            node.setKanan(n);
        }
        return node;
    }



    public boolean adaKah(int data){
        return  adaKah(akar,data);
    }

    private boolean adaKah (Node node,int data){

        if(node.getData()==data){
            return true;
        }
        if(node.getKiri()!=null){
            if(adaKah(node.getKiri(),data)){
                return true;
            }
        }
        if(node.getKanan()!=null){
            if(adaKah(node.getKanan(),data)){
                return true;
            }
        }
        return false;
    }

    public void inOrder(){
        inOrder(akar);
    }

    private void inOrder(Node node){
        if(node !=null){
            inOrder(node.getKiri());
            System.out.println(node.getData()+"");
            inOrder(node.getKanan());
        }
    }

    public void preOrder(){
        preOrder(akar);
    }

    private void preOrder(Node node){
        if(node !=null){
            System.out.println(node.getData()+"");
            preOrder(node.getKiri());
            preOrder(node.getKanan());
        }
    }

    public void postOrder(){
        postOrder(akar);
    }

    private void postOrder(Node node){
        if(node !=null){
            postOrder(node.getKiri());
            postOrder(node.getKanan());
            System.out.println(node.getData()+"");
        }
    }

    public void levelOrder(){
        int h = levelOrder(akar);
        int i;
        for (i=1; i<=h; i++){
            cetakLevel(akar, i);
        }
    }

    private int levelOrder(Node node){
            if (node == null)
                return 0;
            else
            {
                int lh = levelOrder(node.getKiri());
                int rh = levelOrder(node.getKanan());

                if (lh > rh){
                    return(lh+1);
                }
                else{
                    return(rh+1);
                }
            }
    }

    private void cetakLevel (Node node ,int level)
    {
        if (node == null)
            return;
        if (level == 1)
            System.out.println(node.getData() + " ");
        else if (level > 1)
        {
           cetakLevel(node.getKiri(), level-1);
            cetakLevel(node.getKanan(), level-1);
        }
    }

}
