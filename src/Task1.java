public class Task1 extends Thread{
    long sum;
    @Override
    public void run() {
        for (int i = 0; i <= 1000000000; i++) {
            sum += i;
        }
        System.out.println("The sum of task1 is : " + sum);
    }
}
