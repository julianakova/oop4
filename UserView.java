import java.util.List;

public interface UserView<E extends User> {
    void sendOnConsole(List<E> list);
}
