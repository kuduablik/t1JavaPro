import java.util.*;
import java.util.stream.Collectors;

//todo Гришин Владимир

public class Main {
    public static void main(String[] args) {

        /*
         * 1. Найдите в списке целых чисел 3-е наибольшее число (пример: 5 2 <b>10</b> 9 4 3 <b>10</b> 1 <b>13</b> => 10)
         */

        /*
        Integer[] elements = {5, 2, 10, 9, 4, 3, 10, 1, 13, 10};
        List<Integer> list = new ArrayList<>(Arrays.asList(elements));
        //System.out.println(list);
        //System.out.println(list.stream().distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        Integer uniqueNumber = list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("(><)"));
        //.orElse(null);

        System.out.println(uniqueNumber);
        */

        /*
         * 2. Найдите в списке целых чисел 3-е наибольшее «уникальное» число (пример: 5 2 <b>10</b> <b>9</b> 4 3 10 1 <b>13</b> => 9, в отличие от прошлой задачи здесь разные 10 считает за одно число)
         */

        /*
        Integer[] elements = {5, 2, 9, 4, 3, 10, 1, 13, 10, 11};
        List<Integer> list = new ArrayList<>(Arrays.asList(elements));
        //System.out.println(list);

        //System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

        Integer uniqueNumber = list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("(><)"));

        System.out.println(uniqueNumber);
        */

        /*
         * 3. Имеется список объектов типа Сотрудник (имя, возраст, должность), необходимо получить список имен 3 самых старших сотрудников с должностью «Инженер», в порядке убывания возраста
         */

        /*
        List<Employees> employeesList = Arrays.asList(
                new Employees("Максим", 20, "Инженер"),
                new Employees("Иван", 27, "Инженер"),
                new Employees("Влад", 32, "Архитектор"),
                new Employees("Вова", 25, "Архитектор"),
                new Employees("Никита", 23, "Аналитик"),
                new Employees("Санек", 35, "Инженер"),
                new Employees("Паша", 39, "Инженер"),
                new Employees("Вася", 30, "Аналитик")
        );

        List<String> seniorEngineer = getSeniorEngineers(employeesList);
        System.out.println(seniorEngineer);
    }

    public static List<String> getSeniorEngineers(List<Employees> employees) {
        return employees.stream()
                .filter(employee -> "Инженер".equals(employee.getJobTitle()))
                .sorted(Comparator.comparing(Employees::getAge).reversed())
                .limit(3)
                .map(Employees::getName)
                .collect(Collectors.toList());
    }
    */


        /*
         * 4. Имеется список объектов типа Сотрудник (имя, возраст, должность), посчитайте средний возраст сотрудников с должностью «Инженер»
         */

        /*
        List<Employees> employeesList = Arrays.asList(
                new Employees("Максим", 20, "Инженер"),
                new Employees("Иван", 27, "Инженер"),
                new Employees("Влад", 32, "Архитектор"),
                new Employees("Вова", 25, "Архитектор"),
                new Employees("Никита", 23, "Аналитик"),
                new Employees("Санек", 35, "Инженер"),
                new Employees("Паша", 39, "Инженер"),
                new Employees("Вася", 30, "Аналитик")
        );

        // в 1 строчку
        *//*OptionalDouble middleAge = employeesList.stream()
                .filter(employee -> "Инженер".equals(employee.getJobTitle()))
                .mapToInt(Employees::getAge).average();*//*

        OptionalDouble middleAge = getMiddleAge(employeesList);
        System.out.println("Средний возраст сотрудников с должностью «Инженер»: " + middleAge);
    }

    public static OptionalDouble getMiddleAge(List<Employees> employees) {
        return employees.stream()
                .filter(employee -> "Инженер".equals(employee.getJobTitle()))
                .mapToInt(Employees::getAge).average();
        */


        /*
         * 5. Найдите в списке слов самое длинное
         */

        /*
        List<String> wordList = Arrays.asList("бананы", "апельсины", "яблоко", "мандарины", "грейпфруты", "киви");

        String max = wordList.stream().max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Самое длинное слово: " + max);
        */



        /*
         * 6. Имеется строка с набором слов в нижнем регистре, разделенных пробелом. Постройте хеш-мапы, в которой будут храниться пары: слово - сколько раз оно встречается во входной строке
         */

        /*
        String patter = "на дворе трава на траве дрова не руби дрова на траве двора";

        Map<String, Integer> wordCount = Arrays.stream(patter.split(" "))
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));

        System.out.println(wordCount);
        */

        /*
         * 7. Отпечатайте в консоль строки из списка в порядке увеличения длины слова, если слова имеют одинаковую длину, то должен быть сохранен алфавитный порядок
         */

        /*
        List<String> words = Arrays.asList("яблоко", "груша", "дыня", "апельсин", "банан", "киви", "клубника");

        words.stream().sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);
        */


        /*
         * 8. Имеется массив строк, в каждой из которых лежит набор из 5 слов, разделенных пробелом, найдите среди всех слов самое длинное, если таких слов несколько, получите любое из них
         */

        /*String[] sentences = {"один два три четыре пять",
                "яблоко груша апельсин банан киви",
                "имеется массив строк где лежит",
                "найдите среди всехсловсамое длинное если"
                };

        String longestWord = Arrays.stream(sentences)
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .max(Comparator.comparing(String::length))
                .orElse(null);
        System.out.println(longestWord);
        */
    }
}