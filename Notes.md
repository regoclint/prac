**DS & Algos**

DS
String, Array, ArrayList, LinkedList, PQ(Heap), TreeSet, 

Red black tree properties

Graph representations
    Edge list
    Adjacency List
    Adjacency matrix
    HashMap of HashMaps
    List of other neighbour Graph Nodes & node lookup HM

Graph BFS or DFS doesnt matter if its undirected or directed
BFS is better than DFS in grid

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
Inorder in BST is ascending order and modify inorder for descending
For nary tree serialize deserialize need children count
For binary tree serialize deserialize need null values
For preorder subtree need # at start
PQ and TreeSet
    Both O(log(N)) time complexity for adding, removing, and searching elements
    PQ can have duplicates, TreeSet cannot
    Iteration in TreeSet is ordered PQ is random
DL - faster insertions and removals, lookup by index is slow. HM can be used for faster lookup
ArrayList - slower insertions and removals, faster lookup by index    
            Can do a binary search if sorted.

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
- DP
    - Considers all solutions
    - Optimal substructure property
    - Overlapping sub-problems property
    - Approach - Recursive(top down) or Iterative(mostly bottom up) with tabulation
- Branch and bound
    - It's BFS and backtracking is DFS
    
State space tree

MST 
- is a tree with minimum cost of edges. Edges = Vertex -1 to prevent a cycle
- works for only undirected graph
     
Prim's Algo
- Select minimum cost edge
- Next minimum cost edge should be connected to existing edges(keep forming a tree)
- Time complexity  

Kruskal's Algo
- Select next minimum cost edge always
- If it forms a cycle ignore it 
- Time complexity nlogn with PQ
    

AB testing - create 2 versions and gauge the response to finalize the version 



**System Design**

Twitter (News Feed) https://www.youtube.com/watch?v=KmAyPUv9gOY    
- is read heavy compared to write
- Tweeting
    - HTTP Put -> Load balancer -> into 3 redis instances(Fan out). Redis because high speed of in-memory and only 140 characters.
    - We need more speed than space.
    - A tweet updates the followers timeline in redis (precomputing). Based on a frequently logged in user too.
    - 3 Redis instances have duplicated data for high availability
    - A celeb tweet appears on page refresh(from DB rather than Redis) so that comment on the tweet appears in the right order due to the high volume of followers
        The order would get destroyed if redis is used for celebs, cuz updating the follower's timeline would take time and due to that a comment on a celeb tweet may 
        appear before the celeb tweet                      
- Timeline - User and Home
    - User timeline is simple 
    - Home timeline merge from all followers in chronological order
    - HTTP Get -> LB -> get fastest timeline from 3 redis instances         
- Following
    - Active followers table is checked before precomputing the tweet into timelines
- Search
    - During the tweet operation the tweet is also sent to a Search engine to be indexed and be searchable
- Advertising
- Eventual consistency
    
    
 
Instagram (News Feed) 
- Precomputing like count is better so store the aggregation counts in another table  
- similar to twitter cuz of timelines
- Cache and precompute news
- Push notifications for users posts and pull for celebrities (or rate limit pushes) 
- Web sockets to push notifications
    
Whatsapp (Chat service)
- https://www.youtube.com/watch?v=vvhC64hQZMk
- Auth Service/Profile service
- One-one chat
    - UserA over TCP -> to gateway -> LB -> sessions service which has the user to gateway mapping(cache) -> Queue -> Gateway(Web socket) -> UserB
- Sent, delivered and read receipts
- Online/Last seen    
- Group chat 
    - has group service for group to user id mapping
    - Group limit as fanning out can be expensive
    - Group id based consistent hashing
    - failed sending/ Retry message failures
- Chat Backup           
- Image service
- Email/SMS service


