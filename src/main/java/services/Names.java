package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Names {
    private List<String> names;

    public Names(String... names) {
        this.names = new ArrayList<>();
        Collections.addAll(this.names, names);
    }

    public List<String> getNames() {
        this.names.sort(Comparator.reverseOrder());
        return this.names;
    }
}
