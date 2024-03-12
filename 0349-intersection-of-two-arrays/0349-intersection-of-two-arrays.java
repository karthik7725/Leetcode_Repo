
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int element : nums1){
                set1.add(element);
            }

            for(int element : nums2){
                set2.add(element);
            }
        for (int element : set1){
            if(set2.contains(element)){
                list.add(element);
            }
        }
        int arr[] = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        return arr;
      
    }
}