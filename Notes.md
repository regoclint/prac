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

BST do inorder iteratively with stack

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
    Arrays.binarySearch(int[] a, int fromIndex, int toIndex, int key)
    
    Character.isDigit
    Character.isAlphabet
    
Collections.sort uses Array.sort by converting the collection to array
Array.sort uses quick sort for primitive type and Tim sort for objects

26 -
128 -
256 - Extended ASCII

n / 2 + n % 2...for odd and even mid points

Complexities
    n3 > n! > 2^n > n2 > nlogn > n > logn
    
Recursive functions

    T(n)=aT(n-b) + f(n)
        if a<1 T(n)= f(n)
        if a=1 T(n)= n * f(n)
        if a>1 T(n)= a^n *f(n) ...binary tree or trie

    for{} then recursive call(n-1) means n + n-1 +n-2...T(n)=O(n^2)
    for{ recursive call(n-1)} means n x n-1 x n-2...T(n)=O(n!).....n queen example


**System Design**

Twitter (News Feed)    
- is read heavy compared to write
- Tweeting
    - HTTP Put -> Load balancer -> into 3 redis instances(Fan out). Redis because high speed in memory and only 140 characters.
    - We need more speed than space.
    - A tweet updates the followers timeline in redis (precomputing)
    - A celeb tweet appears on page refresh(from DB rather than Redis) so that comment on the tweet appears in the right order due to the high volume of followers                      
- Timeline - User and Home
    - User timeline is simple 
    - Home timeline merge from all followers in chronological order
    - HTTP Get -> LB -> get fastest timeline from 3 redis instances         
- Following
    - Active followers table is checked before precomputing the tweet into timelines
- Search
    - During the tweet operation the tweet is also sent to a Search engine to be indexed and be searchable
- Advertising
- Eventual consistency???
 
Instagram
- Precomputing like count is better so store the aggregation counts in another table  
- similar to twitter cuz of timelines
- Cache or precompute news
- Push notifications for users posts and pull for celebreties or rate limit pushes 
- Web sockets to push notifications
    
Whatsapp (Chat service)
- https://www.youtube.com/watch?v=vvhC64hQZMk
- One-one chat
- UserA over TCP -> to gateway -> sessions service which has the user to gateway mapping -> Queue -> Gateway(Web socket) -> UserB
- Group chat - also has group service for group to user id mapping       

Tinder
+ Store Profiles
    - Images stored as File vs BLOB 
        - Files are cheaper, faster, dont need updates. Can use CDN 
    - Images stored in DFS(Distributed File system)
    
- Recommend matches    
- To index multiple coloumns
  - Casandra or Amazon Dynamo DB - NoSql
  - Sharding or Horizontal scaling

HTTP - client to server protocol
XMPP or Websockets - Peer to peer protocol -Stateful and long lived TCP connection    
CDN - Build to reduce response times by creating copies in different geographical locations




**Design Patterns**

Abstract class is so that no object can be created of it and you can have common functions defined so that
inherited classes can reuse.

Abstract classes can have abstract functions which will have no body so the inherited classes must define it

Singleton
    static getInstance
    private constructor
    
Factory
    Class to create objects so that the creation logic is not handled by clients
    so client doesnt need to be recompiled
   
  
Template
    a process flow that needs to be done for many base classes
    Abstract template class
    final template method
    abstract methods which each sub class will define separately
            
Strategy design pattern
    https://www.geeksforgeeks.org/strategy-pattern-set-1/
    https://www.geeksforgeeks.org/strategy-pattern-set-2/
    Used for optional behaviours
    If a behaviour definition is common and required for all classes use abstract classes
    But, If a behaviour definition is common but not required for all classes use Strategy pattern
    
""


**Java**

Future Task, ExecutorService, ThreadPoolExecutor, Async(Spring)
ExecutorService uses ThreadPoolExecutor and can choose the type of threading
FutureTask blocks current execution

Stream, Lambda

Abstract class - 
    has to have one abstract method - this method would differ for the sub classes hence abstract
    increases reuseability through inheritance using common non-abstract method definitions
    has to be extended
    Cant creat object cuz there are abstract methods in it
    It is inherited
    Not good to keep uncommon functions in abstract class(use Strategy pattern instead)
    
Interface 
    All methods are abstract 
    All methods must be implemented in implementing class
    Cant create object cuz all methods are abstract
    It is implemented
    
String buffer - is synchronized, slow
String builder - is not synchronized, twice as fast

Generics 
- <T> used for type safety. 
- Also helps reducing the number of overloaded functions
- Used for 
    
Reflection
- Get all definitions in a class via java.lang.reflect such as methods, fields, super classes
 
 
**Spring**

Cyclic dependency - if set a bean in constructor

Dependency injection - Helps in loosely coupling and mocking classes(testing)

Scheduling
@Async
Async functions need to be public like @Transactional
https://dzone.com/articles/spring-and-threads-async

AOP

Aspects 
- Advice- Before, After, Around, After returning and After throwing
- Pointcuts - Conditions
- JoinPoint - program execution
- Aspects(concerns) consists of Advice and pointcuts. Advice uses pointcuts

Filter
- Filters are provided as a part of tomcat for Servlets. Spring implements tomcat's Filter
- Tomcat filter lifecycle - init() -> doFilter(){ chain.doFilter()} -> destroy()
- Executes in web layer only

Interceptors
        

@Transactional
Live reload
Actuator 