package pro.kwongsui.offer;

public class Solution11 {

    public int minArray(int[] numbers) {
        int min = numbers[0];
        int lower = 0, upper = numbers.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if(numbers[lower] == numbers[mid]) {
                if(numbers[lower] < min) {
                    min = numbers[lower];
                }
                lower++;
                continue;
            }
            if(numbers[lower] < numbers[mid]) {
                if(numbers[lower] < min) {
                    min = numbers[lower];
                }
                lower = mid + 1;
            } else {
                if(numbers[mid] < min) {
                    min = numbers[mid];
                }
                upper = mid - 1;
            }
        }
        return min;
    }
}
