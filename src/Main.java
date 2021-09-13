public class Main {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        Task2 t2 = new Task2();
        Task3 t3 = new Task3();
        t1.start();
        t2.start();
        try {
            t2.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t3.start();
        t3.isNotOver = false;


    }
}
