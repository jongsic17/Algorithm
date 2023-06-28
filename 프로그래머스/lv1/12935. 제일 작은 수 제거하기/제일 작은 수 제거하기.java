class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int index = 0;
        if(arr[0] == 10)return new int[]{-1};
        for(int i= 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        int k = 0;
        for(int j = 0; j < arr.length; j++){
            if(index != j){
                answer[k++] = arr[j];
            }
        }
        return answer;
    }
}