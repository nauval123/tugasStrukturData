public class manipulasiNode {
    nope node1,node2,node3,node4,head,current;
    String nama;
    int totalTinggi,total;
    public manipulasiNode(){

        node1 = new nope("01",110,240);
        node2 = new nope ("02",120,450);
        node3 = new nope("03",130,550);
        node4 = new nope ("04",200,360);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);

        head = node1;
        current = node1;

    }

    public void totalTinggi(){
        totalTinggi=current.getTinggiBadan()+current.getNext().getTinggiBadan()+current.getNext().getNext().getTinggiBadan()+current.getNext().getNext().getNext().getTinggiBadan();
        System.out.println(totalTinggi);
    }

    public void totalTinggi2(){
        while(current!=null){
            totalTinggi+=this.current.getTinggiBadan();
//            System.out.println(totalTinggi);
            this.current=this.current.getNext();
        }
        System.out.println(totalTinggi);
    }


    public int totalTinggi3(nope current){
        if(current!=null){
            this.head=current;
            if(head==null){
                return head.getTinggiBadan();
            }
            total = head.getTinggiBadan()+totalTinggi3(head.getNext());
        }
        return total;
    }

    public void cek(){
        if(this.head.getBeratBadan()> current.getNext().getBeratBadan()){//1:2
            if(this.head.getBeratBadan()> current.getNext().getNext().getBeratBadan()){//1:3
                if (this.head.getBeratBadan()>current.getNext().getNext().getNext().getBeratBadan()){//1:4=>1
                    System.out.println("bb:"+this.head.getBeratBadan()+",nama:"+ this.head.getNama());
                }else {//1:4=>4
                    System.out.println("bb:"+current.getNext().getNext().getNext().getBeratBadan()+",nama:"+current.getNext().getNext().getNext().getNama());//print 4
                }
            }else if(current.getNext().getNext().getBeratBadan()>current.getNext().getNext().getNext().getBeratBadan()){//3:4=>3
                System.out.println("bb:"+current.getNext().getNext().getBeratBadan()+",nama:"+current.getNext().getNext().getNama());//print 3
            }else {//3:4=>4
                System.out.println("bb:"+current.getNext().getNext().getNext().getBeratBadan()+",nama:"+current.getNext().getNext().getNext().getNama());//print 4
            }
        }else if(current.getNext().getBeratBadan()>current.getNext().getNext().getBeratBadan()){//2:3=>2
            if(current.getNext().getBeratBadan()>current.getNext().getNext().getNext().getBeratBadan()){//2:4=>2
                System.out.println("bb:"+current.getNext().getBeratBadan()+",nama:"+current.getNext().getNama());//print 2
            }else {//2:4=>4
                System.out.println("bb:"+current.getNext().getNext().getNext().getBeratBadan()+",nama:"+current.getNext().getNext().getNext().getNama());
            }
        }else if(current.getNext().getNext().getBeratBadan()>current.getNext().getNext().getNext().getBeratBadan()){//3:4=>3
            System.out.println("bb:"+current.getNext().getNext().getBeratBadan()+",nama:"+current.getNext().getNext().getNama());//print 3
        }else {//3:4=>4
            System.out.println("bb:"+current.getNext().getNext().getNext().getBeratBadan()+",nama"+current.getNext().getNext().getNext().getNama());//print 4
        }
    }
    public void cek3(nope h, nope c){
        if(c.getNext()!=null){
            this.head=h;
            this.current=c.getNext();
            if(head.getBeratBadan()>current.getBeratBadan()){
//                nama=head.getNama();
                cek3(head,current);
            }else {
                this.head=this.current;
                cek3(head,current);
            }
        }
        nama=head.getNama();
        System.out.println(nama);
    }

    public void cek2(){
        while(this.current.getNext()!=null){//1
            if(head.getBeratBadan()>current.getNext().getBeratBadan()){
                this.current=this.current.getNext();
            }else {
                this.head=this.current.getNext();
                this.current=this.current.getNext();
            }
        }
        System.out.println("nama:"+head.getNama()+",berat badan:"+head.getBeratBadan());
    }

}




