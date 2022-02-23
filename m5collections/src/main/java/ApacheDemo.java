import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collection;
import java.util.List;

public class ApacheDemo {

    public static void main(String[] args) {

        Collection<String> intersection = CollectionUtils.intersection(
                                    List.of("a", "b", "c"),
                                    List.of("b", "c", "d", "e"));

        System.out.println(intersection); // [b, c]

        Collection<String> result =
                    CollectionUtils.collate(
                                    List.of("a", "b", "c"),
                                    List.of("b", "c", "d", "e"));
        System.out.println(result); // [a, b, b, c, c, d, e]


        List<String> reversed = Lists.reverse(List.of("e", "z", "f"));
        System.out.println(reversed); // [f, z, e]
    }
}
