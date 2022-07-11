# Bankmachine
import java.util.ArrayList;
import java.util.List;

public class Queue {
    // create class
    // choose a store - array list
    // implement methods

    //
    private List<String> someStuff;

    public Queue() {
        this.someStuff = new ArrayList<>();
    }

    public String peek() {
        if (this.someStuff.isEmpty()) {
            return null;
        }
        return this.someStuff.get(someStuff.size() - 1);
    }

    public String poll() {
        if (this.someStuff.isEmpty()) {
            return null;
        }
        return this.someStuff.remove(someStuff.size() - 1);
    }

    public String remove() {
        return this.someStuff.remove(someStuff.size() - 1);
    }

    public String element() {
        return this.someStuff.get(this.someStuff.size() - 1);
    }

    /*public boolean add(String s) {
        return this.someStuff.add(s);
    }
     public boolean offer(String s) {
        this.someStuff.add(s);
    }*/
}
