#### DS & Algos

DS
String, Array, ArrayList, LinkedList, PQ(Heap), TreeSet, 

Red black tree properties

Graph representations
    Edge list
    Adjacency List
    Adjacency matrix -  friend circle, 
    HashMap of HashMaps
    List of other neighbour Graph Nodes & node lookup HM

Graph BFS or DFS doesnt matter if its undirected or directed
BFS is better than DFS in grid
Target to source can use BFS from both ends
Multiple sources can use multi source BFS

Shallow copy - contains references to the copy from element
Deep copy - New objects are created

Fail-fast - fail earlier in the process. for loop fails fast in case of concurrent modification
Fail-safe - Iterator doesnt fail concurrent modification because they work on a copy. Eg using just iterator or ConcurrentHashMap or CopyOnWriteArrayList
Use iterator to remove elements while iterating over a list
To Remove from list - break after removal or use iterator to avoid comod error

An array list can be printed directly without looping
HashSet can remove duplicates from objects also cuz of equals() definition

For count of all permutations DP
For list of all pnc backtrack

Palindrome substring - Manacher algo

BST do inorder iteratively with stack
Inorder in BST is ascending order and modify inorder for descending
For nary tree serialize deserialize need children count
For binary tree serialize deserialize need null values
Easier to serialize and deserialize via pre order
For preorder subtree need # at start
PQ and TreeSet
    Both O(log(N)) time complexity for adding, removing, and searching elements
    PQ can have duplicates, TreeSet cannot
    PQ cannot hold null values
    Iteration in TreeSet is ordered PQ is random
DL - faster insertions and removals, lookup by index is slow. HM can be used for faster lookup. LRU cache
ArrayList - slower insertions and removals, faster lookup by index    
            Can do a binary search if sorted.
Sorted AL vs BST vs Hashmap for searches and inserts
Balanced search trees - AVL, Red black, B-Tree
B Tree 
    It has data sorted and is used in DB. B tree of order M means it can have maximum m children and min 2
    It is a balanced tree
    B+ tree slightly different with connections between leaves
TreeMap is a red black tree implementation    
    
    

Subset is not a substring or subarray. Subsets are combinations and are supersets to substrings
Substrings are contiguous subsets.
Substring Template applies to longest/shortest substrings
For contiguous number of subsets that equal a number, it monotonically increases so its sum of n-1 numbers
    numSubarrayProductLessThanK(), numFriendRequestsMyWay()
Going reverse in a binary tree has only 1 path unlike going forward - reaching points
Kadane's algo     
Tarjan's algo - Bridges
Array deque can be used for front and back operations. sliding window    
new HashSet(Collection<? extends E>) a collection can quickly be copied into a hashset
Enhanced for loop over stack gives it in sequential order unlike pop
Path of binary search passes over the closest values to target
To access parent nodes of binary 
    convert tree to graph
    make a parent map for each node
For DP if one dimension of the array can go negative then instead of matrix can use an array of hashmaps (longest arith seq)
PQ can be optimised by storing only required size -> nlogK 
To store array index in row * C + col. To retrieve the index row= storedValue / C and col = storedValue % C. or store int[2]

LCA
    For BST - its where the values divide
    For Binary & Nary - return the node if the return node count is >1 the root is new lca
    For multi parent(graph) - Build rev adj matrix, traverse from child to parent for both the targets 
2 sorted lists get minimum difference use 2 pointers and increment the smaller one to get closer(word distance)
2 sorted lists find k pairs minimum sum use PQ(K pairs with smallest sum)
Removing from arraylist and without maintaining sorted order can be done efficiently by replacing the element to remove with the last element
Adding to a list and maintaining sorted order can be done by heap or tree set(in trees the movement is less compared to lists) 
Graphs 
    - Cycle in a graph
        - directed - use topo sort
        - undirected can be found by union find. if an edge has same parents/belong to same set, its a cycle. Can also be done by DFS or BFS
        A connected component may or may not have a cycle in a directed graph, hence topo sort is used. 
    - In union find, can keep -ve as parent marker and count as number of children if ever needed
    - topological sort requires acyclic and directed graph
    - Graph is a tree if
        - number of edges exactly = nodes - 1
        - no cycles
Topological sort
    DFS - gets the reverse order of dependency. Keep a visited set. print after visiting all the neighbours/dependencies
            it assumes it is acyclic and uses only one hashset.
            Can check for cycles with another hashset may be.
    BFS - gets the forward order of dependency. Keep an indegree count. Add to Q and print only if indegree goes to 0.
            if the number of pushes do not equal to the nodes, there's a cycle
             
