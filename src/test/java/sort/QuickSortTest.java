package sort;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class QuickSortTest {
    // 중복이 없는 배열
    @Test
    public void testQuickSort() {

        // {4, 5, 10, 1, 2, 9, 7};
        // pivot = 1
        // left = 4, right = 7 -> 9 -> 2 -> 1 : left <-> pivot
        // {1, 5, 10, 4, 2, 9, 7};
        // pivot = 4
        // left = 5, right = 7 -> 9 -> 2 : left <-> right
        // {1, 2, 10, 4, 5, 9, 7};
        // pivot = 4
        // left = 10, right = 4 : left <-> pivot
        // {1, 2, 4, 10, 5, 9, 7};
        // pivot = 5
        // left = 10, right = 7 -> 9 -> 5: left <-> pivot
        // {1, 2, 4, 5, 10, 9, 7};
        // pivot = 9
        // left = 10, right = 7 : left <-> right
        // left = 9, right = 9
        // {1, 2, 4, 5, 7, 9, 10};










        // given
        int[] numbers = {4, 5, 10, 1, 2, 9, 7};

        // when
        QuickSort quickSort = new QuickSort();
        int[] result = quickSort.sort(numbers);

        // then
        int[] expectedNumbers = {1, 2, 4, 5, 7, 9, 10};
        assertArrayEquals(expectedNumbers, result);
    }

    // 중북이 있는 배열
}
