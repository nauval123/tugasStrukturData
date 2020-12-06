public class Main2 {
    public static void main(String[] args) {
        Bt tree1 = new Bt();
        tree1.masukinData(33);
        tree1.masukinData(83);
        tree1.masukinData(10);
        tree1.masukinData(1);
        tree1.masukinData(13);
        tree1.masukinData(20);
        tree1.masukinData(42);
        tree1.masukinData(51);
        tree1.masukinData(45);
        tree1.masukinData(27);
        tree1.masukinData(58);
        tree1.masukinData(74);
        tree1.masukinData(61);
//        tree1.inOrder();
//        tree1.postOrder();
//        tree1.hapusData(10);
//        tree1.preOrder();
//        tree1.levelOrder();
        tree1.hapusData(1);
        tree1.hapusData(27);
        tree1.hapusData(74);
        tree1.hapusData(10);
        System.out.println("");
        tree1.preOrder();



    }
}