Subsequence is not contiguous, substring is
LIS, Longest arith seq, LCS(substring and Subsequence) all are similar dp loop checks
if top down goes with a +1 to next index then bottom up will go with -1. The opposite happens as dp builds on completed areas.     
For binary search its better to do l +(r-l)/2 to prevent number out of bounds  
Bipartite graph
    - Every edge has one end in one set and other in another
    - Also it has no odd length cycles
    - Can be identified by coloring with 2 colors
Maximum sliding window, daily temperatures...use a stack to get rid of old irrelevant values    
In two sum, take care of 2 equal numbers(Two sum 3)
% 1000 / 100 will give number at hundredth position directly
For a Pair the functions are getKey() and getValue()
Can do Collections.binarySearch on a List of Pairs - TimeMap question
Random number from a range can be done by low + rand(high - low)
Stack can be used to continue a previous processing and end intermediate processing. Keep a list of prev maximums/values
    Daily temp, next greater element, valid parenthesis, maxSlidingWindow have similar needs
For matrix multiplication each row of A is multiplied with each col of B
Assigning a new object to an object variable is not the same as assigning a new value to an array element pointed by an object variable...pass by ref/val
to keep data sorted continuously can use 2 heaps - Median data stream, of sliding window 
Subarray sum
    has a unique method of hashmap
Median of a steam requires sorted data
    Can use 2 heaps to give logN complexity for each
Kth largest
    Fixed set - Quick Select can be used to find kth largest faster than heap. Avg time is N, worst is N^2


Quick select
    Choose a pivot.
    Swap it to the end.
    move all elements lesser than it to the left at the end swap it with the current index which will be its sorted position
        
To make parenthesis valid, remove invalid close brackets need to be done from start and open brackets from end
String builder can be used for backtracking strings like lists are used for other stuff with the setCharAt()
Sliding window
    for subsequence the length of the window can be anything
    for substring the window will be of fixed length - find all anagrams 
        here the window can be reset based on an invalid char occurence

DP
Pattern Bounded Knapsack
    choosing without repetition
    Subset sum - 1d array was used by going backwards to preserve the previous values for calculations
        [1,2,5] is false for equal subsets even tough sum is even 
    Minimum subset sum - min diff will be if a subset =n/2 or close to it. So find subset with maximum sum reaching n/2
    Target sum, has a formula for its dp, making it like count subset sum
Unbounded Knapsack 
    choosing with repetition     
Palindromic Subsequence
    the movement here is from start and end
    the > and == condition can be used to reflect the ones and 0 in the matrix
    LPSubstring - can use true or 0 to break the streak even if the current letter matched
    LPSubsequence has the minimum deletions and good for a K-Palindromic check
    Palindrome partitioning  
Pattern LCS
    Substring is continuous, gets set to 0 if not matched. Hence each row can be diff. Require 2 rows for dp
    Subsequence is not continuous, keeps building. Require just 1 row for dp
    recursive length of dp matrix doesnt require +1 as its handled with ifs. For iterative +1 is done, but it still needs to be populated based on the case.
    
    

Utility funcs

    Changing DS
        Arrays.asList(0, 1, 2, 3, 4, 5);
        sourceList.toArray(new Integer[sourceList.size()]);
        Converting a list of integer arrays to matrix - ans.toArray(new int[ans.size()][2])
        new String(charArray);
    Copy func
        list.add(new ArrayList<String>(list1));
        Arrays.copyOfRange(nums, 0,nums.length-1)

 
    Collections.sort(list, new Comparator<int>(){...})
    Collections.swap(nums, start, i);
    Arrays.sort...can be used on matrix also
    Arrays.fill
    Arrays.binarySearch(int[] a, int fromIndex, int toIndex, int key)
    
    Character.isDigit
    Character.isAlphabet
    
    sb.setCharAt()
    
Collections.sort uses Array.sort by converting the collection to array
Array.sort uses quick sort for primitive type and Tim sort for objects

Ways to optimise
- on time 
        increase space
        multiple O(N)
        already sorted then binary search
        look at different complexity scales and see if you can reduce to the next lower scale
        try diff DS
- On space
        sorting
        binary search
        use input for modification or sentinels          

26 -
128 -
256 - Extended ASCII

Alphabets can be stored in array instead of hashmaps

n / 2 + n % 2...for odd and even mid points


_Complexities_:-

