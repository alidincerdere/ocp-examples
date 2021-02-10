public class ReadInventoryThread extends Thread {
    //extending thread is a less common practice and overriding run method
    public void run() {
        System.out.println("Printing zoo inventory");
    }

    public static void main (String[] args) {

        //create and start thread
        (new ReadInventoryThread()).start();
    }
}
