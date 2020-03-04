package pack;
import javafx.util.Pair;

import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static HashMap<Character, ArrayList> lookup;
    public static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    static HashMap<Integer, List<Integer>> numPaths = formNumPaths();
    static String dfsTraversalOrder = "preorder";
    static Stack<Integer> outputStack = new Stack<>();

    public static void main(String ar[]) throws IOException {


//////////// Word Dict
//        String wordDict[] = {"cats", "dog", "sand", "and", "cat","og"};
//        String wordDict[] = {"dog", "and", "cats"};
//        String wordDict[] = {"apple", "pen"};


//////////// 3 Sum
//        int arr[] = new int[]{2,-2,2,0,0};
//        System.out.println(threeSumm(arr));

///////////// Knapsack
//        int val[] = new int[]{60, 100, 120};
//        int wt[] = new int[]{10, 20, 30};
//        int  W = 50;
//        int n = val.length;
//        System.out.println(knapSack(W, wt, val, n));

//////////// Similar questions Climbing Stairs, Decode ways, Unique Paths, Fibonacci Number
//        System.out.println(climb_Stairs(0,5));

//        String s = "2302";
//        System.out.println(decodeWaysItr(s));
//        System.out.println(decodeWaysRecur(s));

        // Unique Paths I, II(has obstacles)
//        System.out.println(uniquePaths(3,2));
//        int[][] input=new int[][]{{1,1,1,1},
//                                    {1,0,1,1},
//                                    {1,1,0,1},
//                                    {1,1,1,1}};
//        int[][] input=new int[][]{{1,1,0,1}};
//        int[][] input=new int[][]{{0,1,1}};
//        System.out.println(uniquePathsII(input));
//        System.out.println(uniquePathsIIRecur(input));

//////////// Coin change
//        System.out.println(coinChangeDP(new int[]{2,3,4,5},8));
//        System.out.println(maxcoinChangeDP(new int[]{2,3,4,5},8));
//        System.out.println(numberOfPncsCoinChange(new int[]{2,3,4},7));
//        System.out.println(coinChangeGreedy(new int[]{9,6,5,1},11));

//////////// Wordbreak
//        lookup=getLookup(wordDict);
//        System.out.println(wordBreak("catsandog",wordDict));

//        Set<String> stringSet=new HashSet<String>();
//        stringSet.add("cat");
//        stringSet.add("and");
//        stringSet.add("dog");
//        stringSet.add("cats");
//        System.out.println(wordBreakDP("catsanddog",stringSet));

//////////// Permute I II, Subsets I II, CombinationSum I II IV, Palindrome partitioning

//        Print all permutations of the array
//        System.out.println(permute1ByTempList(new int[]{1,1,2}));
//        System.out.println(permute1BySwapping(new int[]{1,1,2}));
//        System.out.println(permuteUniqueByTempList(new int[]{1,1,2}));
//        System.out.println(permuteUniqueBySwapping(new int[]{1,1,2}));
//        System.out.println(pncArrayQueue(new int[]{1,2,3}));
//
//        Subsets
//        System.out.println(subsets1(new int[]{1,2,3}));
//        System.out.println(subsetsWithDup(new int[]{1,2,3}));

//        System.out.println(combinationSum1(new int[]{2,3,6,7},7));
//        System.out.println(combinationSum1(new int[]{1,2,3},4));
//        System.out.println(combinationSum2(3,new int[]{1,2,3}));
//        System.out.println(combinationSum4Backtrack(new int[]{2,3,6,7},7));
//        System.out.println(combinationSum4DP(7,new int[]{2,3,6,7}));

//        Palindrome partitioning
//        System.out.println(partition("aab"));



//////////// House robber I & II
//        System.out.println(rob(new int[]{2,1,1,3}));


//        House robber II - circular rob
//        int[] nums=new int[]{2,1,1,3};
//        System.out.println(Math.max(rob(Arrays.copyOfRange(nums, 0,nums.length-1)),
//                                    rob(Arrays.copyOfRange(nums, 1,nums.length))));

//////////// Can Jump
//        System.out.println(canJump(new int[]{2,3,1,1,4},0));
//        System.out.println(minCanJump(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9},0,new int[]{0,0,0,0,0,0,0,0,0,0,0}));
//        System.out.println(minCanJumpConstantSpace(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9},0));
//        System.out.println(canJumpItr(new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}));
//        System.out.println(canJumpItr(new int[]{1, 3, 0, 1,2,3}));

//////////// Telephone knight

//        System.out.println(telephoneKnight(1,3));
//        System.out.println(telephoneKnightDP(1,2));
//        System.out.println(knightDialerDP(3));

//////////// Longest Palindromic Substring
//        Find substrings of those with >= 2 occurences.

//         Expand around the center
//        System.out.println(longestPalindromeSubstring("ababa"));
//        System.out.println(longestPalindromeSubstring("aaa"));
//        System.out.println(longestPalindromeSubstring("abc"));

//////////// Length Of Longest Non-repeating Substring
//        T = O(n) optimised sliding window with hashmap
//        System.out.println(lengthOfLongestNonRepeatingSubstring("abca"));

//////////// Letter combinations
//        System.out.println(letterCombinations("23").size());
//        System.out.println(letterCombinations("23"));

//////////// ATOI
//        System.out.println(myAtoi("2147483648"));

//////////// Median of Sorted Arrays
//        System.out.println(findMedianSortedArrays(new int[]{1,2,4},new int[]{2,5}));

//////////// merge K Lists and Merge Two Sorted Lists
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
//        listNodes[0]=l4;
//        listNodes[1]=l1;
//        listNodes[2]=l7;
////        ListNode head=mergeKLists(listNodes);
//        ListNode head=mergeKListsMyTest(listNodes);
//        while(head!=null)
//        {
//            System.out.print(head.val+" ");
//            head=head.next;
//        }

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

//////////// Detect cycle in a list
//        visited nodes and 2 pointer. visited 2ptr already in 2ptr list or in 1ptr list

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

//////////// Merge intervals
        //Check graph solution for
//        merge();

//////////// Meeting Rooms II
//        Interval[] intervals=new Interval[3];
//        intervals[0]=new Interval(6,10);
//        intervals[1]=new Interval(3,19);
////        intervals[2]=new Interval(11,30);
////        intervals[3]=new Interval(8,12);
////        intervals[4]=new Interval(10,20);
//        intervals[2]=new Interval(1,5);
//        System.out.println(minMeetingRooms(intervals));

//////////// Unique Paths III - 4 directions
//        int[][] grid=new int[5][5];
//        int[][] grid=new int[4][4];
//        int[][] grid=new int[3][3];
//        grid[0]=new int[]{1,0,0};
//        grid[1]=new int[]{0,2,0};
//        grid[2]=new int[]{0,0,0};
//        grid[0]=new int[]{1,0,0,0};
//        grid[1]=new int[]{0,0,0,0};
//        grid[2]=new int[]{0,0,0,0};
//        grid[3]=new int[]{0,0,2,0};
//        grid[0]=new int[]{1,0,0,0,0};
//        grid[1]=new int[]{0,0,0,0,0};
//        grid[2]=new int[]{0,0,0,0,0};
//        grid[3]=new int[]{0,0,2,0,0};
//        grid[4]=new int[]{0,0,0,2,0};
//        Long startTime=System.currentTimeMillis();
////        System.out.println(UniquePathsIIIRecur.uniquePathsIII(grid));
//        System.out.println(UniquePathsIIIDP.uniquePathsIII(grid));
//        System.out.println(UniquePathsIIIDPMyWay.uniquePathsIII(grid));
//        System.out.println(System.currentTimeMillis()-startTime);

//////////// N Queens Backtracking
//        Long start=System.currentTimeMillis();
////        System.out.println(NQueenHashSet.solveNQueens(4));
//        System.out.println(NQueenBoolArray.solveNQueens(4)); //faster, boolean arrays are faster than HashSets
//        System.out.println((System.currentTimeMillis()-start) + "ms");

//////////// Set Zeroes
//        int[][] matrix=new int[2][3];
//        matrix[0][0]=0;
//        matrix[0][1]=2;
//        matrix[0][2]=0;
//        matrix[1][0]=3;
//        matrix[1][1]=4;
//        matrix[1][2]=5;
//        setZeroes(matrix);

//////////// Spiral Matrix I and II
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
//        generateMatrix(4);

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

//////////// Max Depth BT
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(maxDepthStack(t1));
//        System.out.println(maxDepthRecur(t1));

//////////// Same tree
//        TreeNode t5 = new TreeNode(7, null, null);
//        TreeNode t4 = new TreeNode(15, null, null);
//        TreeNode t3 = new TreeNode(20, t4, t5);
//        TreeNode t2 = new TreeNode(9, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(isSameTreeRecur(t1, t1));
//        System.out.println(isSameTreeQueue(t1, t1));

//////////// Max Path sum BT
//        TreeNode t4 = new TreeNode(-4, null, null);
//        TreeNode t5 = new TreeNode(-5, null, null);
//        TreeNode t3 = new TreeNode(-3, t4, null);
//        TreeNode t2 = new TreeNode(-1, null, t5);
//        TreeNode t1 = new TreeNode(-2, t2, t3);
//        System.out.println(MaxPathBT.maxPathSum(t1));

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

//////////// Tree From Preorder & Inorder
//        int[] preorder=new int[]{3,9,20,15,7};
//        int[] inorder=new int[]{9,3,15,20,7};
//        TreeFromPreorderInorder.buildTree(preorder,inorder);


//////////// Subtree of Another Tree
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

//////////// Validate BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
////        System.out.println(isValidBSTRecur(t1,null,null));
////        System.out.println(isValidBSTInorder(t1));
////        System.out.println(ValidBSTIterative.isValidBSTIterative(t1));
//        int[] inorderlastElement = new int[]{Integer.MIN_VALUE};
//        System.out.println(isValidBSTInorderArray(t1,inorderlastElement));


//////////// kth Smallest element in BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(kthSmallestIter(t1,4));
//        System.out.println(kthSmallestRecur(t1,4));

//////////// Insert & Delete BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        TreeNode result=insertIntoBST(t1,2);
//        result=deleteBST(t1,2);

//////////// kth Smallest element in BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        System.out.println(lowestCommonAncestorIter(t1,t3,t4).val);
//        System.out.println(lowestCommonAncestorRecur(t1,t3,t4).val);

//////////// Longest Repeating Character Replacement
//        String s="AABABBA";
//        String s="ACDBBEFAGHIJA";
//        String s="abaaaabbcde";
//        System.out.println(characterReplacement(s,1));

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

//        LRUCacheLHM cache=new LRUCacheLHM(2);
//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        cache.put(4, 4);    // evicts key 1
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4

//////////// Group Anagrams
//        String[] strs=new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
//        System.out.println(groupAnagrams(strs));

//////////// Valid Parenthesis
//        String strs="{[}]";
//        String strs="(([]){})";
//        System.out.println(isValidParenthesis(strs));

//////////// Count Palindromes
//        String s="babbab";
//        System.out.println(longestPalindromeSubstring(s));
//        System.out.println(countPalindromeSubstrings(s));
//        System.out.println(countPalindromeSubstringsManachersAlgo(s));

//////////// Insert location in array
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
//        String inputString=bufferedReader.readLine();
//        Integer[] input=new Integer[inputString.split(",").length];
//        int i=0;
//        for(String s :inputString.split(","))
//        {
//            input[i]=Integer.parseInt(s);
//            i++;
//        }
//        System.out.println(insertLocation(input,13));
//        System.out.println(insertLocation(input,8));

//////////// Clone graph
//        UndirectedGraphNode n1=new UndirectedGraphNode(1);
//        UndirectedGraphNode n2=new UndirectedGraphNode(2);
//        UndirectedGraphNode n3=new UndirectedGraphNode(3);
//        UndirectedGraphNode n4=new UndirectedGraphNode(4);
//        n1.neighbors.add(n2);
//        n1.neighbors.add(n4);
//        n2.neighbors.add(n3);
//        n2.neighbors.add(n1);
//        n3.neighbors.add(n2);
//        n3.neighbors.add(n4);
//        n4.neighbors.add(n3);
//        n4.neighbors.add(n1);
//        HashMap<Integer, UndirectedGraphNode> visited=new HashMap<>();
//        UndirectedGraphNode clone=clone(n1,visited);

//////////// Course scheduling
//        int[][] pre=new int[2][2];
//        pre[0][0]=1;
//        pre[0][1]=0;
//        pre[1][0]=1;
//        pre[1][1]=2;
//        System.out.println(canFinishDFS(3,pre));
//        System.out.println(canFinishBFS(3,pre));

//////////// Graph traversals - DFS, BFS
//        UndirectedGraphNode n1=new UndirectedGraphNode(1);
//        UndirectedGraphNode n2=new UndirectedGraphNode(2);
//        UndirectedGraphNode n3=new UndirectedGraphNode(3);
//        UndirectedGraphNode n4=new UndirectedGraphNode(4);
//        n1.neighbors.add(n2);
//        n1.neighbors.add(n4);
//        n2.neighbors.add(n3);
//        n2.neighbors.add(n1);
//        n3.neighbors.add(n2);
//        n3.neighbors.add(n4);
//        n4.neighbors.add(n3);
//        n4.neighbors.add(n1);
//        HashSet<Integer> visited =new HashSet<>();
//        System.out.println(graphDFS(n1,visited,3));
//        visited.clear();
//        Queue<UndirectedGraphNode> queue=new LinkedList<>();
//        queue.add(n1);
//        System.out.println(graphBFS(queue,visited,3));

//////////// Topological sort

//        HashMap<Integer, UndirectedGraphNode> graphNodeHashMap= new HashMap<>();
//        graphNodeHashMap.put(5,new UndirectedGraphNode(5));
//        graphNodeHashMap.put(6,new UndirectedGraphNode(6));
//        graphNodeHashMap.put(7,new UndirectedGraphNode(7));
//        graphNodeHashMap.put(8,new UndirectedGraphNode(8));
//        graphNodeHashMap.put(9,new UndirectedGraphNode(9));
//        graphNodeHashMap.put(10,new UndirectedGraphNode(10));
//        graphNodeHashMap.put(11,new UndirectedGraphNode(11));
//        GraphNode graphNode=new GraphNode(graphNodeHashMap);
//        graphNode.addEdge(5,6);
//        graphNode.addEdge(6,8);
//        graphNode.addEdge(6,7);
//        graphNode.addEdge(8,9);
//        graphNode.addEdge(7,8);
//        graphNode.addEdge(7,10);
//        topologicalSort(graphNodeHashMap);
//        while(!outputStack.isEmpty()){
//            System.out.println(outputStack.pop());
//        }


//////////// Word Search II

//        char[][] input=new char[2][2];
//        input[0][0]='a';
//        input[0][1]='b';
//        input[1][0]='c';
//        input[1][1]='d';
        //ab
        //cd
//        wordDict.add("ca");

//        char[][] input=new char[3][3];
//        input[0][0]='a';
//        input[0][1]='b';
//        input[0][2]='c';
//        input[1][0]='d';
//        input[1][1]='e';
//        input[1][2]='f';
//        input[2][0]='g';
//        input[2][1]='h';
//        input[2][2]='i';
//        abc
//        def
//        ghi
//        wordDict.add("hfc");

//        char[][] input=new char[4][4];
//        input[0][0]='o';
//        input[0][1]='a';
//        input[0][2]='a';
//        input[0][3]='n';
//        input[1][0]='e';
//        input[1][1]='t';
//        input[1][2]='a';
//        input[1][3]='e';
//        input[2][0]='i';
//        input[2][1]='h';
//        input[2][2]='k';
//        input[2][3]='r';
//        input[3][0]='i';
//        input[3][1]='f';
//        input[3][2]='l';
//        input[3][3]='v';
//        findWords(input,new String[]{"oath","pea","eat","rain"});
//        wordDict.add("oath");
//        wordDict.add("pea");
//        wordDict.add("eat");
//        wordDict.add("rain");
//
//        wordSearchII(input,visited,wordDict);
//        List<String> res=wordSearchIITrie(input,new String[]{"oath","pea","eat","rain"});


//////////// Peak element
//        System.out.println(findPeakElement(new int[]{3,2,3,5,6,7,8,9,10}));

//////////// Alien Dictionary
//    String[] words=new String[]{"wrt","wrf","er","ett","rftt","rf"};
//    String[] words=new String[]{"z","x"};
//    String[] words=new String[]{"z","x","z"};
//    String[] words=new String[]{"z","z"};
//    String[] words=new String[]{"zy","zx"};
//    String[] words=new String[]{"ac","ab","b"};
//    String[] words=new String[]{"vlxpwiqbsg","cpwqwqcd"};
//
//        System.out.println(alienDictionary(words));
//        System.out.println(alienOrder(words));

//////////// Number of islands
//        int[][] grid=new int[][]{{1,1,0,1,1}, {0,0,1,1,1}};
//        int[][] grid = new int[][]{{1, 1, 0, 0, 0},
//                                    {1, 1, 0, 0, 0},
//                                    {0, 0, 1, 0, 0},
//                                    {0, 0, 0, 1, 1}};
//
//        char[][] grid2 = new char[][]{{'1', '1', '0', '0', '0'},
//                                        {'1', '1', '0', '0', '0'},
//                                        {'0', '0', '1', '0', '0'},
//                                        {'0', '0', '0', '1', '1'}};
//        System.out.println(numIslandsDFSMyWay(grid));
//        System.out.println(numIslandsDFSMyWay(grid));
//        System.out.println(numIslandsDFS(grid2));
//        System.out.println(numIslandsBFS(grid2));

//////////// Pacific Atlantic
//        int[][] grid = new int[][]{{1,2,2,3,5},
//                                    {3,2,3,4,4},
//                                    {2,4,5,3,1},
//                                    {6,7,1,4,5},
//                                    {5,1,1,2,4}};
//        int[][] grid = new int[][]{{9,9,9,9,9},
//                                    {9,2,3,4,9},
//                                    {9,4,5,3,9},
//                                    {9,7,1,4,9},
//                                    {9,9,9,9,9}};
//        int[][] grid = new int[][]{{1,3,4},
//                                    {5,1,0},
//                                    {4,1,2}};
//        System.out.println(pacificAtlantic(grid));

//////////// Number of connected components
//        int[][] edges=new int[][]{{1, 2}, {3, 4},{0, 1}};
//        int[][] edges=new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}};
//        int[][] edges=new int[][]{{5, 4}, {1, 0}, {2, 0}, {3, 0}};
//        int[][] edges=new int[][]{{0,1},{1,2},{0,2},{3,4}};
//        int[][] edges=new int[][]{{2,3},{1,2},{1,3}};
//        int[][] edges=new int[][]{{0,3},{0,2},{0,1}};
//        int[][] edges=new int[][]{{0,3},{0,2}};
//        countComponentsDFS(4,edges);
//        System.out.println(connectedComponentsCount);
//        System.out.println(countComponentsUnionFind(4,edges));

//////////// Longest increasing subsequence
//        System.out.println(LIS(0,new int[]{20,5,40,6,7,8}));
//        System.out.println(LisDP(new int[]{20,5,40,6,7,8}));
//        System.out.println(lengthOfLIS(new int[]{20,5,40,6,7,8}));
//        System.out.println(lengthOfLIS(new int[]{0,7,5,6}));

//////////// Longest common subsequence or delete operation for two strings
//        System.out.println(longestCommonSubsequence("seat","ocean"));
//        System.out.println(minDistance("seat","ocean"));

//////////// basic calculator I II
//        System.out.println(calculateI("(7-(8+9+10))"));
//        System.out.println(calculateI("1+1"));

//        System.out.println(calculateII("5+20/2/5-1*4*6/2*2"));
//        System.out.println(calculateII("5-20+1+3+4"));

//////////// Pretty print JSON
//        prettyPrint("{\"key\\\"1\":\"val1\",\"key2\":[\"item1\",{\"item2key\":1.2}]}");
//        prettyPrint("{\"a\":\"b\",\"c\":\"d\"}");
//        prettyPrint("{\"id\": \"0001\", \"type\": \"donut\", \"name\": \"Cake\", \"ppu\": 0.55, \"batters\":{\"batter\":[{ \"id\": \"1001\", \"type\": \"Regular\" },{ \"id\": \"1002\", \"type\": \"Chocolate\" }]},\"topping\":[{ \"id\": \"5001\", \"type\": \"None\" },{ \"id\": \"5002\", \"type\": \"Glazed\" }]}");

//////////// Search in sorted array of unknown size
//        System.out.println(search(,9));

//////////// Binary tree right side view
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        rightSideViewDFS(t1);

//////////// Asteroid collision
//        int[] output;
//        output=asteroidCollisionStack(new int[]{10, 2, -5});
//        output=asteroidCollisionStack(new int[]{-10,40,35,10,2,-30,-10,-20,-40});
//        output=asteroidCollisionArray(new int[]{-10,40,35,10,2,-30,-10,-20});
//        for (int i : output)
//            System.out.print(i+" ");


//////////// Serialize and deserialize a n-ary tree
//        Node t6 = new Node(6);
//        Node t5 = new Node(5);
//        Node t4 = new Node(4);
//        Node t3 = new Node(3);
//        Node t2 = new Node(2);
//        Node t1 = new Node(1);
//        t1.children.add(t2);
//        t1.children.add(t3);
//        t1.children.add(t4);
//        t3.children.add(t5);
//        t3.children.add(t6);
//        Node result=deserializeNaryTree(serialize(t1));


//////////// Search a 2D Matrix II
//        int[][] matrix=new int[][]{{1,4,7,11,15},
//                                    {2,5,8,12,19},
//                                    {3,6,9,16,22},
//                                    {10,13,14,17,24},
//                                    {18,21,23,26,30}};
//        System.out.println(searchIn2DMatrix(matrix,5));

//////////// Implement a trie
//        implementTrie();

//////////// Search in rotated sorted array
//        System.out.println(searchInRotatedSortedArray(new int[]{4,5,6,7,0,1,2,3},6));

//        PriorityQueue<Integer> priorityQueue=new PriorityQueue<Integer>((a,b) -> {return -(a-b);});
//        priorityQueue.add(4);
//        priorityQueue.add(5);
//        KthLargestPQ kthLargestPQ=new KthLargestPQ(3,new int[]{4,5,8,2});
//        System.out.println(kthLargestPQ.add(3));  // returns 4
//        System.out.println(kthLargestPQ.add(5));  // returns 5
//        System.out.println(kthLargestPQ.add(10));  // returns 5
//        System.out.println(kthLargestPQ.add(9));  // returns 8
//        System.out.println(kthLargestPQ.add(4));  // returns 8

//        KthLargest kthLargest=new KthLargest(3,new int[]{5,4,8,2});
//        System.out.println(kthLargest.add(3));  // returns 4
//        System.out.println(kthLargest.add(5));  // returns 5
//        System.out.println(kthLargest.add(10));  // returns 5
//        System.out.println(kthLargest.add(9));  // returns 8
//        System.out.println(kthLargest.add(4));  // returns 8


//////////// Copy List with Random pointer
//        RandomListNode l1=new RandomListNode(1);
//        RandomListNode l2=new RandomListNode(2);Josef John
//        RandomListNode l3=new RandomListNode(3);
//        l1.next=l2;
//        l1.random=l3;
//        l2.next=l3;
//        l2.random=l2;
//        RandomListNode result=copyRandomList(l1);

//////////// Product of array except self
//        productExceptSelf(new int[]{1,2,3,4});

//////////// Odd even list
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
//        ListNode l5=new ListNode(5);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
//        oddEvenList(l1);

//////////// Zig Zag iterator
//        List<Integer> list1=Arrays.asList(1,2,3,4,5);
//        List<Integer> list2=Arrays.asList(5,6,7,8,9);
//        List<Integer> list3=Arrays.asList(10,11,12,13,14,15);
//        List<Integer> list4=Arrays.asList(16,17,18,19,20);
//        List<List<Integer>> lists=new ArrayList<>();
//        lists.add(list1);
//        lists.add(list2);
//        lists.add(list3);
//        lists.add(list4);
//        ZigzagIterator zigzagIterator=new ZigzagIterator(lists);
//        while (ZigzagIterator.hasNext())
//        {
//            System.out.println(ZigzagIterator.next());
//        }

//////////// Isomorphic strings
//        System.out.println(isIsomorphic("egg","add"));
//        System.out.println(isIsomorphic("egd","add"));

//////////// Print repeating elements
//        printRepeating(new int[]{1, 2, 3, 1, 3, 6, 6});

//////////// Hit Counter
//        HitCounterTreeMapMyWay counter = new HitCounterTreeMapMyWay();
//        counter.hit(1);
//        counter.hit(2);
//        counter.hit(3);
//        System.out.println(counter.getHits(4));
//        counter.hit(300);
//        System.out.println(counter.getHits(300));
//        System.out.println(counter.getHits(301));
//        System.out.println(counter.getHits(350));
//        System.out.println(counter.getHits(2));
//
//
//        System.out.println(counter.getHits(100));
//        System.out.println(counter.getHits(200));
//        System.out.println(counter.getHits(300));
//        counter.hit(300);
//        counter.hit(401);
//        System.out.println(counter.getHits(402));


//        HitCounterTreeMap counter2 = new HitCounterTreeMap();
//        counter2.hit(1);
//        counter2.hit(2);
//        counter2.hit(3);
//        System.out.println(counter2.getHits(4));
//        counter2.hit(300);
//        System.out.println(counter2.getHits(300));
//        System.out.println(counter2.getHits(301));
//        System.out.println(counter2.getHits(350));
//        System.out.println(counter2.getHits(2));


//////////// Binary tree coloring game
//        TreeNode t11 = new TreeNode(11, null, null);
//        TreeNode t10 = new TreeNode(10, null, null);
//        TreeNode t9 = new TreeNode(9, null, null);
//        TreeNode t8 = new TreeNode(8, null, null);
//        TreeNode t7 = new TreeNode(7, null, null);
//        TreeNode t6 = new TreeNode(6, null, null);
//        TreeNode t5 = new TreeNode(5, t10, t11);
//        TreeNode t4 = new TreeNode(4, t8, t9);
//        TreeNode t3 = new TreeNode(3, t6, t7);
//        TreeNode t2 = new TreeNode(2, t4, t5);
//        TreeNode t1 = new TreeNode(1, t2, t3);
//        System.out.println(btreeGameWinningMove(t1,11,3));

//////////// Buy sell stocks
//        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));

//////////// Trapping rain water
//        System.out.println(trap2Pointers(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(trapStack(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(trapDP(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

//////////// K closest points to origin
//        int[][] output=kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
//        System.out.println(output[0].toString());
//        System.out.println(Arrays.asList(output[1]));

//////////// Number to words
//        NumberToWords numberToWords=new NumberToWords();
//        System.out.println(numberToWords.numberToWords(123456));

//////////// Remove invalid parentheses
//        HashSet output=new HashSet();
////        String s="()())()";
//        String s="o(()()()m()((()t";
////        String s=")(a";
//        String s="(()";
//        maxValidString= validParenthesisCount(s);
//        long startTime=System.currentTimeMillis();
//        removeParentheses(new StringBuffer(),output,s.toCharArray(),0,0,0);
//        System.out.println(output);
//        System.out.println("time taken for output "+(System.currentTimeMillis()-startTime));
//        removeInvalidParentheses(s);


//////////// Merge sorted arrays
//        int[] nums1=new int[]{1,2,3,0,0,0};
//        mergeSortedArrayFromEnd(nums1,3,new int[]{2,5,6},3);

//////////// Next permutation
//        int[] input=new int[]{1,5,8,4,7,6,5,3,1};
//        nextPermutation(input);

//////////// Interval list intersections
//        int[][] a = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
//        int[][] b = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
//        int[][] output= intervalIntersection(a, b);

//////////// Shortest distance to a character
//        int[] output = shortestToChar("loveleetcode", 'e');
//        shortestToCharMyWay("loveleetcode", 'e');
//        shortestToCharMyWay("aaab", 'b');
//        shortestToCharMyWay("tonee", 'n');
//        shortestToCharFastest("tonee", 'n');

//////////// Boundary of binary tree
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(3);
//        TreeNode t4=new TreeNode(4);
//        TreeNode t5=new TreeNode(5);
//        TreeNode t6=new TreeNode(6);
//        TreeNode t7=new TreeNode(7);
//        t1.right=t3;
//        t1.left=t2;
//        t2.left=t4;
//        t2.right=t5;
//        t3.left=t6;
//        t3.right=t7;

//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(3);
//        TreeNode t4=new TreeNode(4);
//        TreeNode t5=new TreeNode(5);
//        TreeNode t6=new TreeNode(6);
//        TreeNode t7=new TreeNode(7);
//        TreeNode t8=new TreeNode(8);
//        TreeNode t9=new TreeNode(9);
//        TreeNode t10=new TreeNode(10);
//        t1.right=t3;
//        t1.left=t2;
//        t2.right=t5;
//        t2.left=t4;
//        t3.left=t6;
////        t3.right=t7;
//        t5.left=t7;
//        t5.right=t8;
//        t6.left=t9;
//        t6.right=t10;

//        System.out.println(boundaryOfBinaryTreeMyWay(t1));
//        List<Integer> nodes = new ArrayList<>();
//        System.out.println(boundaryOfBinaryTree2Iterations(t1,nodes));
//        System.out.println(boundaryOfBinaryTreePreOrder(t1));
//        System.out.println(boundaryOfBinaryTreeMyWayOnePass(t1));
//        System.out.println(boundaryOfBinaryTreeOnePass(t1));

//////////// Add and search word
//        WordDictionary wordDictionary=new WordDictionary();
//        wordDictionary.addWord("bad");
//        wordDictionary.addWord("dad");
//        wordDictionary.addWord("mad");
//        System.out.println(wordDictionary.search("pad"));
//        System.out.println(wordDictionary.search("bad"));
//        System.out.println(wordDictionary.search(".ad"));
//        System.out.println(wordDictionary.search("b.."));

//////////// Symmetric tree
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(2);
//        TreeNode t4=new TreeNode(3);
//        TreeNode t5=new TreeNode(3);
//        t1.right=t3;
//        t1.left=t2;
//        t2.right=t4;
//        t3.left=t5;
//        System.out.println(isSymmetricRecursive(t1,t1));
//        System.out.println(isSymmetricIterative(t1));

//////////// Detect cycle start
//        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l2;
//        ListNode output = detectCycle(l1);

//////////// Median of stream
//        MedianFinder.addNum(1);
//        MedianFinder.addNum(2);
//        System.out.println(MedianFinder.findMedian()); // 1.5
//        MedianFinder.addNum(3);
//        System.out.println(MedianFinder.findMedian()); // 2

//////////// Reorder data in log files
//        String[] output = reorderLogFiles(new String[]{"dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art aero"});

//////////// Optimal Utilization
//        List<int[]> a = new ArrayList<>();
//        a.add(new int[]{1, 5});
//        a.add(new int[]{2, 5});
//        List<int[]> b = new ArrayList<>();
//        b.add(new int[]{1, 5});
//        b.add(new int[]{2, 5});
//        List<int[]> output = getPairs(a, b, 10);

//////////// Minimum cost to connect sticks
//        System.out.println(connectSticks(new int[]{2,4,3}));

//////////// Treasure island II
//        treasureIslandII(new char[][]{});


//////////// 01 Matrix
//        int[][] input=new int[][]{{1,1,1},{0,1,0},{1,1,1}};
//        int[][] output=o1MatrixDP(input);
//        output=o1MatrixBFS(input);


//////////// Lemonade change
//        System.out.println(lemonadeChange(new int[]{5,5,5,10,20}));


//////////// Backspace compare
//        System.out.println(backspaceCompare("ab##","c#d#"));

//////////// Min stack
//        MinStack.push(-2);
//        MinStack.push(0);
//        MinStack.push(-3);
//        MinStack.getMin();   // Returns -3.
//        MinStack.pop();
//        MinStack.top();      // Returns 0.
//        MinStack.getMin();   // Returns -2.


//////////// Word ladder
//        System.out.println(ladderLengthBFS("hit","cog",Arrays.asList("hot","dot","dog","lot","log","cog")));
//        System.out.println(ladderLengthBiBFS("hit","cog",Arrays.asList("hot","dot","dog","lot","log","cog")));

//////////// LFU cache
//        LFUCache cache = new LFUCache( 2 /* capacity */ );

//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));       // returns 1
//        cache.put(3, 3);    // evicts key 2
//        System.out.println(cache.get(2));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3.
//        cache.put(4, 4);    // evicts key 1.
//        System.out.println(cache.get(1));       // returns -1 (not found)
//        System.out.println(cache.get(3));       // returns 3
//        System.out.println(cache.get(4));       // returns 4

//        cache.put(1, 1);
//        cache.put(2, 2);
//        System.out.println(cache.get(1));
//        System.out.println(cache.get(2));
//        System.out.println(cache.get(2));
//        System.out.println(cache.get(1));
//        cache.put(3, 3);
//        cache.put(2, 2);

//////////// Critical connections
//        Bridges bridges=new Bridges();
//        System.out.println(bridges.findBridges(5,new int[][]{{1, 2}, {1, 3}, {3, 4}, {1, 4}, {4, 5}}));
//        System.out.println(bridges.findBridges(9,new int[][]{{1, 2}, {1, 3}, {2, 3}, {3, 4}, {3, 6}, {4, 5}, {6, 7}, {6, 9}, {7, 8}, {8, 9}}));

//        CriticalConnections criticalConnections=new CriticalConnections();
//        List<List<Integer>> lists=new ArrayList<>();
//        lists.add(Arrays.asList(1,2));
//        lists.add(Arrays.asList(1,3));
//        lists.add(Arrays.asList(3,4));
//        lists.add(Arrays.asList(1,4));
//        lists.add(Arrays.asList(4,5));

//        lists.add(Arrays.asList(1,2));
//        lists.add(Arrays.asList(1,3));
//        lists.add(Arrays.asList(2,3));
//        lists.add(Arrays.asList(3,4));
//        lists.add(Arrays.asList(3,6));
//        lists.add(Arrays.asList(4,5));
//        lists.add(Arrays.asList(6,7));
//        lists.add(Arrays.asList(6,9));
//        lists.add(Arrays.asList(7,8));
//        lists.add(Arrays.asList(8,9));

//        System.out.println(criticalConnections.criticalConnections(9,lists));

//////////// Find closest fibonacci index
//        TreeMap<Integer,Integer> fibToIndex=new TreeMap<>();
//        System.out.println(findClosestFibTreeMap(5, fibToIndex));
//        System.out.println(findClosestFibTreeMap(14, fibToIndex));


////////////  Path With Maximum Minimum Value
//        System.out.println(maximumMinimumPath(new int[][]{{5,4,5},{1,2,6},{7,4,6}}));

//////////// All paths from source to target
//        System.out.println(allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}}, 0));

//////////// construct BST and find distance
//        System.out.println(bstDistance(new int[]{3,1,2,5,4,6},1,6));

//////////// Max score sight seeing
//        System.out.println(maxScoreSightSeeingPair(new int[]{8,1,5,2,6}));

//////////// Connecting cities with Min cost,
//        MinCostMST minCostMST=new MinCostMST();
//        System.out.println(minCostMST.minimumCost(3,new int[][]{{1,2,5},{1,3,6},{2,3,1}}));

//////////// Prison cells after n days
//        int[] input=new int[]{0,1,0,1,1,0,0,1};
//        int[] output=new int[input.length];
//        output=prisonAfterNDays(input,8);

//////////// Number of Music Playlists
//        List<List<Integer>> output=new ArrayList<>();
//        numMusicPlaylistsMyway(3,3,3,new ArrayList(),output,new HashMap<Integer, Integer>());
//        System.out.println(numMusicPlaylists(2,3,1));

//////////// Min moves to equal array
//        System.out.println(minMovesSort(new int[]{1,3,5,10}));
//        System.out.println(minMovesMyWay2Pass(new int[]{1,3,5,10}));
//        System.out.println(minMovesMyWay1Pass(new int[]{1,3,5,10}));
//        System.out.println(minMovesSort(new int[]{1,2,3}));
//        System.out.println(minMovesMyWay2Pass(new int[]{1,2,3}));
//        System.out.println(minMovesMyWay1Pass(new int[]{1,2,3}));

//////////// Special Binary String
//        TreeMap<String, String> map=new TreeMap<>((a,b)->{return a.compareTo(b);});
//        map.put("2,5","1100");
//        map.put("0,1","10");

//        largestNumber="11011000";
//        largestNumber="101101011000";
//        largestNumber="101100101100";
//        System.out.println(makeLargestSpecialMyWayRecur(largestNumber));
//        largestNumber="11011000";
//        largestNumber="101101011000";
//        largestNumber="101100101100";
//        System.out.println(makeLargestSpecialMyWayIter(largestNumber));
//        System.out.println(makeLargestSpecial(largestNumber));

//////////// Text justification
//        String[] input =new String[]{"This", "is", "an", "example", "of", "text", "justification."};
//        System.out.println(fullJustify(input,16));


//////////// Regular Expression Matching
//        System.out.println(isMatchMyWay("aab","c*a*b"));
//        System.out.println(isMatchMyWay("aa","a"));
//        System.out.println(isMatchMyWay("ab",".*"));
//        System.out.println(isMatchMyWay("mississippi","mis*is*p*."));

//        System.out.println(isMatchRecur("mississippi","mis*is*p*."));
//        System.out.println(isMatchRecur("ab",".*c"));
//        System.out.println(isMatchRecurDP("ab",".*c"));
//        System.out.println(isMatchRecurDP("mississippi","mis*is*p*."));
//        System.out.println(isMatchIterativeDP("mississippi","mis*is*p*."));
//        System.out.println(isMatchIterativeDP("aab","c*a*b"));



//////////// Reaching points
//        System.out.println(reachingPointsBackwards(1,2,3,5));
//        System.out.println(reachingPointsBackwards(2,5,7,12));
//        System.out.println(reachingPointsBackwardsModulo(2,5,7,12));

//////////// Sliding Window Maximum
//        int[] output=maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3);
//        int[] output=maxSlidingWindowMaxHeap(new int[]{1,3,-1,-3,5,3,6,7},3);
//        int[] output=maxSlidingWindowMaxHeap(new int[]{9,10,9,-7,-4,-8,2,-6},5);


//////////// Add binary
//        System.out.println(addBinary("1010","10"));
//        System.out.println(addBinaryBitManip("1010","10"));

//////////// verify alien dictionary
//        System.out.println(isAlienSorted(new String[]{"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz"));

//////////// BST to DLL
//        TreeNode t1=new TreeNode(1);
//        TreeNode t2=new TreeNode(2);
//        TreeNode t3=new TreeNode(3);
//        TreeNode t4=new TreeNode(4);
//        TreeNode t5=new TreeNode(5);
//        t4.right=t5;
//        t4.left=t2;
//        t2.right=t3;
//        t2.left=t1;
//        TreeNode treeNode=treeToDoublyList(t4);

//////////// Expression Add Operators
//        System.out.println(addOperators("1234",6));

//////////// Read N Characters Given Read4 II
//        File file("abc");
//        Solution sol;
//        sol.read(buf, 1); // After calling your read method, buf should contain "a". We read a total of 1 character from the file, so return 1.
//        sol.read(buf, 2); // Now buf should contain "bc". We read a total of 2 characters from the file, so return 2.
//        sol.read(buf, 1); // We have reached the end of file, no more characters can be read. So return 0.


//////////// Task Scheduler
//        System.out.println(leastIntervalMyWay(new char[]{'A','A','A','B','B','B'},2));
//        System.out.println(leastIntervalMyWay(new char[]{'B','B','C','D','D','E','E'},3));
//        System.out.println(leastIntervalMyWay(new char[]{'B','C','D','A','A','A','A','A','A','E','F','G'},2));
//        System.out.println(leastIntervalPQ(new char[]{'B','C','D','A','A','A','A','A','A','E','F','G'},2));

//////////// Is Graph Bipartite?
//        System.out.println(isBipartite(new int[][]{{1,3}, {0,2}, {1,3}, {0,2}}));

//////////// Exclusive Time of Functions
//        List <String> logs =new ArrayList<>(Arrays.asList(new String[]{"0:start:0","1:start:2","1:end:5","0:end:6"}));
//        List <String> logs =new ArrayList<>(Arrays.asList(
//                new String[]{"0:start:0","1:start:5","2:start:6","3:start:9","4:start:11","5:start:12","6:start:14",
//                        "7:start:15","1:start:24","1:end:29","7:end:34","6:end:37","5:end:39","4:end:40","3:end:45",
//                        "0:start:49","0:end:54","5:start:55","5:end:59","4:start:63","4:end:66","2:start:69","2:end:70",
//                        "2:start:74","6:start:78","0:start:79","0:end:80","6:end:85","1:start:89","1:end:93","2:end:96",
//                        "2:end:100","1:end:102","2:start:105","2:end:109","0:end:114"}));
//        exclusiveTime(2, logs);
//        exclusiveTimeWithoutStack(8, logs);


//////////// First bad version
//        System.out.println(firstBadVersion(2126753390));

//////////// Friends Of Appropriate Ages
//        System.out.println(numFriendRequests(new int[]{20,30,100,110,120}));
//        System.out.println(numFriendRequests(new int[]{16,16,16,17}));
//        System.out.println(numFriendRequests(new int[]{8,24,69,85,85}));
//        System.out.println(numFriendRequests(new int[]{16,17,18}));
//        System.out.println(numFriendRequests(new int[]{7,14,63,103,118}));
//        System.out.println(numFriendRequests(new int[]{16,16}));
//        System.out.println(numFriendRequestsMyWay(new int[]{16,16,16,16}));

//////////// Binary Search Tree Iterator
//        TreeNode n1=new TreeNode(7);
//        TreeNode n2=new TreeNode(3);
//        TreeNode n3=new TreeNode(15);
//        TreeNode n4=new TreeNode(9);
//        TreeNode n5=new TreeNode(20);
//        n1.right=n3;
//        n1.left=n2;
//        n3.right=n5;
//        n3.left=n4;
//        BSTIterator iterator = new BSTIterator(n1);
//        System.out.println(iterator.next());    // return 3
//        System.out.println(iterator.next());    // return 7
//        System.out.println(iterator.hasNext()); // return true
//        System.out.println(iterator.next());    // return 9
//        System.out.println(iterator.hasNext()); // return true
//        System.out.println(iterator.next());    // return 15
//        System.out.println(iterator.hasNext()); // return true
//        System.out.println(iterator.next());    // return 20
//        System.out.println(iterator.hasNext()); // return false


//////////// Simplify Path
//        System.out.println(simplifyPath("/a/../../b/../c//.//"));

//////////// Valid Number
//        System.out.println(isNumber(" 6e-1"));
//        System.out.println(isNumber(" 53.5e93"));
//        System.out.println(isNumber("e3"));

//////////// Add strings
//        System.out.println(addStrings("123","999"));

//////////// Find First and Last Position of Element in Sorted Array
//        System.out.println(searchRange(new int[]{5,6},3));
//        System.out.println(searchRange(new int[]{1,4},4));

//////////// Vertical Order Traversal of a Binary Tree
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        TreeNode n6=new TreeNode(6);
//        TreeNode n7=new TreeNode(7);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        n3.left=n6;
//        n3.right=n7;
//        System.out.println(verticalTraversal(n1));

//////////// Range Sum Query 2D - Immutable
//        int[][] matrix = new int[][]{
//                {3, 0, 1, 4, 2},
//                {5, 6, 3, 2, 1},
//                {1, 2, 0, 1, 5},
//                {4, 1, 0, 1, 7},
//                {1, 0, 3, 0, 5}
//        };
//        NumMatrixCachingRows numMatrixCachingRows = new NumMatrixCachingRows(matrix);
//        numMatrixCachingRows.sumRegion(2, 1, 4, 3);
//        numMatrixCachingRows.sumRegion(1, 1, 2, 2);
//        numMatrixCachingRows.sumRegion(1, 2, 2, 4);

//        NumMatrixCachingSmarter numMatrixCachingSmarter = new NumMatrixCachingSmarter(matrix);
//        numMatrixCachingSmarter.sumRegion(2, 1, 4, 3);
//        numMatrixCachingSmarter.sumRegion(1, 1, 2, 2);
//        numMatrixCachingSmarter.sumRegion(1, 2, 2, 4);


//////////// Reorganize String
//        System.out.println(reorganizeString("aab"));

//////////// Closest Binary Search Tree Value
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        n4.left=n2;
//        n4.right=n5;
//        n2.left=n1;
//        n2.right=n3;
//        System.out.println(closestValue(n4,3.7));

//////////// Longest Arithmetic Sequence
//        System.out.println(longestArithSeqLength(new int[]{9,4,7,2,10}));

//////////// All Nodes Distance K in Binary Tree
//        TreeNode n0=new TreeNode(0);
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        TreeNode n6=new TreeNode(6);
//        TreeNode n7=new TreeNode(7);
//        TreeNode n8=new TreeNode(8);
//        n3.right=n1;
//        n3.left=n5;
//        n5.left=n6;
//        n5.right=n2;
//        n1.right=n8;
//        n1.left=n0;
//        n2.left=n7;
//        n2.right=n4;
//        System.out.println(distanceK(n3,n6,3));

//////////// Check Completeness of a Binary Tree
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        TreeNode n6=new TreeNode(6);
//        TreeNode n7=new TreeNode(7);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        n3.left=n6;
//        n3.right=n7;
//        System.out.println(isCompleteTree(n1));

//////////// Accounts Merge
//        ArrayList accounts= new ArrayList<ArrayList<String>>();
//        ArrayList<String> account1=new ArrayList<>();
//        account1.add("John");
//        account1.add("johnsmith@mail.com");
//        account1.add("john00@mail.com");
//        ArrayList<String> account2=new ArrayList<>();
//        account2.add("John");
//        account2.add("johnnybravo@mail.com");
//        ArrayList<String> account3=new ArrayList<>();
//        account3.add("John");
//        account3.add("john_newyork@mail.com");
//        account3.add("johnsmith@mail.com");
//        ArrayList<String> account4=new ArrayList<>();
//        account4.add("Mary");
//        account4.add("mary@mail.com");
//        accounts.add(account1);
//        accounts.add(account2);
//        accounts.add(account3);
//        accounts.add(account4);

//        accounts.add(Arrays.asList(new String[]{"David","David0@m.co","David4@m.co","David3@m.co"}));
//        accounts.add(Arrays.asList(new String[]{"David","David5@m.co","David5@m.co","David0@m.co"}));
//        accounts.add(Arrays.asList(new String[]{"David","David1@m.co","David4@m.co","David0@m.co"}));
//        accounts.add(Arrays.asList(new String[]{"David","David0@m.co","David1@m.co","David3@m.co"}));
//        accounts.add(Arrays.asList(new String[]{"David","David4@m.co","David1@m.co","David3@m.co"}));
//        System.out.println(accountsMergeMyWay(accounts));
//        System.out.println(accountsMergeDFS(accounts));
//        System.out.println(accountsMergeUnionFindWithMaxSize(accounts));
//        System.out.println(accountsMergeUnionFind(accounts));

//////////// Insert into a Sorted Circular Linked List
//        ListNode n2=new ListNode(2);
//        ListNode n3=new ListNode(3);
//        ListNode n4=new ListNode(4);
//        n2.next=n3;
//        n3.next=n4;
//        n4.next=n2;
//        insert(n3,1);

//////////// Partition Equal Subset Sum
//        System.out.println(canPartitionTopDown(new int[]{1, 5, 11, 5}));
//        System.out.println(canPartitionTopDown(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100}));
//        System.out.println(canPartitionBottomUp(new int[]{1, 5, 11, 5}));
//        System.out.println(canPartitionBottomUp(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,100}));
//        System.out.println(canPartitionBottomUp1dArray(new int[]{1, 5, 11, 5}));

//////////// Random Pick Index
//        int[] arr=new int[]{1,2,3,3,2,3};
//        Random rand=new Random();
//        System.out.println(pick(arr,2,rand));
//        System.out.println(pick(arr,2,rand));

//////////// Strobogrammatic Number II
//        System.out.println(findStrobogrammaticRecur(3,3));

//////////// Strobogrammatic Number II
//        System.out.println(strobogrammaticInRange("9999","10000"));

//////////// Bulb Switcher
//        System.out.println(bulbSwitch(4);

//////////// Subarray sum equals k - boolean return
//        System.out.println(subarraySum(new int[]{28,54,7,-70,22,65,-6},100));
//        System.out.println(subarraySum(new int[]{1,2,4,3,1},4));
//        System.out.println(subarraySumBruteForce(new int[]{1,2,4,3,1},4));
//        System.out.println(subarraySumHM(new int[]{1,2,4,3,1},4));

//////////// Continuous Subarray Sum multiple of k - boolean return
//        System.out.println(checkSubarraySum(new int[]{2, 5, 33, 6, 7, 25, 15},13));

//////////// Maximum Sum of 3 Non-Overlapping Subarrays
//        maxSumOfThreeSubarrays(new int[]{1,2,1,2,6,7,5,1},2);

//////////// count Subarray Product Less Than K
//        System.out.println(numSubarrayProductLessThanKMyWay(new int[]{10,5,2,6}, 100));
//        System.out.println(numSubarrayProductLessThanKMyWay(new int[]{10,2,2,5,4,4,4,3,7,7}, 289));
//        System.out.println(numSubarrayProductLessThanK(new int[]{10,5}, 100));
//        System.out.println(numSubarrayProductLessThanK(new int[]{10,2,2,5,4,4,4,3,7,7}, 289));

//////////// count Substrings with exactly K distinct chars or Subarrays with K Different Integers
//        System.out.println(kDistinctSubstringsCount("pqrpqrq1",3));
//        System.out.println(kDistinctSubstringsCount("aabab",3));

//        System.out.println(subarraysWithKDistinctWindow(new int[]{1,2,1},2));
//        System.out.println(subarraysWithKDistinctWindow(new int[]{1,2,1,2,3},2));
//        System.out.println(subarraysWithKDistinctWindow(new int[]{1,2,1,3,4},3));
//        System.out.println(subarraysWithKDistinctWindow(new int[]{1,1,1,3,4,4,4},3));
//        System.out.println(subarraysWithKDistinctWindow(new int[]{1,1,3,4,4,4},3));
//        System.out.println(subarraysWithKDistinctCharWindow("pqpqs",2));
//        System.out.println(subarraysWithKDistinctCharWindow("aabab",3));
//        System.out.println(subarraysWithKDistinct(new int[]{1,2,1},2));

//////////// Substrings of size K with K distinct chars
//        System.out.println(substringSizeKWithKDistinctChars("abcabc",3));

  //////////// Max Prod Subarray
//        int arr[] = new int[]{-2,1,-1,-3,-2};
//        int arr[] = new int[]{-2,0,-1,-3,-2};
//        int arr[] = new int[]{2,3,-2,4};
//        int arr[] = new int[]{-2,0,-1};
//        int arr[] = new int[]{2,-5,-2,-4,3};
//        int arr[] = new int[]{-2,3,1,3};
//        int arr[] = new int[]{-2,0,-1};
//        int arr[] = new int[]{0,-2,0};
//        int arr[] = new int[]{2,3,-1,2};
//        System.out.println(maxProdSubArray(arr));
//        System.out.println(maxProdSubArrayMySol(arr));
//        System.out.println(maxProduct(arr));

//////////// Max Sub array sum
//        int arr[] = new int[]{-2,1,-3,4,-1,2,1,-5,4};
//        System.out.println(maxSubArrayDivideNConquer(arr, 0, arr.length - 1));
//        System.out.println(maxSubArray(arr));

//////////// Find K Closest Elements
//        System.out.println(findClosestElements(Arrays.asList(1,2,3,4,5),3,4));

//////////// Top N buzzwords
//        int numToys = 6, topToys = 2;
//        String[] toys = {"elmo", "elsa", "legos", "drone", "tablet", "warcraft"};
//        int numQuotes = 6;
//        String[] quotes = {
//                "Elmo is the hottest of the season! Elmo will be on every kid's wishlist!",
//                "The new Elmo dolls are super high quality",
//                "Expect the Elsa dolls to be tablet tablet tablet tablet very popular this year, Elsa!",
//                "Elsa and Elmo are the toys I'll be buying for my kids, Elsa is good",
//                "For parents of older kids, look into buying them a drone",
//                "Warcraft is slowly rising in popularity ahead of the holiday season"
//        };
//        popularToys(numToys,topToys,toys,quotes);

//////////// Rotting oranges
//        int[][] grid = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
//        System.out.println(orangesRotting(grid));

//////////// Search Suggestions System
//        System.out.println(suggestedProducts(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse"));
//        System.out.println(suggestedProductsWithoutTrie(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse"));
//        System.out.println(suggestedProductsBinarySearch(new String[]{"mobile","mouse","moneypot","monitor","mousepad"},"mouse"));

//////////// Maximum Average Subtree
//        Node n1=new Node(20);
//        Node n2=new Node(12);
//        Node n3=new Node(8);
//        Node n4=new Node(11);
//        Node n5=new Node(2);
//        Node n6=new Node(3);
//        Node n7=new Node(15);
//        Node n8=new Node(18);
//        n1.children.add(n2);
//        n1.children.add(n3);
//        n2.children.add(n4);
//        n2.children.add(n5);
//        n2.children.add(n6);
//        n3.children.add(n7);
//        n3.children.add(n8);
//        subtreeMaxAvg(n1);
//        System.out.println(maxSubTree);

//////////// Partition Labels
//        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));

//////////// Battleship
//        int N1 = 4;
//        String S1 = "1B 2C,2D 4D", T1 = "2B 2D 3D 4D 4A";
//        System.out.println(Arrays.toString(getResult(S1, T1)));
//        int N2 = 3;
//        String S2 = "1A 1B,2C 2C", T2 = "1B";
//        System.out.println(Arrays.toString(getResult(S2, T2)));
//        int N3 = 12;
//        String S3 = "1A 2A,12A 12A", T3 = "12A";
//        System.out.println(Arrays.toString(getResult(S3, T3)));

//////////// Generate Parentheses
//        System.out.println(generateParenthesis(3));

//////////// Shortest Word Distance II
//        WordDistance wordDistance=new WordDistance(new String[]{"practice", "makes", "perfect", "coding", "makes"});
//        System.out.println(wordDistance.shortest("makes","coding"));

//////////// Nested List Weight Sum II
//        depthSumInverse()

//////////// All O`one Data Structure
//        AllOne allOne=new AllOne();
//        allOne.inc("a");
//        allOne.inc("b");
//        allOne.inc("c");
//        allOne.inc("a");
//        allOne.inc("a");
//        allOne.inc("b");
//        System.out.println(allOne.getMaxKey());
//        System.out.println(allOne.getMinKey());

//////////// Find Leaves of Binary Tree
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        System.out.println(findLeaves(n1));

//////////// Closest Binary Search Tree Value II
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        n4.left=n2;
//        n4.right=n5;
//        n2.left=n1;
//        n2.right=n3;
//        System.out.println(closestKValues(n4,3.7,2));

//////////// Factor Combinations
//        System.out.println(getFactors(16));

//////////// Binary Tree Upside Down
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        upsideDownBinaryTree(n1);

//////////// Find K Pairs with Smallest Sums
//        System.out.println(kSmallestPairs(new int[]{1,1,2},new int[]{1,2,3},2));

//////////// Evaluate Reverse Polish Notation
//        System.out.println(evalRPN(new String[]{"2", "1", "+", "3", "*"}));

//////////// Insert Delete GetRandom O(1)
//        RandomizedSet randomizedSet=new RandomizedSet();
//        // Init an empty set.
//        RandomizedSet randomSet = new RandomizedSet();
//        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
//        System.out.println(randomSet.insert(1));
//        // Returns false as 2 does not exist in the set.
//        System.out.println(randomSet.remove(2));
//        // Inserts 2 to the set, returns true. Set now contains [1,2].
//        System.out.println(randomSet.insert(2));
//        // getRandom should return either 1 or 2 randomly.
//        System.out.println(randomSet.getRandom());
//        // Removes 1 from the set, returns true. Set now contains [2].
//        System.out.println(randomSet.remove(1));
//        // 2 was already in the set, so return false.
//        System.out.println(randomSet.insert(2));
//        // Since 2 is the only number in the set, getRandom always return 2.
//        System.out.println(randomSet.getRandom());

//////////// Insert Delete GetRandom O(1) - Duplicates allowed
        // Init an empty collection.
//        RandomizedCollection collection = new RandomizedCollection();
        // Inserts 1 to the collection. Returns true as the collection did not contain 1.
//        System.out.println(collection.insert(1));
//        // Inserts another 1 to the collection. Returns false as the collection contained 1. Collection now contains [1,1].
//        System.out.println(collection.insert(1));
//        // Inserts 2 to the collection, returns true. Collection now contains [1,1,2].
//        System.out.println(collection.insert(2));
//        // getRandom should return 1 with the probability 2/3, and returns 2 with the probability 1/3.
//        System.out.println(collection.getRandom());
//        // Removes 1 from the collection, returns true. Collection now contains [1,2].
//        System.out.println(collection.remove(1));
//        // getRandom should return 1 and 2 both equally likely.
//        System.out.println(collection.getRandom());


//        System.out.println(collection.insert(0));
//        System.out.println(collection.insert(1));
//        System.out.println(collection.remove(0));
//        System.out.println(collection.insert(2));
//        System.out.println(collection.remove(1));
//        System.out.println(collection.getRandom());

//        System.out.println(collection.insert(1));
//        System.out.println(collection.remove(1));
//        System.out.println(collection.insert(1));

//        System.out.println(collection.insert(4));
//        System.out.println(collection.insert(3));
//        System.out.println(collection.insert(4));
//        System.out.println(collection.insert(2));
//        System.out.println(collection.insert(4));
//        System.out.println(collection.remove(4));
//        System.out.println(collection.remove(3));
//        System.out.println(collection.remove(4));
//        System.out.println(collection.remove(4));

//////////// Valid Tic-Tac-Toe State
//        System.out.println(validTicTacToe(new String[]{"XXX", "XOO", "XOO"}));

//////////// Flatten Nested List Iterator
//            NestedIterator nestedIterator=new NestedIterator();

//////////// Peeking iterator
//        PeekingIterator peekingIterator=new PeekingIterator();

//////////// Partition to K Equal Sum Subsets
//        System.out.println(canPartitionKSubsets(new int[]{1,2,2,1},2));

//////////// Max Points on a Line
//        MaxPointsLine maxPointsLine=new MaxPointsLine();
//        System.out.println(maxPointsLine.maxPoints(new int[][]{{1,1},{3,2},{5,3},{4,1},{2,3},{1,4}}));
//        System.out.println(maxPointsLine.maxPoints(new int[][]{{-4,1},{-7,7},{-1,5},{9,-25}}));
//        System.out.println(maxPointsLine.maxPoints(new int[][]{{4,0},{4,-1},{4,5}}));

//////////// Decode String
//        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("100[leetcode]"));
//        System.out.println(decodeString2Stacks("100[leetcode]"));

//////////// Count Different Palindromic Subsequences

//////////// Paint House
//        System.out.println(minCost(new int[][]{{1,2,3},{3,10,11},{1,25,26}}));

//////////// Paint House II
//        System.out.println(minCostII(new int[][]{{10, 6, 16, 25, 7, 28}, {7, 16, 18, 30, 16, 25}, {8, 26, 6, 22, 26, 19}, {10, 23, 14, 17, 23, 9}, {12, 14, 27, 7, 8, 9}}));

//////////// Favorite Genres

//////////// Most Common Word
//        System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",new String[]{"hit"}));

//////////// Second Minimum Node In a Binary Tree
//        TreeNode n1=new TreeNode(2);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(5);
//        TreeNode n4=new TreeNode(5);
//        TreeNode n5=new TreeNode(7);
//        n1.left=n2;
//        n1.right=n3;
//        n3.left=n4;
//        n3.right=n5;
//        System.out.println(findSecondMinimumValue(n1));

//////////// Populating Next Right Pointers in Each Node
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        TreeNode n6=new TreeNode(6);
//        TreeNode n7=new TreeNode(7);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        n3.left=n6;
//        n3.right=n7;
//        connect(n1);
//        connectRecur(n1);

//////////// Top K Frequent Elements
//        System.out.println(topKFrequent(new int[]{1,1,1,2,2,3},2));

//////////// Binary Tree Zigzag Level Order Traversal
//        TreeNode n1=new TreeNode(1);
//        TreeNode n2=new TreeNode(2);
//        TreeNode n3=new TreeNode(3);
//        TreeNode n4=new TreeNode(4);
//        TreeNode n5=new TreeNode(5);
//        TreeNode n6=new TreeNode(6);
//        TreeNode n7=new TreeNode(7);
//        n1.left=n2;
//        n1.right=n3;
//        n2.left=n4;
//        n2.right=n5;
//        n3.left=n6;
//        n3.right=n7;
//        System.out.println(zigzagLevelOrderBFS(n1));
//        System.out.println(zigzagLevelOrderDFS(n1));

//////////// Valid Sudoku
//        char[][] board =   {{'8','3','.','.','7','.','.','.','.'},
//                            {'6','.','.','1','9','5','.','.','.'},
//                            {'.','9','8','.','.','.','.','6','.'},
//                            {'8','.','.','.','6','.','.','.','3'},
//                            {'4','.','.','8','.','3','.','.','1'},
//                            {'7','.','.','.','2','.','.','.','6'},
//                            {'.','6','.','.','.','.','2','8','.'},
//                            {'.','.','.','4','1','9','.','.','5'},
//                            {'.','.','.','.','8','.','.','7','9'}};
//        System.out.println(isValidSudoku(board));

//////////// Minesweeper
//        char[][] board = {{'E','E','E','E','E'},{'E','E','M','E','E'},{'E','E','E','E','E'},{'E','E','E','E','E'}};
//        updateBoardDFS(board,new int[]{3,0});
//        updateBoardBFS(board,new int[]{3,0});

//////////// Shortest Bridge


//////////// Find coordinates of image of 0s

//        int[][] image1 = {
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 0, 0, 0, 1},
//                {1, 1, 1, 0, 0, 0, 1},
//                {1, 1, 1, 1, 1, 1, 1}
//        };
//
////        Sample output variations (only one is necessary):
////
////        findRectangle(image1) =>
////        x: 3, y: 2, width: 3, height: 2
////        2,3 3,5 -- row,column of the top-left and bottom-right corners
//
//
//        int[][] image2 = {
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 0}
//        };
////        findRectangle(image2) =>
////        x: 6, y: 4, width: 1, height: 1
////        4,6 4,6
//
//        int[][] image3 = {
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 0, 0},
//                {1, 1, 1, 1, 1, 0, 0}
//        };
//
////        findRectangle(image3) =>
////        x: 5, y: 3, width: 2, height: 2
////        3,5 4,6
//
//        int[][] image4 = {
//                {0, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1},
//                {1, 1, 1, 1, 1, 1, 1}
//        };
//
////        findRectangle(image4) =>
////        x: 0, y: 0, width: 1, height: 1
////        0,0 0,0
//
//        int[][] image5 = {
//                {0}
//        };
//
////        findRectangle(image5) =>
////        x: 0, y: 0, width: 1, height: 1
////        0,0 0,0
//
////        for(int i : findDimensions(image1))
////            System.out.println(i);
//
//        for (int i : findDimensionsDFS(image1))
//            System.out.println(i);
//        for (int i : findDimensionsDFS(image2))
//            System.out.println(i);
//        for (int i : findDimensionsDFS(image3))
//            System.out.println(i);
//        for (int i : findDimensionsDFS(image4))
//            System.out.println(i);
//        for (int i : findDimensionsDFS(image5))
//            System.out.println(i);