n3 > n! > 2^n > n2 > nlogn > n > sq root n > logn

for i=i+2 - O(n/2)    
for i=i*2 - O(log n)    
for i=i*3 - O(log3 n)
for i=i/2 - O(log n)

Sum of 2 powers till n - O(2^n)    
Recursive functions

    Masters theorem
    T(n)=aT(n-b) + f(n)
        if a<1 T(n)= f(n).....not that important
        if a=1 T(n)= n * f(n)
        if a>1 T(n)= a^n/b * f(n) ...binary tree or trie

    Consider upper bounds if a for loop decrements on every recursive call
    
    for{} then recursive call(n-1) means n + n-1 +n-2...T(n)=O(n^2)
    for{ recursive call(n-1)} means n x n-1 x n-2...T(n)=O(n!).....n queen example

Optimization problems:-
- Greedy
    - local optimal is global optimal
    - Faster than DP
- Dynamic programming
    - Considers all solutions
    - Optimal substructure property
    - Overlapping sub-problems property
    - Approach 
        - Recursive(top down with memoization ) 
        - Iterative(bottom up with tabulation)
    - For memoization, memoize the changing values in the recur function parameters        
- Branch and bound
    - It's BFS and backtracking is DFS
    
State space tree

MST 
- is a tree with minimum cost of edges. Edges = Vertex -1 to prevent a cycle and form a tree
- works for only connected and undirected graph. Doesnt work for 2 disconnected graphs
Greedy methods     
1.Prim's Algo
- Select minimum cost edge
- Next minimum cost edge should be connected to existing vertices(keep forming a tree)
- Time complexity  

2.Kruskal's Algo
- Always select next minimum cost edge whether connected or not 
- If it forms a cycle ignore it 
- Time complexity nlogn with PQ
    

AB testing - create 2 versions and gauge the response to finalize the version 
Ternary search does more comparisons than binary in worst case. hence binary is preferred. True for nary search




#### SQL
where is applied first, then group by and then having
aggregate functions with group by are applied to each group




#### Design Patterns

https://stackoverflow.com/questions/1673841/examples-of-gof-design-patterns-in-javas-core-libraries/
GoF - Gang of four ppl made design patterns

SOLID 
    - Single responsibility
    - Open for extensibility, closed for modification
    - Liskov substitution - Program to an interface
    - Interface segregation - Fine grained interface. No analysis paralysis for devs to choose which function to choose
    - Dependency Inversion
    
Abstract class is so that no object can be created of it and you can have common functions defined so that inherited classes can reuse.
Abstract classes can have abstract functions which will have no body so the inherited classes must define it
When abstract class and when interface - abstract class when you have common functions also, interfaces when function names/process only might be same not function definitions

##### Creational:-

Singleton 
- static getInstance and synchronise to prevent multiple initial creations
- private constructor
    
Factory
- Class to create objects so that the creation logic is not handled by clients
- so client doesnt need to be recompiled
- Also there is loose coupling in the client cuz of using the interface/abstract class   
- A factory class with a method to return new objects based on the input parameter with return type of the interface/abstract class
- Single responsibility to create, not to do anything else.
- Creating in one place reduces changes all over the code.  
- Can have a factory of decorated objects like NY pizza, CA pizza etc. A custom pizza can return a base pizza and then allow decorators on it
  
Builder
- Should be used only when you want to build different IMMUTABLE objects using same object building process.
- Instead of giving all values in the constructor as a must or telescopic constructors we use builder pattern.
- one inner static class with public methods to set values, no setters for outer class, all final members for outer class(immutability), one build method in the inner class which creates an object of the outer class with itself as a parameter so that
    values can be transferred from inner to outer class  
- Inner static class cuz it doesnt need access to the outer class variables
- Eg. StringBuilder, MockMvcBuilder
- https://www.youtube.com/watch?v=YmEVYvELt28&t=822s


##### Structural:-

Adapter
- Used to take some existing/legacy code and modify a part of it in the adapter for the new code
- Eg. Android to iphone charger, US car speed in m/hr to UK speed km/hr
- Plug the input into the constructor. Map the output functionalities with the input.
- Adapter pattern improves compatibility between 2 incompatible interfaces
- https://stackify.com/design-patterns-explained-adapter-pattern-with-code-examples/
- Supports one to one or many to one mapping. Many to one by passing an interface(s) as input 

Facade 
- Used to build a facade to a client. Used as a cleanup/abstraction layer
- Supports many to many abstraction 
- Used to map to different function names. Same function names means they could be done by coding to an interface, facade wouldnt be required
- Template pattern can become a facade too, if the sub-template methods are defined in the template class
    like order flow- define the inventory, payment and shipping in the template class
