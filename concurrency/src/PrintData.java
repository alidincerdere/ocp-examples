public class PrintData implements Runnable {
    @Override
    public void run() {

        for (int i =0; i<3; i++) {
            System.out.println("Printing record: " + i);
        }
    }

    public static void main(String[] args) {

        //create new thread and pass runnable as parameter
        //be careful with the start method
        (new Thread(new PrintData())).start();
    }


}
