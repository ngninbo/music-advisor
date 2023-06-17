// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    static <T> T getFirst(T[] arr) {
        return Arrays.stream(arr).findFirst().orElse(null);
    }
}