- https://dzone.com/articles/the-facade-pattern


Decorator
- https://www.youtube.com/watch?v=vqy8BL0xV0c&t=352s
- Keep an interface which will be general to all types 
  Keep a basic object to be created as a must. 
  The decorator class is abstract and has the common interface 
  Classes that extend the decorator will call super and add functionality/decorate it.
- To have a constructor that takes an instance of the same abstract class, that's the recognition key of the decorator pattern
- At run time we can add features by decorating each object
- Pizza and their toppings, nokia android phone
- Diff between this and factory is - Factory is like coffee, boba, juice. Decorator is like the toppings on them
- Decorator is used to make combinations possible in any order.
- Helps prevent many ifs
- Drawbacks - Can get too nested to debug, too many objects, can lower the performance


##### Behavioral:-
  
Template
- a process flow that needs to be done for many base classes
- Abstract template class, final template method, that contains abstract methods which each sub class will define separately
            
Strategy design pattern
- https://www.geeksforgeeks.org/strategy-pattern-set-1/
- https://www.geeksforgeeks.org/strategy-pattern-set-2/
- Used for optional behaviours
- If a behaviour definition is common and required for all classes use abstract classes
- But, If a behaviour definition is common but not required for all classes use Strategy pattern
- Assign an interface to a base class and have concrete implementation of the interfaces
- In runtime u wanna be able to set a new interface
- Eg. comparators plugin in diff algos for sorting, characters and their powers
    
Observer
- Used when multiple objects(Observers) are dependent on the state of one object(Subject)
- Eg. Followers get notified, subscriptions, whatsapp group, anything that involves broadcasting a state
- Coding to interfaces helps generalize stuff and can add more classes later on

Iterator


Command
- Creates an abstraction layer for doing commands. The command object has all the implementation details
- Client creates a few commands -> Invoker executes them.

Memento
- Creates a way to undo operations
- A momento is a clone of the object to keep track of its state. A list of momentos can be kept in the invoker to rollback
- https://www.youtube.com/watch?v=zRbHlDeon3E



#### Java

Stream https://www.geeksforgeeks.org/stream-in-java/
- Intermediate Operations: map, filter, sorted
    They return a stream
- Terminal Operations: collect, forEach, reduce
    collect - returns another collection
    forEach - void return. Can be used to modify a list
    reduce - reduce to one value  
eg. number.stream().map(x-> x*x).collect(Collectors.toList());

Abstract class - 
    Doesnt have to have one abstract method - this method would differ for the sub classes hence abstract
    increases reuseability through inheritance using common non-abstract method definitions
    has to be extended. Cant create an object cuz there are abstract methods in it
    Not good to keep uncommon functions in abstract class(use Strategy pattern instead)
     
Interface 
    All methods are abstract 
    All methods must be implemented in implementing class
    Cant create object cuz all methods are abstract
    
StringBuffer - is synchronized, slow
StringBuilder - is not synchronized, twice as fast
StringBuilder is pass by reference, Integer is not 
Integer arrays are faster than Arraylist because arraylist converts primitive types to objects(auto boxing) and then stores the objects which are not contiguous
    hence for primitive types arrays are better. For objects both are same. 

Final
    classes - Cannot be inherited...This can confer security eg. String.java
    methods - cannot be overridden
    variables - are constant

Overriding is for inheritance and overloading is different arguments    
Generics 
- <T> used for type safety during compilation
- T stands mostly for type
- ? means any type. Eg. <? extends T>
- <T extends Number> to allow only classes that extend Number to be passed. Super will be the reverse.
- Used to get rid of overloaded methods. Eg. adding doubles, floats etc
      
Reflection
- Get all definitions in a class via java.lang.reflect such as methods, fields, super classes
- Reflection might be slow 
 
Threads
- Created via extending Thread class or implementing Runnable and define run function. Thread class also implements Runnable. the class that implements Runnable are passed to Thread constructor 
- The start method should be called not run. Calling run will execute it in a single threaded manner.
- Inter-thread communication - wait(),notify(), notifyAll()
- Synchronised blocks can be used for methods that are not synchronisable
- Threadpools - FixedThreadPool, SingleThreadPool, CachedThreadPool(creates new ones threads or reuses old), ScheduleThreadPool 
- ExecutorService is used to run a threadpool. Internally uses a blocking queue which is thread safe
    - Can .execute(Runnables) or .submit(Callables). Runnable doesnt have a return type. Callable can return
    - Future is used as placeholder for Callable returns
    - Future.get() returns the value of the callable and if callable hasn't finished yet it blocks the current thread. It can have a timeout
    https://www.youtube.com/watch?v=NEZ2ASoP_nY
