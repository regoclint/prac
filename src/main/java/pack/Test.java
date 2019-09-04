package pack;
import javafx.util.Pair;

import java.io.IOException;
import java.util.*;

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
//        int arr[] = new int[]{2,3,-1,2};
//        System.out.println(maxProdSubArray(arr));
//        System.out.println(maxProdSubArrayMySol(arr));
//        System.out.println(maxProduct(arr));
////////////

//////////// 3 Sum
//        int arr[] = new int[]{2,-2,2,0,0};
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
//        int[][] input=new int[][]{{1,1,1,1},
//                                    {1,0,1,1},
//                                    {1,1,0,1},
//                                    {1,1,1,1}};
//        int[][] input=new int[][]{{1,1,0,1}};
//        int[][] input=new int[][]{{0,1,1}};
//        System.out.println(uniquePathsII(input));
//        System.out.println(uniquePathsIIRecur(input));
////////////

//////////// Coin change
//        System.out.println(coinChangeDP(new int[]{2,3,4,5},8));
//        System.out.println(maxcoinChangeDP(new int[]{2,3,4,5},8));
//        System.out.println(numberOfPncsCoinChange(new int[]{2,3,4},7));
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


////////////

//////////// House robber I & II
//        System.out.println(rob(new int[]{2,1,1,3}));


//        House robber II - circular rob
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

//////////// Tree From Preorder & Inorder
//        int[] preorder=new int[]{3,9,20,15,7};
//        int[] inorder=new int[]{9,3,15,20,7};
//        TreeFromPreorderInorder.buildTree(preorder,inorder);

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

//////////// Insert & Delete BST
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        TreeNode result=insertIntoBST(t1,2);
//        result=deleteBST(t1,2);
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
//        String s="abaaaabbcde";
//        System.out.println(characterReplacement(s,1));
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
//        String s="babbab";
//        System.out.println(longestPalindromeSubstring(s));
//        System.out.println(countPalindromeSubstrings(s));
//        System.out.println(countPalindromeSubstringsManachersAlgo(s));
////////////

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
////////////

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
////////////

//////////// Course scheduling
//        int[][] pre=new int[2][2];
//        pre[0][0]=1;
//        pre[0][1]=0;
//        pre[1][0]=1;
//        pre[1][1]=2;
//        System.out.println(canFinishDFS(3,pre));
//        System.out.println(canFinishBFS(3,pre));
////////////

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
////////////

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
////////////


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

////////////

//////////// Peak element
//        System.out.println(findPeakElement(new int[]{3,2,3,5,6,7,8,9,10}));
////////////

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
////////////

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
////////////

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
////////////

//////////// Number of connected components
//        int[][] edges=new int[][]{{1, 2}, {3, 4},{0, 1}};
//        int[][] edges=new int[][]{{0, 1}, {1, 2}, {2, 3}, {3, 4}};
//        int[][] edges=new int[][]{{5, 4}, {1, 0}, {2, 0}, {3, 0}};
//        int[][] edges=new int[][]{{0,1},{1,2},{0,2},{3,4}};
//        int[][] edges=new int[][]{{2,3},{1,2},{1,3}};
//        int[][] edges=new int[][]{{0,3},{0,2},{0,1}};
//        countComponentsDFS(4,edges);
//        System.out.println(connectedComponentsCount);
//        System.out.println(countComponentsUnionFind(4,edges));
////////////

//////////// Longest increasing subsequence
//        System.out.println(LIS(0,new int[]{20,5,40,6,7,8}));
//        System.out.println(LisDP(new int[]{20,5,40,6,7,8}));
//        System.out.println(lengthOfLIS(new int[]{20,5,40,6,7,8}));
//        System.out.println(lengthOfLIS(new int[]{0,7,5,6}));
////////////

//////////// Longest common subsequence or delete operation for two strings
//        System.out.println(longestCommonSubsequence("seat","ocean"));
//        System.out.println(minDistance("seat","ocean"));
////////////

//////////// basic calculator I II
//        System.out.println(calculateI("(7-(8+9+10))"));
//        System.out.println(calculateI("1+1"));

//        System.out.println(calculateII("5+20/2/5-1*4*6/2*2"));
//        System.out.println(calculateII("5-20+1+3+4"));
////////////

//////////// Pretty print JSON
//        prettyPrint("");
////////////

//////////// Search in sorted array of unknown size
//        System.out.println(search(,9));
////////////

