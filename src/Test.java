
import javafx.util.Pair;

import java.util.*;

public class Test {
    public static HashMap<Character, ArrayList> lookup;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    static HashMap<Integer, List<Integer>> numPaths= formNumPaths();
    static String dfsTraversalOrder ="preorder";
    public static void main(String ar[]) {



//////////// Word Dict
//        String wordDict[] = {"cats", "dog", "sand", "and", "cat","og"};
//        String wordDict[] = {"dog", "and", "cats"};
//        String wordDict[] = {"apple", "pen"};
////////////

//////////// Max Sub array
//        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArrayDivideNConquer(arr, 0, arr.length - 1));
//        System.out.println(maxSubArray(arr));
////////////

//////////// Max Prod Sub array
//        int arr[] = new int[]{-2,1,-1,-3,-2};
//        int arr[] = new int[]{-2,0,-1,-3,-2};
//        int arr[] = new int[]{2,3,-2,4};
//        int arr[] = new int[]{-2,0,-1};
//        int arr[] = new int[]{2,-5,-2,-4,3};
//        int arr[] = new int[]{-2,3,1,3};
//        int arr[] = new int[]{-2,0,-1};
//        int arr[] = new int[]{0,-2,0};
//        int arr[] = new int[]{-1,3,2,0};
//        System.out.println(maxProdSubArray(arr));
//        System.out.println(maxProdSubArrayMySol(arr));
////////////

//////////// 3 Sum
//        System.out.println(threeSumm(arr));
////////////

///////////// Knapsack
//        int val[] = new int[]{60, 100, 120};
//        int wt[] = new int[]{10, 20, 30};
//        int  W = 50;
//        int n = val.length;
//        System.out.println(knapSack(W, wt, val, n));
////////////

//////////// Similar questions Climbing Stairs, Decode ways, Unique Paths, Fibonacci Number
//        System.out.println(climb_Stairs(0,5));

//        String s = "2302";
//        System.out.println(decodeWaysItr(s));
//        System.out.println(decodeWaysRecur(s));

            // Unique Paths I, II(has obstacles)
//        System.out.println(uniquePaths(3,2));
////////////

//////////// Coin change
//        System.out.println(coinChangeDP(new int[]{1,2},9));
//        System.out.println(coinChangeGreedy(new int[]{9,6,5,1},11));
////////////

//////////// Wordbreak
//        lookup=getLookup(wordDict);
//        System.out.println(wordBreak("catsandog",wordDict));

//        Set<String> stringSet=new HashSet<String>();
//        stringSet.add("cat");
//        stringSet.add("and");
//        stringSet.add("dog");
//        stringSet.add("cats");
//        System.out.println(wordBreakDP("catsanddog",stringSet));
////////////

//////////// CombinationSum
//        System.out.println(combinationSum(10,new int[]{1}));
////////////

//////////// House robber I & II
//        System.out.println(houseRobber(new int[]{2,1,1,3}));


//        circular rob
//        int[] nums=new int[]{2,1,1,3};
//        System.out.println(Math.max(rob(Arrays.copyOfRange(nums, 0,nums.length-1)),
//                                    rob(Arrays.copyOfRange(nums, 1,nums.length))));
////////////

//////////// Can Jump
//        System.out.println(canJump(new int[]{2,3,1,1,4},0));
//        System.out.println(minCanJump(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9},0,new int[]{0,0,0,0,0,0,0,0,0,0,0}));
//        System.out.println(minCanJumpConstantSpace(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9},0));
//        System.out.println(canJumpItr(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
//        System.out.println(canJumpItr(new int[]{1, 3, 0, 1,2,3}));
////////////

//////////// Telephone knight

//        System.out.println(telephoneKnight(1,3));
//        System.out.println(telephoneKnightDP(1,2));
//        System.out.println(knightDialerDP(3));
////////////

//////////// Longest Palindrome
//        Find substrings of those with >= 2 occurences.

//         Expand around the center
//        System.out.println(longestPalindromeSubstring("ababa"));
//        System.out.println(longestPalindromeSubstring("aaa"));
//        System.out.println(longestPalindromeSubstring("abc"));
////////////

//////////// Length Of Longest Non-repeating Substring
//        T = O(n) optimised sliding window with hashmap
//        System.out.println(lengthOfLongestNonRepeatingSubstring("abca"));
////////////

//////////// Letter combinations
//        System.out.println(letterCombinations("23").size());
//        System.out.println(letterCombinations("23"));
////////////

//////////// ATOI
//        System.out.println(myAtoi("2147483648"));
////////////

//////////// Median of Sorted Arrays
//        System.out.println(findMedianSortedArrays(new int[]{1,2,4},new int[]{2,5}));
////////////

//////////// merge K Lists
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
//        ListNode l5=new ListNode(5);
//        ListNode l6=new ListNode(6);
//        ListNode l7=new ListNode(7);
//        ListNode l8=new ListNode(8);
//        ListNode l9=new ListNode(9);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=null;
//        l4.next=l5;
//        l5.next=l6;
//        l6.next=null;
//        l7.next=l8;
//        l8.next=l9;
//        l9.next=null;
//        ListNode[] listNodes=new ListNode[3];
//        listNodes[0]=l1;
//        listNodes[1]=l4;
//        listNodes[2]=l7;
//        ListNode head=mergeKLists(listNodes);
//        while(head!=null)
//        {
//            System.out.print(head.val+" ");
//            head=head.next;
//        }
////////////

//////////// Reorder list (inorder to traverse a list backwards, reverse a list and traverse it forward)
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
//        ListNode l5=new ListNode(5);
//        ListNode l6=new ListNode(6);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        l5.next=l6;
//        l6.next=null;
//        reorderList(l1);
//        while(l1!=null)
//        {
//            System.out.print(l1.val+" ");
//            l1=l1.next;
//        }
////////////

//////////// Detect cycle in a list
//        visited nodes and 2 pointer. visited 2ptr already in 2ptr list or in 1ptr list
////////////

//////////// Insert Intervals, FYI a List of int[], .toArray() will give a matrix
//        int[][] intervals = new int[3][2];
//        intervals[0][0]=1;
//        intervals[0][1]=3;
//        intervals[1][0]=6;
//        intervals[1][1]=9;
//        intervals[2][0]=12;
//        intervals[2][1]=15;
//        int[] newInterval={7,10};
//        int[][] output=insertIntervals(intervals,newInterval);
////////////

//////////// Merge intervals
        //Check graph solution for
//        merge();
////////////

//////////// Meeting Rooms II
//        Interval[] intervals=new Interval[3];
//        intervals[0]=new Interval(6,10);
//        intervals[1]=new Interval(3,19);
////        intervals[2]=new Interval(11,30);
////        intervals[3]=new Interval(8,12);
////        intervals[4]=new Interval(10,20);
//        intervals[2]=new Interval(1,5);
//        System.out.println(minMeetingRooms(intervals));
////////////

//////////// Unique Paths III - 4 directions
//        int[][] grid=new int[3][3];
//        grid[0]=new int[]{1,0,0};
//        grid[1]=new int[]{0,2,0};
//        grid[2]=new int[]{0,0,0};
////        System.out.println(UniquePathsIIIRecur.uniquePathsIII(grid));
//        System.out.println(UniquePathsIIIDP.uniquePathsIII(grid));
////////////

//////////// N Queens Backtracking
//        Long start=System.currentTimeMillis();
////        System.out.println(NQueenHashSet.solveNQueens(4));
//        System.out.println(NQueenBoolArray.solveNQueens(4)); //faster, boolean arrays are faster than HashSets
//        System.out.println((System.currentTimeMillis()-start) + "ms");
////////////

//////////// Set Zeroes
//        int[][] matrix=new int[2][3];
//        matrix[0][0]=0;
//        matrix[0][1]=2;
//        matrix[0][2]=0;
//        matrix[1][0]=3;
//        matrix[1][1]=4;
//        matrix[1][2]=5;
//        setZeroes(matrix);
////////////

//////////// Spiral Matrix
//        int[][] matrix=new int[3][3];
//        matrix[0][0]=1;
//        matrix[0][1]=2;
//        matrix[0][2]=3;
//        matrix[1][0]=4;
//        matrix[1][1]=5;
//        matrix[1][2]=6;
//        matrix[2][0]=7;
//        matrix[2][1]=8;
//        matrix[2][2]=9;
//        spiralOrder(matrix);
////////////

//////////// Rotate Image
//        int[][] matrix=new int[4][4];
//        matrix[0][0]=1;
//        matrix[0][1]=2;
//        matrix[0][2]=3;
//        matrix[0][3]=4;
//        matrix[1][0]=5;
//        matrix[1][1]=6;
//        matrix[1][2]=7;
//        matrix[1][3]=8;
//        matrix[2][0]=9;
//        matrix[2][1]=10;
//        matrix[2][2]=11;
//        matrix[2][3]=12;
//        matrix[3][0]=13;
//        matrix[3][1]=14;
//        matrix[3][2]=15;
//        matrix[3][3]=16;
////        rotateImageTransposenReverse(matrix);
////        rotateImageOnePass(matrix);
//        rotateImageOnePassnOneLoop(matrix);
////////////

//////////// Word search
//        char[][] matrix=new char[3][4];
//        matrix[0][0]='A';
//        matrix[0][1]='B';
//        matrix[0][2]='C';
//        matrix[0][3]='E';
//        matrix[1][0]='S';
//        matrix[1][1]='F';
//        matrix[1][2]='C';
//        matrix[1][3]='S';
//        matrix[2][0]='A';
//        matrix[2][1]='D';
//        matrix[2][2]='E';
//        matrix[2][3]='E';
//        System.out.println(wordSearch(matrix,"SEE"));
////////////

//////////// Max Depth BT
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(maxDepthStack(t1));
//        System.out.println(maxDepthRecur(t1));
////////////

//////////// Same tree
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(isSameTreeRecur(t1, t1));
//        System.out.println(isSameTreeQueue(t1, t1));
////////////

//////////// Max Path sum BT
//        TreeNode t3 = new TreeNode(-3, null, null);
//        TreeNode t2 = new TreeNode(-1, null, null);
//        TreeNode t1 = new TreeNode(2, t2, t3);
//        System.out.println(MaxPathBT.maxPathSum(t1));
////////////

//////////// Level Order
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        List<List<Integer>> levels = new ArrayList<List<Integer>>();
////        levelOrderRecur(t1,levels,0);
////        System.out.println(levels);
//        System.out.println(levelOrderIter(t1)); // after removing the parents at one level, the remaining elements in the queue = no: of children at next level
////////////

//////////// Serialize and deserialize BT
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//
//
//        String serializedString = serialize(t1);
//        System.out.println(serializedString);
//
//        TreeNode result=deserialize(serializedString);
//        String[] preOrderStringArray= serializedString.split(",");
//        TreeNode root=new TreeNode(Integer.parseInt(preOrderStringArray[0]));
//        deserializePreOrder(root,preOrderStringArray,0);
////////////

//////////// Sub tree
//        TreeNode t5 = new TreeNode(2, null, null);
//        TreeNode t4 = new TreeNode(1, null, null);
//        TreeNode t3 = new TreeNode(5, null, null);
//        TreeNode t2 = new TreeNode(4, t4, t5);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//
//        TreeNode s2 = new TreeNode(1, null, null);
//        TreeNode s1 = new TreeNode(4, s2, null);
//
//        System.out.println(isSubtreePreOrder(t1,s1));
//        System.out.println(isSubtreeCompare(t1,s1));
////////////

//////////// Tree From Preorder & Inorder
//        int[] preorder=new int[]{3,9,20,15,7};
//        int[] inorder=new int[]{9,3,15,20,7};
//        TreeFromPreorderInorder.buildTree(preorder,inorder);

////////////

//////////// Validate BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(isValidBSTRecur(t1,null,null));
//        System.out.println(isValidBSTInorder(t1));
//        System.out.println(ValidBSTIterative.isValidBSTIterative(t1));
////////////

//////////// kth Smallest element in BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(kthSmallestIter(t1,4));
//        System.out.println(kthSmallestRecur(t1,4));
////////////

//////////// kth Smallest element in BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(lowestCommonAncestorIter(t1,t3,t4).val);
//        System.out.println(lowestCommonAncestorRecur(t1,t3,t4).val);
////////////

//////////// Longest Repeating Character Replacement
//        String s="AABABBA";
//        String s="ACDBBEFAGHIJA";
//        System.out.println(characterReplacement(s,2));
////////////

//////////// Minimum Window Substring
//        String s="aabaabaaab";
//        String t="bb";
//        String s="adobecodebanc";
//        String t="abc";
//        String s="cabeca";
//        String t="cae";
//        System.out.println(minWindow(s,t));
//        System.out.println(minWindowMyWay(s,t));
//        System.out.println(minWindowTemplate(s,t));
//        String s="aabbbbcdddd";
//        System.out.println(lengthOfLongestSubstringKDistinct(s,3));
////////////

//////////// Encode Decode Strings
//        List<String> orinigalList = new ArrayList<String>();
//        orinigalList.add("abc,");
//        orinigalList.add("def");
//        System.out.println(decode(encode(orinigalList)));
//        orinigalList.clear();
//        orinigalList.add("abc");
//        orinigalList.add(",def");
//        System.out.println(decode(encode(orinigalList)));
//        orinigalList.clear();
//        System.out.println(decode(encode(orinigalList)));

////////////

//////////// LRU cache
//        LRUCache cache = new LRUCache(2);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4
////////////

//////////// Group Anagrams
//        String[] strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(groupAnagrams(strs));
////////////

//////////// Valid Parenthesis
//        String strs="{[}]";
//        String strs="(([]){})";
//        System.out.println(isValidParenthesis(strs));
////////////

//////////// Count Palindromes
        String s="babababa";
        System.out.println(countPalindromeSubstrings(s));
        System.out.println(countPalindromeSubstringsManachersAlgo(s));
////////////

    }