- Completable future
    - Runs a new thread and supports chaining of completable futures or running them in parallel in different thread pools and exception handling compared to Futures
    - runAsync for void return type and supplyAsync for return values 
- ThreadLocal
    - Creates variables/objects for each thread rather than task and remains local to that thread till its killed
    - Has a static object, initialValue() and get() functions
    - Lamda way is- static ThreadLocal<SimpleDateFormat> df = ThreadLocal.withInitial(()) -> new SimpleDateFormat());
    - Helps reduce memory footprint for large number of tasks
- Accessing shared resources https://www.baeldung.com/java-mutex
    - Critical section is a section that accesses a shared resource
    - Mutex is a lock to prevent race conditions over critical sections, can be implemented in the foll ways
    - synchronised - one thread at a time
    - ReentrantLock 
        - one thread at a time but with flexibility of conditions
        - lock.lock() outside the try and lock.unlock() in finally is the same as writing synchronised
        - Condition.await() and Condition.signal()
    - Semaphore
        - Allows a fixed number of threads to access a critical section
        - if capacity is set to 1 then it behaves like a mutex
        - acquire() and release()
        - Used to restrict access to a resource like 100 threads but only 3 at a time are allowed access
    - ReadWriteLock
        - for multiple ReadLocks or one WriteLock. Read and write cannot happen at the same time

Javax.mail - mail api
Apache Velocity templating engine, can be used for email templates

Equals and Hashcode
    - Overriding equals should also override hashCode
    - equals(Object o) method checks 
        - this == o
        - o instanceof className
        - Type cast o and compare all class variables
    - hashcode returns int and should be unique for the set of values in the object
    - If hashcode is different the equals() is not checked
        if hashcode is same equals() is checked
    - String1.equals(string2) calls this method

HashMap working
    - Array and Linked List Node(key, value, hash, next)
    - Put operation -> generate hash and index -> store at that index
    - Get operation -> generate hash and index -> Go thru the LL first check hash, then key 
    - TREEIFY_THRESHOLD = 8 after this converts to binary tree
 
Object class
    - functions like hashcode(), equals(), toString(), clone()
    - default toString() has classname@hashcode as return value 
    - clone()
        - can be a deep copy or shallow copy depending on the implementation of the clone method 
        - Shallow copy - just implement Cloneable and in the clone method do super.clone()
        - Deep copy create a new object for sub objects or call their clone too
        - https://www.geeksforgeeks.org/clone-method-in-java-2/
             
Java 7 vs 8
    - Lamda function - Function as arguments
    - Streams in collection 
@Transient 
    - In java it means dont serialize and in DBMS means dont store
    - static and final fields are class variables and not object/instance so they will always have their default value
      and are not serialized. Making them transient is useless. 
    - Can be used for sensitive info like passwords and derivative fields to speed serialization
Serialization
    - Converts object to stream of bytes for storage/transmission
    - serial version uid can be generated automatically by the JVM but is compiler version dependent, hence setting it manually via IDE is better
    - ObjectMapper from Jackson helps serialize and deserialize JSON
Checked vs Unchecked exceptions
    - Unchecked is like Runtime Exception eg. Divide by 0
    - Checked is compile time  

Integer vs int or Boolean vs boolean etc
    - object vs primitive type, Integer is useful for type conversions, Integer is nullable, int is faster
BigDecimal is better for precision/monetary stuff compared to double or float, but slower
 
Static inner class and inner class
- Inner classes can access all outer class variables including private
- If a class is not used by any other classes it can be kept inside.    
- Non-static inner classes have access to members of the enclosing class, even private. 
- Static nested classes do not have access to other members of the enclosing class. Hence its used in builder pattern
- A static nested class interacts with the instance members of its outer class as the static class exists before the outer class
 
Interface vs Inheritance vs Enum
- Interface you want everything to have a different implementation but common signatures
- Inheritance - "is a" relationship. Extensible for arbitrary number of types and to use common functionality
- Composition - "has a" relationship. Helps in code reuse Car-Engine & Trunk-Engine. Can hide visibility of composed class.
- Enum are named constants, can only be string. They are for fixed possibilities and wouldn't require extra functionality or extensibility in the future
    like days of the week, planets,colors etc

