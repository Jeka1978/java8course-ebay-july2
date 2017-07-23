package equalator;

/**
 * Created by Evegeny on 23/07/2017.
 */
@FunctionalInterface
public interface Equalator<T> {

    boolean equals(T t1, T t2);


}
