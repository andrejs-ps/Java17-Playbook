package map;

import java.util.Map;

public class MapCheckEquality {

    public static void main(String[] args) {

        Map<Integer, String> mapOne = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> mapTwo = Map.of(1, "Java", 2, "C#", 3, "JavaScript");
        Map<Integer, String> mapThree = Map.of(1, "Java", 2, "C#", 4, "JavaScript");

        System.out.println(mapOne.equals(mapTwo));
        System.out.println(mapOne.equals(mapThree));

        Map<Integer, LanguageRecord> mapLangRecordOne = Map.of(1, new LanguageRecord("Java"));
        Map<Integer, LanguageRecord> mapLangRecordTwo = Map.of(1, new LanguageRecord("Java"));
        System.out.println("With records: " + mapLangRecordOne.equals(mapLangRecordTwo));


        Map<Integer, Language> mapLangOne = Map.of(1, new Language("Java"));
        Map<Integer, Language> mapLangTwo = Map.of(1, new Language("Java"));

        System.out.println("Class without equals: " + mapLangOne.equals(mapLangTwo));

        System.out.println("By values only: " + areMapsEqualByValue(mapLangOne, mapLangTwo));

    }


    private static boolean areMapsEqualByValue(Map<Integer, Language> first, Map<Integer, Language> second) {
        if (first.size() != second.size()) {
            return false;
        }

        return first.entrySet().stream()
                .allMatch(e -> e.getValue().getName().equals(second.get(e.getKey()).getName()));

    }


    static class Language {
        String name;

        public Language(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Language language = (Language) o;

            if (!name.equals(language.name)) return false;

            return true;
        }

        @Override
        public int hashCode() {
            return name.hashCode();
        }
    }

    record LanguageRecord(String name) {
    }
}