Tinder (Dating)
https://www.youtube.com/watch?v=tndzLznxq40&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=9
+ Store Profiles
    - No of images req?
    - Images stored as File vs BLOB 
        - Files are cheaper, faster, dont need updates. Can use CDN 
    - Images stored in DFS(Distributed File system) based on user id
    -DB storing user id and file url(CDN ???)
    
- Recommend matches
    - Recommend based on age, gender, location and have a fast lookup
    - Location is updated every hour then how sharding is done??? 
    - If all 3 columns are indexed, only one index is used at a time and binary search happens on them
        - Casandra or Amazon Dynamo DB - NoSql...better than sharding as sharding is complicated
        - Sharding or Horizontal scaling - shard based
         
- Note matches
    - only the user id to user id so that matches can be recovered
    
- Direct messaging    


Uber (Ride share)
 - https://www.youtube.com/watch?v=umWABit-wbk
 - Booking a cab
    - Mapping drivers to riders, cost, time calculations
    - Make payments
    - Confirming request with driver
    - Confirmation sent to customer
 - Mapping (DISCO)
    lat long, circle drawn, by road time and cost calculation done   
 - Payment
 - Messaging/Call
 - Logging service
 - Surge pricing
 - Fraud detection
 - ML stuff
 


Amazon (Shopping)

- Availability > consistency
    - Loss of availability means loss of revenue, hence more important
    - Increase servers for availability but maintaining the replicas consistency is difficult
    - Achieving high availability and consistency is difficult


Netflix (Streaming service) https://www.youtube.com/watch?v=psQzyFfsUGU
- Uploading content
    - Transcoding - Videos need to be created for different formats and resolutions for different devices approx 1200 different versions are created
        - Video validation
        - Divide the original content into chunks, put them into kafka, merge them for different formats and resolutions (concurrent async workers)
        - Store them finally in S3
    - Adaptive bit rate streaming is used to fetch these different formats
    - Different versions are pushed to the Open Connect around the world

- Zuul as gateway
- DB both mysql and cassandra
    MySql - for billing, user, transaction for ACID
        - Writes happens to two masters, then it syncs to slaves
        - Reads happen from slaves
    Cassandra - for user activity, other big data etc 
                When user activity data increased, they compresses old data 
    
- Live Anaylsis
    - Kafka and Chukwa
    - Events such as viewing activity, error logs etc are sent thru kafka
    - ELK used to display search and display activities
    
- Recommendations
    - Spark n ML    
    - Collaborative filtering - What a similar user watched 
    - Content based filtering - What content type the user is interested in from the past

       
Tiny URL


    
Maximus (upload and download)




HTTP - is synchronous, client to server protocol
TCP - is asynchronous
XMPP or Websockets - Peer to peer protocol -Stateful and long lived TCP connection    
CDN - Build to reduce response times by creating copies in different geographical locations
Eventual consistency
    https://www.youtube.com/watch?v=fIfH-kUaX4c
    Monetary Transactions can be tightly coupled
    Like count, hit counter etc can be loosely coupled thru queues
    When high volume comes into picture asynchronous communication might be better

Reverse proxy(NGINX) - A proxy for servers...inbound communication
Forward proxy - A proxy for clients...outbound communication
Gateway/Proxy servers help in
    -Hiding behind a domain(Anonymity)
    -Security, firewalls
    -Caching
    -Load balancing
    -Routing
NGINX is a software based reverse proxy, better than hardware based ones  
Precomputing could generally mean make updates when the update activity is done before run time of the actual activity

Consistent hashing 
    Way to distribute load uniformly by hashing many times for more virtual servers
    So when servers are added or deleted or fail the load is properly distributed
    Hash so that only few servers are affected and caches of previous requests are not dumped

Sharding (DB servers)
    it is technique of distributing data in a relational database on a particular field
    Indexes can be created on another field so that queries are more optimised 
    Consistent hashing can be used to allocate new shards
    Master slave configs provide better availability and consistency as writes happen only to master and then it fans out, read can happen anywhere
    Drawbacks - Joins, Shards are fixed, hierarchical sharding further divides shards into smaller shards

