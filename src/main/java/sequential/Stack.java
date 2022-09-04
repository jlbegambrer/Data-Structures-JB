package sequential;

public abstract class Stack<T> implements Iterable<T> {
    public abstract boolean empty();
    public abstract T peek();
    public abstract T pop();
    public abstract void push(T e);
    public abstract int search(T e);

    /**
     *
     * @return String representation of the list
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T e: this) {
            sb.append(e);
            sb.append("\n\u2193\n");
        }
        sb.replace(sb.length() - 2, sb.length(), "");
        return sb.toString();
    }
}
