class Solution {
    public long solution(String numbers) {
        String[] arr = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] arr2 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for (int i=0; i<arr.length; i++) {
            numbers = numbers.replaceAll(arr[i], arr2[i]);
        }
        
        return Long.parseLong(numbers);
    }
}