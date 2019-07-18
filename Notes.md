**DS & Algos**

Red black tree properties

Graph representations
    Edge list
    Adjacency List
    Adjacency matrix
    HashMap of HashMaps
    List of other neighbour Graph Nodes & node lookup HM

Graph BFS or DFS doesnt matter if its undirected or directed

Shallow copy - contains references to the copy from element
Deep copy - New objects are created

Fail-fast - fail earlier in the process. Iterator fails fast incase of concurrent modification
Use iterator to remove elements while iterating over a list
To Remove from list - break after removal or use iterator to avoid comod error

An array list can be printed directly without looping
HashSet can remove duplicates from objects also cuz of equals() definition

For count of all permutations DP
For list of all pnc backtrack

Palindrome substring - Manacher algo

Utility funcs

    Changing DS
        Arrays.asList(0, 1, 2, 3, 4, 5);
        sourceList.toArray(new Integer[sourceList.size()]);
        new String(charArray);
    Copy func
        list.add(new ArrayList<String>(list1));
        Arrays.copyOfRange(nums, 0,nums.length-1)


    Collections.sort(list, new Comparator<int>(){...})
    Collections.swap(nums, start, i);
    Arrays.sort...can be used on matrix also
    Arrays.fill

Collections.sort uses Array.sort by converting the collection to array
Array.sort uses quick sort for primitive type and Tim sort for objects

26 -
128 -
256 - Extended ASCII

n / 2 + n % 2...for odd and even mid points



**Design Patterns**

Abstract class is so that no object can be created of it and you can have common functions defined so that
inherited classes can reuse.

Abstract classes can have abstract functions which will have no body so the inherited classes must define it

Strategy design pattern
https://www.geeksforgeeks.org/strategy-pattern-set-1/
https://www.geeksforgeeks.org/strategy-pattern-set-2/

""


**System Design**



**Spring**

Cyclic dependency - if set a bean in constructor

Dependency injection - Helps in loosely coupling and mocking classes

Scheduling
@Async
Async functions need to be public like @Transactional
https://dzone.com/articles/spring-and-threads-async

Pointcuts
@Transactional



**Java**

Future Task, ExecutorService, ThreadPoolExecutor, Async(Spring)
ExecutorService uses ThreadPoolExecutor and can choose the type of threading
FutureTask blocks current execution

Stream, Lambda