//////////// Longest Valid Parentheses
//        System.out.println(longestValidParenthesesStack(")()())"));
//        System.out.println(longestValidParentheses(")()())"));


    }

    //Left n right count
    public static int longestValidParentheses(String s) {
        int left = 0, right = 0, maxlength = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * right);
            } else if (right >= left) {
                left = right = 0;
            }
        }
        left = right = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '(') {
                left++;
            } else {
                right++;
            }
            if (left == right) {
                maxlength = Math.max(maxlength, 2 * left);
            } else if (left >= right) {
                left = right = 0;
            }
        }
        return maxlength;
    }

    public static int longestValidParenthesesStack(String s) {
        int maxans = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.empty()) {
                    stack.push(i);
                } else {
                    maxans = Math.max(maxans, i - stack.peek());
                }
            }
        }
        return maxans;
    }

    public static int[] findDimensionsDFS(int[][] input) {

        int[] output = new int[4];
        boolean firstZeroFound = false;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    output[0] = i;
                    output[2] = i;
                    output[1] = j;
                    output[3] = j;
                    firstZeroFound = true;
                    break;
                }
            }
            if (firstZeroFound)
                break;
        }

        Pair<Integer, Integer> pair = new Pair<Integer, Integer>(output[0], output[1]);
        while (true) {
            int i = pair.getKey();
            int j = pair.getValue();
            if (boundaryCheck(input, i + 1, j + 1))
                pair = new Pair<>(i + 1, j + 1);
            else if (boundaryCheck(input, i, j + 1))
                pair = new Pair<>(i, j + 1);
            else if (boundaryCheck(input, i + 1, j))
                pair = new Pair<>(i + 1, j);
            else
                break;
        }
        output[2] = pair.getKey();
        output[3] = pair.getValue();
        return output;
    }


    public static boolean boundaryCheck(int[][] input,int i ,int j){
        if(i<input.length && j<input[0].length && input[i][j]==0)
            return true;
        else
            return false;
    }

    //Glassdoor question
    public static int[] findDimensions(int[][] input){

        int[] output=new int[4];
        boolean firstZeroFound=false;
        HashSet<String> visited=new HashSet<String>();
        Queue<Pair<Integer,Integer>> queue=new LinkedList<Pair<Integer,Integer>>();
        for(int i=0; i<input.length;i++)
        {
            for(int j=0; j<input[0].length;j++)
            {
                if(input[i][j]==0){
                    output[0]=i;
                    output[2]=i;
                    output[1]=j;
                    output[3]=j;
                    queue.offer(new Pair(i,j));
                    firstZeroFound=true;
                    break;
                }
            }
            if(firstZeroFound)
                break;
        }

        int i=0;
        int j=0;
        while(!queue.isEmpty()){

            Pair<Integer, Integer> pair=queue.poll();
            i=pair.getKey();
            j=pair.getValue();
            visited.add(i+","+j);

            if(check(input,visited, queue, i+1,j+1, output))
                continue;
            if(!check(input,visited, queue, i,j+1, output))
                check(input,visited, queue, i+1,j, output);

//            check(input,visited, queue, i,j+1, output);
//            check(input,visited, queue, i+1,j+1, output);
//            check(input,visited, queue, i+1,j, output);

        }
        return output;
    }

    public static boolean check(int[][] input, HashSet<String> visited, Queue<Pair<Integer,Integer>> queue, int i, int j, int[] output)
    {
        if(i<input.length && j<input[0].length && !visited.contains(i+","+j) && input[i][j] == 0 )
        {
            queue.offer(new Pair(i,j));
            output[2]=i;
            output[3]=j;
            return true;
        }
        return false;
    }

    public static int shortestBridge(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] colors = getComponents(A);

        Queue<ShortestBridgeNode> queue = new LinkedList();
        Set<Integer> target = new HashSet();

        for (int r = 0; r < R; ++r)
            for (int c = 0; c < C; ++c) {
                if (colors[r][c] == 1) {
                    queue.add(new ShortestBridgeNode(r, c, 0));
                } else if (colors[r][c] == 2) {
                    target.add(r * C + c);
                }
            }

        while (!queue.isEmpty()) {
            ShortestBridgeNode node = queue.poll();
            if (target.contains(node.r * C + node.c))
                return node.depth - 1;
            for (int nei: neighbors(A, node.r, node.c)) {
                int nr = nei / C, nc = nei % C;
                if (colors[nr][nc] != 1) {
                    queue.add(new ShortestBridgeNode(nr, nc, node.depth + 1));
                    colors[nr][nc] = 1;
                }
            }
        }

        throw null;
    }

    public static int[][] getComponents(int[][] A) {
        int R = A.length, C = A[0].length;
        int[][] colors = new int[R][C];
        int islandNumber = 0;

        for (int r0 = 0; r0 < R; ++r0)
            for (int c0 = 0; c0 < C; ++c0)
                if (colors[r0][c0] == 0 && A[r0][c0] == 1) {
                    // Start dfs
                    Stack<Integer> stack = new Stack();
                    stack.push(r0 * C + c0);
                    colors[r0][c0] = ++islandNumber;

                    while (!stack.isEmpty()) {
                        int node = stack.pop();
                        int r = node / C, c = node % C;
                        for (int nei: neighbors(A, r, c)) {
                            int nr = nei / C, nc = nei % C;
                            if (A[nr][nc] == 1 && colors[nr][nc] == 0) {
                                colors[nr][nc] = islandNumber;
                                stack.push(nr * C + nc);
                            }
                        }
                    }
                }

        return colors;
    }

    public static List<Integer> neighbors(int[][] A, int r, int c) {
        int R = A.length, C = A[0].length;
        List<Integer> ans = new ArrayList();
        if (0 <= r-1) ans.add((r-1) * R + c);
        if (0 <= c-1) ans.add(r * R + (c-1));
        if (r+1 < R) ans.add((r+1) * R + c);
        if (c+1 < C) ans.add(r * R + (c+1));
        return ans;
    }

    static class ShortestBridgeNode {
        int r, c, depth;
        ShortestBridgeNode(int r, int c, int d) {
            this.r = r;
            this.c = c;
            depth = d;
        }
    }

    //In BFS the marking of visited is kinda important so that nothing is redone.
    public static char[][] updateBoardBFS(char[][] board, int[] click) {
        int m = board.length , n = board[0].length;
        int[][] dir = new int[][] {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{1,1},{-1,1},{1,-1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(click);
        if(board[click[0]][click[1]] == 'M'){
            board[click[0]][click[1]] = 'X';
            return board;
        }
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0],col = curr[1] ,count = 0 ;
            for(int[] d : dir){
                int r = row + d[0],c = col + d[1];
                if(r >= m || c >= n || r < 0 || c < 0) continue;
                if(board[r][c] == 'M') count++;
            }
            if(count > 0)
                board[row][col] = (char)(count + '0');
            else{
                board[row][col] = 'B';
                for(int[] d : dir){
                    int r = row + d[0] , c = col + d[1];
                    if(r >= m || c >= n || r < 0 || c < 0) continue;
                    if(board[r][c] == 'E'){
                        q.add(new int[] {r,c});
                        board[r][c] = 'B'; //to prevent revisiting might be overwritten if it has adj mines
                    }
                }
            }

        }
        return board;
    }

    public static char[][] updateBoardDFS(char[][] board, int[] click) {
        if (board.length == 0 || board[0].length == 0 || click.length != 2) return board;
        int x = click[0], y = click[1], m = board.length, n = board[0].length;
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else {
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
            dfs(board, x, y, m, n, dirs);
        }
        return board;
    }

    private static void dfs(char[][] board, int x, int y, int m, int n, int[][] dirs) {
        if (x < 0 || x >= m || y < 0 || y >= n || board[x][y] != 'E') return;
        int mine = adjMine(board, x, y, m, n);
        if (mine > 0) {
            board[x][y] = (char) ('0' + mine);
        } else {
            board[x][y] = 'B';
            for (int[] d : dirs) {
                dfs(board, x + d[0], y + d[1], m, n, dirs);
            }
        }
    }

    private static int adjMine(char[][] board, int x, int y, int m, int n) {
        int cnt = 0;
        for (int i = x - 1; i <= x + 1; i++) {
            for (int j = y - 1; j <= y + 1; j++) {
                if (0 <= i && i < m && 0 <= j && j < n && board[i][j] == 'M')
                    cnt++;
            }
        }
        return cnt;
    }

    //Can be done with hashset and since its going over the grid for every row, only one row hashset is needed instead of 9
    public static boolean isValidSudoku(char[][] board) {
        // init data
        HashMap<Integer, Integer> [] rows = new HashMap[9];
        HashMap<Integer, Integer> [] columns = new HashMap[9];
        HashMap<Integer, Integer> [] boxes = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            rows[i] = new HashMap<Integer, Integer>();
            columns[i] = new HashMap<Integer, Integer>();
            boxes[i] = new HashMap<Integer, Integer>();
        }

        // validate a board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int n = (int)num;
                    int box_index = (i / 3 ) * 3 + j / 3;

                    // keep the current cell value
                    rows[i].put(n, rows[i].getOrDefault(n, 0) + 1);
                    columns[j].put(n, columns[j].getOrDefault(n, 0) + 1);
                    boxes[box_index].put(n, boxes[box_index].getOrDefault(n, 0) + 1);

                    // check if this value has been already seen before
                    if (rows[i].get(n) > 1 || columns[j].get(n) > 1 || boxes[box_index].get(n) > 1)
                        return false;
                }
            }
        }

        return true;
    }

    protected static void DFS(TreeNode node, int level, List<List<Integer>> results) {
        if (level >= results.size()) {
            LinkedList<Integer> newLevel = new LinkedList<Integer>();
            newLevel.add(node.val);
            results.add(newLevel);
        } else {
            if (level % 2 == 0)
                results.get(level).add(node.val);
            else
                results.get(level).add(0, node.val);
        }

        if (node.left != null) DFS(node.left, level + 1, results);
        if (node.right != null) DFS(node.right, level + 1, results);
    }

    public static List<List<Integer>> zigzagLevelOrderDFS(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        DFS(root, 0, results);
        return results;
    }

    public static List<List<Integer>> zigzagLevelOrderBFS(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean zigzag = false;
        while (!queue.isEmpty()) {
            List<Integer> level = new LinkedList<>();
            int cnt = queue.size();
            for (int i = 0; i < cnt; i++) {
                TreeNode node = queue.poll();
                if (zigzag) {
                    level.add(0, node.val);
                }
                else {
                    level.add(node.val);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(level);
            zigzag = !zigzag;
        }
        return res;
    }

    //here the remove then add then remove order is important if there is only one element in the set
    public class RandomizedCollection {
        ArrayList<Integer> lst;
        HashMap<Integer, Set<Integer>> idx;
        java.util.Random rand = new java.util.Random();
        /** Initialize your data structure here. */

        public RandomizedCollection() {
            lst = new ArrayList<Integer>();
            idx = new HashMap<Integer, Set<Integer>>();
        }

        /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
        public boolean insert(int val) {
            if (!idx.containsKey(val)) idx.put(val, new HashSet<Integer>());
            idx.get(val).add(lst.size());
            lst.add(val);
            return idx.get(val).size() == 1;
        }

        /** Removes a value from the collection. Returns true if the collection contained the specified element. */
        public boolean remove(int val) {
            if (!idx.containsKey(val) || idx.get(val).size() == 0) return false;
            int remove_idx = idx.get(val).iterator().next();
            idx.get(val).remove(remove_idx);
            int last = lst.get(lst.size() - 1);
            lst.set(remove_idx, last);
            idx.get(last).add(remove_idx);
            idx.get(last).remove(lst.size() - 1);

            lst.remove(lst.size() - 1);
            return true;
        }

        /** Get a random element from the collection. */
        public int getRandom() {
            return lst.get(rand.nextInt(lst.size()));
        }
    }

    //kLogn
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // build hash map : character and how often it appears
        HashMap<Integer, Integer> count = new HashMap();
        for (int n: nums)
            count.put(n, count.getOrDefault(n, 0) + 1);


        // init heap 'the less frequent element first'
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> count.get(n1) - count.get(n2));

        // keep k top frequent elements in the heap
        for (int n: count.keySet()) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }

        //Can populate an array list backwards instead
        // build output list
        List<Integer> top_k = new LinkedList();
        while (!heap.isEmpty())
            top_k.add(heap.poll());
        Collections.reverse(top_k);
        return top_k;
    }

    public static void connectRecur(TreeNode root) {

        if(root==null || root.left==null)
            return;
        root.left.next=root.right;
        TreeNode leftChild=root.left;
        TreeNode rightChild=root.right;
        while(leftChild.right!=null){
            leftChild=leftChild.right;
            rightChild=rightChild.left;
            leftChild.next=rightChild;
        }
        connectRecur(root.left);
        connectRecur(root.right);
    }

    //going through each curr node in a level and keeping a level start pointer to start the next level
    public static TreeNode connect(TreeNode root) {
        TreeNode level_start=root;
        while(level_start!=null){
            TreeNode cur=level_start;
            while(cur!=null){
                if(cur.left!=null) cur.left.next=cur.right; else return root;
                if(cur.right!=null && cur.next!=null) cur.right.next=cur.next.left;

                cur=cur.next;
            }
            level_start=level_start.left;
        }
        return root;
    }

    static long secondMin = Long.MAX_VALUE;

    public static void dfs(TreeNode root, int headValue) {
        if (root != null) {
            if (headValue < root.val && root.val < secondMin) {
                secondMin = root.val;
            } else if (headValue == root.val) {
                dfs(root.left,headValue);
                dfs(root.right,headValue);
            }
        }
    }

    public static int findSecondMinimumValue(TreeNode root) {
        dfs(root, root.val);
        return secondMin < Long.MAX_VALUE ? (int) secondMin : -1;
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> banset = new HashSet();
        for (String word: banned) banset.add(word);
        Map<String, Integer> count = new HashMap();

        String ans = "";
        int ansfreq = 0;

        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalword = word.toString();
                if (!banset.contains(finalword)) {
                    count.put(finalword, count.getOrDefault(finalword, 0) + 1);
                    if (count.get(finalword) > ansfreq) {
                        ans = finalword;
                        ansfreq = count.get(finalword);
                    }
                }
                word = new StringBuilder();
            }
        }

        return ans;
    }

    public static Map<String, List<String>> favoritegenre(Map<String, List<String>> userMap, Map<String, List<String>> genreMap) {
        Map<String, List<String>> res = new HashMap<>();
        Map<String, String> songstogenre = new HashMap<>();

        for(String genre : genreMap.keySet()) {
            List<String> songs = genreMap.get(genre);
            for(String song : songs) {
                songstogenre.put(song, genre);
            }
        }
        Map<String, Integer> count = new HashMap();
        int max = 0;
        for(String user : userMap.keySet()) {
            count = new HashMap();
            max = 0;
            res.put(user, new ArrayList());
            List<String> songs = userMap.get(user);
            for(String song : songs) {
                String genre = songstogenre.get(song);
                int c = count.getOrDefault(genre, 0) + 1;
                count.put(genre, c);
                max = Math.max(c, max);
            }
            for (String key : count.keySet()) {
                if (count.get(key) == max) {
                    res.get(user).add(key);
                }
            }
        }
        return res;
    }

    public static int minCostII(int[][] costs) {

        if (costs.length == 0) return 0;
        int k = costs[0].length;
        int n = costs.length;


        /* Firstly, we need to determine the 2 lowest costs of
         * the first row. We also need to remember the color of
         * the lowest. */
        int prevMin = -1; int prevSecondMin = -1; int prevMinColor = -1;
        for (int color = 0; color < k; color++) {
            int cost = costs[0][color];
            if (prevMin == -1 || cost < prevMin) {
                prevSecondMin = prevMin;
                prevMinColor = color;
                prevMin = cost;
            } else if (prevSecondMin == -1 || cost < prevSecondMin) {
                prevSecondMin = cost;
            }
        }

        // And now, we need to work our way down, keeping track of the minimums.
        for (int house = 1; house < n; house++) {
            int min = -1; int secondMin = -1; int minColor = -1;
            for (int color = 0; color < k; color++) {
                // Determine the cost for this cell (without writing it in).
                int cost = costs[house][color];
                if (color == prevMinColor) {
                    cost += prevSecondMin;
                } else {
                    cost += prevMin;
                }
                // Determine whether or not this current cost is also a minimum.
                if (min == -1 || cost < min) {
                    secondMin = min;
                    min = cost;
                    minColor = color;
                } else if (secondMin == -1 || cost < secondMin) {
                    secondMin = cost;
                }
            }
            // Transfer current mins to be previous mins.
            prevMin = min;
            prevSecondMin = secondMin;
            prevMinColor = minColor;
        }

        return prevMin;
    }

    //Can also be done by backtracking, top down with memo
    public static int minCost(int[][] costs) {

        for (int n = costs.length - 2; n >= 0; n--) {
            // Total cost of painting the nth house red.
            costs[n][0] += Math.min(costs[n + 1][1], costs[n + 1][2]);
            // Total cost of painting the nth house green.
            costs[n][1] += Math.min(costs[n + 1][0], costs[n + 1][2]);
            // Total cost of painting the nth house blue.
            costs[n][2] += Math.min(costs[n + 1][0], costs[n + 1][1]);
        }

        if (costs.length == 0) return 0;

        return Math.min(Math.min(costs[0][0], costs[0][1]), costs[0][2]);
    }

    //Check iterator over List of List

    public static String decodeString2Stacks(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> charStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int num = c - '0';
                while (Character.isDigit(c = s.charAt(++i))) {
                    num = num * 10 + (c - '0');
                }
                i--;
                numberStack.add(num);
            } else if (c == '[') {
                charStack.add(sb.toString());
                sb = new StringBuilder();
            } else if (c == ']') {
                StringBuilder newSB = new StringBuilder(charStack.pop());
                int num = numberStack.pop();
                String currS = sb.toString();
                while (num-- > 0) {
                    newSB.append(currS);
                }
                sb = new StringBuilder(newSB.toString());
            } else {
                sb.append(c);
            }

        }

        return sb.toString();
    }

    //slower due to multiple conversions
    public static String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ']') {
                int repeat = Integer.parseInt(stack.pop());
                StringBuilder repeatedString = new StringBuilder();
                for (int j = 0; j < repeat; j++)
                    repeatedString.append(sb);
                if (!stack.isEmpty() && Character.isAlphabetic(stack.peek().charAt(0))) {
                    repeatedString.insert(0, stack.pop());
                }
                sb = repeatedString;

            } else if (c == '[') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                }
                stack.push(count + "");
                sb.setLength(0);
                count = 0;
            } else if (Character.isDigit(c)) {
                count = c - '0';
                while (i < s.length() - 1 && Character.isDigit(s.charAt(i + 1))) {
                    i++;
                    count = count * 10 + (s.charAt(i)-'0');
                }
            } else
                sb.append(c);
        }
        return sb.toString();
    }

    //1.0 makes it decimal , 0.0 removes -0.0 i.e -0.0 +0.0 = 0.0
    static class MaxPointsLine {

        int[][] points;
        int n;
        HashMap<Double, Integer> lines = new HashMap<Double, Integer>();
        int horizontal_lines;

        public Pair<Integer, Integer> add_line(int i, int j, int count, int duplicates) {
            int x1 = points[i][0], y1 = points[i][1], x2 = points[j][0], y2 = points[j][1];
            if ((x1 == x2) && (y1 == y2))
                duplicates++;
            else if (y1 == y2) {
                horizontal_lines += 1;
                count = Math.max(horizontal_lines, count);
            }
            else {
                double slope = 1.0 * (x1 - x2) / (y1 - y2) + 0.0;
                lines.put(slope, lines.getOrDefault(slope, 1) + 1);
                count = Math.max(lines.get(slope), count);
            }
            return new Pair(count, duplicates);
        }

        public int max_points_on_a_line_containing_point_i(int i) {
            lines.clear();
            horizontal_lines = 1;
            int count = 1;
            int duplicates = 0;

            for (int j = i + 1; j < n; j++) {
                Pair<Integer, Integer> p = add_line(i, j, count, duplicates);
                count = p.getKey();
                duplicates = p.getValue();
            }
            return count + duplicates;
        }

        public int maxPoints(int[][] points) {
            this.points = points;

            n = points.length;
            if (n < 3)
                return n;

            int max_count = 1;

            for (int i = 0; i < n - 1; i++)
                max_count = Math.max(max_points_on_a_line_containing_point_i(i), max_count);
            return max_count;
        }
    }

    public static boolean search(int[] groups, int row, int[] nums, int target) {
        if (row < 0) return true;
        int v = nums[row--];
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] + v <= target) {
                groups[i] += v;
                if (search(groups, row, nums, target)) return true;
                groups[i] -= v;
            }
            if (groups[i] == 0) break; // this means if the bucket is empty and still havent found a combination its useless trying other buckets
        }
        return false;
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k > 0) return false;
        int target = sum / k;

        Arrays.sort(nums);
        int row = nums.length - 1;
        if (nums[row] > target) return false;
        while (row >= 0 && nums[row] == target) {
            row--;
            k--;
        }
        return search(new int[k], row, nums, target);
    }

    static class PeekingIterator implements Iterator<Integer> {
        private Integer next = null;
        private Iterator<Integer> iter;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            iter = iterator;
            if (iter.hasNext())
                next = iter.next();
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            return next;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Integer res = next;
            next = iter.hasNext() ? iter.next() : null;
            return res;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }
    }

    public class NestedIterator implements Iterator<Integer> {
        Stack<NestedInteger> stack = new Stack<>();
        public NestedIterator(List<NestedInteger> nestedList) {
            for(int i = nestedList.size() - 1; i >= 0; i--) {
                stack.push(nestedList.get(i));
            }
        }

        @Override
        public Integer next() {
            return stack.pop().getInteger();
        }

        @Override
        public boolean hasNext() {
            while(!stack.isEmpty()) {
                NestedInteger curr = stack.peek();
                if(curr.isInteger()) {
                    return true;
                }
                stack.pop();
                for(int i = curr.getList().size() - 1; i >= 0; i--) {
                    stack.push(curr.getList().get(i));
                }
            }
            return false;
        }
    }

    //When O wins countX == countO
    public static boolean validTicTacToe(String[] board) {
        int xCount = 0, oCount = 0;
        for (String row: board)
            for (char c: row.toCharArray()) {
                if (c == 'X') xCount++;
                if (c == 'O') oCount++;
            }

        if (oCount != xCount && oCount != xCount - 1) return false;
        if (win(board, 'X') && oCount != xCount - 1) return false;
        if (win(board, 'O') && oCount != xCount) return false;
        return true;
    }

    public static boolean win(String[] B, char P) {
        // B: board, P: player
        for (int i = 0; i < 3; ++i) {
            if (P == B[0].charAt(i) && P == B[1].charAt(i) && P == B[2].charAt(i))
                return true;
            if (P == B[i].charAt(0) && P == B[i].charAt(1) && P == B[i].charAt(2))
                return true;
        }
        if (P == B[0].charAt(0) && P == B[1].charAt(1) && P == B[2].charAt(2))
            return true;
        if (P == B[0].charAt(2) && P == B[1].charAt(1) && P == B[2].charAt(0))
            return true;
        return false;
    }

    //list.set function is new here
    static class RandomizedSet {
        Map<Integer, Integer> dict;
        List<Integer> list;
        Random rand = new Random();

        /** Initialize your data structure here. */
        public RandomizedSet() {
            dict = new HashMap();
            list = new ArrayList();
        }

        /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
        public boolean insert(int val) {
            if (dict.containsKey(val)) return false;

            dict.put(val, list.size());
            list.add(list.size(), val);
            return true;
        }

        /** Removes a value from the set. Returns true if the set contained the specified element. */
        public boolean remove(int val) {
            if (! dict.containsKey(val)) return false;

            // move the last element to the place idx of the element to delete
            int lastElement = list.get(list.size() - 1);
            int idx = dict.get(val);
            list.set(idx, lastElement);
            dict.put(lastElement, idx);
            // delete the last element
            list.remove(list.size() - 1);
            dict.remove(val);
            return true;
        }

        /** Get a random element from the set. */
        public int getRandom() {
            return list.get(rand.nextInt(list.size()));
        }
    }

    public static int evalRPN(String[] tokens) {
        String ops = "+-*/";
        Stack<Integer> stack = new Stack<>();
        for ( String t : tokens ) {
            if ( ops.contains(t)) {
                int n2 = stack.pop(), n1 = stack.pop();
                stack.push(apply(n1 , n2, t));
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.peek();
    }

    static int apply(int n1 , int n2, String op) {
        if ( op.equals("*")) return n1 * n2;
        else if ( op.equals("/")) return n1/ n2;
        else if ( op.equals("+")) return n1 + n2;
        else return n1 - n2;
    }


    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> que = new PriorityQueue<>((a,b)->a.get(0)+a.get(1)-b.get(0)-b.get(1));
        List<List<Integer>> res = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0 || k==0) return res;
        for(int i=0; i<nums1.length && i<k; i++) que.offer(Arrays.asList(nums1[i], nums2[0], 0));
        while(k-- > 0 && !que.isEmpty()){
            List<Integer> cur = que.poll();
            res.add(Arrays.asList(cur.get(0), cur.get(1)));
            if(cur.get(2) == nums2.length-1) continue;
            que.offer(Arrays.asList(cur.get(0),nums2[cur.get(2)+1], cur.get(2)+1));
        }
        return res;
    }
    
    public TreeNode upsideDownBinaryTreeIterative(TreeNode root) {
        TreeNode curr = root;
        TreeNode prev = null;
        TreeNode next = null;
        TreeNode temp = null;

        while (curr != null) {
            next = curr.left;
            curr.left = temp;
            temp = curr.right;
            curr.right = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static TreeNode upsideDownBinaryTree(TreeNode root) {
        if (root == null || root.left == null && root.right == null)
            return root;

        TreeNode newRoot = upsideDownBinaryTree(root.left);

        root.left.left = root.right;
        root.left.right = root;

        root.left = null;
        root.right = null;

        return newRoot;
    }

    //passing i in the recursion prevents duplicates
    //square root can be used as max limit
    public static List<List<Integer>> getFactors(int n) {
        List<List<Integer>> res = new LinkedList<>();
        backtrack(2, n, new LinkedList<>(), res);
        return res;
    }

    static void backtrack(int start, int n, List<Integer> list, List<List<Integer>> res) {
        for(int i = start; i * i <= n; i++) {
            if(n % i == 0) {
                list.add(i);
                list.add(n / i);
                res.add(new LinkedList<>(list));
                list.remove(list.size() - 1);
                backtrack(i, n / i, list, res);
                list.remove(list.size() - 1);
            }
        }
    }

    public static List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        height(root, res);
        return res;
    }

    public static int height(TreeNode node, List<List<Integer>> res){
        if(null==node)  return -1;
        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
        if(res.size()<level+1)  res.add(new ArrayList<>());
        res.get(level).add(node.val);
        return level;
    }

    static class AllOne {

        // 18ms - 98%
        class Node{
            int val;
            Set<String> keySet;
            Node left, right;
            Node(String key, int val){
                this.val = val;
                if ( key != null){
                    keySet = new HashSet<>();
                    keySet.add(key);
                }
            }
        }

        Map<String, Node> map;
        Node head, tail;

        /** Initialize your data structure here. */
        public AllOne() {
            map = new HashMap<>();
            head = new Node(null, Integer.MIN_VALUE);
            tail = new Node(null, Integer.MAX_VALUE);
            head.right = tail;
            tail.left = head;
        }

        /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
        public void inc(String key) {
            if( map.containsKey(key)) {
                Node n = map.get(key);
                insert(key, n.val+1, n, n.right);
                remove(key, n);
            }else {
                insert(key, 1, head, head.right);
            }
        }

        /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
        public void dec(String key) {
            if( !map.containsKey(key))
                return;

            Node n = map.get(key);
            if ( n.val > 1)
                insert(key, n.val-1, n.left, n);
            else
                map.remove(key); ///
            remove(key, n);
        }

        /** Returns one of the keys with maximal value. */
        public String getMaxKey() {
            if( head.right == tail)
                return "";
            return tail.left.keySet.iterator().next();
        }

        /** Returns one of the keys with Minimal value. */
        public String getMinKey() {
            if(head.right == tail)
                return "";
            return head.right.keySet.iterator().next();
        }

        private void insert(String key, int val, Node left, Node right){
            if( val == left.val){
                left.keySet.add(key);
                map.put(key, left);
            } else if ( val == right.val){
                right.keySet.add(key);
                map.put(key, right);
            } else {
                Node newNode = new Node(key, val);
                left.right = newNode;
                newNode.left = left;
                newNode.right = right;
                right.left = newNode;
                map.put(key, newNode);
            }
        }
        private void remove(String key, Node n){
            n.keySet.remove(key);
            if( n.keySet.isEmpty()){
                n.left.right = n.right;
                n.right.left = n.left;
            }
        }
    }

    //Here the idea is to add the previous/parent level sum again per level and that will be = multiplying it with its level
    public int depthSumInverse(List<NestedInteger> nestedList) {
        if (nestedList == null) return 0;
        Queue<NestedInteger> queue = new LinkedList<NestedInteger>();
        int previousLevelSum = 0;
        int levelSum = 0;
        for (NestedInteger next : nestedList) {
            queue.offer(next);
        }

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                NestedInteger current = queue.poll();
                if (current.isInteger()) levelSum += current.getInteger();
                List<NestedInteger> nextList = current.getList();
                if (nextList != null) {
                    for (NestedInteger next : nextList) {
                        queue.offer(next);
                    }
                }
            }

            previousLevelSum += levelSum;
        }
        return previousLevelSum;
    }

    //Can use binary search for the initial start position of either l1 or l2 which ever is larger or basically if the 2 starts have a huge difference
    //eg l1 1,2,....100,130,150 and l2 70,80
    static class WordDistance {

        HashMap<String, ArrayList<Integer>> locations;

        public  WordDistance(String[] words) {
            this.locations = new HashMap<String, ArrayList<Integer>>();

            // Prepare a mapping from a word to all it's locations (indices).
            for (int i = 0; i < words.length; i++) {
                ArrayList<Integer> loc = this.locations.getOrDefault(words[i], new ArrayList<Integer>());
                loc.add(i);
                this.locations.put(words[i], loc);
            }
        }

        public int shortest(String word1, String word2) {
            ArrayList<Integer> loc1, loc2;

            // Location lists for both the words
            // the indices will be in SORTED order by default
            loc1 = this.locations.get(word1);
            loc2 = this.locations.get(word2);

            int l1 = 0, l2 = 0, minDiff = Integer.MAX_VALUE;
            while (l1 < loc1.size() && l2 < loc2.size()) {
                minDiff = Math.min(minDiff, Math.abs(loc1.get(l1) - loc2.get(l2)));
                if (loc1.get(l1) < loc2.get(l2)) {
                    l1++;
                } else {
                    l2++;
                }
            }

            return minDiff;
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public static void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

    private static int[] getResult(String s, String t) {
        int[] res = new int[2];
        String[] ships = s.split(",");
        Set<String> visited = new HashSet<>();
        for(String ship : ships) {
            String[] xAndY = ship.split(" ");
            int topX = Integer.parseInt(xAndY[0].substring(0, xAndY[0].length() - 1));
            char topY = xAndY[0].charAt(xAndY[0].length() - 1);
            int bottomX = Integer.parseInt(xAndY[1].substring(0, xAndY[1].length() - 1));
            char bottomY = xAndY[1].charAt(xAndY[1].length() - 1);
            int cnt = 0;
            for(String cell : t.split(" ")) {
                if(visited.contains(cell))
                    continue;
                int x = Integer.parseInt(cell.substring(0, cell.length() - 1));
                char y = cell.charAt(cell.length() - 1);
                if(x >= topX && y >= topY && x <= bottomX && y <= bottomY) {
                    cnt++;
                    visited.add(cell);
                }
            }
            if(cnt == (bottomX - topX+1) * (bottomY - topY+1)) {
                res[0]++;
                continue;
            }
            if(cnt > 0)
                res[1]++;
        }
        return res;
    }

    public static List<Integer> partitionLabels(String S) {
        int[] last = new int[26];
        for (int i = 0; i < S.length(); ++i)
            last[S.charAt(i) - 'a'] = i;

        int j = 0, anchor = 0;
        List<Integer> ans = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if (i == j) {
                ans.add(i - anchor + 1);
                anchor = i + 1;
            }
        }
        return ans;
    }

    static int maxSubTree=-1;
    //Correct the comparison of avg with maxAvg
    public static int[] subtreeMaxAvg(Node root) {

        if (root == null) return new int[]{0, 0};
        int sum = root.val;
        int totalNodes = 1;
        for (Node child : root.children) {
            int[] sumAndNodes = subtreeMaxAvg(child);
            sum += sumAndNodes[0];
            totalNodes += sumAndNodes[1];
        }

        if (sum / (totalNodes) > maxSubTree && root.children.size() > 0)
            maxSubTree = root.val;

        return new int[]{sum, totalNodes};
    }

    //not useful for a stream of products, as it sorts them in the beginning
    public static List<List<String>> suggestedProductsBinarySearch(String[] products, String searchWord) {
        List<List<String>> result = new ArrayList<>();
        Arrays.sort(products);
        String key = "";
        for (int i = 0; i < searchWord.length(); i++) {
            key = key + searchWord.charAt(i);
            int index = Arrays.binarySearch(products, key);
            if (index > 0) {
                while (index > 0 && products[index - 1].equals(key)) {
                    index--; // find the first same element
                }
            } else if (index < 0) {
                index = -index - 1; // first element larger than the key
            }
            List<String> suggestions = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                if (index + j < products.length && products[index + j].startsWith(key)) {
                    suggestions.add(products[index + j]);
                } else {
                    break;
                }
            }
            result.add(suggestions);
        }
        return result;
    }

    public static List<List<String>> suggestedProductsTreeMap(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        TreeMap<String, Integer> map = new TreeMap<>();
        Arrays.sort(products);
        List<String> productsList = Arrays.asList(products);

        for (int i = 0; i < products.length; i++) {
            map.put(products[i], i);
        }

        String key = "";
        for (char c : searchWord.toCharArray()) {
            key += c;
            String ceiling = map.ceilingKey(key);
            String floor = map.floorKey(key + "~");
            if (ceiling == null || floor == null) break;
            res.add(productsList.subList(map.get(ceiling), Math.min(map.get(ceiling) + 3, map.get(floor) + 1)));
        }

        while (res.size() < searchWord.length()) res.add(new ArrayList<>());
        return res;
    }

    //Can be done with TreeSet also
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        TrieNode root = new TrieNode(26);
        for (String p : products) { // build Trie.
            TrieNode t = root;
            for (char c : p.toCharArray()) { // insert current product into Trie.
                if (t.next[c - 'a'] == null)
                    t.next[c - 'a'] = new TrieNode(26);
                t = t.next[c - 'a'];
                t.suggestion.offer(p); // put products with same prefix into suggestion list.
                Collections.sort(t.suggestion); // sort products.
                if (t.suggestion.size() > 3) // maintain 3 lexicographically minimum strings.
                    t.suggestion.pollLast();
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (char c : searchWord.toCharArray()) { // search product.
            if (root != null) // if current Trie is NOT null.
                root = root.next[c - 'a'];
            ans.add(root == null ? Arrays.asList() : root.suggestion); // add it if there exist products with current prefix.
        }
        return ans;
    }

    public static List<List<String>> suggestedProductsMyWay(String[] products, String searchWord) {

        TrieNode root = new TrieNode(26);
        for (String product : products)
            buildTrie(product, root, 0);

        return getSearchResult(searchWord, root);
    }

    public static void buildTrie(String product, TrieNode root, int index) {

        for (int i = 0; i < product.length(); i++) {
            if (root.next[product.charAt(i) - 'a'] == null)
                root.next[product.charAt(i) - 'a'] = new TrieNode(26);
            if (root.topThreeSuggesstions.size() > 3)
                root.topThreeSuggesstions.remove(root.topThreeSuggesstions.last());
            root = root.next[product.charAt(i) - 'a'];
            root.topThreeSuggesstions.add(product);
        }
    }

    public static List<List<String>> getSearchResult(String searchWord, TrieNode root) {
        List<List<String>> suggestions = new ArrayList<>();
        for (int i = 0; i < searchWord.length(); i++) {
            if (root.next[searchWord.charAt(i) - 'a'] == null)
                suggestions.add(new ArrayList<>());
            else
                suggestions.add(new ArrayList<>(root.next[searchWord.charAt(i) - 'a'].topThreeSuggesstions));
            root = root.next[searchWord.charAt(i) - 'a'];
        }
        return suggestions;
    }

//    public static TrieNode buildTrieRecur(String product,TrieNode root, int index) {
//
//        if(index==product.length())
//        {root.topThreeSuggesstions.add(product);
////            return top
//        }
//        if (root.next[product.charAt(index) - 'a'] == null)
//            root.next[product.charAt(index) - 'a'] = new TrieNode(26);
//        buildTrie(product, root.next[product.charAt(index) - 'a'], index+1);
//    }

    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return -1;
        int fresh = 0, row = grid.length, col = grid[0].length;
        Queue<int[]> candidates = new LinkedList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1)
                    fresh++;
                else if (grid[i][j] == 2) {
                    candidates.add(new int[]{i, j});
                }
            }
        }
        int day = 0;
        while (!candidates.isEmpty()) {
            if (fresh == 0)
                return day;
            int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
            int size = candidates.size();
            for (int i = 0; i < size; i++) {
                int[] cur = candidates.poll();
                for (int[] dir : dirs) {
                    int x = dir[0] + cur[0];
                    int y = dir[1] + cur[1];
                    if (x >= 0 && y >= 0 && x < row && y < col && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        fresh--;
                        candidates.add(new int[]{x, y});
                    }
                }
            }
            day++;
        }
        return fresh == 0 ? day : -1;

    }

    public static String[] popularToys(int numToys, int topToys, String[] toys, String[] quotes){
        HashMap<String, Toy> toyNameToToy=new HashMap<>();
        for(String toy: toys) toyNameToToy.put(toy, new Toy(toy,0,0));

        for (String quote:quotes) {
            HashSet<String> visited = new HashSet<>();
            for (String word : quote.toLowerCase().replaceAll("!", "").split(" ")){
                if (toyNameToToy.containsKey(word)) {
                    Toy toy = toyNameToToy.get(word);
                    toy.totalCount++;
                    if (!visited.contains(word)) {
                        toy.countPerQuote++;
                        visited.add(word);
                    }
                }
            }
        }

        //This may be a little slower than below cuz of n + nlogn vs nlogn
//        LinkedList<Toy> list=new LinkedList<>();
//        list.addAll(toysToCount.values());
//        Collections.sort(list,(a,b)->
//        {
//            int totalCountCompare=b.totalCount - a.totalCount;
//            if(totalCountCompare==0)
//                return b.countPerQuote-a.countPerQuote;
//            return totalCountCompare;
//        });


        PriorityQueue<Toy> pq=new PriorityQueue<Toy>((a,b)->
        {
            int totalCountCompare=b.totalCount - a.totalCount;
            if(totalCountCompare==0)
                return b.countPerQuote-a.countPerQuote;
            return totalCountCompare;
        });
        for(Toy toy:toyNameToToy.values())
            pq.offer(toy);

        String[] toyOutput=new String[topToys];
        for (int i = 0; i < topToys; i++) {
            toyOutput[i]=pq.poll().toyName;
        }
        return toyOutput;
    }
    static class Toy{
        String toyName;
        int totalCount;
        int countPerQuote;

        public Toy(String toyName, int totalCount, int countPerQuote) {
            this.toyName = toyName;
            this.totalCount = totalCount;
            this.countPerQuote = countPerQuote;
        }
    }
    public static List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int n = arr.size();
        if (x <= arr.get(0)) {
            return arr.subList(0, k);
        } else if (arr.get(n - 1) <= x) {
            return arr.subList(n - k, n);
        } else {
            int index = Collections.binarySearch(arr, x);
            if (index < 0)
                index = -index - 1;
            int low = Math.max(0, index - k - 1), high = Math.min(arr.size() - 1, index + k - 1);

            while (high - low > k - 1) {
                if (low < 0 || (x - arr.get(low)) <= (arr.get(high) - x))
                    high--;
                else if (high > arr.size() - 1 || (x - arr.get(low)) > (arr.get(high) - x))
                    low++;
                else
                    System.out.println("unhandled case: " + low + " " + high);
            }
            return arr.subList(low, high + 1);
        }
    }

    //Handy usage of collection sort to save space
    public static List<Integer> findClosestElementsLongerMethod(List<Integer> arr, int k, int x) {
        Collections.sort(arr, (a,b) -> a == b ? a - b : Math.abs(a-x) - Math.abs(b-x));
        arr = arr.subList(0, k);
        Collections.sort(arr);
        return arr;
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

    //This is faster than the below one
    //It's really about odd or even negative numbers,
    // if it's odd, either the left end one or the right end one should be counted,
    // so it will be revealed by scanning from left and from right in 2 passes.
    // we can also count negatives in the first loop and avoid if count%2==0
    public static int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        int product = 1;
        for (int i = 0; i < nums.length; i++) {
            product *= nums[i];
            if (product > max) max = product;
            if (product == 0) product = 1;
        }
        product = 1;
        for (int j = nums.length - 1; j >= 0; j--) {
            product *= nums[j];
            if (product > max) max = product;
            if (product == 0) product = 1;
        }
        return max;
    }

    //Store previous max and min.
    //if nums[i] is negative then mulitplying it with a negative min will end up as positive hence min and max are multiplied
    public static int maxProdSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max = nums[0], min = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int temp = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min(Math.min(temp * nums[i], min * nums[i]), nums[i]);
            if (max > result) {
                result = max;
            }
        }
        return result;
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

    public static List<String> substringSizeKWithKDistinctChars(String S,int k){
        int distinct=0,i=0;
        int [] memo=new int[26];
        Set<String> set=new HashSet<>();
        for (;i<k;i++){
            if (memo[S.charAt(i)-'a']==0)
                distinct+=1;
            memo[S.charAt(i)-'a']++;
        }
        if (distinct==k) {
            set.add(S.substring(i-k,i));
        }
        while (i<S.length()){
            if (memo[S.charAt(i)-'a']==0)
                distinct+=1;
            memo[S.charAt(i)-'a']++;
            memo[S.charAt(i-k)-'a']--;
            if (memo[S.charAt(i-k)-'a']==0)
                distinct-=1;
            if (distinct==k)
                set.add(S.substring(i-k+1,i+1));
            i++;
        }

        return new ArrayList<>(set);
    }

    //since value of a[i]<a.length we can store in array m
    public static int subarraysWithKDistinct(int[] A, int K) {
        int res = 0, prefix = 0;
        int[] charCount = new int[A.length + 1];
        for (int i = 0, j = 0, distinctCount = 0; i < A.length; ++i) {
            if (charCount[A[i]] == 0) distinctCount++;
            charCount[A[i]]++;

            if (distinctCount > K) {
                charCount[A[j]]--;
                distinctCount--;
                prefix = 0;
                j++;
            }

            while (charCount[A[j]] > 1) {
                prefix++;
                charCount[A[j]]--;
                j++;
            }
            if (distinctCount == K)
                res += prefix + 1;
        }
        return res;
    }

    //Similar to subarray product less than k but with 2 windows
    public static int subarraysWithKDistinctWindow(int[] A, int K) {
        Window window1 = new Window(); // for a valid k char
        Window window2 = new Window();// for < k char
        int ans = 0, left1 = 0, left2 = 0;

        for (int right = 0; right < A.length; ++right) {
            int x = A[right];
            window1.add(x);
            window2.add(x);

            while (window1.getDistinctCount() > K)
                window1.remove(A[left1++]);
            while (window2.getDistinctCount() == K)
                window2.remove(A[left2++]);

            ans += left2 - left1;
        }

        return ans;
    }

    static class Window {
        Map<Integer, Integer> count;
        int distinctCount;

        Window() {
            count = new HashMap();
            distinctCount = 0;
        }

        void add(int x) {
            count.put(x, count.getOrDefault(x, 0) + 1);
            if (count.get(x) == 1)
                distinctCount++;
        }

        void remove(int x) {
            count.put(x, count.get(x) - 1);
            if (count.get(x) == 0)
                distinctCount--;
        }

        int getDistinctCount() {
            return distinctCount;
        }
    }

    public static int subarraysWithKDistinctCharWindow(String A, int K) {
        SlidingWindowChar window1 = new SlidingWindowChar(); // for a valid k char
        SlidingWindowChar window2 = new SlidingWindowChar();// for < k char
        int ans = 0, left1 = 0, left2 = 0;

        for (int right = 0; right < A.length(); ++right) {
            char x = A.charAt(right);
            window1.add(x);
            window2.add(x);

            while (window1.getDistinctCount() > K)
                window1.remove(A.charAt(left1++));
            while (window2.getDistinctCount() == K)
                window2.remove(A.charAt(left2++));

            ans += left2 - left1;
        }

        return ans;
    }

    static class SlidingWindowChar {
        Map<Character, Integer> charToCount;
        int distinctCount;

        SlidingWindowChar() {
            charToCount = new HashMap();
            distinctCount = 0;
        }

        void add(char x) {
            charToCount.put(x, charToCount.getOrDefault(x, 0) + 1);
            if (charToCount.get(x) == 1)
                distinctCount++;
        }

        void remove(char x) {
            charToCount.put(x, charToCount.get(x) - 1);
            if (charToCount.get(x) == 0)
                distinctCount--;
        }

        int getDistinctCount() {
            return distinctCount;
        }
    }

    //doesnt work
    public static int kDistinctSubstringsCount(String s, int k) {
        int start = 0, end = 0, distinctCount = 0, ansCount = 0, currentAns=0;
        int[] characterCount = new int[128];
        while (end < s.length()) {
            if (characterCount[s.charAt(end++)]++ == 0) distinctCount++;
            if (distinctCount == k) {
//                System.out.println(s.substring(start, end));
                if (end - start > k) // >string length
                {
                    ansCount += currentAns+1;
                    currentAns++;
                }
                else
                {
                    ansCount++;
                    currentAns++;
                }
            }

            if (end==s.length() && distinctCount > k) {
                Arrays.fill(characterCount, 0);
                end = start = end - k;
                distinctCount = 0;
                currentAns=0;
            }
        }
        return ansCount;
    }

    //here the subarrays monotonically increase for a valid length
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k <= 1) return 0;
        int prod = 1, ans = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) prod /= nums[left++];
            ans += right - left + 1;
        }
        return ans;
    }

    //Doesnt work- counts the overlapping intervals
    //2-10-5-2 k=101, 2-10-5 & 10-5-2, 10-5 is counted twice
    public static int numSubarrayProductLessThanKMyWay(int[] nums, int k) {
        int start = 0, end = 0, product = 1, output = 0, elementsLessThanK = 0;

        if (k == 0 || k == 1) return 0;

        for (; end < nums.length; end++) {
            if (nums[end] < k)
                elementsLessThanK++;

            product *= nums[end];
            if (product >= k) {
                for (int i = 1; i < end - start; i++)
                    output += i;

                while (product >= k)
                    product /= nums[start++];
            }
        }
        if (product < k)
            for (int i = 1; i < end - start; i++)
                output += i;

        return output + elementsLessThanK;
    }

    //DP didnt understand
    public static int[] maxSumOfThreeSubarrays(int[] nums, int subarrayLength) {
        //W is an array of sums of windows
        int[] W = new int[nums.length - subarrayLength + 1];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (i >= subarrayLength) sum -= nums[i-subarrayLength];
            if (i >= subarrayLength-1) W[i-subarrayLength+1] = sum;
        }

        //indices of w from left
        int[] left = new int[W.length];
        int best = 0;
        for (int i = 0; i < W.length; i++) {
            if (W[i] > W[best]) best = i;
            left[i] = best;
        }

        int[] right = new int[W.length];
        best = W.length - 1;
        for (int i = W.length - 1; i >= 0; i--) {
            if (W[i] >= W[best]) best = i;
            right[i] = best;
        }

        int[] ans = new int[]{-1, -1, -1};
        for (int j = subarrayLength; j < W.length - subarrayLength; j++) {
            int i = left[j - subarrayLength], k = right[j + subarrayLength];
            if (ans[0] == -1 || W[i] + W[j] + W[k] >
                    W[ans[0]] + W[ans[1]] + W[ans[2]]) {

                ans[0] = i;
                ans[1] = j;
                ans[2] = k;
            }
        }
        return ans;
    }

    //Can be done in n2 by cumulative sum
    //rem + k*n = sum.... 7 + 13*3 = 46.....46 % 13 = 7
    public static boolean checkSubarraySum(int[] nums, int k) {
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (k != 0)
                sum = sum % k; // we do this everytime as if its not divisible we can add the remainder also to the next sum... 40%13=1
            if (map.containsKey(sum)) {
                if (i - map.get(sum) > 1) //check min size of array is 2
                    return true;
            } else
                map.put(sum, i);
        }
        return false;
    }

    public static int subarraySumHM(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static int subarraySumBruteForce(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; start++) {
            int sum=0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k)
                    count++;
            }
        }
        return count;
    }

    //Doesnt work for negatives
    public static int subarraySum(int[] nums, int k) {
        int start = 0,end, count = 0, sum = 0;
        for ( end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum > k && start <nums.length) {
                sum -= nums[start++];
            }
            if (start<=end && sum == k) count++;
        }
        while (start<end-1){
            sum-=nums[start++];
            if (sum == k) count++;
        }
        return count;
    }



    public static int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
    //can eliminate out of range numbers and will be much faster
    private static final char[][] CHAR_PAIRS = new char[][]{{'0', '0'}, {'1', '1'}, {'6', '9'}, {'8', '8'}, {'9', '6'}};
    public static int strobogrammaticInRange(String low, String high) {
        int count = 0;

        for (int k = low.length(); k <= high.length(); k++) {
            count += strobogrammaticInRangeHelper(low, high, new char[k], 0, k - 1);
        }

        return count;
    }

    private static int strobogrammaticInRangeHelper(String low, String high, char[] numChars, int left, int right) {
        if (left > right) {
            return isInRange(String.valueOf(numChars), low, high) ? 1 : 0;
        }

        int count = 0;

        for (char[] pair: CHAR_PAIRS) {
            char c = pair[0]; // character
            char p = pair[1]; // partner

            // Skip "0 ... 0" while keeping "0"
            if (left == 0 && right != 0 && c == '0') continue;
            // Skip "... 6 ..." and " ... 9 ... "
            if (left == right && (c == '6' || c == '9')) continue;

            numChars[left] = c;
            numChars[right] = p;
            count += strobogrammaticInRangeHelper(low, high, numChars, left + 1, right - 1);
        }

        return count;
    }

    private static boolean isInRange(String num, String low, String high) {
        int N = num.length();

        if (N < low.length()) {
            return false;
        }
        if (N == low.length() && num.compareTo(low) < 0) {
            return false;
        }

        if (N > high.length()) {
            return false;
        }
        if (N == high.length() && num.compareTo(high) > 0) {
            return false;
        }

        return true;
    }

    //fill each position appears to be faster. can be done faster if memoized like previous one
    public List<String> findStrobogrammaticEachPosition(int n) {
        if (n == 1) {
            return Arrays.asList("0", "1", "8");
        }
        List<String> res = new LinkedList<>();
        char[] arr = new char[n];
        Map<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('6', '9');
        map.put('8', '8');
        map.put('9', '6');
        find(arr, 0, n - 1, map, res);
        return res;
    }

    void find(char[] arr, int left, int right, Map<Character, Character> map, List<String> res) {
        if (left > right) {
            res.add(new String(arr));
            return;
        }
        char[] nums = {'0', '1', '6', '8', '9'};
        for (char n : nums) {
            if (left == 0 && n == '0') {
                continue;
            }
            if (left == right && (n == '6' || n == '9')) {
                continue;
            }
            arr[left] = n;
            arr[right] = map.get(n);
            find(arr, left + 1, right - 1, map, res);
        }
    }

    //Can be done iteratively by storing last 2 lists
    static List<String> findStrobogrammaticRecur(int n, int m) {
        if (n == 0) return new ArrayList<String>(Arrays.asList(""));
        if (n == 1) return new ArrayList<String>(Arrays.asList("0", "1", "8"));

        List<String> list = findStrobogrammaticRecur(n - 2, m);

        List<String> res = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if (n != m) res.add("0" + s + "0");

            res.add("1" + s + "1");
            res.add("6" + s + "9");
            res.add("8" + s + "8");
            res.add("9" + s + "6");
        }

        return res;
    }

    //????Didnt get the equal probability
    public static int pick(int[] a,int target,Random rand) {
        int count = 0;
        for(int i = 0; i < a.length; i++)
            if(target == a[i]) count++;

        int pickIndex = rand.nextInt(count); // returns a random number from 0 to count(excluding)
        for(int i = 0; i < a.length; i++) {
            if(target == a[i]) {
                if(pickIndex-- == 0) return i;
            }
        }
        return 0; // shouldn't come here
    }

    public static boolean canPartitionBottomUp1dArray(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if ((sum & 1) == 1) {
            return false;
        }
        sum /= 2;

        int n = nums.length;
        boolean[] dp = new boolean[sum+1];
        dp[0] = true;

        for (int num : nums) {
            for (int i = sum; i > 0; i--) {
                if (i >= num) {
                    dp[i] = dp[i] || dp[i-num];
                }
            }
        }

        return dp[sum];
    }

    public static boolean canPartitionBottomUp(int[] nums) {
        int sum = 0;
        for (int number : nums)
            sum += number;

        if (sum % 2 != 0) return false;
        boolean[][] dp = new boolean[nums.length][sum / 2 + 1];

        for (int i = 0; i < nums.length; i++)
            dp[i][0] = true;
        for (int i = 1; i < sum / 2 + 1; i++)
            dp[0][i] = i == nums[0] ? true : false;


        for (int row = 1; row < nums.length; row++) {
            for (int col = 1; col < sum / 2 + 1; col++) {
                dp[row][col] = dp[row - 1][col];
                if (!dp[row][col] && nums[row] <= col)
                    dp[row][col] = dp[row - 1][col - nums[row]];
            }
        }

        //with extra row in dp
//        boolean[][] dp = new boolean[nums.length + 1][sum / 2 + 1];
//        for (int i = 0; i < nums.length + 1; i++) {
//            for (int j = 0; j < sum / 2 + 1; j++) {
//                if (j == 0)
//                    dp[i][j] = true;
//                else if (i == 0) dp[i][j] = false;
//                else {
//                    dp[i][j] = dp[i - 1][j];
//                    if (!dp[i][j] && j >= nums[i - 1])
//                        dp[i][j] = dp[i - 1][j - nums[i - 1]];
//                }
//            }
//        }
//        return dp[nums.length][sum / 2];

        return dp[nums.length - 1][sum / 2];
    }

    // TLE
    public static boolean canPartitionTopDown(int[] nums) {
        int sum = 0;
        for (int number : nums)
            sum += number;

        if (sum % 2 != 0) return false;
        boolean[][] dp = new boolean[nums.length][sum / 2 + 1];
        return pick(nums, 0, sum / 2, dp);
    }

    public static boolean pick(int[] nums,int currentIndex, int sum, boolean[][] dp) {
        if (sum == 0) return true;
        if (currentIndex == nums.length) return false;
        if (dp[currentIndex][sum]) return true;
        if (nums[currentIndex] <= sum) {
            if (pick(nums, currentIndex + 1, sum - nums[currentIndex], dp))
                return dp[currentIndex][sum] = true;
        }
        if (pick(nums, currentIndex + 1, sum, dp))
            return dp[currentIndex][sum] = true;
        else
            return false;
    }

    public static ListNode insert(ListNode head, int insertVal) {
        if (head == null) {
            ListNode newNode = new ListNode(insertVal, null);
            newNode.next = newNode;
            return newNode;
        }

        ListNode prev = head;
        ListNode curr = head.next;
        boolean toInsert = false;

        do {
            if (prev.val <= insertVal && insertVal <= curr.val) {
                // Case 1).
                toInsert = true;
            } else if (prev.val > curr.val) {
                // Case 2).
                if (insertVal >= prev.val || insertVal <= curr.val)
                    toInsert = true;
            }

            if (toInsert) {
                prev.next = new ListNode(insertVal, curr);
                return head;
            }

            prev = curr;
            curr = curr.next;
        } while (prev != head);

        // Case 3).
        prev.next = new ListNode(insertVal, curr);
        return head;
    }

    //uses accounts as parent
    public static List<List<String>> accountsMergeUnionFind(List<List<String>> accounts) {
        Map<String, Integer> map = new HashMap(); // email -> account idx
        int[] parent;
        List<List<String>> res = new ArrayList();
        if (accounts == null || accounts.size() == 0) return res;

        parent = new int[accounts.size()];
        for (int i = 0; i < parent.length; i++) parent[i] = i;
        for (int i = 0; i < parent.length; i++) {
            List<String> acc = accounts.get(i);
            for (int j = 1; j < acc.size(); j++){
                Integer prev = map.put(acc.get(j), i);// returns the value in the map
                if (prev != null) {
                    union(prev, i,parent);
                }
            }
        }
        //Grouping
        ArrayList<String>[] children = new ArrayList[parent.length];
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            int idx = find(entry.getValue(),parent);
            if (children[idx] == null){
                children[idx] = new ArrayList();
            }
            children[idx].add(entry.getKey());
        }
        //This can be done rather than find
