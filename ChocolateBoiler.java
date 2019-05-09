public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain(){
        if(isEmpty() && isBoiled()){
            //drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil(){
        if(!isEmpty() && isBoiled()){
            //bring the contents to a boil
            boiled = true;
        }
    }

    public static ChocolateBoiler getInstance(){
        if (instance==null){
            instance=new ChocolateBoiler();
            System.out.print("Primera Instancia creada");
        }
        else{
            System.out.print("Instancia ya existe");
        }
        return instance;
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}

class MyThread implements Runnable {
    Thread t;
    MyThread (String thread){
        name = threadname;
        t = new Thread(this, "thread");
        t.start();
    }
}

public void run(){
    ChocolateBoiler.getInstance();
}
public class Multithread{
    public static void main(){
        for (int i=0; i<10; i++){
            new MyThread();
        }
    }
}

