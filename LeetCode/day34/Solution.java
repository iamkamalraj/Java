package day34;

//49. Group Anagrams

//Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
// 
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//Example 2:
//
//Input: strs = [""]
//Output: [[""]]
//Example 3:
//
//Input: strs = ["a"]
//Output: [["a"]]
// 
//
//Constraints:
//
//1 <= strs.length <= 104
//0 <= strs[i].length <= 100
//strs[i] consists of lowercase English letters.



//class Solution {
//	  public List<List<String>> groupAnagrams(String[] strs) {
//
//	        HashMap<String,List<String>> map=new HashMap<>();
//
//	        List<List<String>> result = new ArrayList<>();
//
//
//	        for (String word: strs
//	        ) {
//	            char[] charArray = word.toCharArray();
//
//
//	            Arrays.sort(charArray);
//
//	            String sortedWord = String.valueOf(charArray);
//
//	            if (!map.containsKey(sortedWord)) {
//	                map.put(sortedWord, new ArrayList<>());
//	            }
//
//
//	            map.get(sortedWord).add(word);
//
//
//	        }
//	        result.addAll(map.values());
//
//	        return result;
//	    }
//	}

//Intuition
//This problem is about grouping words that are anagrams of each other. An anagram is a word formed by rearranging the letters of another word.
//
//Approach
//We use a HashMap to efficiently group anagrams. The key is the sorted version of a word, and the value is a list of anagrams.
//
//We initialize an empty list called result to store the grouped anagrams.
//First, we check if the input strs is empty or null. If it is, we return an empty result.
//If strs contains only one word, we wrap it in a list and return it because there are no other words to group.
//We then go through each word in the strs array.
//We convert each word into a character array (charArray).
//We sort the character array, creating the sorted version of the word (sortedWord).
//If map does not contain sortedWord as a key, we initialize an empty list for that key.
//We add the word to the list corresponding to sortedWord.
//After processing all words, we have grouped the anagrams inside the map.
//We extract the lists of anagrams from the map values and add them to the result list.
//Finally, we return the grouped anagrams as the result.
//Complexity
//Time complexity: O(N * K * log(K))
//
//N represents the number of words in the strs array.
//K represents the maximum length of a word.
//The algorithm iterates through each word (N operations), sorts each word (K * log(K) time complexity), and performs constant-time operations. The dominant factor is the sorting step, resulting in a time complexity of O(N * K * log(K)).
//Space complexity: O(N * K)
//
//The algorithm uses a HashMap to store sorted words as keys and lists of anagrams as values. In the worst case, assuming each word is unique and has a length of K, the space complexity is O(N * K).
