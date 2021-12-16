public class ThreadUsingRunnableInterface implements Runnable{
    public void run(){ 
        System.out.println("The Thread has been created and running.");
    }
    public static void main(String args[]){
        ThreadUsingRunnableInterface t = new ThreadUsingRunnableInterface();
        Thread thread = new Thread(t);
        thread.start();
    }
}
