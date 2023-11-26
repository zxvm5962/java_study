package catch_java.test4;

public class Generic <T>{
    private T element;
    void set(T element){
        this.element = element;
    }
    T get(){
        return element;
    }
}
