// Last updated: 09/09/2026, 13:57:15
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3    List<List<Integer>> list = new ArrayList<>();
4    Arrays.sort(nums);
5    backtrack(list, new ArrayList<>(), nums, 0);
6    return list;
7}
8
9    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
10        list.add(new ArrayList<>(tempList));
11        for(int i = start; i < nums.length; i++){
12            tempList.add(nums[i]);
13            backtrack(list, tempList, nums, i + 1);
14            tempList.remove(tempList.size() - 1);
15        }
16    }
17}