package equalator;

/**
 * Created by Evegeny on 23/07/2017.
 */
@FunctionalInterface
public interface Action<T> {
    void call(T t);
}
