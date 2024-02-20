import java.util.NoSuchElementException;

public class MyStack {
    private int size;
    private int capacity;
    private int[] data;

    public MyStack() {
        this.size = 0;
        this.capacity = 10;
        this.data = new int[this.capacity];
    }

    public void push(int item) {
        // Grow data array if required
        if (this.size == this.capacity) {
            this.capacity *= 2;
            int[] newData = new int[this.capacity];
            System.arraycopy(this.data, 0, newData, 0, this.size);
            this.data = newData;
        }
        this.data[this.size] = item;
        this.size++;
    }

    public int pop() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        this.size--;
        return this.data[this.size];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void displayContents() {
        System.out.print("MyStack([");
        for (int i=0; i<this.size; i++) {
            System.out.print(this.data[i]);
            if (i < this.size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("])");
    }
}