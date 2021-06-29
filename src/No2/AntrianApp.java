package No2;
public class AntrianApp {
    public static void main(String args []){
        Antrian antrian = new Antrian (10);
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(8);
        antrian.display();
        System.out.println(" ");
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        System.out.println("nama saya adalah Ryan Kevin Nurhakim");
        antrian.display();
        System.out.println(" ");
        antrian.enqueue(7);
        antrian.display();
        antrian.enqueue(6);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
    }
}
