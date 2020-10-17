package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/repeated-dna-sequences/
public class Task_187 {

    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) {
            return new ArrayList<>();
        }

        Set<String> set = new HashSet<>();
        Set<String> result = new HashSet<>();

        String x = s.substring(0, 10);
        set.add(x);

        StringBuilder sb = new StringBuilder(x);

        for (int i = 10; i < s.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(s.charAt(i));

            x = sb.toString();

            if (set.contains(x)) {
                result.add(x);
            } else {
                set.add(x);
            }
        }

        return new ArrayList<>(result);
    }
}

/*
*
* Для каждой подстроки длины 10 проверяем есть ли она в set
* Если есть - перекладываем подстроку в новый set result, для исключения дубликатов
* Иначе - кладем в set
*
* Bit manipulation?
*
* */