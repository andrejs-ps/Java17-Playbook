package list;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        List<Integer> ints = List.of(20, 30, 40, 40, 50, 50);
        Set<Integer> intSet = new HashSet<>(ints);
        System.out.println(intSet);


        List<Person> personList = new ArrayList<>(List.of(new Person("Jon"), new Person("Jon")));
        Set<Person> personSet = new HashSet<>(personList);
        System.out.println(personSet);

    }

    static class Person {

        String name;

        public Person(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            final Person other = (Person) obj;
            return this.name.equals(other.name);
        }

        @Override
        public int hashCode() {
            int hash = 3;
            hash = 53 * hash + (this.name != null ? this.name.hashCode() : 0);
            hash = 53 * hash;
            return hash;
        }

        @Override
        public String toString() {
            return name;
        }

    }
}