//////////// Binary tree right side view
//        TreeNode t5 = new TreeNode(6, null, null);
//        TreeNode t4 = new TreeNode(4, null, null);
//        TreeNode t3 = new TreeNode(5, t4, t5);
//        TreeNode t2 = new TreeNode(1, null, null);
//        TreeNode t1 = new TreeNode(3, t2, t3);
//        rightSideViewDFS(t1);
////////////

//////////// Asteroid collision
//        int[] output;
//        output=asteroidCollisionStack(new int[]{10, 2, -5});
//        output=asteroidCollisionStack(new int[]{-10,40,35,10,2,-30,-10,-20,-40});
//        output=asteroidCollisionArray(new int[]{-10,40,35,10,2,-30,-10,-20});
//        for (int i : output)
//            System.out.print(i+" ");

////////////

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

////////////

//////////// Search in 2D Matrix
//        int[][] matrix=new int[][]{{1,4,7,11,15},
//                                    {2,5,8,12,19},
//                                    {3,6,9,16,22},
//                                    {10,13,14,17,24},
//                                    {18,21,23,26,30}};
//        System.out.println(searchIn2DMatrix(matrix,5));
////////////

//////////// Implement a trie
//        implementTrie();
////////////

//////////// Search in rotated sorted array
//        System.out.println(searchInRotatedSortedArray(new int[]{4,5,6,7,0,1,2,3},6));
////////////

////////////
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

////////////

//////////// Copy List with Random pointer
//        RandomListNode l1=new RandomListNode(1);
//        RandomListNode l2=new RandomListNode(2);
//        RandomListNode l3=new RandomListNode(3);
//        l1.next=l2;
//        l1.random=l3;
//        l2.next=l3;
//        l2.random=l2;
//        RandomListNode result=copyRandomList(l1);
////////////

//////////// Product of array except self
//        productExceptSelf(new int[]{1,2,3,4});
////////////

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
////////////

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
////////////

//////////// Isomorphic strings
//        System.out.println(isIsomorphic("egg","add"));
//        System.out.println(isIsomorphic("egd","add"));
////////////

//////////// Print repeating elements
//        printRepeating(new int[]{1, 2, 3, 1, 3, 6, 6});
////////////

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

////////////

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
////////////

//////////// Buy sell stocks
//        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
////////////

//////////// Trapping rain water
//        System.out.println(trap2Pointers(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(trapStack(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
//        System.out.println(trapDP(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
////////////

//////////// K closest points to origin
//        int[][] output=kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
//        System.out.println(output[0].toString());
//        System.out.println(Arrays.asList(output[1]));
////////////

//////////// Number to words
//        NumberToWords numberToWords=new NumberToWords();
//        System.out.println(numberToWords.numberToWords(123456));
////////////

//////////// Remove invalid parentheses
//        HashSet output=new HashSet();
//        removeParentheses(new StringBuffer(),output,new char[]{'(','a',')','(',')',')','(',')'},0);
//        System.out.println(output);
////////////

//////////// Subarray sum equals k
//        System.out.println(subarraySum(new int[]{28,54,7,-70,22,65,-6},100));
//        System.out.println(subarraySum(new int[]{1,2,4,3,1},4));
//        System.out.println(subarraySumBruteForce(new int[]{1,2,4,3,1},4));
//        System.out.println(subarraySumHM(new int[]{1,2,4,3,1},4));
////////////

//////////// Merge sorted arrays
//        int[] nums1=new int[]{1,2,3,0,0,0};
//        mergeSortedArrayFromEnd(nums1,3,new int[]{2,5,6},3);
////////////

//////////// Next permutation
//        int[] input=new int[]{1,5,8,4,7,6,5,3,1};
//        nextPermutation(input);
////////////

