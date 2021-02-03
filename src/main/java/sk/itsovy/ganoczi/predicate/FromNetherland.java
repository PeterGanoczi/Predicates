package sk.itsovy.ganoczi.predicate;

import java.util.function.Predicate;

public class FromNetherland<T> implements Predicate<City> {
    @Override
    public boolean test(City city) {
        return city.getCode().equals("NLD");
    }

    @Override
    public Predicate<City> and(Predicate<? super City> other) {
        return null;
    }

    @Override
    public Predicate<City> negate() {
        return null;
    }

    @Override
    public Predicate<City> or(Predicate<? super City> other) {
        return null;
    }
}