//        for(int i=0;i<parent.length;i++){
//            if(children[parent[i]]!=null)
//                children[parent[i]]=new ArrayList<>(accounts.get(i));
//            else
//            children[parent[i]].addAll(accounts.get(i));
//        }

        //Sort and assign first element
        for (int i = 0; i < children.length; i++){
            if (children[i] != null){
                List<String> cur = new ArrayList();
                cur.add(accounts.get(i).get(0));
                Collections.sort(children[i]);
                cur.addAll(children[i]);
                res.add(cur);
            }
        }
        return res;
    }
    public static void union(int p, int c,int[] parent){
        int pp = find(p,parent);
        int cc = find(c,parent);
        parent[cc] = pp;
    }
    public static int find(int c,int[] parent){
        if (c != parent[c]){
            parent[c] = find(parent[c],parent);
        }
        return parent[c];
    }

    //uses emails as parent
    public static List<List<String>> accountsMergeUnionFindWithMaxSize(List<List<String>> accounts) {
        DSU dsu = new DSU();
        Map<String, String> emailToName = new HashMap();
        Map<String, Integer> emailToID = new HashMap();
        int id = 0;
        for (List<String> account : accounts) {
            String name = "";
            for (String email : account) {
                if (name == "") {
                    name = email;
                    continue;
                }
                emailToName.put(email, name);
                if (!emailToID.containsKey(email)) {
                    emailToID.put(email, id++);
                }
                dsu.union(emailToID.get(account.get(1)), emailToID.get(email));
            }
        }

        Map<Integer, List<String>> ans = new HashMap();
        for (Map.Entry<String,Integer> entry: emailToID.entrySet()) {
            int index = dsu.find(entry.getValue());
            ans.computeIfAbsent(index, x -> new ArrayList()).add(entry.getKey());
        }
        for (List<String> component : ans.values()) {
            Collections.sort(component);
            component.add(0, emailToName.get(component.get(0)));
        }
        return new ArrayList(ans.values());
    }

    static class DSU {
        int[] parent;

        public DSU() {
            parent = new int[10001];
            for (int i = 0; i <= 10000; ++i)
                parent[i] = i;
        }

        public int find(int x) {
            if (parent[x] != x) parent[x] = find(parent[x]);
            return parent[x];
        }

        public void union(int x, int y) {
            parent[find(x)] = find(y);
        }
    }

    public static List<List<String>> accountsMergeDFS(List<List<String>> accounts) {
        Map<String, String> emailToName = new HashMap();
        Map<String, ArrayList<String>> graph = new HashMap();
        for (List<String> account: accounts) {
            String name = "";
            for (String email: account) {
                if (name == "") {
                    name = email;
                    continue;
                }
                graph.computeIfAbsent(email, x-> new ArrayList<String>()).add(account.get(1));
                graph.computeIfAbsent(account.get(1), x-> new ArrayList<String>()).add(email);
                emailToName.put(email, name);
            }
        }

        Set<String> seen = new HashSet();
        List<List<String>> ans = new ArrayList();
        for (String email: graph.keySet()) {
            if (!seen.contains(email)) {
                seen.add(email);
                Stack<String> stack = new Stack();
                stack.push(email);
                List<String> component = new ArrayList();
                while (!stack.empty()) {
                    String node = stack.pop();
                    component.add(node);
                    for (String nei: graph.get(node)) {
                        if (!seen.contains(nei)) {
                            seen.add(nei);
                            stack.push(nei);
                        }
                    }
                }
                Collections.sort(component);
                component.add(0, emailToName.get(email));
                ans.add(component);
            }
        }
        return ans;
    }

    //Doesnt work because an account can belong to multiple groups
    //    [["David","David0@m.co","David1@m.co"],["David","David3@m.co","David4@m.co"],
    //    ["David","David4@m.co","David5@m.co"],["David","David2@m.co","David3@m.co"],
    //    ["David","David1@m.co","David2@m.co"]]
    public static List<List<String>> accountsMergeMyWay(List<List<String>> accounts) {

        HashMap<String, Integer> emailToIndex = new HashMap<>();
        Iterator<List<String>> iterator = accounts.iterator();
        List<Integer> accountsToRemove = new ArrayList<>();
        for (int i = 0; i < accounts.size(); i++) {
            boolean merge = false;
            Set<String> templList = new HashSet<>();
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);

                if (!emailToIndex.containsKey(email))
                    templList.add(email);
                else {
                    merge = true;
                    mergeAndSort(i, email, emailToIndex, accounts, accountsToRemove);
                    break;
                }
            }
            if (!merge) {

                if (templList.size() < accounts.get(i).size()) {
                    templList.add(accounts.get(i).get(0));
                    accounts.set(i, new ArrayList<>(templList));
                }
                for (String email : templList)
                    emailToIndex.put(email, i);
            }
            Collections.sort(accounts.get(i));
        }

        int i = 0;
        for (int accountIndex : accountsToRemove) {
            accounts.remove(i == 0 ? accountIndex : accountIndex - i);
            i++;
        }
        return accounts;
    }

    public static void mergeAndSort(int sourceIndex, String email, HashMap<String, Integer> emailToIndex,List<List<String>> accounts,List<Integer> accountsToRemove){
        int destinationIndex = emailToIndex.get(email);
        for(int j = 1; j < accounts.get(sourceIndex).size(); j++) {
            String emailToAdd=accounts.get(sourceIndex).get(j);
            if (!emailToIndex.containsKey(emailToAdd)) {
                accounts.get(destinationIndex).add(emailToAdd);
                emailToIndex.put(emailToAdd, destinationIndex);
            }
        }
        accountsToRemove.add(sourceIndex);
            Collections.sort(accounts.get(destinationIndex));
    }


    //Can keep node count and compare it with code and terminate earlier
    //Can do bfs and keep track of only previous code, if diff > 1 return false
    //Can do bfs and keep track of null node and if more nodes are left
    public static boolean isCompleteTree(TreeNode root) {
        List<ANode> nodes = new ArrayList();
        nodes.add(new ANode(root, 1));
        int i = 0;
        while (i < nodes.size()) {
            ANode anode = nodes.get(i++);
            if (anode.node != null) {
                nodes.add(new ANode(anode.node.left, anode.code * 2));
                nodes.add(new ANode(anode.node.right, anode.code * 2 + 1));
            }
        }

        return nodes.get(i - 1).code == nodes.size();
    }


    static class ANode {  // Annotated Node
        TreeNode node;
        int code;

        ANode(TreeNode node, int code) {
            this.node = node;
            this.code = code;
        }
    }
    //fastest, quick termination, goes only after necessary nodes
    public static List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> ans = new LinkedList();
        dfs(root, ans, target, K);
        return ans;
    }

    // Return vertex distance from node to target if exists, else -1
    // Vertex distance: the number of vertices on the path from node to target
    public static int dfs(TreeNode node, List<Integer> ans, TreeNode target, int K) {
        if (node == null)
            return -1;
        else if (node == target) {
            subtree_add(node, 0, ans, K);
            return 1;
        } else {
            int L = dfs(node.left, ans, target, K), R = 0;
            if (L > K) return L + 1; // no point to DFS into right subtree after this
            if (L >= 1) {
                if (L == K) ans.add(node.val);
                else
                    subtree_add(node.right, L + 1, ans, K);
                return L + 1;
            }
            R = dfs(node.right, ans, target, K);
            if (R > K) return R + 1;
            if (R >= 1) {
                if (R == K) ans.add(node.val);
                else
                    subtree_add(node.left, R + 1, ans, K);
                return R + 1;
            }
            return -1;
        }
    }

    // Add all nodes 'K - dist' from the node to answer.
    public static void subtree_add(TreeNode node, int dist, List<Integer> ans, int K) {
        if (node == null) return;
        if (dist == K)
            ans.add(node.val);
        else {
            subtree_add(node.left, dist + 1, ans, K);
            subtree_add(node.right, dist + 1, ans, K);
        }
    }

    public List<Integer> distanceKDfsBfs(TreeNode root, TreeNode target, int K) {
        Map<TreeNode, TreeNode> parent = new HashMap();
        dfs(root, null,parent);

        Queue<TreeNode> queue = new LinkedList();
        queue.add(null);
        queue.add(target);

        Set<TreeNode> seen = new HashSet();
        seen.add(target);
        seen.add(null);

        int dist = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (dist == K) {
                    List<Integer> ans = new ArrayList();
                    for (TreeNode n: queue)
                        ans.add(n.val);
                    return ans;
                }
                queue.offer(null);
                dist++;
            } else {
                if (!seen.contains(node.left)) {
                    seen.add(node.left);
                    queue.offer(node.left);
                }
                if (!seen.contains(node.right)) {
                    seen.add(node.right);
                    queue.offer(node.right);
                }
                TreeNode par = parent.get(node);
                if (!seen.contains(par)) {
                    seen.add(par);
                    queue.offer(par);
                }
            }
        }

        return new ArrayList<Integer>();
    }

    public void dfs(TreeNode node, TreeNode par,Map<TreeNode, TreeNode> parent) {
        if (node != null) {
            parent.put(node, par);
            dfs(node.left, node,parent);
            dfs(node.right, node,parent);
        }
    }

    //build und graph + BFS
    public static List<Integer> distanceKGraph(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new ArrayList<Integer> ();
        Map<TreeNode, List<TreeNode>> map = new HashMap();
        if (root == null || K < 0) return res;
        buildMap(root, null,map);
        if (!map.containsKey(target)) return res;
        Set<TreeNode> visited = new HashSet<TreeNode>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(target);
        visited.add(target);
        while (!q.isEmpty()) {
            int size = q.size();
            if (K == 0) {
                for (int i = 0; i < size ; i++) res.add(q.poll().val);
                return res;
            }
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                for (TreeNode next : map.get(node)) {
                    if (visited.contains(next)) continue;
                    visited.add(next);
                    q.add(next);
                }
            }
            K--;
        }
        return res;
    }

    public static void buildMap(TreeNode node, TreeNode parent, Map<TreeNode, List<TreeNode>> map) {
        if (node == null) return;
        if (!map.containsKey(node)) {
            map.put(node, new ArrayList<TreeNode>());
            if (parent != null)  { map.get(node).add(parent); map.get(parent).add(node) ; }
            buildMap(node.left, node,map);
            buildMap(node.right, node,map);
        }
    }


    //faster
    public int longestArithSeqLengthWithMaxLength(int[] A) {
        int res = 0;
        //array to keep differences and sequence length. dp[i][j] meaning is
        //sequence of length i and difference j. Because of the problem restrictions we can
        //allocate array for differences beforehand (0 <= A[i] <= 10000)
        int[][] dp = new int[A.length][20001];

        //set the right border of the sequence
        for (int i = 0; i < A.length; i++) {
            //start checking sequences by moving left border, so sequences from 0..i to i-1..i will
            //be checked
            for (int j = 0; j < i; j++) {
                //get the difference i and j elements, apply 10.000 shift so we can use array indexes
                int dif = (A[i] - A[j]) + 10000;
                //check if we have seen this difference before, if not - make it of length 2 (i and j makes at least
                //2 elements sequence)
                dp[i][dif] = (dp[j][dif] == 0 ? 1 : dp[j][dif]) + 1;
                //keep running max so we dont have to scan our dp matrix at the end
                res = Math.max(res, dp[i][dif]);
            }
        }
        return res;
    }

    public static int longestArithSeqLength(int[] A) {
        int res = 2, n = A.length;
        HashMap<Integer, Integer>[] dp = new HashMap[n];
        for (int j = 0; j < A.length; j++) {
            dp[j] = new HashMap<>();
            for (int i = 0; i < j; i++) {
                int d = A[j] - A[i];
                dp[j].put(d, dp[i].getOrDefault(d, 1) + 1);
                res = Math.max(res, dp[j].get(d));
            }
        }
        return res;
    }

    //This came out faster.
    //Can also be done with binary search and PQ
    public static List<Integer> closestKValues(TreeNode root, double target, int k) {
        LinkedList<Integer> res = new LinkedList<>();
        collect(root, target, k, res);
        return res;
    }

    public static void collect(TreeNode root, double target, int k, LinkedList<Integer> res) {
        if (root == null) return;
        collect(root.left, target, k, res);

        if (res.size() == k) {
            //if size k, add curent and remove head if it's optimal, otherwise return
            if (Math.abs(target - root.val) < Math.abs(target - res.peekFirst()))
                res.removeFirst();
            else return;
        }
        res.add(root.val);
        collect(root.right, target, k, res);
    }

    //Path of binary search passes over the closes values to target
    //If character counts are equal sort in asc order also helps take different characters
    public static int closestValue(TreeNode root, double target) {
        int val, closest = root.val;
        while (root != null) {
            val = root.val;
            closest = Math.abs(val - target) < Math.abs(closest - target) ? val : closest;
            root =  target < root.val ? root.left : root.right;
        }
        return closest;
    }

    // the key exit here is character count > half of length return ""
    public static String reorganizeString(String S) {
        int N = S.length();
        int[] count = new int[128];
        for (char c: S.toCharArray()) count[c]++;
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) ->
                a[1] == b[1] ? a[0] - b[0] : b[1] - a[1]);

        for (int character = 0; character < 128; ++character) if (count[character] > 0) {
            if (count[character] > (N + 1) / 2) return "";
            pq.add(new int[]{character, count[character]});
        }

        StringBuilder ans = new StringBuilder();
        while (pq.size() >= 2) {
            int[] mc1 = pq.poll();
            int[] mc2 = pq.poll();
            /*This code turns out to be superfluous, but explains what is happening
            if (ans.length() == 0 || mc1.letter != ans.charAt(ans.length() - 1)) {
                ans.append(mc1.letter);
                ans.append(mc2.letter);
            } else {
                ans.append(mc2.letter);
                ans.append(mc1.letter);
            }*/
            ans.append((char)mc1[0]);
            ans.append((char)mc2[0]);
            if (--mc1[1] > 0) pq.add(mc1);
            if (--mc2[1] > 0) pq.add(mc2);
        }

        if (pq.size() > 0) ans.append((char)pq.poll()[0]);
        return ans.toString();
    }

    static class NumMatrixCachingSmarter {

        private int[][] dp;

        public NumMatrixCachingSmarter(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            dp = new int[matrix.length + 1][matrix[0].length + 1];
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    dp[r + 1][c + 1] = dp[r + 1][c] + dp[r][c + 1] + matrix[r][c] - dp[r][c];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return dp[row2 + 1][col2 + 1] - dp[row1][col2 + 1] - dp[row2 + 1][col1] + dp[row1][col1];
        }
    }

    //can also be done without the extra col
    //Similar to range query 1D
    static class NumMatrixCachingRows {

        private int[][] dp;

        public NumMatrixCachingRows(int[][] matrix) {
            if (matrix.length == 0 || matrix[0].length == 0) return;
            dp = new int[matrix.length][matrix[0].length + 1];
            for (int r = 0; r < matrix.length; r++) {
                for (int c = 0; c < matrix[0].length; c++) {
                    dp[r][c + 1] = dp[r][c] + matrix[r][c];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            int sum = 0;
            for (int row = row1; row <= row2; row++) {
                sum += dp[row][col2 + 1] - dp[row][col1];
            }
            return sum;
        }
    }

    class Coordinate{
        TreeNode node;
        int x;  //horizontal
        int y;  //depth
        Coordinate(TreeNode n, int x, int y)
        {
            node = n;
            this.x = x;
            this.y = y;
        }
    }

    public List<List<Integer>> verticalTraversalBfsAndHm(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        Map<Integer, List<Coordinate>> map = new HashMap<>(); //x -> list (some nodes might have same y in the list)

        Queue<Coordinate> q = new LinkedList<>();
        q.add(new Coordinate(root, 0, 0));
        int min = 0, max = 0;
        while(!q.isEmpty())
        {
            Coordinate p = q.remove();

            min = Math.min(min, p.x);
            max = Math.max(max, p.x);

            if(!map.containsKey(p.x))
                map.put(p.x, new ArrayList<>());
            map.get(p.x).add(p);

            if(p.node.left!=null) q.add(new Coordinate(p.node.left, p.x-1, p.y+1));
            if(p.node.right!=null) q.add(new Coordinate(p.node.right, p.x+1, p.y+1));
        }

        for(int i=min; i<=max; i++)
        {
            List<Coordinate> coordinates=map.get(i);
            Collections.sort(coordinates, new Comparator<Coordinate>(){
                public int compare(Coordinate a, Coordinate b)
                {
                    if(a.y==b.y) //when y is equal, sort it by value
                        return a.node.val - b.node.val;
                    return 0; //otherwise don't change the order as BFS guarantees that top nodes are visited first
                }
            });
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<coordinates.size(); j++)
            {
                list.add(coordinates.get(j).node.val);
            }
            lists.add(list);
        }
        return lists;
    }

    static List<Location> locations;

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        locations = new ArrayList();
        dfs(root, 0, 0);
        Collections.sort(locations);

        //Grouping
        List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList<Integer>());
        int prev = locations.get(0).x;
        for (Location loc : locations) {
            // If the x value changed, it's part of a new report.
            if (loc.x != prev) {
                prev = loc.x;
                ans.add(new ArrayList<Integer>());
            }

            // We always add the node's value to the latest report.
            ans.get(ans.size() - 1).add(loc.val);
        }

        return ans;
    }

    public static void dfs(TreeNode node, int x, int y) {
        if (node != null) {
            locations.add(new Location(x, y, node.val));
            dfs(node.left, x - 1, y + 1);
            dfs(node.right, x + 1, y + 1);
        }
    }

    static class Location implements Comparable<Location>{
        int x, y, val;
        Location(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }

        @Override
        public int compareTo(Location that) {
            if (this.x != that.x)
                return Integer.compare(this.x, that.x);
            else if (this.y != that.y)
                return Integer.compare(this.y, that.y);
            else
                return Integer.compare(this.val, that.val);
        }
    }

    private static int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            }
            else {
                lo = mid+1;
            }
        }

        return lo;
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        int leftIdx = extremeInsertionIndex(nums, target, true);

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

        return targetRange;
    }

    public static int[] searchRangeMyWay(int[] nums, int target) {

        int left = 0, mid = 0, right = nums.length - 1;
        int[] output = new int[]{-1, -1};
        if(nums.length==0) return output;
        while (left < right) {
            mid = (left + right) / 2;
            if (target > nums[mid])
                left = mid + 1;
            else if (target < nums[mid])
                right = mid - 1;
            else
                break;
        }

        if (nums[mid] != target && nums[left]!=target)
            return output;

        if(nums[left]==target) mid=left;
        output[1] = output[0] = mid;

        //find first left index
        output[0] = findLeftIndex(0, right, mid, target, nums);

        //find first right index
        output[1] = findRightIndex(0, right, mid, target, nums);

        return output;
    }

    public static int findLeftIndex( int left, int right,int mid, int target, int[] nums) {
        if (mid - 1 >= 0 && nums[mid - 1] == target) {
            right = mid - 1;
            while (left < right) {
                mid = (left + right) / 2;
                if (target > nums[mid])
                    left = mid + 1;
                else if (target < nums[mid])
                    right = mid - 1;
                else
                    return findLeftIndex(left, right, mid, target, nums);
            }
            return left;
        } else
            return mid;
    }

    public static int findRightIndex(int left, int right,int mid, int target, int[] nums) {
        if (mid + 1 <= nums.length - 1 && nums[mid + 1] == target) {
            left = mid + 1;
            while (left < right) {
                mid = (left + right) / 2;
                if (target > nums[mid])
                    left = mid + 1;
                else if (target < nums[mid])
                    right = mid - 1;
                else
                    return findRightIndex(left, right, mid, target, nums);
            }
            return left;
        } else
            return mid;
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }

    public static boolean isNumber(String s) {
        s = s.trim();

        boolean pointSeen = false;
        boolean eSeen = false;
        boolean numberSeen = false;
        boolean numberAfterE = true;
        for (int i = 0; i < s.length(); i++) {
            if ('0' <= s.charAt(i) && s.charAt(i) <= '9') {
                numberSeen = true;
                numberAfterE = true;
            } else if (s.charAt(i) == '.') {
                if (eSeen || pointSeen) {
                    return false;
                }
                pointSeen = true;
            } else if (s.charAt(i) == 'e') {
                if (eSeen || !numberSeen) {
                    return false;
                }
                numberAfterE = false;
                eSeen = true;
            } else if (s.charAt(i) == '-' || s.charAt(i) == '+') {
                if (i != 0 && s.charAt(i - 1) != 'e') {
                    return false;
                }
            } else
                return false;

        }

        return numberSeen && numberAfterE;
    }

    public static String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder("/");
        LinkedList<String> stack = new LinkedList<String>();
        for(String s: path.split("/")){
            if(s.equals("..")){
                if(!stack.isEmpty())
                    stack.removeLast();
            }
            else if(!s.equals("") && !s.equals("."))
                stack.add(s);
        }
        for(String s: stack){
            sb.append(s+"/");
        }
        if(!stack.isEmpty()) sb.setLength(sb.length()-1);
        return sb.toString();
    }


    //Can also covert BST to DLL and iterate over right pointer
    static class BSTIterator {
        Stack<TreeNode> stack;
        public BSTIterator(TreeNode root) {
            stack = new Stack<TreeNode>();
            leftmostInorder(root);
        }

        private void leftmostInorder(TreeNode root) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
        }

        public int next() {
            TreeNode topmostNode = stack.pop();
            if (topmostNode.right != null) {
                leftmostInorder(topmostNode.right);
            }
            return topmostNode.val;
        }

        public boolean hasNext() {
            return stack.size() > 0;
        }
    }

    public static int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for (int age: ages) count[age]++;

        int ans = 0;
        for (int ageA = 0; ageA <= 120; ageA++) {
            int countA = count[ageA];
            for (int ageB = 0; ageB <= ageA; ageB++) {
                int countB = count[ageB];
                if (ageA * 0.5 + 7 >= ageB) continue;
                ans += countA * countB;
                if (ageA == ageB) ans -= countA;
            }
        }

        return ans;
    }

    public static int numFriendRequestsMyWay(int[] ages) {

        int j = 0, i = 1, output = 0;
        if (ages.length < 2) return 0;
        Arrays.sort(ages);
        while (i < ages.length) {
            if (requestPossible(ages[i], ages[j])) {
                if (ages[i] == ages[i - 1]) {
                    int k = i - 1;
                    while (i < ages.length && ages[i] == ages[k]) {
                        output += 2 * (i - k) + k - j;
                        i++;
                    }
                } else {
                    output += i - j;
                    i++;
                }
            } else {
                if(i==j+1) i++;
                j++;

            }
        }
        return output;
    }

    public static boolean requestPossible(int ageOfA, int ageOfB) {
        if (ageOfB <= 0.5 * ageOfA + 7) return false;
        if (ageOfB > ageOfA) return false;
        if (ageOfB > 100 && ageOfA < 100) return false;

        return true;
    }

    //left + (right -left) /2 to prevent overflow
    //return left is important here and parts to skip and part to keep in the binary search
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right-left) / 2;
            System.out.println(mid);
            if(mid<0) break;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int n){
        return n >= 1702766719 ? true :false;

    }


    //this wont work if there are gaps in time, then stack will help as it will go to the previous running task
    public static int[] exclusiveTimeWithoutStack(int n, List <String> logs) {
        int[] res = new int[n];
        String[] s = logs.get(0).split(":");
        int i = 1, prevIndex=0, prevTime = Integer.parseInt(s[2]);
        while (i < logs.size()) {
            s = logs.get(i).split(":");
            if (s[1].equals("start")) {
                res[prevIndex] += Integer.parseInt(s[2]) - prevTime;
                prevIndex=Integer.parseInt(s[0]);
                prevTime = Integer.parseInt(s[2]);
            } else {
                res[Integer.parseInt(s[0])] += Integer.parseInt(s[2]) - prevTime + 1;
                prevIndex=Integer.parseInt(s[0]);
                prevTime = Integer.parseInt(s[2]) + 1;
            }
            i++;
        }
        return res;
    }

    //Can pop the "starts" when new event starts to reduce memory
    public static int[] exclusiveTime(int n, List <String> logs) {
        Stack<Integer> stack = new Stack<>(); //stack of ids
        int[] res = new int[n];
        String[] s = logs.get(0).split(":");
        stack.push(Integer.parseInt(s[0]));
        int i = 1, prevTime = Integer.parseInt(s[2]);
        while (i < logs.size()) {
            s = logs.get(i).split(":");
            if (s[1].equals("start")) {
                if (!stack.isEmpty())
                    res[stack.peek()] += Integer.parseInt(s[2]) - prevTime;
                stack.push(Integer.parseInt(s[0]));
                prevTime = Integer.parseInt(s[2]);
            } else {
                res[stack.pop()] += Integer.parseInt(s[2]) - prevTime + 1; //end will always have its start before it no other start
                prevTime = Integer.parseInt(s[2]) + 1;
            }
            i++;
        }
        return res;
    }

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];
        Arrays.fill(color, -1);

        for (int start = 0; start < n; ++start) {
            if (color[start] == -1) {
                Stack<Integer> stack = new Stack();
                stack.push(start);
                color[start] = 0;

                while (!stack.empty()) {
                    Integer node = stack.pop();
                    for (int nei: graph[node]) {
                        if (color[nei] == -1) {
                            stack.push(nei);
                            color[nei] = color[node] ^ 1;
                        } else if (color[nei] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static int leastIntervalMathematicalWay(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c: tasks)
            map[c - 'A']++;
        Arrays.sort(map);
        int max_val = map[25] - 1, idle_slots = max_val * n;
        for (int i = 24; i >= 0 && map[i] > 0; i--) {
            idle_slots -= Math.min(map[i], max_val);
        }
        return idle_slots > 0 ? idle_slots + tasks.length : tasks.length;
    }

    public static int leastIntervalPQ(char[] tasks, int n) {
        int[] map = new int[26];
        for (char c : tasks)
            map[c - 'A']++;
        PriorityQueue<Integer> queue = new PriorityQueue<>(26, Collections.reverseOrder());
        for (int f : map) {
            if (f > 0)
                queue.add(f);
        }
        int time = 0;
        while (!queue.isEmpty()) {
            int i = 0;
            List<Integer> temp = new ArrayList<>();
            while (i <= n) {
                if (!queue.isEmpty()) {
                    if (queue.peek() > 1)
                        temp.add(queue.poll() - 1);
                    else
                        queue.poll();
                }
                time++;
                if (queue.isEmpty() && temp.isEmpty())
                    break;
                i++;
            }
            for (int l : temp)
                queue.add(l);
        }
        return time;
    }


    //Incorrect doesnt pick based on sorted value
    public static int leastIntervalMyWay(char[] tasks, int n) {
        if (n==0) return tasks.length;
        int tasksCompleted = 0, output = 0;
        HashMap<Character, Integer> taskCount = new HashMap<Character, Integer>();
        HashMap<Character, Integer> waitingQueue = new HashMap<Character, Integer>();

        for (char c : tasks) taskCount.put(c, taskCount.getOrDefault(c, 0) + 1);

        while (tasksCompleted < tasks.length) {
            Iterator<Map.Entry<Character, Integer>> taskCountIterator = taskCount.entrySet().iterator();
            boolean taskExecuted = false;
            while (taskCountIterator.hasNext()) {
                Map.Entry<Character, Integer> entry = taskCountIterator.next();
                Character character = entry.getKey();
                Integer value = entry.getValue();

                //task is pending and has cooled down
                if (value > 0 && !waitingQueue.containsKey(character)) {
                    tasksCompleted++;
                    output++;
                    taskCount.put(character, --value);
                    reduceOtherTasks(waitingQueue);
                    waitingQueue.put(character, n);
                    taskExecuted = true;
                    if(taskCount.get(character)==0) taskCountIterator.remove();
                    break;
                }
            }
            if (!taskExecuted)
            {   output++;
                reduceOtherTasks(waitingQueue);
            }
        }

        return output;

    }

    public static void reduceOtherTasks(HashMap<Character, Integer> waitingQueue) {
        Iterator<Map.Entry<Character, Integer>> iterator = waitingQueue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            Character character = entry.getKey();
            Integer value = entry.getValue();
            if (value == 1)
                iterator.remove();
            if (value > 1)
                waitingQueue.put(character, --value);
        }
    }


    public class Read4 {
        /**
         * @param buf Destination buffer
         * @param n   Number of characters to read
         * @return    The number of actual characters read
         */
        private int tempBufPtr = 0;
        private int readCount = 0;
        private char[] tempBuf = new char[4];
        public int read(char[] buf, int n) {
            int ptr = 0;
            while (ptr < n) {
                if (tempBufPtr == 0) {
                    //readCount = read4(tempBuf); // gives compile error hence commented
                }
                if (readCount == 0) break;
                while (ptr < n && tempBufPtr < readCount) {
                    buf[ptr++] = tempBuf[tempBufPtr++];
                }
                if (tempBufPtr == readCount) tempBufPtr = 0;
            }
            return ptr;
        }
    }

    //Do
    public static List<String> addOperators(String num, int target) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        dfs(res, sb, num.toCharArray(), 0, target, 0, 0);
        return res;

    }

    public static void dfs(List<String> res, StringBuilder sb, char[] num, int pos, int target, long prev, long multi) {
        if(pos == num.length) {
            if(target == prev) res.add(sb.toString());
            return;
        }
        long curr = 0;
        for(int i = pos; i < num.length; i++) {
            if(num[pos] == '0' && i != pos)
                break; //used to prevent 01 as a possibility
            curr = 10 * curr + num[i] - '0'; //used to combine digits 1+23
            int len = sb.length();
            if(pos == 0) {
                dfs(res, sb.append(curr), num, i + 1, target, curr, curr);
                sb.setLength(len);
            } else {
                dfs(res, sb.append("+").append(curr), num, i + 1, target, prev + curr, curr);
                sb.setLength(len);
                dfs(res, sb.append("-").append(curr), num, i + 1, target, prev - curr, -curr);
                sb.setLength(len);
                dfs(res, sb.append("*").append(curr), num, i + 1, target, prev - multi + multi * curr, multi * curr);
                sb.setLength(len);
            }
        }
    }

    // the smallest (first) and the largest (last) nodes
    static TreeNode first = null;
    static TreeNode last = null;

    public static void helper(TreeNode node) {
        if (node != null) {
            helper(node.left); // left
            if (last != null) {
                // link the previous node (last)
                // with the current one (node)
                last.right = node;
                node.left = last;
            }
            else {
                // keep the smallest node
                // to close DLL later on
                first = node;
            }
            last = node;
            helper(node.right); // right
        }
    }

    //BST to circular DLL
    public static TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) return null;

        helper(root);
        // close DLL
        last.right = first;
        first.left = last;
        return first;
    }

    public static boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++)
            index[order.charAt(i) - 'a'] = i;
        for (int i = 0; i < words.length - 1; i++) {
            int length = Math.min(words[i].length(), words[i + 1].length());
            for (int j = 0; j < length; j++)
                if (words[i].charAt(j) != words[i + 1].charAt(j))
                    if (index[words[i].charAt(j) - 'a'] > index[words[i + 1].charAt(j) - 'a'])
                        return false;
                    else
                        length = -1;
            if (length != -1 && words[i].length() > words[i + 1].length())
                return false;
        }
        return true;
    }

    //Do
    public static String addBinaryBitManip(String a, String b) {
        BigInteger x = new BigInteger(a, 2);
        BigInteger y = new BigInteger(b, 2);
        BigInteger zero = new BigInteger("0", 2);
        BigInteger carry, answer;
        while (y.compareTo(zero) != 0) {
            answer = x.xor(y);
            carry = x.and(y).shiftLeft(1);
            x = answer;
            y = carry;
        }
        return x.toString(2);
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void clean_deque(int i, int k,int[] nums,ArrayDeque<Integer> deq) {
        // removes the maximum element not in the sliding window
        if (!deq.isEmpty() && deq.getFirst() == i - k)
            deq.removeFirst();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        while (!deq.isEmpty() && nums[i] > nums[deq.getLast()])
            deq.removeLast();
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (n * k == 0) return new int[0];
        if (k == 1) return nums;
        ArrayDeque<Integer> deq = new ArrayDeque<Integer>();

        // init deque and output
        int max_idx = 0;
        for (int i = 0; i < k; i++) {
            clean_deque(i, k,nums,deq);
            deq.addLast(i);
            // compute max in nums[:k]
            if (nums[i] > nums[max_idx]) max_idx = i;
        }
        int [] output = new int[n - k + 1];
        output[0] = nums[max_idx];

        // build output
        for (int i  = k; i < n; i++) {
            clean_deque(i, k,nums,deq);
            deq.addLast(i);
            output[i - k + 1] = nums[deq.getFirst()];
        }
        return output;
    }

    public static void clean_dequeMaxHeap(int i, int k,int[] nums,PriorityQueue<Integer> deq) {

        // removes the maximum element not in the sliding window
        if (!deq.isEmpty() && deq.peek() == i - k)
            deq.poll();

        // remove from deq indexes of all elements
        // which are smaller than current element nums[i]
        if (!deq.isEmpty() && nums[i] > nums[deq.peek()])
            deq.clear();
    }

    //one test case doesnt pass
    public static int[] maxSlidingWindowMaxHeap(int[] nums, int k) {

        PriorityQueue<Integer> deq = new PriorityQueue<>((a, b) -> nums[b] - nums[a]);
        int max_idx = 0;

        for (int i = 0; i < k; i++) {
            clean_dequeMaxHeap(i, k,nums,deq);
            deq.add(i);
            // compute max in nums[:k]
            if (nums[i] > nums[max_idx]) max_idx = i;
        }

        int [] output = new int[nums.length - k + 1];
        output[0] = nums[max_idx];

        // build output
        for (int i  = k; i < nums.length; i++) {
            clean_dequeMaxHeap(i, k,nums,deq);
            deq.add(i);
            output[i - k + 1] = nums[deq.peek()];
        }
        return output;
    }

    //bidirectional bfs can also be done but is slower than this
    //Other approaches- brute force approach is recursion 2^n, brute force with dp
    //                  target backwards to parent as a node can have only one parent
    public static boolean reachingPointsBackwards(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (sx == tx && sy == ty)
                return true;
            if (tx > ty) tx -= ty;
            else ty -= tx;
        }
        return false;
    }

    //didnt really get it, but modulo will reduce parent operations
    public static boolean reachingPointsBackwardsModulo(int sx, int sy, int tx, int ty) {
        while (tx >= sx && ty >= sy) {
            if (tx == ty) break;
            if (tx > ty) {
                if (ty > sy) tx %= ty;
                else return (tx - sx) % ty == 0;
            } else {
                if (tx > sx) ty %= tx;
                else return (ty - sy) % tx == 0;
            }
        }
        return (tx == sx && ty == sy);
    }


    //Regular expression matching
    //Here the matrix is filled from the end because * patterns are about matches ahead in the string not before
    public static boolean isMatchIterativeDP(String text, String pattern) {
        boolean[][] dp = new boolean[text.length() + 1][pattern.length() + 1];
        dp[text.length()][pattern.length()] = true;

        for (int i = text.length(); i >= 0; i--){
            for (int j = pattern.length() - 1; j >= 0; j--){
                boolean first_match = (i < text.length() &&
                        (pattern.charAt(j) == text.charAt(i) ||
                                pattern.charAt(j) == '.'));
                if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                    dp[i][j] = dp[i][j+2] || first_match && dp[i+1][j];
                } else {
                    dp[i][j] = first_match && dp[i+1][j+1];
                }
            }
        }
        return dp[0][0];
    }

    enum Result{
        TRUE, FALSE
    }

    public static boolean isMatchRecurDP(String text, String pattern) {
        Result[][] memo = new Result[text.length() + 1][pattern.length() + 1];
        return dp(0, 0, text, pattern, memo);
    }

    public static boolean dp(int i, int j, String text, String pattern,Result[][] memo) {
        if (memo[i][j] != null) {
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if (j == pattern.length()){
            ans = i == text.length();
        } else{
            boolean first_match = (i < text.length() &&
                    (pattern.charAt(j) == text.charAt(i) ||
                            pattern.charAt(j) == '.'));

            if (j + 1 < pattern.length() && pattern.charAt(j+1) == '*'){
                ans = (dp(i, j+2, text, pattern,memo) ||
                        first_match && dp(i+1, j, text, pattern,memo));
            } else {
                ans = first_match && dp(i+1, j+1, text, pattern,memo);
            }
        }
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }

    public static boolean isMatchRecur(String text, String pattern) {
        if (pattern.isEmpty()) return text.isEmpty();
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            //does not match the pattern or first char matched
            return (isMatchRecur(text, pattern.substring(2)) || (first_match && isMatchRecur(text.substring(1), pattern)));
        } else {
            return first_match && isMatchRecur(text.substring(1), pattern.substring(1));
        }
    }

    //Doesnt work for .*a or multiple .* with letter in between means have to check for those letters after .*
    public static boolean isMatchMyWay(String s, String p) {

        int i = 0, j = 0;

        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j)=='.') {
                i++;
                j++;
            } else if (p.charAt(j) == '*') {
                char repeatingCharacter = p.charAt(j - 1);
                if(repeatingCharacter=='.' && j+1==p.length()) return true;
                while (i < s.length() && s.charAt(i) == repeatingCharacter) {
                    i++;
                }
                j++;
            } else if (p.charAt(j + 1) == '*') {
                j = j + 2;
            } else
                return false;
        }

        if (i < s.length() || j < p.length()) return false;

        return true;

    }


    public static List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<String>();

        int index = 0;
        while (index < words.length) {
            int count = words[index].length();
            int last = index + 1;
            while (last < words.length) {
                if (words[last].length() + count + 1 > maxWidth) break;
                count += words[last].length() + 1;
                last++;
            }

            StringBuilder builder = new StringBuilder();
            int diff = last - index - 1;
            // if last line or number of words in the line is 1, left-justified
            if (last == words.length || diff == 0) {
                for (int i = index; i < last; i++) {
                    builder.append(words[i] + " ");
                }
                builder.deleteCharAt(builder.length() - 1);
                for (int i = builder.length(); i < maxWidth; i++) {
                    builder.append(" ");
                }
            } else {
                // middle justified
                int spaces = (maxWidth - count) / diff;
                int r = (maxWidth - count) % diff;
                for (int i = index; i < last; i++) {
                    builder.append(words[i]);
                    if (i < last - 1) {
                        for (int j = 0; j <= (spaces + ((i - index) < r ? 1 : 0)); j++) {
                            builder.append(" ");
                        }
                    }
                }
            }
            lines.add(builder.toString());
            index = last;
        }


        return lines;
    }

    //didnt understand
    public static String makeLargestSpecial(String S) {
        if (S.length() == 0) return S;
        int anchor = 0, bal = 0;
        List<String> mountains = new ArrayList();
        for (int i = 0; i < S.length(); ++i) {
            bal += S.charAt(i) == '1' ? 1 : -1;
            if (bal == 0) {
                mountains.add("1" + makeLargestSpecial(S.substring(anchor+1, i)) + "0");
                anchor = i+1;
            }
        }
        Collections.sort(mountains, Collections.reverseOrder());
        StringBuilder ans = new StringBuilder();
        for (String mtn: mountains)
            ans.append(mtn);
        return ans.toString();
    }

    //??? case of "101100101100" is a mystery
    //Could it be that one of the smaller intermediate swaps if continued would be larger than the largest
    public static String makeLargestSpecialMyWayIter(String s) {
        int oneCount = 0, zeroCount = 0;
        HashMap<Integer, HashSet<String>> endIndexMap = new HashMap<>();

        do {
            s=largestNumber;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') zeroCount++;
                else oneCount++;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '0') zeroCount++;
                    else oneCount++;
                    if (zeroCount == oneCount) {
                        String specialString = s.substring(i, j + 1);
                        if (!endIndexMap.containsKey(j + 1)) {
                            HashSet<String> strings = new HashSet<>();
                            strings.add(specialString);
                            endIndexMap.put(j + 1, strings);
                        } else
                            endIndexMap.get(j + 1).add(specialString);

                        //consecutive special strings
                        if (endIndexMap.containsKey(i)) {
                            for (String matchingString : endIndexMap.get(i)) {
                                String swappedMathcingString = s.substring(0, i - matchingString.length()) + specialString + matchingString;
                                String finalString = swappedMathcingString + s.substring(swappedMathcingString.length());
                                largestNumber = finalString.compareTo(largestNumber) == 1 ? finalString : largestNumber;
                            }
                        }

                    }
                }
                zeroCount = oneCount = 0;
            }
            endIndexMap.clear();
        } while (largestNumber.compareTo(s) == 1);

        return largestNumber;
    }

    public static String makeLargestSpecialMyWayRecur(String s) {
        TreeMap<String, String> map=new TreeMap<>((a,b)->{return a.compareTo(b);});
        HashMap<Integer, HashSet<String>> startTimeMap=new HashMap<>();
        largestNumber=s;
        do
        {
            s=largestNumber;
            startTimeMap.clear();
            specialSubstrings(largestNumber, new ArrayList<>(), 0, 0, 0, startTimeMap);

        }while (largestNumber.compareTo(s)==1);

        return largestNumber;
    }

    static String largestNumber="0";
    public static void specialSubstrings(String input, List<Character> tempList,
                                         int start,int zeroCount,int oneCount,HashMap<Integer, HashSet<String>> startTimeMap) {

        if (oneCount == zeroCount && oneCount > 0) {
            String specialString = tempList.stream().map(String::valueOf).collect(Collectors.joining());
//            map.put(start - tempList.size() + "," + start, specialString);
            if (!startTimeMap.containsKey(start - tempList.size())) {
                HashSet<String> strings = new HashSet<>();
                strings.add(specialString);
                startTimeMap.put(start - tempList.size(), strings);
            } else {
                startTimeMap.get(start - tempList.size()).add(specialString);
            }

            if (startTimeMap.containsKey(start)) {
                for (String matchingString : startTimeMap.get(start)) {
                    String swappedMathcingString = input.substring(0, start - tempList.size()) + matchingString + specialString;
                    String finalString = swappedMathcingString + input.substring(swappedMathcingString.length());
                    largestNumber = finalString.compareTo(largestNumber) == 1 ? finalString :largestNumber;
                }
            }

        }
        for (int i = start; i <= start + 1 && i < input.length(); i++) {
            tempList.add(input.charAt(i));
            specialSubstrings(input, tempList, i + 1, input.charAt(i) == '0' ? zeroCount + 1 : zeroCount,
                    input.charAt(i) == '1' ? oneCount + 1 : oneCount, startTimeMap);
            tempList.clear();
            zeroCount = oneCount = 0;

        }

    }

    public static int minMovesMyWay1Pass(int[] nums) {
        int min = nums[0], count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                count += (min - nums[i]) * i;
                min = nums[i];
            } else
                count += nums[i] - min;
        }
        return count;
    }

    public static int minMovesMyWay2Pass(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++)
            min = Math.min(min, nums[i]);

        for (int i = 0; i < nums.length; i++)
            moves += nums[i] - min;

        return moves;
    }

    public static int minMovesSort(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            count += nums[i] - nums[0];
        }
        return count;
    }

    //Num of playlists means there is a possibility of DP
    //????
    public static int numMusicPlaylists(int N, int L, int K) {
        int MOD = 1_000_000_007;

        long[][] dp = new long[L+1][N+1];
        dp[0][0] = 1;
        for (int i = 1; i <= L; ++i)
            for (int j = 1; j <= N; ++j) {
                dp[i][j] += dp[i-1][j-1] * (N-j+1);
                dp[i][j] += dp[i-1][j] * Math.max(j-K, 0);
                dp[i][j] %= MOD;
            }

        return (int) dp[L][N];
    }

    public static void numMusicPlaylistsMyway(int n, int l, int k,List<Integer> tempPlaylist,
                                              List<List<Integer>> playlist,HashMap<Integer,Integer> uniqueMapCount) {

        if (tempPlaylist.size() == l)
        {
            if(uniqueMapCount.size()==n)
            playlist.add(new ArrayList<>(tempPlaylist));
            return;
        }

        for (int i = 1; i <= n; i++) {
            if(uniqueMapCount.containsKey(i) && uniqueMapCount.size()-1<k) continue;

            tempPlaylist.add(i);
            uniqueMapCount.put(i,uniqueMapCount.getOrDefault(i,0)+1);

            numMusicPlaylistsMyway(n,l,k,tempPlaylist,playlist,uniqueMapCount);

            uniqueMapCount.put(i,uniqueMapCount.get(i)-1);
            if(uniqueMapCount.containsKey(i) && uniqueMapCount.get(i)==0)
                uniqueMapCount.remove(i);

            tempPlaylist.remove(tempPlaylist.size()-1);
        }

    }

    //Leetcode solution stores the cycle and uses it for further iterations
    //Do????
    public int[] prisonAfterNDaysStoreCycle(int[] cells, int N) {
        Map<Integer, Integer> seen = new HashMap();

        // state  = integer representing state of prison
        int state = 0;
        for (int i = 0; i < 8; ++i) {
            if (cells[i] > 0)
                state ^= 1 << i;
        }

        // While days remaining, simulate a day
        while (N > 0) {
            // If this is a cycle, fast forward by
            // seen.get(state) - N, the period of the cycle.
            if (seen.containsKey(state)) {
                N %= seen.get(state) - N;
            }
            seen.put(state, N);

            if (N >= 1) {
                N--;
                state = nextDay(state);
            }
        }

        // Convert the state back to the required answer.
        int[] ans = new int[8];
        for (int i = 0; i < 8; ++i) {
            if (((state >> i) & 1) > 0) {
                ans[i] = 1;
            }
        }

        return ans;
    }

    public int nextDay(int state) {
        int ans = 0;

        // We only loop from 1 to 6 because 0 and 7 are impossible,
        // as those cells only have one neighbor.
        for (int i = 1; i <= 6; ++i) {
            if (((state >> (i-1)) & 1) == ((state >> (i+1)) & 1)) {
                ans ^= 1 << i;
            }
        }

        return ans;
    }

    public static int[] prisonAfterNDays(int[] cells, int N) {

        if (N==0)
            return cells;
        while (N>0) {
            int prevOutputValue = 0, currentOutputValue = 0;

            for (int i = 1; i < cells.length - 1; i++) {
                currentOutputValue = cells[i - 1] == cells[i + 1] ? 1: 0;

                cells[i - 1] = prevOutputValue;
                prevOutputValue = currentOutputValue;
            }

            cells[cells.length - 2] = prevOutputValue;
            cells[cells.length - 1] = 0;
            N--;
        }
        return cells;
    }

    static class MinCostMST {

        int[] parent;
        int n;

        private void unionMST(int x, int y) {
            int px = findMST(x);
            int py = findMST(y);

            if (px != py) {
                parent[px] = py;
                n--;
            }
        }

        private int findMST(int x) {
            if (parent[x] == x)
                return parent[x];

            parent[x] = findMST(parent[x]); // path compression
            return parent[x];
        }

        public int minimumCost(int N, int[][] connections) {
            parent = new int[N + 1];
            n = N;
            for (int i = 0; i <= N; i++) {
                parent[i] = i;
            }

            Arrays.sort(connections, (a, b) -> (a[2] - b[2]));

            int res = 0;

            for (int[] c : connections) {
                int x = c[0], y = c[1];
                if (findMST(x) != findMST(y)) {
                    res += c[2];
                    unionMST(x, y);
                }
            }

            return n == 1 ? res : -1;
        }
    }

    //Like Kadane's algo, keep a[i]+i as max
    public static int maxScoreSightSeeingPair(int[] a) {
        int max_so_far = a[0];
        int result = 0;
        for(int j=1;j<a.length;j++){
            result = Math.max(result, max_so_far + a[j] - j);
            max_so_far = Math.max(max_so_far, a[j] + j);
        }
        return result;
    }

    public static int bstDistance(int[] nums, int node1, int node2) {
        TreeNode root = buildBST(nums, node1, node2);
        if (root == null) return -1;
        TreeNode lca = lca(root, node1, node2);
        return getDistance(lca, node1) + getDistance(lca, node2);
    }

    private static int getDistance(TreeNode src, int dest) {
        if (src.val == dest) return 0;
        TreeNode node = src.left;
        if (src.val < dest) {
            node = src.right;
        }
        return 1 + getDistance(node, dest);
    }

    private static TreeNode lca(TreeNode root, int node1, int node2) {
        while (true) {
            if (root.val > node1 && root.val > node2) {
                root = root.left;
            } else if (root.val < node1 && root.val < node2) {
                root = root.right;
            } else {
                return root;
            }
        }
    }

    private static TreeNode buildBST(int[] nums, int node1, int node2) {
        TreeNode root = null;
        boolean found1 = false;
        boolean found2 = false;
        for (int val : nums) {
            if (val == node1) found1 = true;
            if (val == node2) found2 = true;

            TreeNode node = new TreeNode(val);
            if (root == null) {
                root = node;
                continue;
            }
            addToBST(root, node);
        }
        if (!found1 || !found2) return null;
        return root;
    }

    private static void addToBST(TreeNode root, TreeNode node) {
        for (TreeNode curr = root; true; ) {
            if (curr.val > node.val) {
                if (curr.left == null) {
                    curr.left = node;
                    break;
                } else {
                    curr = curr.left;
                }
            } else {
                if (curr.right == null) {
                    curr.right = node;
                    break;
                } else {
                    curr = curr.right;
                }
            }
        }
    }

    //???? Complexity O(2^N N^2).
    //Paths can be memoized so that all nodes are visited only once
    public static List<List<Integer>> allPathsSourceTarget(int[][] graph, int node) {
        int N = graph.length;
        List<List<Integer>> ans = new ArrayList();
        if (node == N - 1) {
            List<Integer> path = new ArrayList();
            path.add(N-1);
            ans.add(path);
            return ans;
        }

        for (int nei: graph[node]) {
            for (List<Integer> path: allPathsSourceTarget(graph, nei)) {
                path.add(0, node);
                ans.add(path);
            }
        }
        return ans;
    }

    public static int maximumMinimumPath(int[][] A) {
        int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}}; //this may be only 2 dir
        int n = A.length;
        int m = A[0].length;
        boolean[][] visited = new boolean[n][m];

        // in the BFS approach, for each step, we are interested in getting the maximum min that we have seen so far, thus we reverse the ordering in the pq(descending)
        Queue<int[]> pq = new PriorityQueue<>((a,b) -> b[2] - a[2]);

        pq.offer(new int[]{0, 0, A[0][0]});

        // BFS
        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int row = cell[0];
            int col = cell[1];

            //this may be on this 2nd last squares
            if (row == n - 1 && col == m - 1) {
                return cell[2];
            }

            visited[row][col] = true;

            for (int[] dir : directions) {
                int nextRow = row + dir[0];
                int nextCol = col + dir[1];

                if (nextRow < 0 || nextRow >= n || nextCol < 0 || nextCol >= m || visited[nextRow][nextCol]) continue;

                // we are keeping track of the min element that we have seen until now
                pq.offer(new int[]{nextRow, nextCol, Math.min(cell[2], A[nextRow][nextCol])});
            }
        }
        return -1;
    }

    static int maxInTreeMap=0;

    //TreeMap.lastKey() goes over the right half of the tree, so it's not O(1)
    public static int findClosestFibTreeMap(int num, TreeMap<Integer,Integer> fibToIndex) {
        int prev = 1, curr = 1, index = 3;

        if (num <= maxInTreeMap) {
            if (num - fibToIndex.floorKey(num) <= fibToIndex.ceilingKey(num) - num)
                return fibToIndex.get(fibToIndex.floorKey(num));
            else
                return fibToIndex.get(fibToIndex.ceilingKey(num));

        } else if (fibToIndex.size() > 0) {
            prev = fibToIndex.floorKey(maxInTreeMap - 1);
            curr = maxInTreeMap;
            index = fibToIndex.get(maxInTreeMap);
        }

        while (curr <= num) {
            fibToIndex.put(curr, index);
            maxInTreeMap = curr;
            int temp = curr;
            curr = prev + curr;
            prev = temp;
            index++;
        }

        if (num - prev <= curr - prev)
            return index - 1;
        else
            return index;
    }

    static class CriticalConnections {
        int edgeIndex = 0;
        int[] to;
        int[] next;
        int[] head;
        int[] low;
        int[] visited;
        int time = -1;
        List<List<Integer>> res = new ArrayList<>();

        private void addEdge(int u, int v) {
            to[edgeIndex] = v;
            next[edgeIndex] = head[u];
            head[u] = edgeIndex ++;
        }

        public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
            low = new int[n+1];
            visited = new int[n+1];
            int m = connections.size();
            to = new int[m * 2];
            head = new int[n+1];
            next = new int[m * 2];
            Arrays.fill(head, -1);
            Arrays.fill(next, -1);
            Arrays.fill(low, -1);
            Arrays.fill(visited, -1);

            for (List<Integer> edge : connections) {
                int u = edge.get(0);
                int v = edge.get(1);
                addEdge(u, v);
                addEdge(v, u);
            }

            dfs(1, -1);
            return res;
        }
        private void dfs(int curr, int parent) {
            //not required
//            if (visited[curr] != -1)
//                return;
            System.out.println("dfs");
            low[curr] = visited[curr] = ++ time;
            for (int edge = head[curr]; edge != -1; edge = next[edge]) {
                int next = to[edge];
                if (next == parent) continue;
                if (visited[next] == -1) {
                    dfs(next, curr);
                    low[curr] = Math.min(low[curr], low[next]);
                    if (visited[curr]< low[next]) {
                        res.add(Arrays.asList(curr, next));
                    }
                } else
                    low[curr] = Math.min(low[curr], visited[next]);

            }
        }
    }

    //Tarjan's bridge-finding algorithm
    //https://www.youtube.com/watch?v=TyWtx7q2D7Y&t=702s
    public static class Bridges {
        private int id;
        private int[] visited;
        private int[] lowLink;
        private List<Integer>[] graph;

        public List<List<Integer>> findBridges(int n, int[][] edges) {
            List<List<Integer>> bridges = new ArrayList<>();
            graph = buildGraph(n, edges);
            visited = new int[n + 1];
            lowLink = new int[n + 1];
            id = 1;
            visit(1, -1, bridges);
            return bridges;
        }

        private void visit(int curr, int parent, List<List<Integer>> bridges) {
            lowLink[curr] = visited[curr] = id++;
            for (int next : graph[curr]) {
                if (next == parent) continue;
                if (visited[next] == 0) { // not visited
                    visit(next, curr, bridges);
                    lowLink[curr] = Math.min(lowLink[curr], lowLink[next]); //making sure on the way back to consolidate to a cycle
                    if (visited[curr] < lowLink[next]) // this means next doesnt belong to current's cycle, so there's a bridge
                        bridges.add(Arrays.asList(curr, next)); //curr might be the critical node

                } else
                    lowLink[curr] = Math.min(lowLink[curr], visited[next]); // consolidating cycles
            }
        }

        private List<Integer>[] buildGraph(int n, int[][] edges) {
            List<Integer>[] graph = new List[n + 1];
            Arrays.setAll(graph, (i) -> new ArrayList<>());
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                graph[u].add(v);
                graph[v].add(u);
            }
            return graph;
        }
    }

    //May be possible to do with DLL and one hashmap like All O one question
    static class LFUCache {
        HashMap<Integer, Integer> keyToVal;
        HashMap<Integer, Integer> keyToCount;
        HashMap<Integer, LinkedHashSet<Integer>> countToLRUKeys;
        int cap;
        int min = -1;

        public LFUCache(int capacity) {
            cap = capacity;
            keyToVal = new HashMap<>();
            keyToCount = new HashMap<>();
            countToLRUKeys = new HashMap<>();
            countToLRUKeys.put(1, new LinkedHashSet<>());
        }

        public int get(int key) {
            if (!keyToVal.containsKey(key))
                return -1;
            int count = keyToCount.get(key);
            keyToCount.put(key, count + 1);
            countToLRUKeys.get(count).remove(key);
            if (count == min && countToLRUKeys.get(count).size() == 0)
                min++;
            if (!countToLRUKeys.containsKey(count + 1))
                countToLRUKeys.put(count + 1, new LinkedHashSet<>());
            countToLRUKeys.get(count + 1).add(key);
            return keyToVal.get(key);
        }

        public void put(int key, int value) {
            if (cap <= 0)
                return;
            if (keyToVal.containsKey(key)) {
                keyToVal.put(key, value);
                get(key);   // inrease frequency when same value is put
                return;
            }
            if (keyToVal.size() >= cap) {
                int evit = countToLRUKeys.get(min).iterator().next();// this removes the least used element
                countToLRUKeys.get(min).remove(evit);
                keyToVal.remove(evit);
            }
            keyToVal.put(key, value);
            keyToCount.put(key, 1);
            min = 1;
            countToLRUKeys.get(1).add(key);
        }
    }

    public static int ladderLengthBiBFS(String beginWord, String endWord, List<String> wordList) {

        if (!wordList.contains(endWord))
            return 0;

        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        // Since all words are of same length.
        int wordLength = beginWord.length();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < wordLength; i++) {
                        // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, wordLength);
                        ArrayList<String> transformations =
                                allComboDict.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        Queue<Pair<String, Integer>> Q_begin = new LinkedList<Pair<String, Integer>>();
        Queue<Pair<String, Integer>> Q_end = new LinkedList<Pair<String, Integer>>();
        Q_begin.add(new Pair(beginWord, 1));
        Q_end.add(new Pair(endWord, 1));

        HashMap<String, Integer> visitedBegin = new HashMap<String, Integer>();
        HashMap<String, Integer> visitedEnd = new HashMap<String, Integer>();
        visitedBegin.put(beginWord, 1);
        visitedEnd.put(endWord, 1);

        while (!Q_begin.isEmpty() && !Q_end.isEmpty()) {

            // One hop from begin word
            int ans = visitWordNode(Q_begin, visitedBegin, visitedEnd, allComboDict, wordLength);
            if (ans > -1)
                return ans;

            // One hop from end word
            ans = visitWordNode(Q_end, visitedEnd, visitedBegin, allComboDict, wordLength);
            if (ans > -1)
                return ans;

        }

        return 0;
    }

    private static int visitWordNode(
            Queue<Pair<String, Integer>> queue,
            HashMap<String, Integer> visited,
            HashMap<String, Integer> othersVisited, HashMap<String, ArrayList<String>> allComboDict, int wordLength) {
        Pair<String, Integer> node = queue.remove();
        String word = node.getKey();
        int level = node.getValue();

        for (int i = 0; i < wordLength; i++) {
            String newWord = word.substring(0, i) + '*' + word.substring(i + 1, wordLength);

            for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                // If at any point if we find what we are looking for
                // i.e. the end word - we can return with the answer.
                if (othersVisited.containsKey(adjacentWord))
                    return level + othersVisited.get(adjacentWord);

                if (!visited.containsKey(adjacentWord)) {
                    visited.put(adjacentWord, level + 1);
                    queue.add(new Pair(adjacentWord, level + 1));
                }
            }
        }
        return -1;
    }

    public static int ladderLengthBFS(String beginWord, String endWord, List<String> wordList) {

        // Since all words are of same length.
        int L = beginWord.length();

        // Dictionary to hold combination of words that can be formed,
        // from any given word. By changing one letter at a time.
        HashMap<String, ArrayList<String>> allComboDict = new HashMap<String, ArrayList<String>>();

        wordList.forEach(
                word -> {
                    for (int i = 0; i < L; i++) {
                        // Key is the generic word
                        // Value is a list of words which have the same intermediate generic word.
                        String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);
                        ArrayList<String> transformations =
                                allComboDict.getOrDefault(newWord, new ArrayList<String>());
                        transformations.add(word);
                        allComboDict.put(newWord, transformations);
                    }
                });

        // Queue for BFS
        Queue<Pair<String, Integer>> Q = new LinkedList<Pair<String, Integer>>();
        Q.add(new Pair(beginWord, 1));

        // Visited to make sure we don't repeat processing same word.
        HashMap<String, Boolean> visited = new HashMap<String, Boolean>();
        visited.put(beginWord, true);

        while (!Q.isEmpty()) {
            Pair<String, Integer> node = Q.remove();
            String word = node.getKey();
            int level = node.getValue();
            for (int i = 0; i < L; i++) {

                // Intermediate words for current word
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, L);

                // Next states are all the words which share the same intermediate state.
                for (String adjacentWord : allComboDict.getOrDefault(newWord, new ArrayList<String>())) {
                    // If at any point if we find what we are looking for
                    // i.e. the end word - we can return with the answer.
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }
                    // Otherwise, add it to the BFS Queue. Also mark it visited
                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        Q.add(new Pair(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }

    //Naive way is keep a PQ/tree set for minimum
    //But only min at each stage is required. So keep an array of [element,min] in the stack.
    //but that also wont scale there will unnecessary min stored if there is not change in min.
    //So push min only when there's a change
    static class MinStack {
        static int min = Integer.MAX_VALUE;
        static Stack<Integer> stack = new Stack<Integer>();
        public static void push(int x) {
            // only push the old minimum value when the current
            // minimum value changes after pushing the new value x
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }

        public static void pop() {
            // if pop operation could result in the changing of the current minimum value,
            // pop twice and change the current minimum value to the last minimum value.
            if(stack.pop() == min) min=stack.pop();
        }

        public static int top() {
            return stack.peek();
        }

        public static int getMin() {
            return min;
        }
    }

    public static boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { // While there may be chars in build(S) or build (T)
            while (i >= 0) { // Find position of next possible char in build(S)
                if (S.charAt(i) == '#') {skipS++; i--;}
                else if (skipS > 0) {skipS--; i--;}
                else break;
            }
            while (j >= 0) { // Find position of next possible char in build(T)
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }
            // If two actual characters are different
            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))
                return false;
            // If expecting to compare char vs nothing
            if ((i >= 0) != (j >= 0))
                return false;
            i--; j--;
        }
        return true;
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill: bills) {
            if (bill == 5)
                five++;
            else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    static int[][] o1MatrixDP(int[][] matrix)
    {
        int rows = matrix.length;
        if (rows == 0)
            return matrix;
        int cols = matrix[0].length;
        int[][] dist= new int[rows][cols];

        //First pass: check for left and top
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE-10000);
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0)
                    dist[i][j] = 0;
                else {
                    if (i > 0)
                        dist[i][j] = Math.min(dist[i][j], dist[i - 1][j] + 1);
                    if (j > 0)
                        dist[i][j] = Math.min(dist[i][j], dist[i][j - 1] + 1);
                }
            }
        }

        //Second pass: check for bottom and right
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (i < rows - 1)
                    dist[i][j] = Math.min(dist[i][j], dist[i + 1][j] + 1);
                if (j < cols - 1)
                    dist[i][j] = Math.min(dist[i][j], dist[i][j + 1] + 1);
            }
        }

        return dist;
    }

    //The important part here is the initial filling with max value and then checking if a new lesser value is available
    //Multi source BFS, multiple ways to reach target node(s)
    //starting BFS from 1s can only be done one 1 at a time, the other 1s in this path may not have the same closest 0
    //Starting with multiple 1s cannot be done cuz of marking visited
    //the above is true for  only one 0 at a time also
    //starting from Multiple 0s(start) get to the closest 1s first
    //marking it visited or checking less than is the same indicator to prevent reusing nodes
    static int[][] o1MatrixBFS(int[][] matrix)
    {
        int rows = matrix.length;
        if (rows == 0)
            return matrix;
        int cols = matrix[0].length;
        int[][] dist= new int[rows][cols];

        Queue<o1Pair> q=new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE-10000);
            for (int j = 0; j < cols; j++)
                if (matrix[i][j] == 0) {
                    dist[i][j] = 0;
                    q.offer(new o1Pair(i, j)); //Put all 0s in the queue.
                }
        }

        int[][] dir=new int[][]{ { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
        while (!q.isEmpty()) {
            o1Pair curr = q.poll();

            for (int i = 0; i < 4; i++) {
                int new_r = curr.first + dir[i][0], new_c = curr.second + dir[i][1];
                if (new_r >= 0 && new_c >= 0 && new_r < rows && new_c < cols) {
                    if (dist[new_r][new_c] > dist[curr.first][curr.second] + 1) {
                        dist[new_r][new_c] = dist[curr.first][curr.second] + 1;
                        q.offer(new o1Pair(new_r, new_c ));
                    }
                }
            }
        }
        return dist;
    }

    static class o1Pair{
        int first;
        int second;
        o1Pair(int i,int j) {
            first = i;
            second = j;
        }
    }

    public static int treasureIslandII(char[][] islands){
        final int[][] dirs = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        if(islands.length == 0 || islands[0].length == 0) return -1;
        int R = islands.length, C = islands[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int steps = 1;
        // add all sources to queue and set 'visited'.
        for(int i = 0; i < R; ++i){
            for(int j = 0; j < C; ++j){
                if(islands[i][j] == 'S'){
                    queue.add(new int[]{i, j}); islands[i][j] = 'D';
                }
            }
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; ++i){
                int[] pos = queue.poll();
                for(int[] dir: dirs){
                    int x = pos[0] + dir[0], y = pos[1] + dir[1];
                    if(x < 0 || x >= R || y < 0 || y >= C || islands[x][y] == 'D') continue;
                    if(islands[x][y] == 'E') return steps;
                    queue.add(new int[]{x, y});
                    islands[x][y] = 'D';
                }
            }
            ++steps;
        }
        return -1;
    }

    public static int connectSticks(int[] sticks) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i: sticks) pq.add(i);
        int res = 0;
        while(pq.size() > 1){
            int t = pq.poll() + pq.poll();   // sum the two smallest
            res +=t;  // count the cost
            pq.offer(t); //
        }
        return res;
    }

    //get pairs that equal a target
    //can also be done by putting the shorter list in a tree map K- value & Value-List of indices. Iterate over the longer one and TM floor will quickly give nearest sum
    //https://leetcode.com/discuss/interview-question/373202
    private static List<int[]> getPairs(List<int[]> a, List<int[]> b, int target) {
        Collections.sort(a, (i,j) -> i[1] - j[1]);
        Collections.sort(b, (i,j) -> i[1] - j[1]);
        List<int[]> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int m = a.size();
        int n = b.size();
        int i =0;
        int j =n-1;
        while(i<m && j >= 0) {
            int sum = a.get(i)[1] + b.get(j)[1];
            if(sum > target) {
                --j;
            } else {
                if(max <= sum) {
                    if(max < sum) {
                        max = sum;
                        result.clear();
                    }
                    result.add(new int[]{a.get(i)[0], b.get(j)[0]});
                    //Add duplicate pairs
                    int index = j-1;
                    while(index >=0 && b.get(index)[1] == b.get(index+1)[1]) {
                        result.add(new int[]{a.get(i)[0], b.get(index--)[0]});
                    }
                }
                ++i;
            }
        }
        return result;
    }

    public static String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (log1, log2) -> {
            String[] split1 = log1.split(" ", 2);
            String[] split2 = log2.split(" ", 2);
            boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
            boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
            if (!isDigit1 && !isDigit2) {
                int cmp = split1[1].compareTo(split2[1]);
                if (cmp != 0) return cmp;
                return split1[0].compareTo(split2[0]);
            }
            return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
        });
        return logs;
    }

    //have to keep them sorted
    //naive way is to sort every time for a median
    //another way, sort while inserting
     static class MedianFinder {
        static PriorityQueue<Integer> lo=new PriorityQueue<>();
        static PriorityQueue<Integer> hi=new PriorityQueue<>(Collections.reverseOrder());

        // Adds a number into the data structure.
        static void addNum(int num)
        {
            lo.offer(num);              // Add to max heap
            hi.offer(lo.poll());        // balancing step

            if (lo.size() < hi.size())   // maintain size property
                lo.offer(hi.poll());

        }

        // Returns the median of current data stream
        static double findMedian()
        {
            return lo.size() > hi.size() ? (double) lo.peek() : (lo.peek() + hi.peek()) * 0.5;
        }
    };

    //distance from intersection and from start to the start of cycle is same
    //2(F+a)= F+a+b+a ie F=b
    public static ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        // If there is a cycle, the fast/slow pointers will intersect at some
        // node. Otherwise, there is no cycle, so we cannot find an entrance to
        // a cycle.
        ListNode intersect = getIntersect(head);
        if (intersect == null) {
            return null;
        }

        // To find the entrance to the cycle, we have two pointers traverse at
        // the same speed -- one from the front of the list, and the other from
        // the point of intersection.
        ListNode ptr1 = head;
        ListNode ptr2 = intersect;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return ptr1;
    }

    public static ListNode getIntersect(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;

        // A fast pointer will either loop around a cycle and meet the slow
        // pointer or reach the `null` at the end of a non-cyclic list.
        while (hare != null && hare.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;
            if (tortoise == hare) {
                return tortoise;
            }
        }

        return null;
    }

    public static boolean isSymmetricIterative(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

    public static boolean isSymmetricRecursive(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val)
                && isSymmetricRecursive(t1.right, t2.left)
                && isSymmetricRecursive(t1.left, t2.right);
    }

    static class TreeNodeNChild {
        TreeNode treeNode;
        boolean isRightSubtree;

        public TreeNodeNChild(TreeNode treeNode, boolean isRightSubtree) {
            this.treeNode = treeNode;
            this.isRightSubtree = isRightSubtree;
        }
    }

    public static List<Integer> boundaryOfBinaryTreeOnePass(TreeNode root){

        List<Integer> exteriorList = new ArrayList<>();

        if(root == null){
            return exteriorList;
        }

        List<Integer> leftBoundaryAndLeavesList = new ArrayList<>();
        List<Integer> rightBoundaryAndLeavesList = new ArrayList<>();

        computeLeftBoundaryAndLeaves(root.left,leftBoundaryAndLeavesList,true);
        computeRightBoundaryAndLeaves(root.right,rightBoundaryAndLeavesList,true);

        exteriorList.add(root.val);
        exteriorList.addAll(leftBoundaryAndLeavesList);
        exteriorList.addAll(rightBoundaryAndLeavesList);

        return exteriorList;

    }

    private static void computeLeftBoundaryAndLeaves(TreeNode root, List<Integer> result,boolean isBoundary){

        if(root!=null){

            if(isBoundary || isLeaf(root)){
                result.add(root.val);
            }

            computeLeftBoundaryAndLeaves(root.left,result,isBoundary);
            computeLeftBoundaryAndLeaves(root.right,result,isBoundary && root.left == null);

        }
    }

    private static void computeRightBoundaryAndLeaves(TreeNode root, List<Integer> result,boolean isBoundary){

        if(root!=null){

            computeRightBoundaryAndLeaves(root.left,result,isBoundary && root.right == null);
            computeRightBoundaryAndLeaves(root.right,result,isBoundary);

            if(isBoundary || isLeaf(root)){
                result.add(root.val);
            }

        }
    }

    public static List<Integer> boundaryOfBinaryTreeMyWayOnePass(TreeNode treeNode) {
        List<Integer> leftBoundaryNLeaves = new ArrayList<>();
        if(treeNode==null) return leftBoundaryNLeaves;
        leftBoundaryNLeaves.add(treeNode.val);
        boundaryOfBinaryTreeMyWay2(treeNode.left, leftBoundaryNLeaves, false, true, leftBoundaryNLeaves.size());
        boundaryOfBinaryTreeMyWay2(treeNode.right, leftBoundaryNLeaves, false, false,leftBoundaryNLeaves.size());
        return leftBoundaryNLeaves;
    }

    public static boolean boundaryOfBinaryTreeMyWay2(TreeNode root, List<Integer> output, boolean boundaryOver, boolean isLeftSubtree, int leftBoundaryNLeavesSize) {
        if (root == null) return boundaryOver;
        if (root.left == null && root.right == null) // add leaf nodes
        {
            boundaryOver = true;
            output.add(getIndex(isLeftSubtree,output.size(),leftBoundaryNLeavesSize), root.val);
            return boundaryOver;
        }
        if (!boundaryOver) { // go for boundary
            output.add(getIndex(isLeftSubtree,output.size(),leftBoundaryNLeavesSize), root.val); //add boundary nodes
            if (getSameDirection(root, isLeftSubtree) == null)
                boundaryOver = boundaryOfBinaryTreeMyWay2(getOppositeDirection(root, isLeftSubtree), output, boundaryOver, isLeftSubtree,leftBoundaryNLeavesSize);
            else {
                boundaryOver = boundaryOfBinaryTreeMyWay2(getSameDirection(root, isLeftSubtree), output, boundaryOver, isLeftSubtree,leftBoundaryNLeavesSize);
                if (boundaryOver)
                    boundaryOfBinaryTreeMyWay2(getOppositeDirection(root, isLeftSubtree), output, boundaryOver, isLeftSubtree,leftBoundaryNLeavesSize);
            }
        } else { //go for leaf nodes
            boundaryOfBinaryTreeMyWay2(getSameDirection(root, isLeftSubtree), output, boundaryOver, isLeftSubtree,leftBoundaryNLeavesSize);
            boundaryOfBinaryTreeMyWay2(getOppositeDirection(root, isLeftSubtree), output, boundaryOver, isLeftSubtree,leftBoundaryNLeavesSize);
        }
        return boundaryOver;
    }

    public static int getIndex(boolean isLeftSubtree,int outputSize,int leftBoundaryNLeavesSize ) {
        return isLeftSubtree ? outputSize : leftBoundaryNLeavesSize;
    }

    public static TreeNode getSameDirection(TreeNode treeNode, boolean left) {
        if (left) return treeNode.left;
        else return treeNode.right;
    }

    public static TreeNode getOppositeDirection(TreeNode treeNode, boolean left) {
        if (left) return treeNode.right;
        else return treeNode.left;
    }

    public static List<Integer> boundaryOfBinaryTreePreOrder(TreeNode root) {
        List<Integer> left_boundary = new LinkedList<>(), right_boundary = new LinkedList<>(), leaves = new LinkedList<>();
        preorder(root, left_boundary, right_boundary, leaves, 0);
        left_boundary.addAll(leaves);
        left_boundary.addAll(right_boundary);
        return left_boundary;
    }

    public static boolean isLeaf(TreeNode cur) {
        return (cur.left == null && cur.right == null);
    }

    public static boolean isRightBoundary(int flag) {
        return (flag == 2);
    }

    public static boolean isLeftBoundary(int flag) {
        return (flag == 1);
    }

    public static boolean isRoot(int flag) {
        return (flag == 0);
    }

    public static int leftChildFlag(TreeNode cur, int flag) {
        if (isLeftBoundary(flag) || isRoot(flag))
            return 1;
        else if (isRightBoundary(flag) && cur.right == null)
            return 2;
        else return 3;
    }

    public static int rightChildFlag(TreeNode cur, int flag) {
        if (isRightBoundary(flag) || isRoot(flag))
            return 2;
        else if (isLeftBoundary(flag) && cur.left == null)
            return 1;
        else return 3;
    }

    public static void preorder(TreeNode cur, List<Integer> left_boundary, List<Integer> right_boundary, List<Integer> leaves, int flag) {
        if (cur == null)
            return;
        if (isRightBoundary(flag))
            right_boundary.add(0, cur.val);
        else if (isLeftBoundary(flag) || isRoot(flag))
            left_boundary.add(cur.val);
        else if (isLeaf(cur))
            leaves.add(cur.val);
        preorder(cur.left, left_boundary, right_boundary, leaves, leftChildFlag(cur, flag));
        preorder(cur.right, left_boundary, right_boundary, leaves, rightChildFlag(cur, flag));
    }

    //This is 2 iterations, can be reduced to one
    public static List<Integer> boundaryOfBinaryTree2Iterations(TreeNode root, List<Integer> nodes) {

        if (root == null) return nodes;

        nodes.add(root.val);
        leftBoundary(root.left, nodes);
        leaves(root.left, nodes);
        leaves(root.right, nodes);
        rightBoundary(root.right, nodes);

        return nodes;
    }

    public static void leftBoundary(TreeNode root, List<Integer> nodes) {
        if (root == null || (root.left == null && root.right == null)) return;
        nodes.add(root.val);
        if (root.left == null) leftBoundary(root.right, nodes);
        else leftBoundary(root.left, nodes);
    }

    public static void rightBoundary(TreeNode root, List<Integer> nodes) {
        if (root == null || (root.right == null && root.left == null)) return;
        if (root.right == null) rightBoundary(root.left, nodes);
        else rightBoundary(root.right, nodes);
        nodes.add(root.val); // add after child visit(reverse)
    }

    public static void leaves(TreeNode root, List<Integer> nodes) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            nodes.add(root.val);
            return;
        }
        leaves(root.left, nodes);
        leaves(root.right, nodes);
    }

    //Doesnt work completely 104/117
    public static List<Integer> boundaryOfBinaryTreeMyWay(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        List<TreeNodeNChild> currentLevelElements = new ArrayList<>();
        ArrayList<Integer> leafNodes = new ArrayList<>();
        Queue<TreeNodeNChild> queue = new LinkedList<>();
        int numberOfElements, left = 0;
        TreeNodeNChild polledNode = null;

        if (root == null) return output;
        output.add(left++, root.val);
        if (root.left != null)
            queue.offer(new TreeNodeNChild(root.left, false));
        if (root.right != null)
            queue.offer(new TreeNodeNChild(root.right, true));

        while (!queue.isEmpty()) {
            currentLevelElements.clear();
            numberOfElements = queue.size();

            if (!queue.peek().isRightSubtree)
                output.add(left++, queue.peek().treeNode.val); // left boundary

            for (int i = 0; i < numberOfElements; i++) {
                polledNode = queue.poll();
                currentLevelElements.add(polledNode);
                if (polledNode.treeNode.left != null) {
                    queue.offer(new TreeNodeNChild(polledNode.treeNode.left, polledNode.isRightSubtree));
                }
                if (polledNode.treeNode.right != null) {
                    queue.offer(new TreeNodeNChild(polledNode.treeNode.right, polledNode.isRightSubtree));
                }
                //Add leaf nodes
                if (polledNode.treeNode.left == null && polledNode.treeNode.right == null && ((i > 0 && i < numberOfElements - 1)
                        || (numberOfElements > 1 && ((i == 0 && polledNode.isRightSubtree) || (i == numberOfElements - 1 && !polledNode.isRightSubtree)))))
                    leafNodes.add(polledNode.treeNode.val);
            }
            if (polledNode.isRightSubtree)
                output.add(left, polledNode.treeNode.val); // right boundary
        }
        for (int i = 0; i <= leafNodes.size() - 1; i++)
            output.add(left++, leafNodes.get(i));

        return output;
    }


    public static int[] shortestToCharFastest(String S, char C) {

        int[] array = new int[S.length()];

        wave(array, S.toCharArray(), C);

        /*for (int i : array) {
            System.out.print(i + ",");
        }*/
        return array;
    }

    public static void wave(int[] array, char[] letter, char c) {
        int counter = 0;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (letter[i] == c) {
                goBack(array, i);
                index = i + 1;
                break;
            } else {
                array[i] = array.length;
            }
        }
        for (int i = index; i < array.length; i++) {
            array[i] = counter = letter[i] != c ? counter + 1 : 0;
            if (array[i] == 0) {
                goBack(array, i);
            }
        }
    }

    public static void goBack(int[] array, int index){
        int counter = 1;
        for (int i = index - 1; i >= 0; i--) {
            if (array[i] > counter) {
                array[i] = counter;
            } else {
                break;
            }
            counter++;
        }
    }

    public static int[] shortestToCharMyWay(String s, char C) {
        int N = s.length();
        int[] ans = new int[N];
        int leftIndex=0 ,leftCount=0, rightIndex=0, rightCount=0;
        Arrays.fill(ans, -1);

        for (int i = 0; i < N; ++i) {
            if (s.charAt(i) == C) {
                //go left
                leftIndex = i;
                leftCount = 0;
                while (leftIndex >= 0 && (ans[leftIndex] == -1 || ans[leftIndex] >= leftCount))
                    ans[leftIndex--] = leftCount++;

                //go right
                rightIndex = i + 1;
                rightCount = 1;
                while (rightIndex <= N - 1 && s.charAt(rightIndex) != C)
                    ans[rightIndex++] = rightCount++;

            }
        }
        return ans;
    }

    public static int[] shortestToChar(String S, char C) {
        int N = S.length();
        int[] ans = new int[N];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = N-1; i >= 0; --i) {
            if (S.charAt(i) == C) prev = i;
            ans[i] = Math.min(ans[i], prev - i);
        }

        return ans;
    }

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> ans = new ArrayList();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            int lo = Math.max(A[i][0], B[j][0]);
            int hi = Math.min(A[i][1], B[j][1]);
            if (lo <= hi)
                ans.add(new int[]{lo, hi});

            // Remove the interval with the smallest endpoint
            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }

        return ans.toArray(new int[ans.size()][2]);
    }

    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    //Approach 1: merge and then sort
    //Approach 2: merge sorted array from begining with extra space
    public static void mergeSortedArrayFromEnd(int[] nums1, int m, int[] nums2, int n) {
        // two get pointers for nums1 and nums2
        int p1 = m - 1;
        int p2 = n - 1;
        // set pointer for nums1
        int p = m + n - 1;

        // while there are still elements to compare
        while ((p1 >= 0) && (p2 >= 0))
            // compare two elements from nums1 and nums2
            // and add the largest one in nums1
            nums1[p--] = (nums1[p1] < nums2[p2]) ? nums2[p2--] : nums1[p1--];

        // add missing elements from nums2
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
    }

    private static Set<String> validExpressions = new HashSet<String>();

    private static void recurse(String s, int index, int leftCount, int rightCount, int leftRem, int rightRem, StringBuilder expression) {

        // If we reached the end of the string, just check if the resulting expression is
        // valid or not and also if we have removed the total number of left and right
        // parentheses that we should have removed.
        if (index == s.length()) {
            if (leftRem == 0 && rightRem == 0)
                validExpressions.add(expression.toString());
        } else {
            char character = s.charAt(index);
            int length = expression.length();

            // The discard case. Note that here we have our pruning condition.
            // We don't recurse if the remaining count for that parenthesis is == 0.
            if ((character == '(' && leftRem > 0) || (character == ')' && rightRem > 0))
                recurse(s, index + 1, leftCount, rightCount, leftRem - (character == '(' ? 1 : 0), rightRem - (character == ')' ? 1 : 0), expression);

            expression.append(character);

            // Simply recurse one step further if the current character is not a parenthesis.
            if (character != '(' && character != ')')
                recurse(s, index + 1, leftCount, rightCount, leftRem, rightRem, expression);
            else if (character == '(')
                recurse(s, index + 1, leftCount + 1, rightCount, leftRem, rightRem, expression); // Consider an opening bracket.
            else if (rightCount < leftCount)
                recurse(s, index + 1, leftCount, rightCount + 1, leftRem, rightRem, expression); // Consider a closing bracket.

            // Delete for backtracking.
            expression.deleteCharAt(length);
        }
    }

    //Do ???
    public static List<String> removeInvalidParentheses(String s) {

        int left = 0, right = 0;

        long startTime = System.currentTimeMillis();
        // First, we find out the number of misplaced left and right parentheses.
        for (int i = 0; i < s.length(); i++) {

            // Simply record the left one.
            if (s.charAt(i) == '(') {
                left++;
            } else if (s.charAt(i) == ')') {
                // If we don't have a matching left, then this is a misplaced right, record it.
                if (left == 0) right = right + 1;

                // Decrement count of left parentheses because we have found a right
                // which CAN be a matching one for a left.
                if (left > 0) left = left - 1;
            }
        }

        System.out.println("time taken " + (System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        recurse(s, 0, 0, 0, left, right, new StringBuilder());
        System.out.println("time taken for output " + (System.currentTimeMillis() - startTime));
        return new ArrayList<String>(validExpressions);
    }


    static int maxValidString=0;
    static int leftBracketTotalCount =0;
    static int rightBracketTotalCount=0;

    //Find number of invalid parentheses question created from this
    //Check for removing combinations when its not brackets
    public static void removeParentheses(StringBuffer tempList, Set<String> output, char[] input, int start, int leftBracketCount, int rightBracketCount) {

        for (int i = start; i < input.length; i++) {
            if (input[i] == ')') rightBracketCount++;
            else if (input[i] == '(') leftBracketCount++;

            if (rightBracketCount <= leftBracketCount && rightBracketCount<=rightBracketTotalCount && leftBracketCount<=leftBracketTotalCount) {
                tempList.append(input[i]);
                if (tempList.length() == maxValidString && rightBracketCount==rightBracketTotalCount && leftBracketCount== leftBracketTotalCount)
                    output.add(tempList.toString());
                removeParentheses(tempList, output, input, i + 1, leftBracketCount, rightBracketCount);
                tempList.setLength(tempList.length() - 1);
            }
            if (input[i] == ')') rightBracketCount--;
            else if (input[i] == '(') leftBracketCount--;
        }
    }

    public static int validParenthesisCount(String s) {

        int count = 0;
        char c = ' ';
        Stack<Character> stack = new Stack<Character>();

        long startTime=System.currentTimeMillis();
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == ')') {
                char topElement = stack.empty() ? '#' : stack.pop();
                //matched pair
                if (topElement == '(') {
                    count += 2;
                    leftBracketTotalCount++;
                    rightBracketTotalCount++;
                }
            } else if (c == '(') stack.push(c);
            else count++;
        }
        System.out.println("time taken "+(System.currentTimeMillis()-startTime));
        return count;
    }

    static class NumberToWords {
        public String one(int num) {
            switch (num) {
                case 1:
                    return "One";
                case 2:
                    return "Two";
                case 3:
                    return "Three";
                case 4:
                    return "Four";
                case 5:
                    return "Five";
                case 6:
                    return "Six";
                case 7:
                    return "Seven";
                case 8:
                    return "Eight";
                case 9:
                    return "Nine";
            }
            return "";
        }

        public String twoLessThan20(int num) {
            switch (num) {
                case 10:
                    return "Ten";
                case 11:
                    return "Eleven";
                case 12:
                    return "Twelve";
                case 13:
                    return "Thirteen";
                case 14:
                    return "Fourteen";
                case 15:
                    return "Fifteen";
                case 16:
                    return "Sixteen";
                case 17:
                    return "Seventeen";
                case 18:
                    return "Eighteen";
                case 19:
                    return "Nineteen";
            }
            return "";
        }

        public String ten(int num) {
            switch (num) {
                case 2:
                    return "Twenty";
                case 3:
                    return "Thirty";
                case 4:
                    return "Forty";
                case 5:
                    return "Fifty";
                case 6:
                    return "Sixty";
                case 7:
                    return "Seventy";
                case 8:
                    return "Eighty";
                case 9:
                    return "Ninety";
            }
            return "";
        }

        public String two(int num) {
            if (num == 0)
                return "";
            else if (num < 10)
                return one(num);
            else if (num < 20)
                return twoLessThan20(num);
            else {
                int tenner = num / 10;
                int rest = num - tenner * 10;
                if (rest != 0)
                    return ten(tenner) + " " + one(rest);
                else
                    return ten(tenner);
            }
        }

        public String three(int num) {
            int hundred = num / 100;
            int rest = num - hundred * 100;
            String res = "";
            if (hundred * rest != 0)
                res = one(hundred) + " Hundred " + two(rest);
            else if ((hundred == 0) && (rest != 0))
                res = two(rest);
            else if ((hundred != 0) && (rest == 0))
                res = one(hundred) + " Hundred";
            return res;
        }

        public String numberToWords(int num) {
            if (num == 0)
                return "Zero";

            int billion = num / 1000000000;
            int million = (num - billion * 1000000000) / 1000000;
            int thousand = (num - billion * 1000000000 - million * 1000000) / 1000;
            int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;

            String result = "";
            if (billion != 0)
                result = three(billion) + " Billion";
            if (million != 0) {
                if (!result.isEmpty())
                    result += " ";
                result += three(million) + " Million";
            }
            if (thousand != 0) {
                if (!result.isEmpty())
                    result += " ";
                result += three(thousand) + " Thousand";
            }
            if (rest != 0) {
                if (!result.isEmpty())
                    result += " ";
                result += three(rest);
            }
            return result;
        }
    }

    //this can better be done by max heap or arrayList & binary search
    public static int[][] kClosest(int[][] points, int K) {
        int N = points.length;
        int[] dists = new int[N];
        for (int i = 0; i < N; ++i)
            dists[i] = dist(points[i]);

        Arrays.sort(dists);
        int distK = dists[K-1];

        int[][] ans = new int[K][2];
        int t = 0;
        for (int i = 0; i < N; ++i)
            if (dist(points[i]) <= distK)
                ans[t++] = points[i];
        return ans;
    }

    public static int dist(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }

    static int trap2Pointers(int[] height) {
        int left = 0, right = height.length - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= left_max) left_max = height[left];
                else ans += left_max - height[left];
                ++left;
            } else {
                if (height[right] >= right_max) right_max = height[right];
                else ans += right_max - height[right];
                --right;
            }
        }
        return ans;
    }

    static int trapStack(int[] height)
    {
        int ans = 0, current = 0;
        Stack<Integer> st=new Stack<>();
        while (current < height.length) {
            while (!st.empty() && height[current] > height[st.peek()]) {
                int top = st.peek();
                st.pop();
                if (st.empty())
                    break;
                int distance = current - st.peek() - 1;
                int bounded_height = Math.min(height[current], height[st.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            st.push(current++);
        }
        return ans;
    }

    static int trapDP(int[] height)
    {
        if(height == null)
            return 0;
        int ans = 0;
        int size = height.length;
        int[] left_max=new int[size], right_max=new int[size];
        left_max[0] = height[0];
        for (int i = 1; i < size; i++) {
            left_max[i] = Math.max(height[i], left_max[i - 1]);
        }
        right_max[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right_max[i] = Math.max(height[i], right_max[i + 1]);
        }
        for (int i = 1; i < size - 1; i++) {
            ans += Math.min(left_max[i], right_max[i]) - height[i];
        }
        return ans;
    }

    static int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }

    static int left, right, val;
    //player 2 can choose either the left, right or parent of 1's node to restrict its maximum nodes
    public static boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        val = x;
        count(root);
        return Math.max(Math.max(left, right), n - left - right - 1) > n / 2;
    }

    static int count(TreeNode node) {
        if (node == null) return 0;
        int l = count(node.left), r = count(node.right);
        if (node.val == val) {
            left = l;
            right = r;
        }
        return l + r + 1;
    }

    //constant space and time. You can also get past getHits() by adding condition timestamp > times[i] && ....
    //This may not be good for concurrency because concurrently accessing the array element is same as int
    static class HitCounterArrays {
        private int[] times;
        private int[] hits;
        /** Initialize your data structure here. */
        public HitCounterArrays() {
            times = new int[300];
            hits = new int[300];
        }

        /** Record a hit.
         @param timestamp - The current timestamp (in seconds granularity). */
        public void hit(int timestamp) {
            int index = timestamp % 300;
            if (times[index] != timestamp) {
                times[index] = timestamp;
                hits[index] = 1;
            } else {
                hits[index]++;
            }
        }

        /** Return the number of hits in the past 5 minutes.
         @param timestamp - The current timestamp (in seconds granularity). */
        public int getHits(int timestamp) {
            int total = 0;
            for (int i = 0; i < 300; i++) {
                if (timestamp - times[i] < 300) {
                    total += hits[i];
                }
            }
            return total;
        }
    }

    //Can handle volume
    static class HitCounterQueue {

        Queue<Integer> q = null;

        /**
         * Initialize your data structure here.
         */
        public HitCounterQueue() {
            q = new LinkedList<Integer>();
        }

        /**
         * Record a hit.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public void hit(int timestamp) {
            q.offer(timestamp);
        }

        /**
         * Return the number of hits in the past 5 minutes.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public int getHits(int timestamp) {
            while (!q.isEmpty() && timestamp - q.peek() >= 300) {
                q.poll();
            }
            return q.size();
        }
    }

    static class HitCounterTreeMap {

        TreeMap<Integer, Integer> map;
        int count = 1;

        /** Initialize your data structure here. */
        public HitCounterTreeMap() {
            map = new TreeMap<Integer, Integer>();
        }

        /** Record a hit.
         @param timestamp - The current timestamp (in seconds granularity). */
        public void hit(int timestamp) {
            map.put(timestamp, count++);
        }

        /** Return the number of hits in the past 5 minutes.
         @param timestamp - The current timestamp (in seconds granularity). */
        public int getHits(int timestamp) {
            return count-1 - (map.floorKey(timestamp-300) == null ? 0 : map.floorEntry(timestamp-300).getValue());
        }
    }

    static class HitCounterTreeMapMyWay {

        TreeMap<Integer, Integer> timestampToHitCounterMap;
        int count = 0;

        /**
         * Initialize your data structure here.
         */
        public HitCounterTreeMapMyWay() {
            timestampToHitCounterMap = new TreeMap<>();
        }

        /**
         * Record a hit.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public void hit(int timestamp) {
            timestampToHitCounterMap.put(timestamp, ++count);
        }

        /**
         * Return the number of hits in the past 5 minutes.
         *
         * @param timestamp - The current timestamp (in seconds granularity).
         */
        public int getHits(int timestamp) {
            if (timestampToHitCounterMap.containsKey(timestamp)) {
                if (timestamp <= 300) return timestampToHitCounterMap.get(timestamp);
                else {
                    if (timestampToHitCounterMap.containsKey(timestamp - 300))
                        return timestampToHitCounterMap.get(timestamp) - timestampToHitCounterMap.get(timestamp - 300);
                    else
                        return timestampToHitCounterMap.get(timestamp) - timestampToHitCounterMap.get(timestampToHitCounterMap.headMap(timestamp - 300).lastKey());
                }
            } else {
                if (timestampToHitCounterMap.headMap(timestamp).size() == 0) return 0;
                int lastKey = timestampToHitCounterMap.headMap(timestamp).lastKey();
                if (timestamp <= 300 && lastKey < 300) return timestampToHitCounterMap.get(lastKey);
                else {
                    if (timestampToHitCounterMap.containsKey(timestamp - 300))
                        return timestampToHitCounterMap.get(lastKey) - timestampToHitCounterMap.get(timestamp - 300);
                    else if (timestampToHitCounterMap.headMap(timestamp - 300).size() == 0)
                        return timestampToHitCounterMap.get(lastKey);
                    else
                        return timestampToHitCounterMap.get(lastKey) - timestampToHitCounterMap.get(timestampToHitCounterMap.headMap(timestamp - 300).lastKey());
                }
            }
        }
    }

    //use value as index to mark presence
    static void printRepeating(int arr[])
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < arr.length; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.println(Math.abs(arr[i]) + " ");
        }
    }

    //Can also be done with an array of hashSets containing value 1 & -1
    //Basically check if each char has the same out degree and in degree.
    // the cases that shouldn't have are. Char pointing to 2 char or a char being pointed by 2 chars
    public static boolean isIsomorphic(String s, String t) {
        int m1[] = new int[256], m2[] = new int[256], n = s.length();
        for (int i = 0; i < n; ++i) {
            if (m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
            m1[s.charAt(i)] = i + 1;
            m2[t.charAt(i)] = i + 1;
        }
        return true;
    }

    public static class ZigzagIterator {

        // Better solution, 6ms
        static Queue<Iterator> q;

        public ZigzagIterator(List<List<Integer>> lists) {
            q = new LinkedList();
            for(List<Integer> list :lists) if (!list.isEmpty()) q.offer(list.iterator());
        }

        public static int next() {
            Iterator cur = q.poll();
            int res = (int) cur.next();
            if (cur.hasNext()) q.offer(cur);
            return res;
        }

        public static boolean hasNext() {
            return q.peek() != null;
        }
    }

    //even comes after odd so need to check for even only and even.next as even.next.next is also accessed
    public static ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head, even = head.next, evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    //similar to trapping water
    public static int[] productExceptSelf(int[] nums) {

        int length = nums.length;
        int[] answer = new int[length];
        answer[0] = 1;
        for (int i = 1; i < length; i++)
            answer[i] = nums[i - 1] * answer[i - 1];

        int R = 1;
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = answer[i] * R;
            R *= nums[i];
        }
        return answer;
    }

    public static RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode iter = head, next;

        // 1->1'->2->2'->3->3'  //the existing list is used to store mapping old->new-old->
        while (iter != null) {
            next = iter.next;
            RandomListNode copy = new RandomListNode(iter.label);
            iter.next = copy;
            copy.next = next;
            iter = next;
        }

        // assign the random pointers
        iter = head;
        while (iter != null) {
            if (iter.random != null) {
                iter.next.random = iter.random.next;
            }
            iter = iter.next.next;
        }

        // separate the lists
        iter = head;
        RandomListNode pseudoHead = new RandomListNode(0);
        RandomListNode copy, copyIter = pseudoHead;
        while (iter != null) {
            next = iter.next.next;
            // extract the copy
            copyIter.next = iter.next;
            copyIter = iter.next;
            // restore the original list
            iter.next = next;
            iter = next;
        }
        return pseudoHead.next;
    }


    public static RandomListNode copyRandomListIterativeWithSpace(RandomListNode head, HashMap<RandomListNode, RandomListNode> visited) {

        if (head == null) return null;

        RandomListNode oldNode = head;

        RandomListNode newNode = new RandomListNode(oldNode.label);
        visited.put(oldNode, newNode);

        while (oldNode != null) {
            newNode.random = getClonedNode(oldNode.random,visited);
            newNode.next = getClonedNode(oldNode.next,visited);

            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        return visited.get(head);
    }

    public static RandomListNode getClonedNode(RandomListNode node, HashMap<RandomListNode, RandomListNode> visited) {
        if (node != null) {
            if (visited.containsKey(node))
                return visited.get(node);
             else {
                visited.put(node, new RandomListNode(node.label));
                return visited.get(node);
            }
        }
        return null;
    }

    static class KthLargest {

        int k = 0;
        int[] arr;
        ArrayList<Integer> list;
        public KthLargest(int k, int[] nums) {
            arr = nums;
            this.k = k;
            list=new ArrayList<>();
            for(int i : nums) add(i);
        }

        public int add(int val) {
            int position=Collections.binarySearch(list,val);
            if(position<0) position=-(position+1);
            list.add(position,val);
            return k>list.size() ? list.get(0):list.get(list.size()-k);
        }
    }

    static class KthLargestPQ {

        int k = 0;
        int[] arr;
        PriorityQueue<Integer> pq;

        public KthLargestPQ(int k, int[] nums) {
            arr = nums;
            this.k = k;
            pq = new PriorityQueue<Integer>((a, b) -> {
                return -(a - b);
            });
            for (int i : arr) pq.add(i);

        }

        public int add(int val) {
            pq.add(val);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 1; i < k; i++) arrayList.add(pq.remove());
            int returnValue = pq.peek();
            for (int i : arrayList) pq.add(i);
            return returnValue;
        }
    }

    int searchSomeOtherSoln(int A[], int n, int target) {
        int lo=0,hi=n-1;
        // find the index of the smallest value using binary search.
        // Loop will terminate since mid < hi, and lo or hi will shrink by at least 1.
        // Proof by contradiction that mid < hi: if mid==hi, then lo==hi and loop would have been terminated.
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(A[mid]>A[hi]) lo=mid+1;
            else hi=mid;
        }
        // lo==hi is the index of the smallest value and also the number of places rotated.
        int rot=lo;
        lo=0;hi=n-1;
        // The usual binary search and accounting for rotation.
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int realmid=(mid+rot)%n;
            if(A[realmid]==target)return realmid;
            if(A[realmid]<target)lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }

    public static int searchInRotatedSortedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;

            if (nums[start] <= nums[mid]){
                if (target < nums[mid] && target >= nums[start])
                    end = mid - 1;
                else
                    start = mid + 1;
            }

            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }

    public static class WordDictionary {
        public class TrieNode {
            public TrieNode[] children = new TrieNode[26];
            public String item = "";
        }

        private TrieNode root = new TrieNode();

        public void addWord(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                if (node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c - 'a'];
            }
            node.item = word;
        }

        public boolean search(String word) {
            return match(word.toCharArray(), 0, root);
        }

        private boolean match(char[] chs, int k, TrieNode node) {
            if (k == chs.length) return !node.item.equals("");
            if (chs[k] != '.') {
                return node.children[chs[k] - 'a'] != null && match(chs, k + 1, node.children[chs[k] - 'a']);
            } else {
                for (int i = 0; i < node.children.length; i++) {
                    if (node.children[i] != null) {
                        if (match(chs, k + 1, node.children[i])) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
    }

    public static void implementTrie(){
        Trie trie=new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));   // returns true
        System.out.println(trie.search("app"));     // returns false
        System.out.println(trie.startsWith("app")); // returns true
        trie.insert("app");
        System.out.println(trie.search("app"));     // returns true
    }

    static class Trie {

        // R links to node children
        private Trie[] links;

        private final int R = 26;

        private boolean isEnd;

        public Trie() {
            links = new Trie[R];
        }

        public boolean containsKey(char ch) {
            return links[ch - 'a'] != null;
        }

        public Trie get(char ch) {
            return links[ch - 'a'];
        }

        public void put(char ch, Trie node) {
            links[ch - 'a'] = node;
        }

        public void setEnd() {
            isEnd = true;
        }

        public boolean isEnd() {
            return isEnd;
        }

        // Inserts a word into the trie.
        public void insert(String word) {
            Trie node =this;
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                if (!node.containsKey(currentChar)) {
                    node.put(currentChar, new Trie());
                }
                node = node.get(currentChar);
            }
            node.setEnd();
        }

        // search a prefix or whole key in trie and
        // returns the node where search ends
        private Trie searchPrefix(String word) {
            Trie node =this;
            for (int i = 0; i < word.length(); i++) {
                char curLetter = word.charAt(i);
                if (node.containsKey(curLetter)) {
                    node = node.get(curLetter);
                } else {
                    return null;
                }
            }
            return node;
        }

        // Returns if the word is in the trie.
        public boolean search(String word) {
            Trie node = searchPrefix(word);
            return node != null && node.isEnd();
        }

        // Returns if there is any word in the trie
        // that starts with the given prefix.
        public boolean startsWith(String prefix) {
            Trie node = searchPrefix(prefix);
            return node != null;
        }
    }

    //can be done from bottom left or top right as from these points u can inc or dec
    public static boolean searchIn2DMatrix(int[][] matrix, int target) {
        // start our "pointer" in the bottom-left
        int row = matrix.length - 1;
        int col = 0;

        while (row >= 0 && col < matrix[0].length) {
            if (matrix[row][col] > target) row--;
            else if (matrix[row][col] < target) col++;
            else return true; // found it
        }

        return false;
    }

    public static int[] asteroidCollisionArray(int[] asteroids) {
        int n = asteroids.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            asteroids[++j] = asteroids[i];
            if (asteroids[i] < 0) {
                while (j >= 1) {
                    int r = asteroids[j], l = asteroids[j - 1];
                    if (l > 0 && r < 0) {
                        if (l > -r) {--j;break;}
                        else if (l < -r) asteroids[--j] = r;
                        else j = j - 2;
                    } else {
                        break;
                    }
                }
            }
        }
        return Arrays.copyOfRange(asteroids, 0, j + 1);
    }

    //Stack is a better DS here than DLL as its cleaner to do remove and add as it happens at the end only
    //Stack extends Vector class which has data stored as an array of objects so stack.elementAt() is fast
    public static int[] asteroidCollisionStack(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.size() == 0) {
                stack.push(asteroid);
                continue;
            }
            if (asteroid < 0 && stack.size() > 0 && stack.peek() > 0) {
                while (stack.size() > 0 && stack.peek() > 0 && Math.abs(asteroid) > Math.abs(stack.peek())) {
                    stack.pop();
                }
                if (stack.size() > 0) {
                    if (stack.peek() < 0) stack.push(asteroid);
                    else if (Math.abs(asteroid) == Math.abs(stack.peek())) stack.pop();
                } else if (stack.size() == 0) stack.push(asteroid);

            } else
                stack.push(asteroid);

        }

        int[] output = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            output[i] = stack.elementAt(i);
        }
        return output;
    }

    public static List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }

    public static void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }

        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);

    }

    //temp class to remove compilation errors
    static class ArrayReader{
        public int get(int m){return m;}
    }