Lombok - a java framework to remove boilerplate code
    @Data - provides getter, setter, toString, hashcode

try-finally combination is used to free up resources. BoundedBlockingQueueReentrantLock
 
Comparable vs Comparator
- Comparable uses compareTo(T), Comparator uses compare(T, T)
- Sometimes, we can't modify the source code of the class whose objects we want to sort, thus making the use of Comparable impossible
- Using Comparators allows us to avoid adding additional code to our domain classes
- We can define multiple different comparison strategies which isn't possible when using Comparable
- collection.sort(List) uses comparable, collection.sort(List, Comparator) uses comparator and follows strategy pattern

#### Spring

Spring is a framework over Servlets

Cyclic dependency A->B->A. 
    - Can be removed by @Lazy, Setter, @PostConstruct

Dependency injection - Helps in loosely coupling and mocking classes(testing)
    - A dependency injection container helps create objects and autowire them
    - Instead of creating objects with "new" manually and having them tightly coupled, the container creates them and autowires them, making them mockable too
    - By creating a mock bean the container knows it has to autowire this bean instead of the actual one. To create a mock objects you need loosely coupled components
    - @Qualifier helps differentiate between similar bean types

@Autowire a list of interface, autowires all its implementations    

Bean scopes   
- Singleton scope should be used for stateless beans. Default. Initialized on startup
- Prototype scope for all beans that are stateful. Unique per reference. Initialized only when getBean() is called.
    Used when u want spring context in a class but it should have multiple instances. 
- Request
- Response
- to inject prototype bean into singleton we need @Lookup notation to correctly have a prototype bean

Scheduling - Quartz
@Async
Async functions need to be public like @Transactional
    - https://dzone.com/articles/spring-and-threads-async
    - Simpler than writing taskExecutor for standalone asynchronous tasks
    - If a task executor is present it will go to it, if specific taskExectutor is mentioned will run in that
      or otherwise will run a default one.

AOP

Aspects 
- Advice - Before, After, Around, After returning and After throwing
- Pointcuts - Conditions
- JoinPoint - program execution
- Aspects(concerns) consists of Advice and pointcuts. Advice uses pointcuts

Filter
- Filters are provided as a part of tomcat for Servlets. Spring implements tomcat's Filter
- lifecycle - init() -> doFilter(){ log(request); chain.doFilter(); log(response)} -> destroy()
- Executes in web layer only

Interceptors
        

@Transactional 
    - will rollback in case of unchecked exceptions(Runtime exp,) but can be configured for checked also
    - method needs to be public
    - Will auto commit at the end
    
Live reload
Actuator     

Redirect - https://www.baeldung.com/spring-redirect-and-forward
    Redirect happens on the browser side with a 302
    Forward happens on the server side
    
Spring testing
@RunWith(SpringRunner.class) only is required for spring
@RunWith(MockitoJunitRunner.class) is for non-spring context
@MockMvc creates a test without server
@MockBean - for mocking beans, automatically injects them
@SpyBean - for mocking only certain parts
@Mock , @Spy - for non spring boot context
@InjectMocks used by regular(Non-spring) mockito to inject mocks into service/class

@PreAuthorize helps authorize access to APIs base on roles
ObjectMapper from Jackson helps serialize and deserialize JSON

Fault Tolerance vs Resilience
- Slow threads make every thing else slow, so make them timeout
- Too many timeouts occur, still can make everything else slow, so create a circuit breaker pattern(Hystrix)
- Circuit Breaker parameters - Number of requests, number of failed requests, time duration of requests
- After breaking the circuit, 3 Fallback options - Return cached response, Return default response, Return error
- Bulkhead pattern- like a ship separate the parts that could cause an issue. Set separate hystrix pools

Microservices
- Monolith is a all in one, SOA is many services but still in one, MS is multiple services in separate instances
- Advantages - diff development cycles and languages, diff scaling, fault tolerant, modular POCs
- Disadvantages - Latency, authentication, load balancing, debugging 
- In case of many MS, debugging can be done better with a correlation id per request(originating processName_timestamp_threadname)


#### Misc.

Agile methodology uses scrum framework 
Sprint is like 2 weeks or 4 weeks development cycle and shippable product
Daily Scrum meetings is a standup meeting either daily, where what has been completed, what being worked on and issues are discussed 
A sprint has many daily scrums

Experience related question:
- Memory issues
- Performance issues
- Commodity code issue
- Code review
 
 
 
