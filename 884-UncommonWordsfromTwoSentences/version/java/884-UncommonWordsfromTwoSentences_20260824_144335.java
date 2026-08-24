// Last updated: 24/08/2026, 14:43:35
1class Solution {
2    public String[] uncommonFromSentences(String s1, String s2) {
3        Map<String, Integer> wordFreq1 = new HashMap<>();
4        Map<String, Integer> wordFreq2 = new HashMap<>();
5        String sen1Words[] = s1.split(" ");
6        String sen2Words[] = s2.split(" ");
7        for(var word : sen1Words){
8            wordFreq1.put(word, wordFreq1.getOrDefault(word, 0)+1);
9        }
10        for(var word : sen2Words){
11            wordFreq2.put(word, wordFreq2.getOrDefault(word, 0)+1);
12        }
13        List<String> uncommons = new ArrayList<>();
14        
15        for(var entry : wordFreq1.entrySet()){
16            String word = entry.getKey();
17            int wordFreq = entry.getValue();
18            if(wordFreq == 1 && !wordFreq2.containsKey(word)){
19                 uncommons.add(word);
20            }
21        }
22       
23        for(var entry : wordFreq2.entrySet()){
24            String word = entry.getKey();
25            int wordFreq = entry.getValue();
26            if(wordFreq == 1 && !wordFreq1.containsKey(word)){
27                 uncommons.add(word);
28            }
29        }
30        return uncommons.stream().toArray(String[]::new);
31    }
32}