//////////// Interval list intersections
//        int[][] a = new int[][]{{0, 2}, {5, 10}, {13, 23}, {24, 25}};
//        int[][] b = new int[][]{{1, 5}, {8, 12}, {15, 24}, {25, 26}};
//        int[][] output= intervalIntersection(a, b);
////////////

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

    static int maxValidString=0;
    public static void removeParentheses(StringBuffer tempList, Set<String> output, char[] input, int start) {
        if (tempList.length() >= maxValidString && isValidParenthesis(tempList.toString())) {
            if (tempList.length() == maxValidString)
                output.add(tempList.toString());
            else {
                maxValidString=tempList.length();
                output.clear();
                output.add(tempList.toString());
            }
        }

        for (int i = start; i < input.length; i++) {
            tempList.append(input[i]);
            removeParentheses(tempList, output, input, i + 1);
            tempList.setLength(tempList.length() - 1);
        }
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


    //constant space and time. You can also get past getHits() by adding condtion timestamp > times[i] && ....
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
            return count-1 - (map.floorKey(timestamp-300) == null ? 0 : map.get(map.floorKey(timestamp-300)));
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

        // 1->1'->2->2'->3->3'
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
            copy = iter.next;
            copyIter.next = copy;
            copyIter = copy;
            // restore the original list
            iter.next = next;
            iter = next;
        }
        return pseudoHead.next;
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
        for (int i = 0; i < input.length(); i++) {

            if (quoteCounter == 0 && input.charAt(i) == '"') {
                quoteCounter++;
            } else if (quoteCounter == 1 && input.charAt(i) == '\"')
                quoteCounter--;


            if (quoteCounter != 1 && input.charAt(i) == '{' || input.charAt(i) == '[') {
                System.out.print(input.charAt(i));
                System.out.println();
                spaces += 2;
                for (int space = 0; space < spaces; space++)
                    System.out.print(" ");

            } else if (quoteCounter != 1 && input.charAt(i) == '}' || input.charAt(i) == ']') {
                System.out.println();
                spaces -= 2;
                for (int space = 0; space < spaces; space++)
                    System.out.print(" ");
                System.out.print(input.charAt(i));

            } else if (quoteCounter != 1 && input.charAt(i) == ',') {
                System.out.print(",");
                System.out.println();
                for (int space = 0; space < spaces; space++)
                    System.out.print(" ");

            } else if (quoteCounter != 1 && input.charAt(i) == ':')
                System.out.print(": ");
            else
                System.out.print(input.charAt(i));

        }
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

    //>>>>Rev
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

    //Do with one matrix only
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

    private static void dfs(int[][] matrix, int[][] visited, int y, int x, int ocean) {
        int val = matrix[y][x];
        int visitedOcean = visited[y][x];
        if (visitedOcean == ocean || visitedOcean == -3) return;
        visited[y][x] = visitedOcean < 0 ? -3 : ocean;

        boolean left = x > 0 && matrix[y][x-1] >= val;
        boolean right = x < matrix[0].length -1 && matrix[y][x+1] >= val;
        boolean up = y > 0 && matrix[y-1][x] >= val;
        boolean down = y < matrix.length - 1 && matrix[y+1][x] >= val;

        if (left) dfs(matrix, visited, y, x-1, ocean);
        if (right) dfs(matrix, visited, y, x+1, ocean);
        if (up) dfs(matrix, visited, y-1, x, ocean);
        if (down) dfs(matrix, visited, y+1, x, ocean);
    }

    //Space is O(min(m,n))
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


//    {
//        for(int i=start;i<nums.length;i++)
//        swap();
//        func(i+1)
//        swap
//    }
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
//    Do binary search in array


    class LRUCacheLHM extends LinkedHashMap<Integer, Integer>{
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

    //Kthe smallest and validate BST have the same procedure,
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

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        return serialize(root, "");
    }

    public static String serialize(TreeNode root, String str) {
        // Recursive serialization.
        if (root == null) {
            str += "null,";
        } else {
            if (dfsTraversalOrder.equals("preorder"))
                str += str.valueOf(root.val) + ",";

            str = serialize(root.left, str);
            if (dfsTraversalOrder.equals("inorder"))
                str += str.valueOf(root.val) + ",";

            str = serialize(root.right, str);

            if (dfsTraversalOrder.equals("postorder"))
                str += str.valueOf(root.val) + ",";

        }
        return str;
    }

    //For deserializing, the position of root is very important.
    //for Preorder, its in the start so start from start, post- at the end and inorder-root position should be given
    public static int deserializePreOrder(TreeNode root, String[] preOrderString, int index) {

        index++;
        if (!preOrderString[index].equals("null")) {
            root.left = new TreeNode(Integer.parseInt(preOrderString[index]));
            index = deserializePreOrder(root.left, preOrderString, index);
        } else
            index++;

        if (!preOrderString[index].equals("null")) {
            root.right = new TreeNode(Integer.parseInt(preOrderString[index]));
            index = deserializePreOrder(root.right, preOrderString, index);
        } else
            index++;

        return index;
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
        List ans = new ArrayList();
        if (matrix.length == 0)
            System.out.println(null + "");
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

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i + interval < lists.length; i = i + interval * 2)
                lists[i] = merge2Lists(lists[i], lists[i + interval]);

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