//    Search in sorted array of unknown size
    public static int search(ArrayReader reader, int target) {
        if (reader == null) {
            return -1;
        }

        int l = 0;
        int r = 1;
        while (l <= r) {
            int m = l + (r - l) / 2;

            int medianNum = reader.get(m);

            if (medianNum == 2147483647 || medianNum > target) {
                r = m - 1;
            } else if (medianNum < target) {
                l = m + 1;
                r = l + r;
            } else {
                return m;
            }
        }
        return -1;
    }

    public static void prettyPrint(String input) {
        int spaces = 0;
        int quoteCounter = 0;
        char character = ' ';
        for (int i = 0; i < input.length(); i++) {
            character=input.charAt(i);
            if (quoteCounter == 0 && character == '"') {
                quoteCounter++;
            } else if (quoteCounter == 1 && character == '\"')
                quoteCounter--;


            if (quoteCounter != 1 && character == '{' || character == '[') {
                System.out.print(character);
                printSpaces(spaces+=2);

            } else if (quoteCounter != 1 && character == '}' || character == ']') {
                printSpaces(spaces-=2);
                System.out.print(character);

            } else if (quoteCounter != 1 && input.charAt(i) == ',') {
                System.out.print(character);
                printSpaces(spaces);

            } else if (quoteCounter != 1 && character == ':')
                System.out.print(": ");
            else
                System.out.print(character);

        }
    }

    public static void printSpaces(int spaces){
        System.out.println();
        for (int space = 0; space < spaces; space++)
            System.out.print(" ");
    }


    //Keep + - together in result and /* in tail
    public static int calculateII(String s) {
        int tail = 0;
        char operator = '+';
        int res = 0;
        // char[] charArray = s.toCharArray(); // no need of char array as String is stored as char array
        int num = 0;
        int n = s.length();


        for(int i = 0 ; i < n; i++){
            char c = s.charAt(i); //charAt works on an array
            if(c == ' ') continue;
            if (Character.isDigit(c)){
                num =  c-'0';
                while(i + 1 < n && Character.isDigit(s.charAt(i+1))){
                    num = num * 10 + (s.charAt(i+1) - '0');
                    i++;
                }
                switch (operator){
                    case '+':
                        res +=tail;
                        tail = num;
                        break;
                    case '-':
                        res += tail;
                        tail = -num;
                        break;
                    case '*':
                        tail*=num;
                        break;
                    case '/':
                        tail/=num;
                        break;
                }
            } else {
                operator = c;
            }
        }
        return res + tail;
    }

    public static int calculateI(String s) {

        Stack<Integer> stack = new Stack<Integer>();
        int operand = 0;
        int result = 0; // For the on-going result
        int sign = 1;  // 1 means positive, -1 means negative

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                operand = 10 * operand + (int) (ch - '0');

            else if (ch == '+' || ch == '-') {
                result += sign * operand; //calculate the left part of this sign
                sign = ch == '+' ? 1 : -1; //assign sign for next operation
                operand = 0;

            } else if (ch == '(') {
                stack.push(result); //push result first
                stack.push(sign);
                sign = 1;
                result = 0;

            } else if (ch == ')') {
                result += sign * operand; //complete current bracket
                result *= stack.pop(); //pop sign first
                result += stack.pop();
                operand = 0;
            }
        }
        return result + (sign * operand);
    }

    static int[] father;
    static int cnt;

    //No children count is stored in this method, every time a connection is made the count is incremented
    //Here the array size has to be till the maximum value of a node and integer.
    // In the case of large int values or strings as node values a HM can be used
    public static int countComponentsUnionFind(int n, int[][] edges) {
        father = new int[n];
        cnt = n;
        for (int i = 0; i < n; ++i) {
            father[i] = i;
        }
        for (int[] edge : edges) {
            union(edge[0], edge[1]);
        }
        return cnt;
    }


    private static int find(int x) {
        int fatherOfX = x;
        //Find father of x
        while (fatherOfX != father[fatherOfX]) fatherOfX = father[fatherOfX];

        //Collapsing find
        while (father[x] != fatherOfX) {
            int tmp = father[x];
            father[x] = fatherOfX;
            x = tmp;
        }
        return fatherOfX;
    }

    private static void union(int a, int b) {
        int fa = find(a);
        int fb = find(b);
        if (fa != fb) {
            father[fa] = fb;
            --cnt;
        }
    }


    static int connectedComponentsCount=0;
    public static int countComponentsDFS(int n, int[][] edges) {

        HashSet<Integer> visited = new HashSet<>();
        HashMap<Integer, UndirectedGraphNode> adjList = new HashMap<>();
        UndirectedGraphNode firstNode;
        UndirectedGraphNode secondNode;

        //Create adj list
        for (int i = 0; i < edges.length; i++) {
            if (adjList.get(edges[i][0]) == null) {
                firstNode = new UndirectedGraphNode(edges[i][0]);
                adjList.put(firstNode.value, firstNode);
            } else
                firstNode = adjList.get(edges[i][0]);

            if (adjList.get(edges[i][1]) == null) {
                secondNode = new UndirectedGraphNode(edges[i][1]);
                adjList.put(secondNode.value, secondNode);
            } else
                secondNode = adjList.get(edges[i][1]);


            firstNode.neighbors.add(secondNode);
            secondNode.neighbors.add(firstNode);
        }


        for (int i = 0; i < n; i++) {
            if (!adjList.containsKey(i)) {
                connectedComponentsCount++;
                continue;
            }
            UndirectedGraphNode node = adjList.get(i);
            if (!visited.contains(node.value)) {
                dfs(node, visited, false, -1);
            }
        }

        return connectedComponentsCount;
    }

    public static boolean dfs(UndirectedGraphNode node,HashSet<Integer> visited,boolean flag,int parentValue) {

        if (node == null)
            connectedComponentsCount++;
        if (visited.contains(node.value))
            return flag;

        visited.add(node.value);

        for (UndirectedGraphNode neighbour : node.neighbors) {
            if (neighbour.value == parentValue) continue;
            flag = dfs(neighbour, visited, flag, node.value);
        }
        if (flag == false) {
            flag = true;
            connectedComponentsCount++;
        }
        return flag;
    }

    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList();
        if (matrix.length == 0 || matrix[0].length == 0)  return res;
        // visited by pacific == -1, atlantic == -2, both == -3
        int[][] visited = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            dfs(matrix, visited, i, 0, -1);
            dfs(matrix, visited, i, matrix[0].length-1, -2);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            dfs(matrix, visited, 0, i, -1);
            dfs(matrix, visited, matrix.length-1, i, -2);
        }


        for (int y = 0; y < matrix.length; y++) {
            for (int x = 0; x < matrix[0].length; x++) {
                if (visited[y][x] == -3) {
                    res.add(Arrays.asList(y,x));
                }
            }
        }
        return res;
    }

    private static void dfs(int[][] matrix, int[][] visited, int row, int col, int ocean) {
        int val = matrix[row][col];
        int visitedOcean = visited[row][col];
        if (visitedOcean == ocean || visitedOcean == -3) return;
        visited[row][col] = visitedOcean < 0 ? -3 : ocean;

        boolean left = col > 0 && matrix[row][col-1] >= val;
        boolean right = col < matrix[0].length -1 && matrix[row][col+1] >= val;
        boolean up = row > 0 && matrix[row-1][col] >= val;
        boolean down = row < matrix.length - 1 && matrix[row+1][col] >= val;

        if (left) dfs(matrix, visited, row, col-1, ocean);
        if (right) dfs(matrix, visited, row, col+1, ocean);
        if (up) dfs(matrix, visited, row-1, col, ocean);
        if (down) dfs(matrix, visited, row+1, col, ocean);
    }

    //Space is O(min(m,n)) or may be diagonal
    //BFS space keeps reducing cuz of popping the queue
    public static int numIslandsBFS(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;

        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    grid[r][c] = '0'; // mark as visited
                    Queue<Integer> neighbors = new LinkedList<>();
                    neighbors.add(r * nc + c);
                    while (!neighbors.isEmpty()) {
                        int id = neighbors.remove();
                        int row = id / nc;
                        int col = id % nc;
                        if (row - 1 >= 0 && grid[row-1][col] == '1') {
                            neighbors.add((row-1) * nc + col);
                            grid[row-1][col] = '0';
                        }
                        if (row + 1 < nr && grid[row+1][col] == '1') {
                            neighbors.add((row+1) * nc + col);
                            grid[row+1][col] = '0';
                        }
                        if (col - 1 >= 0 && grid[row][col-1] == '1') {
                            neighbors.add(row * nc + col-1);
                            grid[row][col-1] = '0';
                        }
                        if (col + 1 < nc && grid[row][col+1] == '1') {
                            neighbors.add(row * nc + col+1);
                            grid[row][col+1] = '0';
                        }
                    }
                }
            }
        }

        return num_islands;
    }

    static void dfs(char[][] grid, int r, int c) {
        int nr = grid.length;
        int nc = grid[0].length;

        if (r < 0 || c < 0 || r >= nr || c >= nc || grid[r][c] == '0') return;

        grid[r][c] = '0';
        dfs(grid, r - 1, c);
        dfs(grid, r + 1, c);
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1);
    }

    public static int numIslandsDFS(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int nr = grid.length;
        int nc = grid[0].length;
        int num_islands = 0;
        for (int r = 0; r < nr; ++r) {
            for (int c = 0; c < nc; ++c) {
                if (grid[r][c] == '1') {
                    ++num_islands;
                    dfs(grid, r, c);
                }
            }
        }

        return num_islands;
    }

    static int islandCount=0;
    public static int numIslandsDFSMyWay(int[][] grid) {


        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                if (grid[row][column] == 1) {
                    HashSet<String> visited = new HashSet<>();
                    calculateIsland(grid, row, column, visited);
                }
            }
        }
        return islandCount * -1;
    }

    public static int calculateIsland(int[][] grid, int row, int column,HashSet<String> visited) {

        if (row < 0 || row == grid.length || column < 0 || column == grid[0].length || grid[row][column] == 0) return 0;

        if (grid[row][column] < 0) //existing island
            return grid[row][column];

        if (visited.contains(row + "," + column))//pending island
            return 0;

        if (grid[row][column] == 1) {
            visited.add(row + "," + column);
            int[] tr = {0, -1, 0, 1};
            int[] tc = {1, 0, -1, 0};

            int total = 0;
            for (int i = 0; i < 4; i++) {
                total = calculateIsland(grid, row + tr[i], column + tc[i], visited);
                if (total < 0) {
                    visited.remove(row + "," + column);
                    grid[row][column] = total;
                    return total;
                }

            }
            if (total == 0) {
                islandCount--;
                grid[row][column] = islandCount;
                return islandCount;
            } else if (total < 0)
                grid[row][column] = total;
        }
        return 0;
    }

    public static String alienOrder(String[] words) {
        Map<Character, Set<Character>> adjacencyList = new HashMap<Character, Set<Character>>();
        Map<Character, Integer> degree = new HashMap<Character, Integer>();
        String result = "";
        if (words == null || words.length == 0) return result;
        //default indgrees ( this can be combined in the below loop)
        for (String s : words) {
            for (char c : s.toCharArray()) {
                degree.put(c, 0);
            }
        }

        for (int i = 0; i < words.length - 1; i++) {
            String cur = words[i];
            String next = words[i + 1];
            int length = Math.min(cur.length(), next.length());
            for (int j = 0; j < length; j++) {
                char c1 = cur.charAt(j);
                char c2 = next.charAt(j);
                if (c1 != c2) {
                    Set<Character> set = new HashSet<Character>();
                    if (adjacencyList.containsKey(c1)) set = adjacencyList.get(c1);
                    if (!set.contains(c2)) {
                        set.add(c2);
                        adjacencyList.put(c1, set);
                        degree.put(c2, degree.get(c2) + 1);
                    }
                    break;
                }
            }
        }
        Queue<Character> queue = new LinkedList<Character>();
        for (char c : degree.keySet()) {
            if (degree.get(c) == 0) queue.add(c);
        }
        while (!queue.isEmpty()) {
            char c = queue.remove();
            result += c;
            if (adjacencyList.containsKey(c)) {
                for (char c2 : adjacencyList.get(c)) {
                    degree.put(c2, degree.get(c2) - 1);
                    if (degree.get(c2) == 0) queue.add(c2);
                }
            }
        }
        if (result.length() != degree.size()) return "";
        return result;
    }

    public static String alienDictionary(String[] words) {
        HashMap<Character, UndirectedGraphNodeChar> adjacencyList = new HashMap<>();
        int[] indegree = new int[26];
        Queue<Character> queue = new LinkedList<>();

        if (words.length == 1)
            return words[0];

        int j = 0;
        //Create adjacency list
        for (int i = 0; i < words.length - 1; i++) {
            String word = words[i];
            String nextWord = words[i + 1];

            for (j = 0; j < Math.min(word.length(), nextWord.length()); j++) {
                if (word.charAt(j) == nextWord.charAt(j)) //the loop should continue
                {
                    if (!adjacencyList.containsKey(word.charAt(j))) {
                        adjacencyList.put(word.charAt(j), new UndirectedGraphNodeChar(word.charAt(j)));
                        indegree[word.charAt(j) - 'a']++;
                    }
                } else {  //no point in continuing the loop for adjacencies
                    UndirectedGraphNodeChar firstNode = adjacencyList.get(word.charAt(j));
                    UndirectedGraphNodeChar secondNode = adjacencyList.get(nextWord.charAt(j));
                    if (firstNode == null) {
                        firstNode = new UndirectedGraphNodeChar(word.charAt(j));
                        adjacencyList.put(word.charAt(j), firstNode);
                    }

                    if (secondNode == null)
                        secondNode = new UndirectedGraphNodeChar(nextWord.charAt(j));

                    firstNode.neighbors.add(secondNode);
                    adjacencyList.put(firstNode.value, firstNode);
                    adjacencyList.put(nextWord.charAt(j), secondNode);

                    if (indegree[nextWord.charAt(j) - 'a'] == 0)
                        indegree[nextWord.charAt(j) - 'a'] = 2;
                    else
                        indegree[nextWord.charAt(j) - 'a']++;

                    if (indegree[word.charAt(j) - 'a'] == 0)
                        indegree[word.charAt(j) - 'a'] = 1;

                    addElements(word, adjacencyList, indegree);
                    addElements(nextWord, adjacencyList, indegree);
                    break;
                }
            }
            addElements(word, adjacencyList, indegree);
            addElements(nextWord, adjacencyList, indegree);
        }

        //Add independent elements to Queue
        for (int i = 0; i < 26; i++) {
            if (indegree[i] == 1) {
                queue.add((char) ('a' + i));
            }
        }

        StringBuilder output = new StringBuilder();
        while (!queue.isEmpty()) {

            char poppedChar = queue.poll();
            output.append(poppedChar);
            for (UndirectedGraphNodeChar neighbour : adjacencyList.get(poppedChar).neighbors) {
                if (indegree[neighbour.value - 'a']-- == 2) {
                    queue.add(neighbour.value);
                }
            }
        }

        return output.length() != adjacencyList.size() ? "" : output.toString();
    }

    public static void addElements(String word,HashMap<Character,UndirectedGraphNodeChar> adjacencyList,int[] indegree){

        for (int j = 0; j < word.length(); j++) {

            if(!adjacencyList.containsKey(word.charAt(j))) {
                adjacencyList.put(word.charAt(j), new UndirectedGraphNodeChar(word.charAt(j)));
                indegree[word.charAt(j)-'a']=1;
            }
        }
    }

    //here i cannot be equal to i+1, so binary search works
    //peak is an element greater than its neighbours, return any one peak
    public static int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }


    public static List<String> wordSearchIITrie(char[][] board, String[] words) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrie(words);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, res);
            }
        }
        return res;
    }

    public static void dfs(char[][] board, int i, int j, TrieNode p, List<String> res) {
        char c = board[i][j];
        if (c == '#' || p.next[c - 'a'] == null) return;
        p = p.next[c - 'a'];
        if (p.word != null) {   // found one
            res.add(p.word);
            p.word = null;     // de-duplicate
        }

        board[i][j] = '#';
        if (i > 0) dfs(board, i - 1, j, p, res);
        if (j > 0) dfs(board, i, j - 1, p, res);
        if (i < board.length - 1) dfs(board, i + 1, j, p, res);
        if (j < board[0].length - 1) dfs(board, i, j + 1, p, res);
        board[i][j] = c;
    }

    public static TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode(26);
        for (String w : words) {
            TrieNode p = root;
            for (char c : w.toCharArray()) {
                int i = c - 'a';
                if (p.next[i] == null) p.next[i] = new TrieNode(26);
                p = p.next[i];
            }
            p.word = w;
        }
        return root;
    }

    static HashSet<String> output = new HashSet();
    static HashSet<String> visited = new HashSet<>(), wordDict = new HashSet<>();

    //boilerplate func for leetcode
    public static HashSet<String> findWords(char[][] board, String[] words) {

        for (String i : words) wordDict.add(i);

        wordSearchII(board, visited, wordDict);
        return output;
    }

    //Time limit exceeded solution cuz it goes over all possible combos
    public static void wordSearchII(char[][] input, HashSet<String> visited, HashSet<String> wordDict) {
        for (int row = 0; row < input.length; row++) {
            for (int coloumn = 0; coloumn < input[0].length; coloumn++) {
                findWordsRecur("", input, row, coloumn);
            }
        }
    }

    public static void findWordsRecur(String prefixString, char[][] input, int row, int column) {

        if (!(row >= 0 && row < input.length) || !(column >= 0 && column < input[0].length))
            return;

        if (visited.contains(row + "," + column))
            return;

        prefixString = prefixString + input[row][column];
        visited.add(row + "," + column);
        if (wordDict.contains(prefixString))
            output.add(prefixString);

        findWordsRecur(prefixString, input, row, column + 1);
        findWordsRecur(prefixString, input, row - 1, column + 1);
        findWordsRecur(prefixString, input, row - 1, column);
        findWordsRecur(prefixString, input, row - 1, column - 1);
        findWordsRecur(prefixString, input, row, column - 1);
        findWordsRecur(prefixString, input, row + 1, column - 1);
        findWordsRecur(prefixString, input, row + 1, column);
        findWordsRecur(prefixString, input, row + 1, column + 1);

        visited.remove(row + "," + column);
    }

    //Topological sort assumes the graph is directed and acyclic whereas canFinish() checks whether it is DAC
    public static void topologicalSort(HashMap<Integer, UndirectedGraphNode> graphNodeHashMap) {

        HashSet<Integer> visited = new HashSet<>();
        for (int i : graphNodeHashMap.keySet()) {

            if (!visited.contains(i))
                topoDFS(graphNodeHashMap.get(i), visited);
        }
    }

    public static void topoDFS(UndirectedGraphNode node, HashSet<Integer> visited) {

        visited.add(node.value);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (!visited.contains(neighbor.value))
                topoDFS(neighbor, visited);
        }
        outputStack.push(node.value);
    }

    public static boolean graphBFS(Queue<UndirectedGraphNode> queue, HashSet<Integer> visited, int destination) {

        while (!queue.isEmpty()) {
            UndirectedGraphNode node = queue.poll();

            if (node.value == destination)
                return true;

            for (UndirectedGraphNode neighbour : node.neighbors) {
                if (neighbour.value == destination)
                    return true;
                if (!visited.contains(neighbour.value)) {
                    queue.add(neighbour);
                    visited.add(neighbour.value);
                }
            }
        }
        return false;
    }

    public static boolean graphDFS(UndirectedGraphNode node, HashSet<Integer> visited, int destination) {

        if (node == null || visited.contains(node.value))
            return false;

        if (node.value == destination)
            return true;

        visited.add(node.value);
        for (UndirectedGraphNode g : node.neighbors) {
            if (graphDFS(g, visited, destination))
                return true;
        }
        return false;
    }

    //When Indegree goes to zero means you can go ahead
    //Can finish problem check for circles in a graph
    public static boolean canFinishBFS(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        int[] indegree = new int[numCourses];
        Queue queue = new LinkedList();
        int count = 0;

        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();

        for (int i = 0; i < prerequisites.length; i++) {
            indegree[prerequisites[i][0]]++;
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                count++;
            }
        }

        while (queue.size() != 0) {
            int course = (int) queue.poll();
            for (int i = 0; i < graph[course].size(); i++) {
                int pointer = (int) graph[course].get(i);
                indegree[pointer]--;// mark visited
                if (indegree[pointer] == 0) {
                    queue.add(pointer);
                    count++;
                }
            }
        }
        if (count == numCourses)
            return true;
        else
            return false;
    }

    //Nodes can be marked as acyclic after traversing them to prevent re-traversing
    public static boolean canFinishDFS(int numCourses, int[][] prerequisites) {
        ArrayList[] graph = new ArrayList[numCourses];
        //Initialize array
        for (int i = 0; i < numCourses; i++)
            graph[i] = new ArrayList();

        //Set adjacency list
        boolean[] visited = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            graph[prerequisites[i][1]].add(prerequisites[i][0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, visited, i))
                return false;
        }
        return true;
    }

    private static boolean dfs(ArrayList[] graph, boolean[] visited, int course) {
        if (visited[course])
            return false;
        else
            visited[course] = true;

        for (int i = 0; i < graph[course].size(); i++) {
            if (!dfs(graph, visited, (int) graph[course].get(i)))
                return false;
        }
        visited[course] = false;
        return true;
    }

    private static UndirectedGraphNode clone(UndirectedGraphNode node, HashMap<Integer, UndirectedGraphNode> visited) {
        if (node == null) return null;

        if (visited.containsKey(node.value)) {
            return visited.get(node.value);
        }
        UndirectedGraphNode clone = new UndirectedGraphNode(node.value);
        visited.put(clone.value, clone);
        for (UndirectedGraphNode neighbor : node.neighbors) {
            clone.neighbors.add(clone(neighbor, visited));
        }
        return clone;
    }


    public static int insertLocation(Integer[] input, int number) {

        int low = 0, high = input.length - 1, mid = 0;
        if (input.length == 0)
            return 0;
        while (low < high) {
            mid = (low + high) / 2;
            if (number < input[mid])
                high = mid;
            if (number > input[mid])
                low = mid;
            if (high - low == 1)
                return high;
        }
        return low + 1;
    }

    //Stack preserves order
    public static boolean isValidParenthesis(String s) {

        // Hash table that takes care of the mappings.
        HashMap<Character, Character> mappings=new HashMap<Character, Character>();
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
            } else if(c=='(' || c=='{' || c=='['){
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
                if (openPtr == -1 || openPtr > doneIndex)
                    openPtr = i;

            } else if (character == '}' || character == ')' || character == ']') {
                endPtr = i;
                if (openPtr == -1)
                    return false;

                if (character == '}' && s.charAt(openPtr) != '{')
                    return false;
                if (character == ')' && s.charAt(openPtr) != '(')
                    return false;
                if (character == ']' && s.charAt(openPtr) != '[')
                    return false;

                //there was a pair match at this point
                if (--openPtr == doneIndex) {
                    doneIndex = endPtr;
                    openPtr = -1;
                }
            }
        }
        if (openPtr != -1)
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

    static class LRUCacheLHM extends LinkedHashMap<Integer, Integer>{
        private int capacity;

        public LRUCacheLHM(int capacity) {
            super(capacity, 0.75F, true);
            this.capacity = capacity;
        }

        public int get(int key) {
            return super.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            super.put(key, value);
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return size() > capacity;
        }
    }

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

        private void removeNode(DLinkedNode node) {
            /**
             * Remove an existing node from the linked list.
             */
            DLinkedNode prev = node.prev;
            DLinkedNode next = node.next;

            prev.next = next;
            next.prev = prev;
        }

        private void moveToHead(DLinkedNode node) {
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

            if (node == null) {
                DLinkedNode newNode = new DLinkedNode();
                newNode.key = key;
                newNode.value = value;

                cache.put(key, newNode);
                addNode(newNode);

                ++size;

                if (size > capacity) {
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
        StringBuilder stringLengthSequence = new StringBuilder(".");
        StringBuilder inputSequence = new StringBuilder();
        if (strs.size() == 0)
            return "";
        for (String s : strs) {
            stringLengthSequence.append(s.length() + " ");
            inputSequence.append(s);
        }
        return inputSequence.toString() + stringLengthSequence.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String s) {
        if (s.isEmpty())
            return new ArrayList<String>();

        String[] sequence = s.substring(s.lastIndexOf(".") + 1).split(" ");
        List<String> orinigalList = new ArrayList<String>();
        int startIndex = 0;
        int lenghtOfString = 0;
        for (String number : sequence) {
            lenghtOfString = Integer.parseInt(number);
            orinigalList.add(s.substring(startIndex, startIndex + lenghtOfString));
            startIndex += lenghtOfString;
        }
        return orinigalList;
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

    //For 2 distinct char- can be better with earliest last index of the 2 distinct characters
    // to jump begin ptr quickly rather than inner while loop
    //In the template way only minWindow() has a for loop to set initial values
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int[] map = new int[128];
        char[] sCharArray = s.toCharArray();
        int counter = 0, begin = 0, end = 0, d = 0;
        while (end < sCharArray.length) {
            if (map[sCharArray[end++]]++ == 0) counter++;
            while (counter > k) if (map[sCharArray[begin++]]-- == 1) counter--;
            d = Math.max(d, end - begin);
        }
        return d;
    }

    //Min Mindow, atmost 2 distinct char and without repeating substrings have a template
    //https://leetcode.com/problems/minimum-window-substring/discuss/26808
    public static String minWindowTemplate(String s, String t) {
        int[] charactersOfT = new int[128];
        char[] sCharArray = s.toCharArray();
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
        if (s.indexOf(t) >= 0)
            return t;
        if (t.length() == 1 && s.indexOf(t) < 0)
            return "";

        int start = 0, end = 0;
        String maxString = s + "a";
        HashMap<Character, Integer> remainingSet = new HashMap<Character, Integer>();
        HashMap<Character, Integer> repeatedElements = new HashMap<Character, Integer>();
        HashSet<Character> uniqueCharacters = new HashSet<Character>();
        Queue<CharacterAndIndex> queue = new LinkedList<CharacterAndIndex>();

        boolean firstOccurence = false;

        for (char character : t.toCharArray()) {
            remainingSet.put(character, remainingSet.getOrDefault(character, 0) + 1);
            uniqueCharacters.add(character);
        }

        while (end < s.length() || repeatedElements.size() > 0) {

            while (!remainingSet.isEmpty() && end < s.length()) {
                if (remainingSet.containsKey(s.charAt(end))) {
                    if (!firstOccurence) {
                        start = end;
                        firstOccurence = true;
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
            if (!remainingSet.isEmpty() && end == s.length()) {
                if (maxString.length() <= s.length())
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
            if (!repeatedElements.containsKey(remainingSet.get(0)) && end == s.length())
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

    //>>>Do yr way
    //Longest Repeating Character Replacement
    public static int characterReplacement(String s, int k) {
        int[] count = new int[128];
        int max = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            max = Math.max(max, ++count[s.charAt(end)]);
            if (max + k < end - start + 1)
                count[s.charAt(start++)]--;
        }
        return s.length() - start;// the window of length-start is taken forward always and we try to see if we can better from that number for each end index.
    }

    //In BST iterative, may not need stack as u can move through searching
    //LCA can be asked for BT also, there whole tree needs to be searched except for inside a node that has matched.
    public static TreeNode lowestCommonAncestorRecur(TreeNode root, TreeNode p, TreeNode q) {

        int parentVal = root.val;
        int pVal = p.val;
        int qVal = q.val;

            // If both p and q are greater than parent
        if (pVal > parentVal && qVal > parentVal)
            return lowestCommonAncestorRecur(root.right, p, q);
         else if (pVal < parentVal && qVal < parentVal)
             return lowestCommonAncestorRecur(root.left, p, q);
         else // We have found the split point, i.e. the LCA node.
            return root;
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

    public static int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) root = root.left;
        return root.val;
    }

    /*
    One step left and then always right
    */
    public static int predecessor(TreeNode root) {
        root = root.left;
        while (root.right != null) root = root.right;
        return root.val;
    }

    public static TreeNode deleteBST(TreeNode root, int key) {
        if (root == null) return null;

        // delete from the right subtree
        if (key > root.val) root.right = deleteBST(root.right, key);
        // delete from the left subtree
        else if (key < root.val) root.left = deleteBST(root.left, key);
        else { // delete the current node

            // the node is a leaf
            if (root.left == null && root.right == null) root = null;
                // the node is not a leaf and has a right child
            else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteBST(root.right, root.val);
            }
            // the node is not a leaf, has no right child, and has a left child
            else {
                root.val = predecessor(root);
                root.left = deleteBST(root.left, root.val);
            }
        }
        return root;
    }

    public static TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode node = root;
        while (node != null) {
            // insert into the right subtree
            if (val > node.val) {
                // insert right now
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    return root;
                } else node = node.right;
            }
            // insert into the left subtree
            else {
                // insert right now
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    return root;
                } else node = node.left;
            }
        }
        return new TreeNode(val);
    }

    //    >>>>>???? Check for insert + search optimisation, doubly ll solution
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

    //Kth smallest and validate BST have the same procedure,
    // get inorder, push all left then compare root and move right and repeat
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

    public static boolean isValidBSTInorderArray(TreeNode root, int[] inorderLastElement) {

        if (root == null)
            return true;

        if (!isValidBSTInorderArray(root.left, inorderLastElement)) return false;

        if (root.val <= inorderLastElement[0])
            return false;
        else
            inorderLastElement[0] = root.val;

        if (!isValidBSTInorderArray(root.right, inorderLastElement)) return false;

        return true;
    }

//    dfs - stack(Iterative)
//    bfs - queue(Iterative(levelorder) or recursion)
//    Parent's value and level can be stored within recursion, no extra space required
//    Inorder in BST gives ascending order

    public static boolean isValidBSTInorder(TreeNode root) {
        Stack<TreeNode> stack = new Stack();
        double inorder = -Double.MAX_VALUE;

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

        if (!isValidBSTRecur(node.right, val, upper)) return false;
        if (!isValidBSTRecur(node.left, lower, val)) return false;
        return true;
    }

    public static boolean equals(TreeNode x, TreeNode y) {
        if (x == null && y == null)
            return true;
        if (x == null || y == null)
            return false;
        return x.val == y.val && equals(x.left, y.left) && equals(x.right, y.right);
    }

    public static boolean isSubtreeCompare(TreeNode s, TreeNode t) {
        return s != null && (equals(s, t) || isSubtreeCompare(s.left, t) || isSubtreeCompare(s.right, t));
    }

    //passes without rnull and lnull
    //Comparing with pre order need the # in the start
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
        return "#" + t.val + " " + preorder(t.left, true) + " " + preorder(t.right, false);
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

    //For nary tree need children count
    public static String serialize(Node root) {
        List<String> list=new LinkedList<>();
        serializeHelper(root,list);
        return String.join(",",list);
    }

    private static void serializeHelper(Node root, List<String> list){
        if(root==null){
            return;
        }else{
            list.add(String.valueOf(root.val));
            list.add(String.valueOf(root.children.size()));
            for(Node child:root.children){
                serializeHelper(child,list);
            }
        }
    }

    //Queue and recursion used helps retain the node after its polled too
    // Decodes your encoded data to tree.
    public static Node deserializeNaryTree(String data) {
        if(data.isEmpty())
            return null;

        String[] ss=data.split(",");
        Queue<String> q=new LinkedList<>(Arrays.asList(ss));
        return deserializeHelper(q);
    }

    private static Node deserializeHelper(Queue<String> q){
        Node root=new Node();
        root.val=Integer.parseInt(q.poll());
        int size=Integer.parseInt(q.poll());
        root.children=new ArrayList<Node>(size);
        for(int i=0;i<size;i++){
            root.children.add(deserializeHelper(q));
        }
        return root;
    }

    private static final String splitter = ",";
    private static final String SIGN = "#";

    // Encodes a tree to a single string.
    //Use string builder
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(root, sb);
        return sb.toString();
    }

    private void buildString(TreeNode root, StringBuilder sb) {
        if (root == null) sb.append(SIGN).append(splitter);
        else {
            sb.append(root.val).append(splitter);
            buildString(root.left, sb);
            buildString(root.right, sb);
        }
    }

    // Decodes your encoded data to tree.
    //Deque is faster
    //For deserializing, the position of root is very important.
    //for Preorder, its in the start so start from start, post- at the end and inorder-root position should be given
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList();
        nodes.addAll(Arrays.asList(data.split(splitter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(SIGN)) return null;
        else {
            TreeNode cur = new TreeNode(Integer.valueOf(val));
            cur.left = buildTree(nodes);
            cur.right = buildTree(nodes);
            return cur;
        }
    }

    //>>>>Rev
    public static List<List<Integer>> levelOrderIter(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        if (root == null) return levels;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int level = 0;
        while (!queue.isEmpty()) {
            // start the current level
            levels.add(new ArrayList<Integer>());

            // number of elements in the current level = size of Q
            int level_length = queue.size();
            for (int i = 0; i < level_length; ++i) {
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

        if (node == null)
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

            //By comparing with 0, negatives are ignored. If there are only negatives the maximum negative node will be the answer
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
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (exist(board, row, col, w, 0)) return true;
            }
        }
        return false;
    }

    private static boolean exist(char[][] board, int row, int col, char[] inputWord, int currentWordLength) {
        if (currentWordLength == inputWord.length) return true;
        if (row < 0 || col < 0 || row == board.length || col == board[row].length) return false;
        if (board[row][col] != inputWord[currentWordLength]) return false;
        board[row][col] ^= 256;
        boolean exist = exist(board, row, col + 1, inputWord, currentWordLength + 1)
                || exist(board, row, col - 1, inputWord, currentWordLength + 1)
                || exist(board, row + 1, col, inputWord, currentWordLength + 1)
                || exist(board, row - 1, col, inputWord, currentWordLength + 1);
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

        int n = matrix.length, lo = 0, hi = matrix.length - 1;
        // l is the side length, for loop to process one square at a time, l-=2 as the square becomes smaller
        for (int l = n; l > 1; l -= 2) {

            //for loop to go over the elements in the square
            for (int element = 0; element < l - 1; element++) {
                // move number on one side to the other side clockwise
                int temp = matrix[hi - element][lo];
                matrix[hi - element][lo] = matrix[hi][hi - element];
                matrix[hi][hi - element] = matrix[lo + element][hi];
                matrix[lo + element][hi] = matrix[lo][lo + element];
                matrix[lo][lo + element] = temp;
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
        if (matrix.length == 0)
            System.out.println(null + "");
        int rowStart = 0, rowEnd = matrix.length - 1;
        int colStart = 0, colEnd = matrix[0].length - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int c = colStart; c <= colEnd; c++) System.out.print(matrix[rowStart][c]);
            for (int r = rowStart + 1; r <= rowEnd; r++) System.out.print(matrix[r][colEnd]);
            if (rowStart < rowEnd && colStart < colEnd) {
                for (int c = colEnd - 1; c > colStart; c--) System.out.print(matrix[rowEnd][c]);
                for (int r = rowEnd; r > rowStart; r--) System.out.print(matrix[r][colStart]);
            }
            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }
    }

    public static int[][] generateMatrix(int n) {
        // Declaration
        int[][] matrix = new int[n][n];
        if (n == 0) return matrix;

        int rowStart = 0,rowEnd = n-1,colStart = 0,colEnd = n-1,num = 1; //change

        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = colStart; i <= colEnd; i ++)
                matrix[rowStart][i] = num ++; //change

            rowStart ++;

            for (int i = rowStart; i <= rowEnd; i ++)
                matrix[i][colEnd] = num ++; //change

            colEnd --;

            for (int i = colEnd; i >= colStart; i --)
                if (rowStart <= rowEnd)
                    matrix[rowEnd][i] = num ++; //change

            rowEnd --;

            for (int i = rowEnd; i >= rowStart; i --)
                if (colStart <= colEnd)
                    matrix[i][colStart] = num ++; //change

            colStart ++;
        }

        return matrix;
    }

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
            dfs(res, new ArrayList<String>(), 0, n);
            return res;
        }

        private static void dfs(List<List<String>> res, List<String> list, int row, int n) {
            if (row == n) {
                res.add(new ArrayList<String>(list));
                return;
            }
            for (int column = 0; column < n; column++) {
                if (NQueenHashSet.col.contains(column) || diag1.contains(row + column) || diag2.contains(row - column))
                    continue;

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

    ///testing
    static class UniquePathsIIIDPMyWay {
        static int ans;
        static int[][] gridStatic;
        static int R, C;
        static int tr, tc, target;
        static int[] dr = new int[]{0, -1, 0, 1};
        static int[] dc = new int[]{1, 0, -1, 0};
        static Integer[][][] memo;
        static HashMap<String, Integer> dp= new HashMap<>();

        public static int uniquePathsIII(int[][] grid) {
            gridStatic = grid;
            R = grid.length;
            C = grid[0].length;

            int todo = 0;
            int sr = 0, sc = 0;
            //Find number of walkable, start and end positions
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
            return dfs(sr, sc, todo);
//            return ans;
        }

        public static int dfs(int r, int c, int todo) {
            if(dp.containsKey(r + "," + c + "," + todo))
            {   return dp.get(r + "," + c + "," + todo);

            }
            todo--;
            if (todo < 0) return ans;
            //reached target
            if (r == tr && c == tc) {
                //no empty paths left
                if (todo == 0) ans++;
                return ans;
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
            dp.put(r + "," + c + "," + todo, ans);
        return ans;
        }
    }

    //This takes way more time and space than recur method actually compared to what leetcode says
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

            memo = new Integer[R][C][1 << R * C];
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
            //Find number of walkable, start and end positions
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
            if (merged.isEmpty() || (int) (merged.getLast().end) < interval.start) {
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
        while (i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i]);
            i++;
        }

        // Merge
        while (i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start, end});
        // Add rest
        while (i < intervals.length) {
            result.add(intervals[i]);
            i++;
        }
        return result.toArray(new int[result.size()][2]);
    }

    public static void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        //Find the middle of the list
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2.next != null && p2.next.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
        }

        //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
        ListNode preMiddle = p1;
        ListNode preCurrent = p1.next;
        while (preCurrent.next != null) {
            ListNode current = preCurrent.next;
            preCurrent.next = current.next;
            current.next = preMiddle.next;
            preMiddle.next = current;
        }

        //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
        p1 = head;
        p2 = preMiddle.next;
        while (p1 != preMiddle) {
            preMiddle.next = p2.next;
            p2.next = p1.next;
            p1.next = p2;
            p1 = p2.next;
            p2 = preMiddle.next;
        }
    }

    public static ListNode mergeKListsMyTest(ListNode[] lists){

        int increment=1,end=lists.length-1;
        //O(nlogk)
        while(end>0) {
            for (int start = 0; start < end; start++,end--)
                lists[start] = merge2Lists(lists[start], lists[end]);
        }

        //O(nk)
//        for (int i = 1; i < lists.length; i++) {
//            lists[0] = merge2Lists(lists[0], lists[i]);
//        }
        return lists[0];
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i = i + interval * 2)
                merge2Lists(lists[i], lists[i + interval]);

            interval *= 2;
        }
        return lists[0];
    }

    public static ListNode merge2Lists(ListNode l1, ListNode l2) {
        if ((l1 == null) && (l2 == null)) return null;
        ListNode l3 = new ListNode(0);
        ListNode currL3 = l3;
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

    //Do
    public static double findMedianSortedArrays(int[] A, int[] B) {
        int m = A.length;
        int n = B.length;

        //this "if" can be added to a function and prevent swapping to reduce the space complexity
        if (m > n) { // to ensure m<=n
            int[] temp = A;
            A = B;
            B = temp;
            int tmp = m;
            m = n;
            n = tmp;
        }
        int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLen - i;
            if (i < iMax && B[j - 1] > A[i]) {
                iMin = i + 1; // i is too small
            } else if (i > iMin && A[i - 1] > B[j]) {
                iMax = i - 1; // i is too big
            } else { // i is perfect
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }
                if ((m + n) % 2 == 1) {
                    return maxLeft;
                } //for odd, the mid value is median

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(B[j], A[i]);
                }

                return (maxLeft + minRight) / 2.0;
            }
        }
        return 0.0;
    }

    //Check for decimal
    public static int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        //1. Empty string
        if (str.length() == 0) return 0;

        //2. Remove Spaces
        while (str.charAt(index) == ' ' && index < str.length())
            index++;

        //3. Handle signs
        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        //4. Convert number and avoid overflow
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) break;

            //check if total will be overflow after 10 times and add digit
            if (Integer.MAX_VALUE / 10 < total || (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit))
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            total = 10 * total + digit;
            index++;
        }
        return total * sign;
    }

    public static List<String> letterCombinations(String digits) {
        LinkedList<String> ans = new LinkedList<String>();
        if (digits.isEmpty()) return ans;
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        while (ans.peek().length() != digits.length()) {
            String remove = ans.remove();
            String map = mapping[digits.charAt(remove.length()) - '0'];
            for (char c : map.toCharArray()) {
                ans.addLast(remove + c);
            }
        }
        return ans;
    }

    // Manacher's Algorithm
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

        //By 2 because there were extra palindromes counted because of #
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

    static int palindromCounter = 0;


    //Code this
    public static String longestPalindromeSubstring(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        palindromCounter = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        System.out.println(palindromCounter + " palindromes");
        return s.substring(start, end + 1);
    }

    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            System.out.println(s.substring(L, R + 1));
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
                {4, 6}, {6, 8}, {7, 9}, {4, 8}, {3, 9, 0},
                {}, {1, 7, 0}, {2, 6}, {1, 3}, {2, 4}};

        int[][] dp = new int[2][10];
        Arrays.fill(dp[0], 1);
        for (int hops = 0; hops < N - 1; ++hops) {
            Arrays.fill(dp[~hops & 1], 0);
            for (int node = 0; node < 10; ++node)
                for (int nei : moves[node]) {
                    dp[~hops & 1][nei] += dp[hops & 1][node];
                    dp[~hops & 1][nei] %= MOD;
                }
        }

        long ans = 0;
        for (int x : dp[~N & 1])
            ans += x;
        return (int) (ans % MOD);
    }

    public static int telephoneKnight(int start, int moves) {

        int paths = 0;
        int subMaxPaths = 0;
        if (moves > 0) {
            List<Integer> subPathNodes = numPaths.get(start);
            paths = subPathNodes.size();
            if (moves - 1 > 0) {
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

        int[] prior_case = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int[] current_case = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int current_num_hops = 1;

        while (current_num_hops <= num_hops) {
            current_case = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
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

    public static HashMap<Integer, List<Integer>> formNumPaths() {
        HashMap<Integer, List<Integer>> numPaths = new HashMap<Integer, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        list.add(8);
        list.add(6);
        numPaths.put(1, list);
        list = new ArrayList<Integer>();
        list.add(9);
        list.add(7);
        numPaths.put(2, list);
        list = new ArrayList<Integer>();
        list.add(4);
        list.add(8);
        numPaths.put(3, list);
        list = new ArrayList<Integer>();
        list.add(3);
        list.add(9);
        list.add(0);
        numPaths.put(4, list);
        list = new ArrayList<Integer>();
        numPaths.put(5, list);
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(0);
        numPaths.put(6, list);
        list = new ArrayList<Integer>();
        list.add(2);
        list.add(6);
        numPaths.put(7, list);
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(3);
        numPaths.put(8, list);
        list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        numPaths.put(9, list);
        list = new ArrayList<Integer>();
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
                    minJumps = nums[index + i] * -1 + 1;
                    continue;
                }
                int currentMinJumps = minCanJumpConstantSpace(nums, index + i);
                if (currentMinJumps < minJumps)
                    minJumps = currentMinJumps + 1;
            } else
                break;
        }
        nums[index] = minJumps * -1;
        return minJumps;
    }

    public static int minCanJumpDP(int[] nums, int index, int[] minJumpDp) {

        int minJumps = nums.length + 2;
        if (index == nums.length - 1)
            return 0;

        for (int i = 1; i <= nums[index]; i++) {
            if (index + i < nums.length) {
                //if already calculated
                if (minJumpDp[index + i] != 0) {
                    minJumps = minJumpDp[index + i] + 1;
                    continue;
                }
                int currentMinJumps = minCanJumpDP(nums, index + i, minJumpDp);
                if (currentMinJumps < minJumps)
                    minJumps = currentMinJumps + 1;
            } else
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

    //for this we need 2d array
    private void printSelectedElementsKnapsack(int dp[][], int[] weights, int[] profits, int capacity) {
        System.out.print("Selected weights:");
        int totalProfit = dp[weights.length - 1][capacity];
        for (int i = weights.length - 1; i > 0; i--) {
            if (totalProfit != dp[i - 1][capacity]) {
                System.out.print(" " + weights[i]);
                capacity -= weights[i];
                totalProfit -= profits[i];
            }
        }

        if (totalProfit != 0)
            System.out.print(" " + weights[0]);
        System.out.println("");
    }
    //>>>>????
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

    static int knapSackRecur(int W, int wt[], int val[], int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        // If weight of the nth item is more than Knapsack capacity W, then
        // this item cannot be included in the optimal solution
        if (wt[n - 1] > W)
            return knapSackRecur(W, wt, val, n - 1);

            // Return the maximum of two cases:
            // (1) nth item included
            // (2) not included
        else return Math.max(val[n - 1] + knapSackRecur(W - wt[n - 1], wt, val, n - 1),
                knapSackRecur(W, wt, val, n - 1)
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

    // with memo its n^2 and without n^n
    public static boolean word_BreakRecurWithMemo(String s, Set<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && word_BreakRecurWithMemo(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }

    //Word break dfs using startsWith() and the dictionary
    //Can be
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s == null || s.length()==0)
            return false;
        boolean[] visited = new boolean[s.length()];
        return dfs(s, 0, wordDict, visited);
    }

    private boolean dfs(String s, int start, List<String> wordDict, boolean[] visited){
        if(start == s.length())
            return true;
        if(visited[start])
            return false;
        visited[start] = true;
        for(String word : wordDict){
            if(s.startsWith(word, start)){
                if(dfs(s, start + word.length(), wordDict, visited))
                    return true;
            }
        }
        return false;
    }

    //https://leetcode.com/problems/permutations/discuss/18239/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partioning)
    //This permute method has removal of list and search in list which is expensive
    public static List<List<Integer>> permute1ByTempList(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        // Arrays.sort(nums); // not necessary
        backtrack1TempList(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack1TempList(List<List<Integer>> list, List<Integer> tempList, int [] nums){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                if(tempList.contains(nums[i])) continue; // element already exists, skip
                tempList.add(nums[i]);
                backtrack1TempList(list, tempList, nums);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permute1BySwapping(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        List<Integer> input = new ArrayList<>();
        for (int i : nums)
            input.add(i);

        backtrack1BySwapping(input, new ArrayList<Integer>(), list, 0);
        return list;
    }

    public static void backtrack1BySwapping(List<Integer> nums, List<Integer> tempList, List<List<Integer>> list, int start) {
        if (start == nums.size())
            list.add(new ArrayList<>(nums));

        for (int i = start; i < nums.size(); i++) {
            Collections.swap(nums, start, i); //always replace with start in this loop, as we are finding all positions of start
            backtrack1BySwapping(nums, tempList, list, start + 1); // start + 1 because we have to take the next digit and find all its positions
            Collections.swap(nums, start, i);
        }
    }

    public static List<List<Integer>> permuteUniqueByTempList(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrackUniqueByTempList(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    private static void backtrackUniqueByTempList(List<List<Integer>> list, List<Integer> tempList, int [] nums, boolean [] used){
        if(tempList.size() == nums.length){
            list.add(new ArrayList<>(tempList));
        } else{
            for(int i = 0; i < nums.length; i++){
                //if the same digit occurring earlier is false then it means that a duplicate combo will be created hence skip
                if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                used[i] = true;
                tempList.add(nums[i]);
                backtrackUniqueByTempList(list, tempList, nums, used);
                used[i] = false;
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static List<List<Integer>> permuteUniqueBySwapping(int[] nums) {
        HashSet<List<Integer>> list = new HashSet<>();
        Arrays.sort(nums);
        List<Integer> input = new ArrayList<>();
        for (int i : nums)
            input.add(i);

        backtrackPermuteUniqueBySwapping(input, list, 0);
        return new ArrayList<>(list);
    }

    public static void backtrackPermuteUniqueBySwapping(List<Integer> nums, HashSet<List<Integer>> list, int start) {
        if(list.contains(nums))
            return;

        if (start == nums.size()) {
            list.add(new ArrayList<>(nums));
        }
        for (int i = start; i < nums.size(); i++) {
            Collections.swap(nums, start, i); //always replace with start in this loop, as we are finding all positions of start
            backtrackPermuteUniqueBySwapping(nums, list, start + 1); // start + 1 because we have to take the next digit and find all its positions
            Collections.swap(nums, start, i);
        }
    }

    public static Queue<String> pncArrayQueue(int[] input) {
        int n = input.length, popLimit = 0;
        String elementToPush = "", poppedElement = "";
        Queue<String> output = new LinkedList<>();
        output.add("" + input[n - 2] + "," + input[n - 1]);
        output.add("" + input[n - 1] + "," + input[n - 2]);

        for (int insertCharacter = input.length - 3; insertCharacter >= 0; insertCharacter--) {
            popLimit = output.size();
            for (int numberOfTimesToPop = 0; numberOfTimesToPop < popLimit; numberOfTimesToPop++) {
                poppedElement = output.poll();
                output.add(input[insertCharacter] + "," + poppedElement);
                for (int poppedChar = poppedElement.indexOf(","); poppedChar < poppedElement.length(); poppedChar++) {

                    elementToPush = poppedElement.substring(0, poppedChar) + "," + input[insertCharacter] + poppedElement.substring(poppedChar);

                    output.add(elementToPush);
                    if (poppedElement.substring(poppedChar + 1).indexOf(",") == -1) {
                        output.add(poppedElement + "," + input[insertCharacter]);
                        break;
                    }
                    poppedChar = poppedElement.substring(poppedChar + 1).indexOf(",") + poppedElement.substring(poppedChar).length();
                }
            }
        }
        return output;
    }

    public static List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList)); //keep inside for and after temp add to avoid emptyset
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrackSubset2(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrackSubset2(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }

    //For all permutations keep int i=0
    //Better to use backtrack for only combinations, to prevent resusable combos, done by the start variable.
    //Sorting and then if statement is faster than not sorting
    //If sorting is not allowed remove the if in the backtrack
    public static List<List<Integer>> combinationSum1(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
//        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, target, 0);
        return list;
    }


    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start) {
        if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                if (nums[i] <= remain) {
                    tempList.add(nums[i]);
                    backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                    tempList.remove(tempList.size() - 1);
                }
//                else
//                    break; //use if sorted
            }
        }
    }

    //Cant reuse and no duplicates
    public static List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack2(list, new ArrayList<>(), nums, target, 0);
        return list;

    }

    private static void backtrack2(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start) {
        if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) continue; // skip duplicates
                if (nums[i] <= remain) {
                    tempList.add(nums[i]);
                    backtrack2(list, tempList, nums, remain - nums[i], i + 1);
                    tempList.remove(tempList.size() - 1);
                } else
                    break;
            }
        }
    }

    //PnC backtrack, with i=0.
    //This is list of all permutations and combinations
    //For all permuatation do bactrack for number of them can do DP
    public static List<List<Integer>> combinationSum4Backtrack(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack4(list, new ArrayList<>(), nums, target);
        return list;
    }


    private static void backtrack4(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain) {
        if (remain == 0) list.add(new ArrayList<>(tempList));
        else {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= remain) {
                    tempList.add(nums[i]);
                    backtrack4(list, tempList, nums, remain - nums[i]);
                    tempList.remove(tempList.size() - 1);
                } else
                    break;
            }
        }
    }

    //This is the number of permutations
    //Can be optimised to take only the computed values of the subtractions rather than dp of all the values till target sum
    //  and for negative, there should be a limit on the length https://leetcode.com/problems/combination-sum-iv/discuss/85041/7-liner-in-Python-and-follow-up-question
    //Difficult to do dp to remove permutations as what worked before cannot be used again because the coins available have changed,better to use backtrack
    public static int combinationSum4DP(int target, int[] nums) {

        int[] result = new int[target + 1];
        result[0] = 1;

        for (int currentTarget = 1; currentTarget <= target; ++currentTarget) {
            for (int x : nums) {
                if (currentTarget >= x) {
                    result[currentTarget] += result[currentTarget - x];
                }
            }
        }
        return result[target];
    }

    //Same as combination sum 4
    public static int numberOfPncsCoinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int i = 1; i <= amount; i++) {
            for (int j : coins) {
                if (j <= i)
                    dp[i]+= dp[i - j];
                else
                    break;
            }
        }
        return dp[amount];
    }

    // These min max questions count the number in each permuation
    //Counts min number of coins, goes through all permutations(because goes through all coins everytime)
    //>>>>???? Check the top up and bottom down ways
    public static int coinChangeDP(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j : coins) {
                if (j <= i) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);//+1 for the coin itself
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    //Counts max number of coins
    public static int maxcoinChangeDP(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j : coins) {
                if (j <= i) {
                    dp[i] = Math.max(dp[i], dp[i - j] + 1);//+1 for the coin itself
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    //Greedy is not optimal
    public static int coinChangeGreedy(int[] coins, int amount) {
        List<Integer> ans = new ArrayList<Integer>();
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

    public static List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), s, 0);
        return list;
    }

    public static void backtrack(List<List<String>> list, List<String> tempList, String s, int start){
        if(start == s.length())
            list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < s.length(); i++){
                if(isPalindrome(s, start, i)){
                    tempList.add(s.substring(start, i + 1));
                    backtrack(list, tempList, s, i + 1);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }

    public static boolean isPalindrome(String s, int low, int high){
        while(low < high)
            if(s.charAt(low++) != s.charAt(high--)) return false;
        return true;
    }

    static int longestCommonSubsequence(String a,String b)
    {
        int m = a.length();
        int n = b.length();

        int[][] dp =new int[m+1][n+1];//Keeping space for empty strings

        for(int i=1; i<=m; i++)
            for(int j=1; j<=n; j++)
                dp[i][j] = a.charAt(i-1)==b.charAt(j-1) ? dp[i-1][j-1]+1 : Math.max(dp[i-1][j],dp[i][j-1]);

        return dp[m][n];
    }

    static int minDistance(String word1, String word2) {
        return word1.length() + word2.length()- 2 * longestCommonSubsequence(word1,word2);
    }

    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int len = 0;
        for (int num : nums) {
            int i = Arrays.binarySearch(dp, 0, len, num);
            if (i < 0) {
                i = -(i + 1);
            }
            dp[i] = num;
            if (i == len) {
                len++;
            }
        }
        return len;
    }

    public static int LisDP(int[] input) {
        int finalMax = 1;
        int[] dp = new int[input.length];
        for (int i = input.length - 1; i >= 0; i--) {
            int currentMax = 0;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > input[i]) {
                    currentMax = Math.max(currentMax, dp[j]);
                    if(dp[j]==finalMax) break;
                }
            }
            dp[i] = currentMax + 1;
            if (dp[i] > finalMax) finalMax = dp[i];
        }
        return finalMax;
    }

    public static int LIS(int start, int[] input) {
        int maxCount = 1;
        for (int i = start; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] > input[i]) {
                    maxCount = Math.max(LIS(j, input) + 1, maxCount);
                }
            }
        }
        return maxCount;

    }

    static int rob(int[] nums) {
        //This DP array can be simplified to few variables
//        int[] dp = new int[10001];
//        int len = nums.length;
//        if (len == 0) return 0;
//        else if (len == 1) return nums[0];
//        else if (len == 2) return Math.max(nums[0], nums[1]);
//        else {
//            dp[0] = nums[0];
//            dp[1] = nums[1];
//            dp[2] = nums[0] + nums[2];
//            for (int i = 3; i < len; i++) {
//                dp[i] = nums[i] + Math.max(dp[i - 2], dp[i - 3]);
//            }
//
//            return Math.max(dp[len - 2], dp[len - 1]);
//        }

        int prevMax = 0;
        int currMax = 0;
        for (int x : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + x, currMax);
            prevMax = temp;
        }
        return currMax;
    }

    public static int decodeWaysItr(String s) {
        int n = s.length();
        if (n == 0) return 0;

        int[] memo = new int[n + 1];
        memo[0] = 1;
        memo[1] = s.charAt(0) != '0' ? 1 : 0;

        for (int i = 2; i <= s.length(); i++)
            if (s.charAt(i - 1) == '0')
                if (s.charAt(i - 2) == '1' || s.charAt(i - 2) == '2') memo[i] = memo[i - 1];
                else
                    memo[i] = 0;
            else
                memo[i] = (Integer.parseInt(s.substring(i - 2, i)) <= 26 && s.charAt(i - 2) != '0') ? memo[i - 1] + memo[i - 2] : memo[i - 1];

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

    public static int uniquePathsII(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i - 1 < 0 && j - 1 < 0) || obstacleGrid[i][j] == 0) continue;
                if (i - 1 < 0)
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                else if (j - 1 < 0)
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                else
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1] + obstacleGrid[i - 1][j];
            }
        }
        return obstacleGrid[m - 1][n - 1] == 0 ? 0 : obstacleGrid[m - 1][n - 1];

    }

    static int uniqueCount=0;
    //Recursive way goes over cells repeatedly can be removed by storing the right and left counts
    public static int uniquePathsIIRecur(int[][] input) {
        recur(0,0,input.length-1,input[0].length-1,input);
        return uniqueCount;
    }
    public static void recur(int row, int coloumn, int targetRow, int targetCol,int[][] input) {
        if(row==targetRow && coloumn==targetCol) {uniqueCount++; return;}
        if(row<0 || row >targetRow || coloumn<0 || coloumn >targetCol || input[row][coloumn]==0) return;
        recur(row,coloumn+1,targetRow,targetCol,input);
        recur(row+1,coloumn,targetRow,targetCol,input);
    }

    public static int uniquePaths(int m, int n) {
        int[] grid = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0)
                    grid[j] = 1;
                else
                    grid[j] = grid[j - 1] + grid[j];
            }
        }
        return grid[n - 1];
    }

}


