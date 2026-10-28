public class Stack {
  private static int stacks_count = 0;
  final int MAX_CAPACITY = 1024;
  final int MIN_CAPACITY = 1;
  final int DEFAULT_CAPACITY = 32;
  private int[] arr;
  private int capacity;
  private int top = -1;
  private int stack_id = stacks_count++;


  // Constructors:
  public Stack(int capacity) {
    if (capacity < 0) capacity = 0;
    else if (capacity > MAX_CAPACITY) capacity = MAX_CAPACITY;
    this.capacity = capacity;
    arr = new int[this.capacity];
  }

  public Stack() {
    arr = new int[DEFAULT_CAPACITY];
  }

  public boolean push(int x) {
    if (is_full()) return false;
    arr[++top] = x;
    return true;
  }

  public int pop() {
    if (is_empty()) return -1;
    return arr[top--];
  }

  public int peek() {
    if (is_empty()) return -1;
    return arr[top];
  }

  public boolean is_empty() {
    return (top < 0);
  }

  public  boolean is_full() {
    return (top >= capacity - 1);
  }

  public void display() {
    System.out.print("Stack "+stack_id+": ");
    if (top < 0) {
      System.out.println("Empty");
      return;
    }
    for (int i = top; i >= 0; i--) {
      System.out.print(arr[i]+" ");
    }
    System.out.println("");
  }

  public int resize() {
    return 0;
  }

  public int get_size() {
    return top+1;
  }

  // getters:
  public int get_capacity() {
    return capacity;
  }

  public int get_id() {
    return stack_id;
  }

  public static void main(String[] args) {
    Stack S0 = new Stack(4);
    S0.push(1);
    S0.push(2);
    S0.push(3);
    S0.push(4);
    S0.display();

    Stack S1 = new Stack(10);
    S1.push(1);
    S1.push(2);
    S1.push(3);
    S1.push(4);
    S1.push(5);
    S1.push(6);
    S1.display();
    System.out.println("S1 Peek: "+S1.peek());
  }
}

// Boualleg Kaissar :)