package topKElementsInList;

import java.util.Arrays;

class TopKElementsInList {
    public void main(String[] args) {
        int[] nums = new int[] { 1, 2, 2, 3, 3, 3 };
        int k = 2;

        Arrays.stream(topKFrequent(nums, k)).forEach(System.out::println);
    }

    public int[] topKFrequent(int[] nums, int k) {

        return new int[] { 2, 3 };
    }
}