Load balancing helps you scale horizontally across an ever-increasing number of servers

CAP theorem
Consistency - Data should be same in read for all users
              read and writes should be synchronised
              Consistency is more important than availability for DBs
Availability - Always on               
               More important than consistency for Computational servers
Partition tolerance - cluster functions even when some nodes can't communicate with each other
    CA - data is consistent between all nodes - as long as all nodes are online 
       - and you can read/write from any node and be sure that the data is the same, 
       - but if you ever develop a partition between nodes, the data will be out of sync (and won't re-sync once the partition is resolved).
    CP - data is consistent between all nodes, and maintains partition tolerance (preventing data desync) by becoming unavailable when a node goes down.
    AP - nodes remain online even if they can't communicate with each other and will resync data once the partition is resolved,
       - but you aren't guaranteed that all nodes will have the same data (either during or after the partition)
                 
Server crash use heartbeats to the service not box and restart nodes

Pessimistic concurrency lock - Lock the resource when accessed
                                Helpful for multiple simultaneous access  
Optimistic concurrency lock - No locks, while committing a change check whether the previous read state == current read state 
                              Helpful for infrequent multiple simultaneous access  

- Idempotent - No matter how many times you call the operation, the result will be the same.

ACID - Atomicity, Consistency, Isolation, and Durability

- Kafka vs Message queues
    - https://hackernoon.com/a-super-quick-comparison-between-kafka-and-message-queues-e69742d855a8
    - https://kafka.apache.org/intro.html
    - Messaging traditionally has two models: queuing and publish-subscribe
    - queues aren't multi-subscriber—once one process reads the data it's gone
    - Publish-subscribe allows you broadcast data to multiple processes, but has no way of scaling processing since every message goes to every subscriber
    - Kafka's model is that every topic has both these properties—it can scale processing and is also multi-subscriber
    - Kafka messages are retained even after they are consumed



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
Enumerations serve the purpose of representing a group of named constants like types -days of the week,
planets,colors etc

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

Final
    classes - Cannot be inherited...This can confer security eg. java.lang.system
    methods - cannot be overridden
    variables - are constant
    
Generics 
- <T> used for type safety. 
- Also helps reducing the number of overloaded functions
- Used for 
    
Reflection
- Get all definitions in a class via java.lang.reflect such as methods, fields, super classes
 
Threads
- Created via extending Thread class or implementing Runnable and define run function
- ExecutorService can be used as a thread pool
    - It can use future.get which returns null when its over
    - It can be implemented via Callable instead of Runnable and return a result via future.get()
 
Apache Velocity templating engine, can be used for email templates
Javax.mail - mail api

 
**Spring**

Spring is a framework over Servlets

Cyclic dependency - if set a bean in constructor

Dependency injection - Helps in loosely coupling and mocking classes(testing)

Bean scope - As a rule of thumb, you should use the prototype scope for all beans that are stateful, 
while the singleton scope should be used for stateless beans.


Scheduling - Quartz
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
        

@Transactional - will rollback failures
Live reload
Actuator 

Redirect - https://www.baeldung.com/spring-redirect-and-forward

Spring testing
@RunWith(SpringRunner.class) only is required for spring
@RunWith(MockitoJunitRunner.class) is for non-spring context
@MockMvc creates a test without server
@MockBean - for mocking beans, automatically injects them
@SpyBean - for mocking only certain parts
@Mock , @Spy - for non spring boot context
@InjectMocks used by normal mockito to inject mocks into service/class


**Misc**
Agile methodology uses scrum framework 
Sprint is like 2 weeks or 4 weeks development cycle and shippable product
Daily Scrum meetings is a standup meeting either daily, where what has been completed, what being worked on and issues are discussed 
A sprint has many daily scrums

Experience related question:
- Memory issues
- Performance issues
- Commodity code issue
- Code review