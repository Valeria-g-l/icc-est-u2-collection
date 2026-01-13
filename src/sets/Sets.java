package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import models.Person;

public class Sets {

    public Set<String> construirHashSet() {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("A"); 
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("F");
        return hashSet;
    }

    public Set<String> construirLinkedHashSet() {
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add("A"); 
        linkedHashSet.add("D");
        return linkedHashSet;
    }

    public Set<String> construirTreeSet() {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("D");
        treeSet.add("A");
        treeSet.add("E");
        treeSet.add("I");
        treeSet.add("O");
        treeSet.add("U");
        treeSet.add("a");
        return treeSet;
    }

    public Set<String> construirTreeSetConComparador() {
        Set<String> treeSetComp = new TreeSet<>((pal1, pal2) -> pal1.compareToIgnoreCase(pal2));
        treeSetComp.add("D");
        treeSetComp.add("A");
        treeSetComp.add("E");
        treeSetComp.add("I");
        treeSetComp.add("O");
        treeSetComp.add("U");
        treeSetComp.add("a");
        return treeSetComp;
        
    }  
    
    public Set<Person> personsTreeSet(){
       /*  Set<Person> treePersons = new TreeSet<>((p1, p2) -> {
                                //int com = Integer.compare(p1.getEdad(), p2.getEdad());
                               // int com = p1.getNombre().compareTo(p2.getNombre());
                               // return com;
                                int compN = p2.getNombre().compareTo(p1.getNombre());
                                if(compN != 0 )
                                     return compN;

                                int compE = Integer.compare(p2.getEdad(), p1.getEdad());
                                return compE;
        });*/

         Set<Person> treePersons = new TreeSet<>();
        treePersons.add(new Person("Carlos", 23 ));
        treePersons.add(new Person("Ana", 30 ));
        treePersons.add(new Person("Luis", 18 ));
         treePersons.add(new Person("Ana", 20 ));
        treePersons.add(new Person("Andres", 23 ));
        treePersons.add(new Person("Luis", 18 ));
        return treePersons;
    }
}