    //Stack preserves order
    public static boolean isValidParenthesis(String s) {

        // Hash table that takes care of the mappings.
         HashMap<Character, Character> mappings;
        mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');

        // Initialize a stack to be used in the algorithm.
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static boolean isValidParenthesisDintWork(String s) {

        int openPtr = -1, endPtr = -1, doneIndex = -1;
        char character = '\0';
        for (int i = 0; i < s.length(); i++) {
            character = s.charAt(i);
            if (character == '{' || character == '(' || character == '[') {
                if (openPtr == -1 || openPtr>doneIndex)
                    openPtr = i;

            }
            else
            if(character == '}' || character == ')' || character == ']')
            {
                    endPtr = i;
                if(openPtr==-1)
                    return false;

                if(character=='}' && s.charAt(openPtr)!='{')
                    return false;
                if(character==')' && s.charAt(openPtr)!='(')
                    return false;
                if(character==']' && s.charAt(openPtr)!='[')
                    return false;

                //there was a pair match at this point
                if(--openPtr==doneIndex) {
                    doneIndex = endPtr;
                    openPtr=-1;
                }
            }
        }
        if(openPtr!=-1)
            return false;
        return true;
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) count[c - 'a']++;

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

//    Red black trees…properties
//    Balance a binary tree or BST…do with inorder
//    Check if balanced binary tree…check by height subtractions
//    Do binary search in array

//    LRU cache can be a linked hash map too
    public static class LRUCache {

        private Hashtable<Integer, DLinkedNode> cache =
                new Hashtable<Integer, DLinkedNode>();
        private int size;
        private int capacity;
        private DLinkedNode head, tail;

        class DLinkedNode {
            int key;
            int value;
            DLinkedNode prev;
            DLinkedNode next;
        }

        public LRUCache(int capacity) {
            this.size = 0;
            this.capacity = capacity;

            head = new DLinkedNode();
            // head.prev = null;

            tail = new DLinkedNode();
            // tail.next = null;

            head.next = tail;
            tail.prev = head;
        }

        private void addNode(DLinkedNode node) {
            /**
             * Always add the new node right after head.
             */
            node.prev = head;
            node.next = head.next;

            head.next.prev = node;
            head.next = node;
        }

        private void removeNode(DLinkedNode node){
            /**
             * Remove an existing node from the linked list.
             */
            DLinkedNode prev = node.prev;
            DLinkedNode next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void moveToHead(DLinkedNode node){
            /**
             * Move certain node in between to the head.
             */
            removeNode(node);
            addNode(node);
        }

        private DLinkedNode popTail() {
            /**
             * Pop the current tail.
             */
            DLinkedNode res = tail.prev;
            removeNode(res);
            return res;
        }

        public int get(int key) {
            DLinkedNode node = cache.get(key);
            if (node == null) return -1;

            // move the accessed node to the head;
            moveToHead(node);

            return node.value;
        }

        public void put(int key, int value) {
            DLinkedNode node = cache.get(key);

            if(node == null) {
                DLinkedNode newNode = new DLinkedNode();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addNode(newNode);

                ++size;

                if(size > capacity) {
                    // pop the tail
                    DLinkedNode tail = popTail();
                    cache.remove(tail.key);
                    --size;
                }
            } else {
                // update the value.
                node.value = value;
                moveToHead(node);
            }
        }
    }

    // Encodes a list of strings to a single string.
    public static String encode(List<String> strs) {
        StringBuffer sequence = new StringBuffer(".");
        StringBuffer stringInput = new StringBuffer();
        if (strs.size() == 0)
            return "";
        for (String s : strs) {
            sequence.append(s.length() + " ");
            stringInput.append(s);
        }
        return stringInput.toString() + sequence.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        if(s.isEmpty())
            return new ArrayList<String>();

        String[] sequence = s.substring(s.lastIndexOf(".") + 1).split(" ");
        List<String> orinigalList = new ArrayList<String>();
        int startIndex = 0;
        int lenghtOfString = 0;
        for (String number : sequence) {
            lenghtOfString = Integer.parseInt(number);
            orinigalList.add(s.substring(startIndex, startIndex + lenghtOfString));
            startIndex+=lenghtOfString;
        }
        return orinigalList;
    }

    //For 2 distinct char- can be better with earliest last index of the 2 distinct characters
    // to jump begin ptr quickly rather than inner while loop
    //In the template way only minWindow() has a for loop to set initial values
    public static int lengthOfLongestSubstringKDistinct(String s,int k) {
        int[] map=new int[128];
        char[] sCharArray=s.toCharArray();
        int counter=0, begin=0, end=0, d=0;
        while(end<sCharArray.length){
            if(map[sCharArray[end++]]++==0) counter++;
            while(counter>k) if(map[sCharArray[begin++]]--==1) counter--;
            d=Math.max(d, end-begin);
        }
        return d;
    }

    //Min Mindow, atmost 2 distinct char and without repeating substrings have a template
    public static String minWindowTemplate(String s, String t) {
        int[] charactersOfT = new int[128];
        char[] sCharArray=s.toCharArray();
        int tcounter = t.length(), beginOfS = 0, endOfS = 0, minStringLength = Integer.MAX_VALUE, minStringStart = 0;

        for (char c : t.toCharArray()) charactersOfT[c]++;

        while (endOfS < s.length()) {
            if (charactersOfT[sCharArray[endOfS++]]-- > 0) tcounter--; //in t

            //substring found, go over it to find new begin index
            while (tcounter == 0) {
                if (endOfS - beginOfS < minStringLength) minStringLength = endOfS - (minStringStart = beginOfS);
                if (charactersOfT[sCharArray[beginOfS++]]++ == 0)
                    tcounter++;  //make it invalid
            }
        }
        return minStringLength == Integer.MAX_VALUE ? "" : s.substring(minStringStart, minStringStart + minStringLength);
    }

    public static String minWindowMyWay(String s, String t) {

        if (t.length() > s.length())
            return "";
        if(s.indexOf(t)>=0)
            return t;
        if(t.length()==1 && s.indexOf(t)<0)
            return "";

        int start = 0, end = 0;
        String maxString = s + "a";
        HashMap<Character, Integer> remainingSet = new HashMap<Character, Integer>();
        HashMap<Character, Integer> repeatedElements = new HashMap<Character, Integer>();
        HashSet<Character> uniqueCharacters = new HashSet<Character>();
        Queue<CharacterAndIndex> queue = new LinkedList<CharacterAndIndex>();

        boolean firstOccurence=false;

            for (char character : t.toCharArray()) {
                remainingSet.put(character, remainingSet.getOrDefault(character, 0) + 1);
                uniqueCharacters.add(character);
            }

            while (end < s.length() || repeatedElements.size() > 0) {

                while (!remainingSet.isEmpty() && end < s.length()) {
                    if (remainingSet.containsKey(s.charAt(end))) {
                        if(!firstOccurence){
                            start=end;
                            firstOccurence=true;
                        }

                        if (remainingSet.get(s.charAt(end)) == 1)
                            remainingSet.remove(s.charAt(end));
                        else
                            remainingSet.put(s.charAt(end), remainingSet.get(s.charAt(end)) - 1);
                        ((LinkedList<CharacterAndIndex>) queue).push(new CharacterAndIndex(s.charAt(end), end));
                    } else if (uniqueCharacters.contains(s.charAt(end))) {
                        repeatedElements.put(s.charAt(end), repeatedElements.getOrDefault(s.charAt(end), 0) + 1);
                        ((LinkedList<CharacterAndIndex>) queue).push(new CharacterAndIndex(s.charAt(end), end));
                    }
                    end++;
                }
                if (!remainingSet.isEmpty() && end == s.length())
                {    if (maxString.length()<=s.length())
                        return maxString;
                    else
                        return "";
            }
                //after this point u have found a substring
                maxString = s.substring(start, end).length() < maxString.length() ? s.substring(start, end) : maxString;
//                System.out.println(s.substring(start, end));

                if (end < s.length() || repeatedElements.size() > 0) {
                    CharacterAndIndex poppedElement = ((LinkedList<CharacterAndIndex>) queue).pollLast();
                        while (repeatedElements.containsKey(poppedElement.character)) {
                            if (repeatedElements.get(poppedElement.character) == 1)
                                repeatedElements.remove(poppedElement.character);
                            else
                                repeatedElements.put(poppedElement.character, repeatedElements.get(poppedElement.character) - 1);

                            poppedElement = ((LinkedList<CharacterAndIndex>) queue).pollLast();
                            start = poppedElement.index;
                            maxString = s.substring(start, end).length() < maxString.length() ? s.substring(start, end) : maxString;
//                            System.out.println(s.substring(start, end));
                        }
                        remainingSet.put(poppedElement.character, 1);
                        start = ((LinkedList<CharacterAndIndex>) queue).peekLast().index;
                }
                if (!repeatedElements.containsKey(remainingSet.get(0)) && end==s.length())
                    break;
            }
        return maxString;
    }


        public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        // Dictionary which keeps a count of all the unique characters in t.
        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
        for (int i = 0; i < t.length(); i++) {
            int count = dictT.getOrDefault(t.charAt(i), 0);
            dictT.put(t.charAt(i), count + 1);
        }

        // Number of unique characters in t, which need to be present in the desired window.
        int required = dictT.size();

        // Left and Right pointer
        int l = 0, r = 0;

        // formed is used to keep track of how many unique characters in t
        // are present in the current window in its desired frequency.
        // e.g. if t is "AABC" then the window must have two A's, one B and one C.
        // Thus formed would be = 3 when all these conditions are met.
        int formed = 0;

        // Dictionary which keeps a count of all the unique characters in the current window.
        Map<Character, Integer> windowCounts = new HashMap<Character, Integer>();

        // ans list of the form (window length, left, right)
        int[] ans = {-1, 0, 0};

        while (r < s.length()) {
            // Add one character from the right to the window
            char c = s.charAt(r);
            int count = windowCounts.getOrDefault(c, 0);
            windowCounts.put(c, count + 1);

            // If the frequency of the current character added equals to the
            // desired count in t then increment the formed count by 1.
            if (dictT.containsKey(c) && windowCounts.get(c).intValue() == dictT.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window till the point where it ceases to be 'desirable'.
            while (l <= r && formed == required) {
                c = s.charAt(l);
                // Save the smallest window until now.
                if (ans[0] == -1 || r - l + 1 < ans[0]) {
                    ans[0] = r - l + 1;
                    ans[1] = l;
                    ans[2] = r;
                }

                // The character at the position pointed by the
                // `Left` pointer is no longer a part of the window.
                windowCounts.put(c, windowCounts.get(c) - 1);
                if (dictT.containsKey(c) && windowCounts.get(c).intValue() < dictT.get(c).intValue()) {
                    formed--;
                }

                // Move the left pointer ahead, this would help to look for a new window.
                l++;
            }

            // Keep expanding the window once we are done contracting.
            r++;
        }

        return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
    }

    public static int characterReplacement(String s, int k)
    {
        int[] count = new int[128];
        int max=0;
        int start=0;
        for(int end=0; end<s.length(); end++)
        {
            max = Math.max(max, ++count[s.charAt(end)]);
            if(max+k<end-start+1)
                count[s.charAt(start++)]--;
        }
        return s.length()-start;
    }

    //LCA can be asked for BT also, there whole tree needs to be searched except for inside a node that has matched.
    public static TreeNode lowestCommonAncestorRecur(TreeNode root, TreeNode p, TreeNode q) {

        // Value of current node or parent node.
        int parentVal = root.val;

        // Value of p
        int pVal = p.val;

        // Value of q;
        int qVal = q.val;

        if (pVal > parentVal && qVal > parentVal) {
            // If both p and q are greater than parent
            return lowestCommonAncestorRecur(root.right, p, q);
        } else if (pVal < parentVal && qVal < parentVal) {
            // If both p and q are lesser than parent
            return lowestCommonAncestorRecur(root.left, p, q);
        } else {
            // We have found the split point, i.e. the LCA node.
            return root;
        }
    }

    public static TreeNode lowestCommonAncestorIter(TreeNode root, TreeNode p, TreeNode q) {

        // Value of p
        int pVal = p.val;

        // Value of q;
        int qVal = q.val;

        // Start from the root node of the tree
        TreeNode node = root;

        // Traverse the tree
        while (node != null) {

            // Value of ancestor/parent node.
            int parentVal = node.val;

            if (pVal > parentVal && qVal > parentVal) {
                // If both p and q are greater than parent
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                // If both p and q are lesser than parent
                node = node.left;
            } else {
                // We have found the split point, i.e. the LCA node.
                return node;
            }
        }
        return null;
    }

//    >>>>>???? Check for insert + search optimisation, doubly ll soulution
    public static ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null) return arr;
        inorder(root.left, arr);
        arr.add(root.val);
        inorder(root.right, arr);
        return arr;
    }

