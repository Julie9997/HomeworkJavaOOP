package homework3;

import homework3.drugs.Component;
import homework3.drugs.impl.CatDrug;
import homework3.drugs.impl.components.Azitron;
import homework3.drugs.impl.components.Pinecilin;
import homework3.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //списки компонентов
        List<Component> componentCat = List.of(new Azitron("Азитрон", "5", 4),
                new Water("Вода", "15", 3),
                new Water("Вода", "15", 3));
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Pinecilin("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat5 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat6 = List.of(new Water("Вода", "20", 12),
                new Pinecilin("Пинецилин", "8", 30),
                new Azitron("Азитрон", "7", 12));

        // лекарства на основе компонентов
        CatDrug drug1 = new CatDrug(componentCat, "Bonsy");
        CatDrug drug2 = new CatDrug(componentCat2, "Apiccena");
        CatDrug drug3 = new CatDrug(componentCat3, "Zoetis");
        CatDrug drug4 = new CatDrug(componentCat4, "Intervet");
        CatDrug drug5 = new CatDrug(componentCat5, "Elanco");
        CatDrug drug6 = new CatDrug(componentCat6, "Beaphar");

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);
        drugs.add(drug5);
        drugs.add(drug6);

        Collections.sort(drugs);
        System.out.println("Sorted drugs:");
        for (CatDrug d: drugs) {
            System.out.println(d);
        }

        System.out.println("Components of componentCat: ");
        System.out.println(componentCat);

        // множество компонентов componentCat
        Set<Component> result = new HashSet<>(componentCat);
        System.out.println("Unique set components of componentCat: ");
        System.out.println(result);
    }
}
