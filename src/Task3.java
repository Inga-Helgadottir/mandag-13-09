public class Task3 extends Thread{
    boolean isNotOver = true;
    @Override
    public void run() {
        for (int i = 10; i <= 1000000000; i++) {
            if(isNotOver){
                System.out.println(i);
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                return;
            }
        }
    }

    public void setNotOver(boolean notOver) {
        isNotOver = notOver;
    }
}