    public static int kthSmallestRecur(TreeNode root, int k) {
        ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
        return nums.get(k - 1);
    }

    public static int kthSmallestIter(TreeNode root, int k) {
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while (true) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.removeLast();
            if (--k == 0) return root.val;
            root = root.right;
        }
    }

//    dfs - stack(Iterative)
//    bfs - queue(Iterative(levelorder) or recursion)
//    Parent's value and level can be stored within recursion, no extra space required
//    Inorder in BST gives ascending order

    public static boolean isValidBSTInorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = - Double.MAX_VALUE;

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            // If next element in inorder traversal
            // is smaller than the previous one
            // that's not BST.
            if (root.val <= inorder) return false;
            inorder = root.val;
            root = root.right;
        }
        return true;
    }

    static class ValidBSTIterative {
        static LinkedList<TreeNode> stack = new LinkedList();
        static LinkedList<Integer> uppers = new LinkedList(),
                lowers = new LinkedList();

        public static void update(TreeNode root, Integer lower, Integer upper) {
            stack.add(root);
            lowers.add(lower);
            uppers.add(upper);
        }

        public static boolean isValidBSTIterative(TreeNode root) {
            Integer lower = null, upper = null, val;
            update(root, lower, upper);

            while (!stack.isEmpty()) {
                root = stack.poll();
                lower = lowers.poll();
                upper = uppers.poll();

                if (root == null) continue;
                val = root.val;
                if (lower != null && val <= lower) return false;
                if (upper != null && val >= upper) return false;
                update(root.right, val, upper);
                update(root.left, lower, val);
            }
            return true;
        }
    }

    public static boolean isValidBSTRecur(TreeNode node, Integer lower, Integer upper) {
        if (node == null) return true;

        int val = node.val;
        if (lower != null && val <= lower) return false;
        if (upper != null && val >= upper) return false;

        if (! isValidBSTRecur(node.right, val, upper)) return false;
        if (! isValidBSTRecur(node.left, lower, val)) return false;
        return true;
    }

    static class TreeFromPreorderInorder {
        // start from first preorder element
        static int preIndex = 0;
        static int[] preorder;
        static HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();

        public static TreeNode helper(int inLeftBound, int inRightBound) {
            // if there is no elements to construct subtrees
            if (inLeftBound == inRightBound)
                return null;

            // pick up preIndex element as a root
            int root_val = preorder[preIndex];
            TreeNode root = new TreeNode(root_val);

            // root splits inorder list
            // into left and right subtrees
            int index = idx_map.get(root_val);

            // recursion
            preIndex++;
            // build left subtree
            root.left = helper(inLeftBound, index);
            // build right subtree
            root.right = helper(index + 1, inRightBound);
            return root;
        }

        public static TreeNode buildTree(int[] preorderr, int[] inorderr) {
            preorder = preorderr;

            // build a hashmap value -> its index
            int idx = 0;
            for (Integer val : inorderr)
                idx_map.put(val, idx++);
            return helper(0, inorderr.length);
        }
    }

    public static boolean equals(TreeNode x,TreeNode y)
    {
        if(x==null && y==null)
            return true;
        if(x==null || y==null)
            return false;
        return x.val==y.val && equals(x.left,y.left) && equals(x.right,y.right);
    }
    public static boolean isSubtreeCompare(TreeNode s,TreeNode t)
    {
        return  s!=null && ( equals(s,t) || isSubtreeCompare(s.left,t) || isSubtreeCompare(s.right,t));
    }


    //passes without rnull and lnull
    public static boolean isSubtreePreOrder(TreeNode s, TreeNode t) {
        String tree1 = preorder(s, true);
        String tree2 = preorder(t, true);
        return tree1.indexOf(tree2) >= 0;
    }
    public static String preorder(TreeNode t, boolean left) {
        if (t == null) {
            if (left)
                return "lnull";
            else
                return "rnull";
        }
        return "#"+t.val + " " +preorder(t.left, true)+" " +preorder(t.right, false);
    }

    public static String serialize(TreeNode root, String str) {
        // Recursive serialization.
        if (root == null) {
            str += "null,";
        } else {
            if(dfsTraversalOrder.equals("preorder"))
                str += str.valueOf(root.val) + ",";

            str = serialize(root.left, str);
            if(dfsTraversalOrder.equals("inorder"))
                str += str.valueOf(root.val) + ",";

            str = serialize(root.right, str);

            if(dfsTraversalOrder.equals("postorder"))
                str += str.valueOf(root.val) + ",";

        }
        return str;
    }

    //For deserializing, the position of root is very important.
    //for Preorder, its in the start so start from start, post- at the end and inorder-root position should be given
    public static int deserializePreOrder(TreeNode root, String[] preOrderString, int index) {

        index++;
        if (!preOrderString[index].equals("null"))
        {
            root.left = new TreeNode(Integer.parseInt(preOrderString[index]));
            index = deserializePreOrder(root.left, preOrderString, index);
        } else
            index++;

        if (!preOrderString[index].equals("null"))
        {
            root.right = new TreeNode(Integer.parseInt(preOrderString[index]));
            index = deserializePreOrder(root.right, preOrderString, index);
        } else
            index++;

        return index;
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        return serialize(root, "");
    }

    public static TreeNode deserialize(List<String> l) {
        // Recursive deserialization.
        if (l.get(0).equals("null")) {
            l.remove(0);
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(l.get(0)));
        l.remove(0);
        root.left = deserialize(l);
        root.right = deserialize(l);

        return root;
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        String[] data_array = data.split(",");
        List<String> data_list = new LinkedList<String>(Arrays.asList(data_array));
        return deserialize(data_list);
    }


    public static List<List<Integer>> levelOrderIter(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while ( !queue.isEmpty() ) {
            // start the current level
            levels.add(new ArrayList<Integer>());

            // number of elements in the current level
            int level_length = queue.size();
            for(int i = 0; i < level_length; ++i) {
                TreeNode node = queue.remove();

                // fulfill the current level
                levels.get(level).add(node.val);

                // add child nodes of the current level
                // in the queue for the next level
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            // go to next level
            level++;
        }
        return levels;
    }

    public static void levelOrderRecur(TreeNode node, List<List<Integer>> levels, int level) {

        if(node==null)
            return;
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

        // fulfil the current level
        levels.get(level).add(node.val);

        // process child nodes for the next level
        if (node.left != null)
            levelOrderRecur(node.left, levels, level + 1);
        if (node.right != null)
            levelOrderRecur(node.right, levels, level + 1);
    }

    static class MaxPathBT {
        static int max_sum = Integer.MIN_VALUE;

        public static int max_gain(TreeNode node) {
            if (node == null) return 0;

            // max sum on the left and right sub-trees of node
            int left_gain = Math.max(max_gain(node.left), 0);
            int right_gain = Math.max(max_gain(node.right), 0);

            // the price to start a new path where `node` is a highest node
            int price_newpath = node.val + left_gain + right_gain;

            // update max_sum if it's better to start a new path
            max_sum = Math.max(max_sum, price_newpath);

            // for recursion :
            // return the max gain if continue the same path
            return node.val + Math.max(left_gain, right_gain);
        }

        public static int maxPathSum(TreeNode root) {
            max_gain(root);
            return max_sum;
        }
    }

    public static boolean isSameTreeQueue(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!check(p, q)) return false;

        // init deques
        ArrayDeque<TreeNode> deqP = new ArrayDeque<TreeNode>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<TreeNode>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (!check(p, q)) return false;
            if (p != null) {
                // in Java nulls are not allowed in Deque
                if (!check(p.left, q.left)) return false;
                if (p.left != null) {
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }
                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    deqP.addLast(p.right);
                    deqQ.addLast(q.right);
                }
            }
        }
        return true;
    }

    public static boolean check(TreeNode p, TreeNode q) {
        // p and q are null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return true;
    }

    public static boolean isSameTreeRecur(TreeNode p, TreeNode q) {
        // p and q are both null
        if (p == null && q == null) return true;
        // one of p and q is null
        if (q == null || p == null) return false;
        if (p.val != q.val) return false;
        return isSameTreeRecur(p.right, q.right) &&
                isSameTreeRecur(p.left, q.left);
    }

    public static int maxDepthStack(TreeNode root) {
        LinkedList<Pair<TreeNode, Integer>> stack = new LinkedList<>();
        if (root != null) {
            stack.add(new Pair(root, 1));
        }
        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> current = stack.pollLast();
            root = current.getKey();
            int current_depth = current.getValue();
            if (root != null) {
                depth = Math.max(depth, current_depth);
                stack.add(new Pair(root.left, current_depth + 1));
                stack.add(new Pair(root.right, current_depth + 1));
            }
        }
        return depth;
    }

    public static int maxDepthRecur(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int left_height = maxDepthRecur(root.left);
            int right_height = maxDepthRecur(root.right);
            return java.lang.Math.max(left_height, right_height) + 1;
        }
    }
    
    public static boolean wordSearch(char[][] board, String word) {
        char[] w = word.toCharArray();
        for (int row=0; row<board.length; row++) {
            for (int col=0; col<board[row].length; col++) {
                if (exist(board, row, col, w, 0)) return true;
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, int row, int col, char[] inputWord, int currentWordLength) {
        if (currentWordLength == inputWord.length) return true;
        if (row<0 || col<0 || row == board.length || col == board[row].length) return false;
        if (board[row][col] != inputWord[currentWordLength]) return false;
        board[row][col] ^= 256;
        boolean exist = exist(board, row, col+1, inputWord, currentWordLength+1)
                || exist(board, row, col-1, inputWord, currentWordLength+1)
                || exist(board, row+1, col, inputWord, currentWordLength+1)
                || exist(board, row-1, col, inputWord, currentWordLength+1);
        board[row][col] ^= 256;
        return exist;
    }

    public static void rotateImageOnePassnOneLoop(int[][] matrix) {
//        int n = matrix.length;
//        for (int i = 0; i < (n + 1) / 2; i ++) {
//            for (int j = 0; j < n / 2; j++) {
//                int temp = matrix[n - 1 - j][i];
//                matrix[n - 1 - j][i] = matrix[n - 1 - i][n - j - 1];
//                matrix[n - 1 - i][n - j - 1] = matrix[j][n - 1 -i];
//                matrix[j][n - 1 - i] = matrix[i][j];
//                matrix[i][j] = temp;
//            }
//        }


//        int n = matrix.length;
//        // l is the side length of the matrix we are processing
//        for(int l = n; l > 1; l -= 2){
//            // lo is the start index of the matrix we are processing
//            int lo = (n-l)/2;
//            // hi is the end index of the matrix we are processing
//            int hi = lo + l -1;
//            for(int i = 0; i < l-1; i++){
//                // move number on one side to the other side clockwise
//                int temp = matrix[hi-i][lo];
//                matrix[hi-i][lo] = matrix[hi][hi-i];
//                matrix[hi][hi-i] = matrix[lo+i][hi];
//                matrix[lo+i][hi] = matrix[lo][lo+i];
//                matrix[lo][lo+i] = temp;
//            }
//        }

        int n = matrix.length, lo=0,hi=matrix.length-1;
        // l is the side length, for loop to process one square at a time, l-=2 as the square becomes smaller
        for(int l = n; l > 1; l -= 2){

            //for loop to go over the elements in the square
            for(int element = 0; element < l-1; element++){
                // move number on one side to the other side clockwise
                int temp = matrix[hi-element][lo];
                matrix[hi-element][lo] = matrix[hi][hi-element];
                matrix[hi][hi-element] = matrix[lo+element][hi];
                matrix[lo+element][hi] = matrix[lo][lo+element];
                matrix[lo][lo+element] = temp;
            }
            // lo is the first element on the side l
            lo++;
            // hi is the last element on the side l
            hi--;
        }
    }

    public static void rotateImageOnePass(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2 + n % 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                int[] tmp = new int[4];
                int row = i;
                int col = j;
                for (int k = 0; k < 4; k++) {
                    tmp[k] = matrix[row][col];
                    int x = row;
                    row = col;
                    col = n - 1 - x;
                }
                for (int k = 0; k < 4; k++) {
                    matrix[row][col] = tmp[(k + 3) % 4];
                    int x = row;
                    row = col;
                    col = n - 1 - x;
                }
            }
        }
    }

    public static void rotateImageTransposenReverse(int[][] matrix) {
        int n = matrix.length;

        // transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        // reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = tmp;
            }
        }
    }

    public static void spiralOrder(int[][] matrix) {
        List ans = new ArrayList();
        if (matrix.length == 0)
            System.out.println(null+"");
        int r1 = 0, r2 = matrix.length - 1;
        int c1 = 0, c2 = matrix[0].length - 1;
        while (r1 <= r2 && c1 <= c2) {
            for (int c = c1; c <= c2; c++) System.out.print(matrix[r1][c]);
            for (int r = r1 + 1; r <= r2; r++) System.out.print(matrix[r][c2]);
            if (r1 < r2 && c1 < c2) {
                for (int c = c2 - 1; c > c1; c--) System.out.print(matrix[r2][c]);
                for (int r = r2; r > r1; r--) System.out.print(matrix[r][c1]);
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
//        return ans;
    }

    //>>>>Rev1
    public static void setZeroes(int[][] matrix) {
        Boolean isFirstCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        //Set indicators(sentinel) for other elements
        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) {
                isFirstCol = true;
            }

            for (int j = 1; j < C; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        //Use indicators, over other elements, Do columns and rows separate for loop will be faster(m+n vs mn)
        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isFirstCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    static class NQueenBoolArray {
        private static boolean[] column;
        private static boolean[] _antiDiag;
        private static boolean[] _diag;

        public static List<List<String>> solveNQueens(int n) {
            // time: O(n* (n!))

            column = new boolean[n];
            _antiDiag = new boolean[2 * n - 1];
            _diag = new boolean[2 * n - 1];
            List<List<String>> res = new ArrayList<List<String>>();
            List<String> list = new ArrayList<String>();

            dfs(list, 0, res, n);
            return res;
        }

        private static void dfs(List<String> list, int rowIndex, List<List<String>> res, int n) {
            if (rowIndex == n) {
                res.add(new ArrayList<String>(list));
                return;
            }
            for (int col = 0; col < n; col++) {
                if (!column[col] && !_diag[rowIndex - col + n - 1] && !_antiDiag[rowIndex + col]) {

                    char[] charArray = new char[n];
                    Arrays.fill(charArray, '.');
                    charArray[col] = 'Q';

                    list.add(new String(charArray));
                    column[col] = true;
                    _diag[rowIndex - col + n - 1] = true;
                    _antiDiag[col + rowIndex] = true;

                    dfs(list, rowIndex + 1, res, n);

                    list.remove(list.size() - 1);
                    column[col] = false;
                    _diag[rowIndex - col + n - 1] = false;
                    _antiDiag[col + rowIndex] = false;
                }
            }
        }
    }

    public static class NQueenHashSet {
        private static Set<Integer> col = new HashSet<Integer>();
        private static Set<Integer> diag1 = new HashSet<Integer>();
        private static Set<Integer> diag2 = new HashSet<Integer>();

        public static List<List<String>> solveNQueens(int n) {
            List<List<String>> res = new ArrayList<List<String>>();
            dfs(res,new ArrayList<String>(), 0, n);
            return res;
        }
        private static void dfs(List<List<String>> res, List<String> list, int row, int n){
            if (row == n){
                res.add(new ArrayList<String>(list));
                return;
            }
            for (int column = 0; column < n; column++){
                if (NQueenHashSet.col.contains(column) || diag1.contains(row + column) || diag2.contains(row - column)) continue;

                char[] charArray = new char[n];
                Arrays.fill(charArray, '.');
                charArray[column] = 'Q';
                String rowString = new String(charArray);

                list.add(rowString);
                NQueenHashSet.col.add(column);
                diag1.add(row + column);
                diag2.add(row - column);

                dfs(res, list, row + 1, n);

                list.remove(list.size() - 1);
                NQueenHashSet.col.remove(column);
                diag1.remove(row + column);
                diag2.remove(row - column);
            }
        }
    }

    static class UniquePathsIIIDP {
        static int ans;
        static int[][] grid;
        static int R, C;
        static int tr, tc, target;
        static int[] dr = new int[]{0, -1, 0, 1};
        static int[] dc = new int[]{1, 0, -1, 0};
        static Integer[][][] memo;

        public static int uniquePathsIII(int[][] grid) {
//            this.grid = grid;
            R = grid.length;
            C = grid[0].length;
            target = 0;

            int sr = 0, sc = 0;
            for (int r = 0; r < R; ++r)
                for (int c = 0; c < C; ++c) {
                    if (grid[r][c] % 2 == 0)
                        target |= code(r, c);

                    if (grid[r][c] == 1) {
                        sr = r;
                        sc = c;
                    } else if (grid[r][c] == 2) {
                        tr = r;
                        tc = c;
                    }
                }

            memo = new Integer[R][C][1 << R*C];
            return dp(sr, sc, target);
        }

        public static int code(int r, int c) {
            return 1 << (r * C + c);
        }

        public static Integer dp(int r, int c, int todo) {
            if (memo[r][c][todo] != null)
                return memo[r][c][todo];

            if (r == tr && c == tc) {
                return todo == 0 ? 1 : 0;
            }

            int ans = 0;
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C) {
                    if ((todo & code(nr, nc)) != 0)
                        ans += dp(nr, nc, todo ^ code(nr, nc));
                }
            }
            memo[r][c][todo] = ans;
            return ans;
        }
    }

    static class UniquePathsIIIRecur {
        static int ans;
        static int[][] gridStatic;
        static int R, C;
        static int tr, tc, target;
        static int[] dr = new int[]{0, -1, 0, 1};
        static int[] dc = new int[]{1, 0, -1, 0};
        static Integer[][][] memo;

        public static int uniquePathsIII(int[][] grid) {
            gridStatic = grid;
            R = grid.length;
            C = grid[0].length;

            int todo = 0;
            int sr = 0, sc = 0;
            //Find number of obstacles, start and end positions
            for (int r = 0; r < R; ++r)
                for (int c = 0; c < C; ++c) {
                    if (grid[r][c] != -1) {
                        todo++;
                    }

                    if (grid[r][c] == 1) {
                        sr = r;
                        sc = c;
                    } else if (grid[r][c] == 2) {
                        tr = r;
                        tc = c;
                    }
                }

            ans = 0;
            dfs(sr, sc, todo);
            return ans;
        }

        public static void dfs(int r, int c, int todo) {
            todo--;
            if (todo < 0) return;
            //reached target
            if (r == tr && c == tc) {
                //no empty paths left
                if (todo == 0) ans++;
                return;
            }

            gridStatic[r][c] = 3;
            //Move front, up, back and down
            for (int k = 0; k < 4; ++k) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (0 <= nr && nr < R && 0 <= nc && nc < C) {
                    if (gridStatic[nr][nc] % 2 == 0)
                        dfs(nr, nc, todo);
                }
            }
            gridStatic[r][c] = 0;
        }
    }

    public static int minMeetingRoomsSortMethod(Interval[] intervals) {

        // Check for the base case. If there are no intervals, return 0
        if (intervals.length == 0) {
            return 0;
        }

        Integer[] start = new Integer[intervals.length];
        Integer[] end = new Integer[intervals.length];

        for (int i = 0; i < intervals.length; i++) {
            start[i] = intervals[i].start;
            end[i] = intervals[i].end;
        }

        // Sort the intervals by end time
        Arrays.sort(
                end,
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a - b;
                    }
                });

        // Sort the intervals by start time
        Arrays.sort(
                start,
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a - b;
                    }
                });

        // The two pointers in the algorithm: e_ptr and s_ptr.
        int startPointer = 0, endPointer = 0;

        // Variables to keep track of maximum number of rooms used.
        int usedRooms = 0;

        // Iterate over intervals.
        while (startPointer < intervals.length) {

            // If there is a meeting that has ended by the time the meeting at `start_pointer` starts
            if (start[startPointer] >= end[endPointer]) {
                usedRooms -= 1;
                endPointer += 1;
            }

            // We do this irrespective of whether a room frees up or not.
            // If a room got free, then this used_rooms += 1 wouldn't have any effect. used_rooms would
            // remain the same in that case. If no room was free, then this would increase used_rooms
            usedRooms += 1;
            startPointer += 1;

        }

        return usedRooms;
    }

    public static int minMeetingRoomsPriorityQ(Interval[] intervals) {

        // Check for the base case. If there are no intervals, return 0
        if (intervals.length == 0) {
            return 0;
        }

        // Min heap
        PriorityQueue<Integer> allocator =
                new PriorityQueue<Integer>();

        // Sort the intervals by start time
        Arrays.sort(
                intervals,
                new Comparator<Interval>() {
                    public int compare(Interval a, Interval b) {
                        return a.start - b.start;
                    }
                });

        // Add the first meeting
        allocator.add(intervals[0].end);

        // Iterate over remaining intervals
        for (int i = 1; i < intervals.length; i++) {

            // If the room due to free up the earliest is free, assign that room to this meeting.
            if (intervals[i].start >= allocator.peek()) {
                allocator.poll();
            }

            // If a new room is to be assigned, then also we add to the heap,
            // If an old room is allocated, then also we have to add to the heap with updated end time.
            allocator.add(intervals[i].end);
        }

        // The size of the heap tells us the minimum rooms required for all the meetings.
        return allocator.size();
    }

    public static List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Interval.IntervalComparator());

        LinkedList<Interval> merged = new LinkedList<Interval>();
        for (Interval interval : intervals) {
            // if the list of merged intervals is empty or if the current
            // interval does not overlap with the previous, simply append it.
            if (merged.isEmpty() || (int)(merged.getLast().end) < interval.start) {
                merged.add(interval);
            }
            // otherwise, there is overlap, so we merge the current and previous
            // intervals.
            else {
                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
            }
        }

        return merged;
    }

    public static int[][] insertIntervals(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<int[]>();
        int start = newInterval[0];
        int end = newInterval[1];

        int i = 0;
        // add all interval with ends < start
        while(i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i]);
            i++;
        }

        // Merge
        while(i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start, end});
        // Add rest
        while(i<intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][2]);
    }

    public static void reorderList(ListNode head) {
        if(head==null||head.next==null) return;

        //Find the middle of the list
        ListNode p1=head;
        ListNode p2=head;
        while(p2.next!=null&&p2.next.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle=p1;
        ListNode preCurrent=p1.next;
        while(preCurrent.next!=null){
            ListNode current=preCurrent.next;
            preCurrent.next=current.next;
            current.next=preMiddle.next;
            preMiddle.next=current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1=head;
        p2=preMiddle.next;
        while(p1!=preMiddle){
            preMiddle.next=p2.next;
            p2.next=p1.next;
            p1.next=p2;
            p1=p2.next;
            p2=preMiddle.next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        int interval = 1;
        while(interval < lists.length){
            for (int i = 0; i + interval<lists.length; i=i+interval*2)
                lists[i]=merge2Lists(lists[i],lists[i+interval]);

            interval*=2;
        }
        return lists[0];
    }

    public static ListNode merge2Lists(ListNode l1, ListNode l2) {
        if ((l1 == null) && (l2 == null)) return null;
        ListNode l3 = new ListNode(0);
        ListNode currL3=l3;
        while ((l1 != null) && (l2 != null)) {
            if (l1.val < l2.val) {
                currL3.next = l1;
                l1 = l1.next;
            } else {
                currL3.next = l2;
                l2 = l2.next;
            }
            currL3 = currL3.next;
        }
        if ((l1 == null) && (l2 != null))
            currL3.next = l2;
        if ((l1 != null) && (l2 == null))
            currL3.next = l1;

        return l3.next;
    }

    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        //this "if" can be added to a function and prevent swapping to reduce the space complexity
        if (m > n) { // to ensure m<=n
            int[] temp = A; A = B; B = temp;
            int tmp = m; m = n; n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j-1] > A[i]){
                iMin = i + 1; // i is too small
            }
            else if (i > iMin && A[i-1] > B[j]) {
                iMax = i - 1; // i is too big
            }
            else { // i is perfect
                int maxLeft = 0;
                if (i == 0) { maxLeft = B[j-1]; }
                else if (j == 0) { maxLeft = A[i-1]; }
                else { maxLeft = Math.max(A[i-1], B[j-1]); }
                if ( (m + n) % 2 == 1 ) { return maxLeft; } //for odd, the mid value is median

                int minRight = 0;
                if (i == m) { minRight = B[j]; }
                else if (j == n) { minRight = A[i]; }
                else { minRight = Math.min(B[j], A[i]); }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    public static int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if(str.length() == 0) return 0;

        //2. Remove Spaces
        while(str.charAt(index) == ' ' && index < str.length())
            index ++;

        //3. Handle signs
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            sign = str.charAt(index) == '+' ? 1 : -1;
            index ++;
        }

        //4. Convert number and avoid overflow
        while(index < str.length()){
            int digit = str.charAt(index) - '0';
            if(digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if(Integer.MAX_VALUE/10 < total || (Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index ++;
        }
        return total * sign;
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while(ans.peek().length()!=digits.length()){
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length())-'0'];
            for(char c: map.toCharArray()){
                ans.addLast(remove+c);
            }
        }
        return ans;
    }

    //Sliding window, can be done with int[] also 26 char, 128 char or 256 extended ASCII
    public static int lengthOfLongestNonRepeatingSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    //Check Manacher's Algorithm
    public static int countPalindromeSubstringsManachersAlgo(String S) {
        int center = 0, right = 0, t = 2, ans = 0, mirrorOfi = 0;
        char[] paddedInput = new char[2 * S.length() + 3];
        int[] dp = new int[paddedInput.length];

        paddedInput[0] = '@';
        paddedInput[1] = '#';
        paddedInput[paddedInput.length - 1] = '$';
        for (char c : S.toCharArray()) {
            paddedInput[t++] = c;
            paddedInput[t++] = '#';
        }

        for (int i = 1; i < dp.length - 1; ++i) {
            mirrorOfi = 2 * center - i;

            //If i is inside second half of palindrome, copy over the palindrome length
            if (i < right)
                dp[i] = Math.min(right - i, dp[mirrorOfi]);

            //Compare characters around i
            while (paddedInput[i + dp[i] + 1] == paddedInput[i - dp[i] - 1])
                dp[i]++;

            //If palindrome at i expands beyond right side of C
            if (i + dp[i] > right) {
                center = i;
                right = i + dp[i];
            }
        }

        for (int v : dp) ans += (v + 1) / 2;
        return ans;
    }

    public static int countPalindromeSubstrings(String S) {
        int N = S.length(), ans = 0, left = 0, right = 0;

        //2*N-1 because we use L=i & R=i and then L=i & R=i+1
        for (int endIndex = 0; endIndex <= 2 * N - 1; ++endIndex) {
            left = endIndex / 2;
            right = left + endIndex % 2;
            while (left >= 0 && right < N && S.charAt(left) == S.charAt(right)) {
                ans++;
                left--;
                right++;
            }
        }
        return ans;
    }

    static int palindromCounter=0;


    //Code this
    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0; palindromCounter=0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(palindromCounter+" palindromes");
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
//            System.out.println(s.substring(L, R+1));
            palindromCounter++;
            L--;
            R++;

        }
        return R - L - 1;
    }

