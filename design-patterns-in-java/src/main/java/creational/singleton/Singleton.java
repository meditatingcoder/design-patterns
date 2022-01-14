package creational.singleton;

/***
 * This pattern helps in maintaining only one class of an object within the program.
 *
 * Usually helpful in expensive objects like data base connection object.
 *
 * Idea is to create one instance of a class and share the same object across the program
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
        System.out.println("Creating a new singleton");
        this.instance = instance;
    }

    public synchronized Singleton getInstance() {
        if(instance==null){
            synchronized(Singleton.class) {
                if(instance==null)
                    instance=new Singleton();
            }
        }
       return instance;
    }
}
