package workbench.streams;

import workbench.shared.Data;

import java.util.Collection;

public class Program {
    public static void main(String[] args) {
        Collection<String> cheap = Data.getProducts().stream()
            .filter(p -> p.price() < 2.50)
            .map(p -> String.format("%s costs just %.2fEUR", p.name(), p.price()))
            .toList();

        for (String t : cheap) System.out.println(t);
    }
}