//    >>>>????
    public static int knightDialerDP(int N) {
        int MOD = 1000000007;
        int[][] moves = new int[][]{
                {4,6},{6,8},{7,9},{4,8},{3,9,0},
                {},{1,7,0},{2,6},{1,3},{2,4}};

        int[][] dp = new int[2][10];
        Arrays.fill(dp[0], 1);
        for (int hops = 0; hops < N-1; ++hops) {
            Arrays.fill(dp[~hops & 1], 0);
            for (int node = 0; node < 10; ++node)
                for (int nei: moves[node]) {
                    dp[~hops & 1][nei] += dp[hops & 1][node];
                    dp[~hops & 1][nei] %= MOD;
                }
        }

        long ans = 0;
        for (int x: dp[~N & 1])
            ans += x;
        return (int) (ans % MOD);
    }

    public static int telephoneKnight(int start, int moves) {

        int paths = 0;
        int subMaxPaths = 0;
        if(moves > 0) {
            List<Integer> subPathNodes = numPaths.get(start);
            paths = subPathNodes.size();
            if (moves - 1 > 0)
            {
                for (int subPathNode = 0; subPathNode < subPathNodes.size(); subPathNode++) {

                    int subPaths = telephoneKnight(subPathNodes.get(subPathNode), moves - 1);
                    if (subPaths > subMaxPaths)
                        subMaxPaths = subPaths;
                }
            }
            paths += subMaxPaths;
        }
        return paths;
    }

    public static int telephoneKnightDP(int start_position, int num_hops) {

        int[] prior_case = new int[]{1,1,1,1,1,1,1,1,1,1};
        int[] current_case = new int[]{0,0,0,0,0,0,0,0,0,0};
        int current_num_hops = 1;

        while (current_num_hops <= num_hops) {
            current_case = new int[]{0,0,0,0,0,0,0,0,0,0};
            current_num_hops += 1;

            for (int position = 0; position < 10; position++) {
                for (int neighbor : numPaths.get(position)) {
                    current_case[position] += prior_case[neighbor];
                }
            }
            prior_case = current_case;
        }
        return current_case[start_position];
    }

    public static HashMap<Integer, List<Integer>> formNumPaths(){
        HashMap<Integer, List<Integer>> numPaths= new HashMap<Integer, List<Integer>>();
        List<Integer> list= new ArrayList<Integer>();
        list.add(8);
        list.add(6);
        numPaths.put(1, list);
        list= new ArrayList<Integer>();
        list.add(9);
        list.add(7);
        numPaths.put(2, list);
        list= new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        numPaths.put(3, list);
        list= new ArrayList<Integer>();
        list.add(3);
        list.add(9);
        list.add(0);
        numPaths.put(4, list);
        list= new ArrayList<Integer>();
        numPaths.put(5, list);
        list= new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(0);
        numPaths.put(6, list);
        list= new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        numPaths.put(7, list);
        list= new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        numPaths.put(8, list);
        list= new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        numPaths.put(9, list);
        list= new ArrayList<Integer>();
        list.add(4);
        list.add(6);
        numPaths.put(0, list);
        return numPaths;
    }


    public static int minCanJumpConstantSpace(int[] nums, int index) {

        int minJumps = nums.length + 2;
        if (index == nums.length - 1)
            return 0;

        for (int i = 1; i <= nums[index]; i++) {
            if (index + i < nums.length) {
                //if already calculated
                if (nums[index + i] < 0) {
                    minJumps= nums[index + i] * -1 + 1;
                    continue;
                }
                int currentMinJumps = minCanJumpConstantSpace(nums, index + i);
                if (currentMinJumps < minJumps)
                    minJumps = currentMinJumps + 1;
            }
            else
                break;
        }
        nums[index] = minJumps * -1;
        return minJumps;
    }

    public static int minCanJumpDP(int[] nums, int index,int[] minJumpDp) {

        int minJumps = nums.length + 2;
        if (index == nums.length - 1)
            return 0;

        for (int i = 1; i <= nums[index]; i++) {
            if (index + i < nums.length) {
                //if already calculated
                if (minJumpDp[index + i] != 0) {
                    minJumps= minJumpDp[index + i] + 1;
                    continue;
                }
                int currentMinJumps = minCanJumpDP(nums, index + i, minJumpDp);
                if (currentMinJumps < minJumps)
                    minJumps = currentMinJumps + 1;
            }
            else
                break;
        }
        minJumpDp[index] = minJumps;
        return minJumps;
    }


    public static boolean canJumpItr(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }

    public static boolean canJumpRecur(int[] nums, int index) {

        if (index == nums.length - 1)
            return true;

        for (int i = 1; i <= nums[index]; i++) {
            if (canJumpRecur(nums, index + i))
                return true;
        }
        nums[index] = 0;
        return false;

    }

