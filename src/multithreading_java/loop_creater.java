package multithreading_java;

public class loop_creater extends Thread {
    loop_creater(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + i);
            System.out.print("done with loops");
            try {
                currentThread().sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("interrupt aagyi");
            }
        }
    }
}
