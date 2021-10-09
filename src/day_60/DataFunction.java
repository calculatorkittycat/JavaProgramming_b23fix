package day_60;
@FunctionalInterface
public interface DataFunction<T> { //generic type

    T accept(T t);


}