//    >>>>????
    public static int maxProdSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0){
                int tmp = currentMax;
                currentMax = currentMin;
                currentMin = tmp;
            }

            currentMax = Math.max(nums[i], currentMax * nums[i]);
            currentMin = Math.min(nums[i], currentMin * nums[i]);
            maxSum = Math.max(maxSum, currentMax);
        }
        return maxSum;
    }

    public static int maxProdSubArrayMySol(int[] nums) {
        int totalProd = 1, firstNegativePosition = -1, maxProd = 0x80000000, productAfterFirstNegative = 1;
        if (nums.length == 1)
            return nums[0];

        for (int i = 0; i < nums.length; i++) {

            productAfterFirstNegative *= nums[i];
            maxProd = Math.max(maxProd, nums[i]); //if 0 is greatest is covered here

            if (firstNegativePosition == -1 && nums[i] < 0) {
                firstNegativePosition = i;
                if (i != nums.length - 1)
                    productAfterFirstNegative = 1;
            }

            if (nums[i] == 0) {
                totalProd = 1;
                firstNegativePosition = -1;
                if (i != nums.length - 1)
                    productAfterFirstNegative = 1;
            } else {
                totalProd = totalProd * nums[i];

                maxProd = Math.max(maxProd, totalProd);
            }
            if (totalProd < 0 && firstNegativePosition != i)
                maxProd = Math.max(maxProd, productAfterFirstNegative);

        }
        return Math.max(maxProd, productAfterFirstNegative);
    }

        private static int maxSubArray(int[] nums) {
        int sum = 0, smax = 0x80000000;
        for (int num : nums) {
            sum += num;
            smax = Math.max(smax, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return smax;
    }

    private static int maxSubArrayDivideNConquer(int[] nums, int l, int r) {
        if (l > r) {
            return 0x80000000;
        }
        int m = l + (r - l) / 2;
        int lmax = maxSubArrayDivideNConquer(nums, l, m - 1);
        int rmax = maxSubArrayDivideNConquer(nums, m + 1, r);
        int smaxl = 0, smaxr = 0;
        for (int i = m - 1, sum = 0; i >= l; i--) {
            sum += nums[i];
            smaxl = Math.max(smaxl, sum);
        }
        for (int i = m + 1, sum = 0; i <= r; i++) {
            sum += nums[i];
            smaxr = Math.max(smaxr, sum);
        }
        return Math.max(Math.max(lmax, rmax), smaxl + smaxr + nums[m]);
    }

    public static void threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int pi = 0;
        for (int i = 0; i < n; i++) {
            if (pi == nums[i]) continue;
            pi = nums[i];

            int l = i + 1;
            int r = n - 1;
            while (l < r) {
                int left = nums[l];
                int right = nums[r];
                int s = -left - right;
                if (s == pi)
                    System.out.println(nums[i] + " " + nums[l] + " " + nums[r]);
                if (s <= pi) while (l < r && right == nums[r]) r--;
                if (s >= pi) while (l < r && left == nums[l]) l++;
            }
        }
    }

    public static List<List<Integer>> threeSumm(int[] nums) {
        Set<List<Integer>> res = new HashSet<List<Integer>>();
        if (nums.length == 0) return new ArrayList<List<Integer>>(res);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                else if (sum > 0) k--;
                else if (sum < 0) j++;
            }

        }
        return new ArrayList<List<Integer>>(res);

    }

