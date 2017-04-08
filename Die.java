import edu.princeton.cs.algs4.StdOut;

// A data type representing a six-sided die.
public class Die implements Comparable<Die> {
    // face value
    private int value; 
    
    public Die() { //constructor
        this.value = value;
    }
    
    public void roll() {    //void means there is no return type
        value = (int) (Math.random() * 6) +1;
    }
    // Face value of the die.
    public int value() {
        return (value);
    }

    // Does the die have the same face value as that?
    public boolean equals(Die that) {
        return (this.value == that.value);
    }

    // A negative integer, zero, or positive integer depending on whether this
    // die's value is less than, equal to, or greater than the that die's value.
    public int compareTo(Die that) {
        return (this.value - that.value);
    }

    // A string representation of the die giving the current face value.
    public String toString() {
        if (value == 1) {
            String first =  " \n     *      \n ";
            return first;
        }
        
        else if (value == 2) {
            String second =  " *        \n         \n        * ";
            return second;
        }
        
        else if (value == 3) {    
            String third = " *        \n     *    \n       * ";
            return third;
        }
        
        else if (value == 4) {
            String fourth = " *      *  \n     *    \n  *     * ";
            return fourth;
        }
        
        else if (value == 5) {
            String fifth =  "*   *\n  *  \n*   *";
            return fifth;
        }
        
        else {
            String sixth = "* * *\n     \n* * *";
            return sixth;
        }
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        Die a = new Die();
        a.roll();
        while (a.value() != x) {
            a.roll();
        }
        Die b = new Die();        
        b.roll();
        while (b.value() != y) {
            b.roll();
        }
        Die c = new Die();        
        c.roll();
        while (c.value() != z) {
            c.roll();
        }
        StdOut.println(a);
        StdOut.println(a.equals(b));
        StdOut.println(b.equals(c));        
        StdOut.println(a.compareTo(b));
        StdOut.println(b.compareTo(c));        
    }
}
