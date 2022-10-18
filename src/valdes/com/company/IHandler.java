package valdes.com.company;

public interface IHandler<T> {
    public void onAdding(T value);

    public void onRemoving(T value);

    public void onGetting(T value);

    public void onReplacing(T value1, T value2);
}