//    >>>>????
    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int W, int wt[], int val[], int N) {
        int n, w;
        int k[][] = new int[N + 1][W + 1];

        for (n = 0; n <= N; n++) {
            for (w = 0; w <= W; w++) {
                if (n == 0 || w == 0)
                    k[n][w] = 0;
                else if (wt[n - 1] <= w)
                    k[n][w] = Math.max(val[n - 1] + k[n - 1][w - wt[n - 1]], k[n - 1][w]);
                else
                    k[n][w] = k[n - 1][w];
            }
        }
        return k[N][W];
    }

    static int knapSackRecur(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n-1] > W)
            return knapSackRecur(W, wt, val, n-1);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else return Math.max( val[n-1] + knapSackRecur(W-wt[n-1], wt, val, n-1),
                knapSackRecur(W, wt, val, n-1)
        );
    }

    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    public int climbStairsDP(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

//     >>>???? Check the top up and bottom down ways
    public static int coinChangeDP(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    //Greedy is not optimal
    public static int coinChangeGreedy(int[] coins, int amount) {
        List<Integer> ans=new ArrayList<Integer>();
        Arrays.sort(coins);
        // Traverse through all denomination
        for (int i = coins.length - 1; i >= 0; i--) {
            // Find denominations
            while (amount >= coins[i]) {
                amount -= coins[i];
                ans.add(coins[i]);
            }
        }

//        // Print result
//        for (int i = 0; i < ans.size(); i++)
//            System.out.println(ans.get(i)+ "  ");
        return ans.size();
    }

    public static boolean wordBreakGreedy(String input, String[] wordDict) {

        if (!lookup.containsKey(input.charAt(0)))
            return false;

        for (int i = 0; i < input.length(); i++) {
            if (lookup.containsKey(input.charAt(i))) {
                ArrayList<String> wordsStartingWith = lookup.get(input.charAt(i));
                for (String wordStartingWith : wordsStartingWith) {
                    if (input.length() >= wordStartingWith.length() && wordStartingWith.equals(input.substring(i, wordStartingWith.length()))) {
                        if (input.substring(i + wordStartingWith.length()).length() == 0) //end of string
                            return true;
                        else if (wordBreakGreedy(input.substring(i + wordStartingWith.length()), wordDict))
                            return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static HashMap<Character, ArrayList> getLookup(String[] wordDict) {
        HashMap<Character, ArrayList> lookup = new HashMap<Character, ArrayList>();
        for (String word : wordDict) {
            if (lookup.containsKey(word.charAt(0)))
                lookup.get(word.charAt(0)).add(word);
            else {
                ArrayList arrayList = new ArrayList<String>();
                arrayList.add(word);
                lookup.put(word.charAt(0), arrayList);
            }
        }
        return lookup;
    }

    public static boolean wordBreakDP(String s, Set<String> dict) {

        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;


        /* First DP
        for(int i = 1; i <= s.length(); i++){
            for(String str: dict){
                if(str.length() <= i){
                    if(f[i - str.length()]){
                        if(s.substring(i-str.length(), i).equals(str)){
                            f[i] = true;
                            break;
                        }
                    }
                }
            }
        }*/

        //Second DP
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }

//    >>>???? and for negative
    public static int combinationSum(int target, int[] nums) {

        int[] result = new int[target + 1];
        result[0] = 1;

        for (int i = 1; i <= target; ++i) {
            for (int x : nums) {
                if (i >= x) {
                    result[i] += result[i - x];
                }
            }
        }
        return result[target];
    }

    //Failed solution, error for 2,1,1,3
    public static int houseRobber(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = nums[0];
        result[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; ++i) {
            result[i] = Math.max(result[i - 1], nums[i] + result[i - 2]);
        }
        return result[nums.length - 1];
    }

    static int rob(int[] nums) {
        int[] dp = new int[10001];
        int len = nums.length;
        if (len == 0) return 0;
        else if (len == 1) return nums[0];
        else if (len == 2) return Math.max(nums[0], nums[1]);
        else {
            dp[0] = nums[0];
            dp[1] = nums[1];
            dp[2] = nums[0] + nums[2];
            for (int i = 3; i < len; i++) {
                dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
            }

            return Math.max(dp[len - 2], dp[len - 1]);
        }
    }

    public static int decodeWaysItr(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= s.length(); i++)
            if (s.charAt(i - 1) == '0')
                if (s.charAt(i-2)=='1' || s.charAt(i-2)=='2') memo[i]=memo[i - 1];
                else
                    memo[i]=0;
            else
                memo[i] = (Integer.parseInt(s.substring(i - 2, i)) <= 26 && s.charAt(i-2)!='0') ? memo[i - 1] + memo[i - 2] : memo[i - 1];

        return memo[n];
    }

//    >>>>???? do
    public static int decodeWaysRecur(String s) {

//        if(s == null || s.length() == 0) {
//            return 0;
//        }
//        int n = s.length();
//        int[] dp = new int[n+1];
//        dp[0] = 1;
//        dp[1] = s.charAt(0) != '0' ? 1 : 0;
//        for(int i = 2; i <= n; i++) {
//            int first = Integer.valueOf(s.substring(i-1, i));
//            int second = Integer.valueOf(s.substring(i-2, i));
//            if(first >= 1 && first <= 9) {
//                dp[i] += dp[i-1];
//            }
//            if(second >= 10 && second <= 26) {
//                dp[i] += dp[i-2];
//            }
//        }
//        return dp[n];
        return 0;
    }

    public static int uniquePaths(int m, int n) {
        int[] grid = new int[n];
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                if(j==0 || i==0)
                    grid[j] = 1;
                else
                    grid[j] = grid[j-1] + grid[j];
            }
        }
        return grid[n-1];
    }


}


