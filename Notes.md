**DS & Algos**

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

Fail-fast - fail earlier in the process. Iterator fails fast in case of concurrent modification
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
new HashSet(Collection<? extends E) a collection can quickly be copied into a hashset
Enhanced for loop over stack gives it in sequential order unlike pop
Path of binary search passes over the closest values to target
To access parent nodes of binary 
    convert tree to graph
    make a parent map for each node
For DP if one dimension of the array can go negative then instead of matrix can use an array of hashmaps (longest arith seq)
PQ can be optimised by storing only required size -> Klogn 
To store array index in row * C + col. To retrieve the index row= storedValue / C and col = storedValue % C 

LCA
    For BST - its where the values divide
    For Binary & Nary - return the node if the return node count is >1 the root is new lca
    For multi parent(graph) - Build adj matrix, traverse from child to parent for both the targets 
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
    - Tree is a graph if
        - number of edges exactly = nodes - 1
        - no cycles
Subsequence is not contguous, substring is
LIS, Longest arith seq, LCS(substring and Subsequence) all are similar dp loop checks
if top down goes with a +1 to next index then bottom up will go with -1. The opposite happens as dp builds on completed areas.     
For binary search its better to do l +(r-l)/2 to prevent number out of bounds  
Bipartite graph
    - Every edge has one end in one set and other in another
    - Also it has no odd length cycles
    - Can be identified by coloring with 2 colors
Maximum sliding window, daily temperatures...use a stack to get rid of old irrelevant values    
In two sum, take care of 2 equal numbers(Two sum 3)
Graph is a tree, if there is only one connected path to all nodes, no cycles
% 1000 / 100 will give number at hundred position directly
For a pair the functions are getKey() and getValue()
Can do Collections.binarySearch on a List of Pairs - TimeMap question
Random number from a range can be done by low + rand(high - low)
Stack can be used to continue a previous processing and end intermediate processing. Keep a list of prev maximums/values
    Daily temp, next greater element, valid parenthesis, maxSlidingWindow have similar needs
For matrix multiplication each row of A is multiplied with each col of B


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




**SQL**
where is applied first, then group by and then having
aggregate functions with group by are applied to each group




**System Design**

Twitter (News Feed) https://www.youtube.com/watch?v=KmAyPUv9gOY    
- is read heavy compared to write
- Tweeting
    - HTTP Put -> Load balancer -> into 3 redis instances(Fan out). Redis because high speed of in-memory and only 140 characters.
    - We need more speed than space.
    - A tweet updates the followers timeline in redis (precomputing). Based on a frequently logged in user too. This is for non-celebrities
    - 3 Redis instances have duplicated data for high availability
    - A celeb tweet is added to a user timeline on a pull basis rather than fanout so that comment on the tweet appears in the right order due to the high volume of followers
        The order would get destroyed if fanout is used for celebs, cuz updating the follower's timeline would take time and due to that a comment on a celeb tweet may 
        appear before the celeb tweet
        When a pull request comes in a users celebrities timeline is checked and latest tweets are merged into the user's timeline                      
- Timeline - User and Home
    - User timeline is simple 
    - Home timeline merge from all followers in chronological order
    - HTTP Get -> LB -> get fastest timeline from 3 redis instances         
- Following
    - Active followers table is checked before precomputing the tweet into timelines
-Sharding
    Posts - Cassandra. Cannot be sharded on user cuz for hot users it could create an unbalanced load. Shard based on epoch time & sequence
    Timeline - Since its in memory and has limited posts per user, we can shard on userid and use CH
    News feeds have hot users unlike other design hence userids are not that good for CH
- Trends
    - Filter(stop words, unwanted hashes, adult)-> parse -> Geolocation count  ___
                                                                                  |-> Redis
                                                         -> volume based count ---
    - based on volume in a given amount of time
    - Storm is use for stream processing 
Feed ranking    
- Search
    - During the tweet operation the tweet is also sent to a Search engine to be indexed and be searchable
- Advertising
- Eventual consistency is fine to have as its not a banking application. A slight delay in showing is fine 
- Zookeeper to manage the large Redis clusters    
    
 
Instagram (News Feed) 
- Precomputing like count is better so store the aggregation counts in another table  
- similar to twitter cuz of timelines
- Cache and precompute news
- Push notifications for users posts and pull for celebrities (or rate limit pushes) 
- Web sockets to push notifications
- Store Images/Videos in S3

    
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

Facebook (Chat service with storage)
- FR - 1-1 chat, online status, chat storage,group chat, push notifications
- NFR - low latency, no data loss and high consistency
- Message handling 
    - push model through web sockets or HTTP long polling
    - keep track of user to connection box
    - 500M active connections so 10K servers with each having 50K connection capacity
    - Storing the message in DB can be done parallely
    - Message id is epoch time + seq
- Message storage
    - HBase as there are a large number of small entries
    - Fetching data should be by Pagination based on the viewport of the user's device
    - cache few messages of frequent users spoken to for a particular each user
- User status
    - User comes online or offline, broadcast to viewers
    - Fetch top users in a user's chat when the app is open
    - set status after waiting for a couple of seconds to prevent offline and online rapid changes    
- Partitioning based on userid or groupid
- Fault tolerence - if chat server fails. allow user to reconnect

                        

Tinder (Dating)
https://www.youtube.com/watch?v=tndzLznxq40&list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX&index=9
https://www.youtube.com/watch?v=nBdTBDJNOh8 (for the diagrams)
+ Store Profiles and Login
    - No of images req?
    - Images stored as File vs BLOB 
        - Files are cheaper, faster, dont need updates. Can use CDN 
    - Images stored in DFS(Distributed File system) based on user id
    - DB storing user id and file url(CDN ???)
    - token used for authorizing each call instead of sessions as this is not web
    
- Recommend matches
    - Recommend based on age, gender, location, active users, bad actors, progressive taxation(if u get too many hits), user grouping(for most likely matchable ppl)
    - Geosharding - Using Google S2 to find location of servers to be placed and to get recommendations
    - Servers in different timezones can be used together when one timezone has much lower load 
    - Elastic search is used to find the sharded data
    - Location is updated every hour then how sharding is done??? 
    - If all 3 columns are indexed, only one index is used at a time and binary search happens on them
        - Casandra or Amazon Dynamo DB - NoSql...better than sharding as sharding is complicated
        - Sharding or Horizontal scaling - shard based
         
- Note matches
    - only the user id to user id so that matches can be recovered
    - send the match -> web socket and -> queue - > Matching service <--> Redis 
       Other user   <------|----------<-  queue   <-|
                                                        
- Direct messaging      




Amazon (Shopping)

- Availability > consistency
    - Loss of availability means loss of revenue, hence more important
    - Increase servers for availability but maintaining the replicas consistency is difficult
    - Achieving high availability and consistency is difficult

Youtube/Netflix
-Components - Processing Q, Encoder, Thumbnail generator, Video and User metadata store, Video and Thumbnail store, Video metadata Cache, CDN 
- Video metadata and user storage can be in MySQL
- Videos can be stored in HDFS
- Split read and write traffic
- Use master slave config for reading videos, a delay in updating all slaves is acceptable as its fine to not show a video for some time
- Thumbnails are more in number like 5 per video and very small in size(5kb), so BigTable is good along with a cache for hot ones
- Video uploads should resume from a point if failed
- Shard for video metadata db based on videoId instead of userId to prevent hot users.
    So a select all user's videos will aggregate data from all servers and could apply ranking and return the results
- Video deduplication can be done at preprocessing time rather than later to prevent encoding etc 
- Can cache based on 80-20 rule for metadata servers
- Use CDN may be within an ISP like Netflix
      

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
    
- Live Analysis
    - Kafka and Chukwa
    - Events such as viewing activity, error logs etc are sent thru kafka
    - ELK used to display search and display activities
    
- Recommendations
    - Spark n ML    
    - Collaborative filtering - What a similar user watched 
    - Content based filtering - What content type the user is interested in from the past


Web crawler https://www.youtube.com/watch?v=BKZxZwUgL3Y

 - Flow: Seed URL -> URL Frontier -> Fetcher + Renderer (DNS resolver + Redis + Storage) -> URL Extractor + Duplicate detection + ...
        -> URL filter -> Is Crawled?(Bloom filter - youtube.com/watch?v=RSwjdlTp108) 

- Seed url from all categories
 - URL Frontier:- Prioritizer -> front Qs(1 Q per priority) -> Back Q router -> Back Qs (1 per thread and per domain to maintain politeness)
                ->Heap(to select earliest politeness)    
                Prioritizer will have priority on type of content(like news),freshness etc
                Back Q Router will create mapping of hostid to Back Q id
                Heap will update time after picking the url for politness
                #Back queues = # of threads of fetcher          
 - DNS Resolver to map hostname to ip can be cached. A custom dns resolver is req as its faster                 
 - Fetcher & renderer:- fetches urls from back Qs when its free. It also renders the pages also now we have single page applications like angular which need rendering
                It stores the pages in compressed forms in DB and some in uncompressed form in redis(because uncompressing can take time for some)
 - URL extractor - This can be done only after rendering to reveal the total list of URLs
 - URL filter- only html or only jpeg etc
 - Detect updates:- HEAD requests to find update time
        duplicates:- MD5 hash works only entire match, SimHash of 2 pages gives similarity %(near duplicate for people who copy content)
 - Storage:- Google cloud big table build on GFS etc. No sql DB for PBs of data                 
       
    
Rate limiter https://www.youtube.com/watch?v=mhUQe4BKZXs
 - Flow:- Clients -> Web Server -><- Rate Limiter Svc -> Redis & DBMS 
                                -><- App Service        
 - High availability, low latency system
 - Algos
    Fixed window - leads to waste of time slots
    Rolling window - this is better as necessary timeslots are stored. But last 5 mins requests can be more than the limit. use Redis with lock
    Sliding window - Store all timestamps, delete older ones every time. Has too many entries. Redis sorted set
    Sliding window with counters - sliding window for 1 hour and rolling window for each min(max 60 rolling windows) i.e timestamp with count. Keep a TTL for each entry. Redis hash
 - Keep redis as storage for the tokens. Userid : Count : Epoch time(number of milliseconds since 1 Jan 1970)
 - Every access is read and write. Use write back cache as its not critical data and has low latency.
 - LRU cache for eviction policy
 - In a distributed system there can be concurrency issue/race condition(Atomicity of read & write)- Optimistic locking can solve it     
 - Storage space required for 1 million users ~ 1.6GB
 - Shard per user id and per api. Consistent hashing for fault tolerance and replication
 - Rate limit by both user & ip - Only IP then other users will also be blocked
                               Only User then login api will not get rate limited      
 - Similar to hit counter, but differences are -
    Hit counter is not per user so one Q is fine
    It has 2 operations, getHits() is not a multi-threaded low latency response  
 
Dropbox https://www.youtube.com/watch?v=U0xTu6E2CT8
 - Flow- Client -> EBS storage
                -> Message Qs -><- Sync Svc -> Metadata store
                     |
         Client2 <---|
         Client3 <---|            
 - Write and read heavy system
 - SQL cuz of ACID will help in consistency. NoSQL eventual consistency will be messy
 - Client
        Watcher watches for changes in current folders, hashing can be used to check file differences
        Chunker - Breaks file into smaller chunks for better bandwidth, time, storage, throughput
        Indexer - receives events from watcher and updates DB, also shares changes with Sync svc
        Internal DB - Keep track of offline changes,    
 - Metadata server
    Info about Chunks, Files, User, Devices, Workspace (sync folders)
    Hash file id with CH
 - Synchronisation server
 - Message Queue Service
    One request queue may be because of ordering, might be possible to have one queue per file 
    Separate response Qs because of many devices so each device needs to get an update of the the file
    Helps persist data if devices are offline
 - Block Cloud storage like EBS       
       
       
Tiny URL
 - Flow:- client -> LB -> App server -> LB -> Cache
                                           -> DB                 <- Cleanup Svc
                                     -> Key gen svc -> Key DB    <-     
 - Unique id generation
    Generate 6 letter random alpha-numeric keys in advance via MD5 or SH-256
    2 tables for used and unused keys
    Lock the key so that multiple servers wont give same key
    Rate limit creation to prevent abusive usage of all keys
 - LB - Round robin with CPU load check. Between client, App server, cache and db
 - Caching
    Data is only read from caches, no updates by users.
    If there is a cache miss, read from db and update all caches
    LRU
    Create replicas so load is uniformly distributed and no SPF
- DB NoSQL is better because millions of records and only 2 tables URL and User. CH based on the uniqueid for partitioning    
 - Purging
    When expired link is accessed delete it and make it reusable
    Can run cleanup tasks during low traffic. 
    Could store id and expiration time in another table 
    Cleanup should be another micro-service
 - HTTP 302 to redirect and 404 not found  
   
Pastebin
- Same like URL shortening except read requests are lower and Object storage S3 is used
- Why S3, why not S3 and CLOB. S3 is automatically scaleable
    
Maximus (upload and download)

Type Ahead Suggestions
 - Flow:- Gateway -> LB -> Cache
                        -> Trie Svc  -> File system Backup
                             ^       -> Logs                   -> Update Svs
                             | ---------------------------------------|                                                                   
 - Use tries to store words. Can consolidate ones that have a single branch
 - Each node store top suggestions and their counts
 - Frequency of search can be used for top 10 terms. additionally location, personalization,
 - Can store top 10 suggestion in each node as multiple keywords can lead to deeper search levels in trie
 - go recursively and from bottom generate suggestions so each parent can get their top 10
 - To update the trie for freq, log the counts, Use Map reduce job every hour to read the counts and update a slave, then make it master.
        Counts need to be updated for each node recursively for a given period
 - Rebuild trie by storing it a file in level order C2,A2,R1,T,P,O1,D
 - Cache top searches       
 - Client
    Allow type ahead only after a couple of searches
    Limit calls to every 50ms
    Store history
    pre-fetch

Twitter search
Index
-to find tweets that contain search terms
    Build an in memory Distributed Hashtable of all words to tweetid
    500k words and having tweet ids of the last 2 years
    Sharding based on words would lead to unbalanced load due to hot words
    sharding based on tweetid and aggregating would be balanced. 
        So first hash on tweetid and then a distributed hashtable of words to tweetid in each server(index server)
Fault tolerance
    have a primary and secondary storage
    if both fail, the index server needs to be rebuilt
        For that a reverse map of server id to tweet id should be created with backup. This way if a server fails only those tweets can be fetched from the db and reindexed        
Cache
    Hot tweets can be stored in memory
Ranking
    based on social graph distance, popularity, relevance, etc can be done while aggregating                    


Search
    Pre processing
        crawl -> index
        Page rank - 200+ factors based on visits, rank of users, search keywords appears together rather than far away
                    location, context
    Flow:- User searches -> find closest DC -> ||ly sent to different machines -> return batches -> sort by best rank
    https://www.deepcrawl.com/knowledge/technical-seo-library/search-engine-indexing/
     
Yelp
- Shard based on location id to a quad tree server
- Quad tree structure per quad tree server
    Quad tree has 4 children, each time the size of the children exceeds 500 locations it is further divided into 4 children
- Fault tolerance
    have a primary and secondary storage
    if both fail, the index server needs to be rebuilt
        For that a reverse map of server id to location id should be created with backup. This way if a server fails only those location ids can be fetched from the db and reindexed        
- Cache
    Hot searches can be stored in memory
- Ranking
    based on popularity, relevance, etc can be done while aggregating                    


Uber (Ride share) https://www.youtube.com/watch?v=umWABit-wbk
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
 



Stock alert system     


Ticket master
NF req
    - concurrent ticket booking
    - security of maximum tickets and DDos attacks on booking reservations
RDBMS is required cuz of transactions and locking    
ActiveReservationsService - daemon service with a hashmap of LinkedHM
    - ShowId - (BookingId, start Timestamp)
WaitingUsersService - daemon service with a hashmap of LinkedHM
    - ShowId, (UserId, wait start Timestamp)
- Concurrency should be handled with transaction locks
- Fault tolerance can be done by master slave design for the daemon services and DB
- Sharding should be done on showId, as movieId can result in hot movies resulting in unbalanced load
     
     
     
**SD Concepts**

Hot users


Indexing sorts a particular set of data so that it can be binary searched. This results in faster searches than that of unsorted data.
    - A separate sorted col is created in the DB per index which links to the actual record. A separate col is created bcuz its faster than sorting all the data
    - Index favours read and not write. In write it has to update indexes for all the indexed columns and then the write is complete.
    - Over-indexing transactional tables is not good for the writes
    - When there are a lot of unique values it makes sense(Cardinality)
    - When the indexed rows are used more often for querying its useful otherwise its more of a negative for writes
    https://www.youtube.com/watch?v=zDzu6vka0rQ
    https://www.youtube.com/watch?v=WmJuhKLQMA4
Solr vs ElasticSearch
    - both build on Apache Lucene. Elastic came later
    - Elastic has built in Zookeeper. SolrCloud needs Zookeeper to manage 
    - Solr is much more oriented towards text search while Elasticsearch is often used for analytical querying, filtering, and grouping.
 
SOAP vs REST vs GraphQL
    - REST was supersceeded by SOAP was superceeded by CORBA
    - SOAP is a protocol(developed by Microsoft),  GraphQL(developed by Fb) & REST are an architectural pattern
    - SOAP uses XML, REST can use anything
    - REST architectural pattern is to be stateless and use HTTP status codes
    - https://restfulapi.net/statelessness/
    - GraphQl has one endpoint and the rest is a query and you can specify exactly what data u need on the fly
    - GraphQL can get complex for rate limiting, api request logging etc. It is best when data requirements are changing frequently
    
APIs best practices
    - 
    - API versioning for major breaking changes, use URI, custom header
    
      
HTTP - is synchronous, client to server protocol
TCP - is asynchronous, is stateful
XMPP or Websockets - Peer to peer protocol -Stateful and long lived TCP connection    
CDN - Build to reduce response times by creating copies in different geographical locations
    - Push CDN - Pushes only when there're changes. Extra work done, harder to implement. Good for blogs etc and low traffic sites so there arent a lot of pushes 
    - Pull CDN - Pulls content after TTL. Good for high traffic sites. Doesnt have latest info but thats fine
     
     
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
Precomputing could generally mean, make updates when the update activity is done before run time of the actual activity
Block Storage vs Object storage vs DFS
    - Block for heavy read and write. EBS. Can replace parts for updates.
    - Object for low write and heavy read. S3. Whole object is replaced. S3 is a key:value pair NoSQL db
    - HDFS is faster in read and write compared to S3 as its local and has no size limitations
    - S3 has 5GB size limitation but S3 more scalable, cheaper and durable compared to HDFS 
    - https://www.xplenty.com/blog/storing-apache-hadoop-data-cloud-hdfs-vs-s3/#performance
  
Encryption is a two-way function where information is scrambled in such a way that it can be unscrambled later. Like whatsapp messages
Hashing is a one-way function where data is mapped to a fixed-length value. Hashing is primarily used for authentication. For passwords but not that safe.
Salting is an additional step during hashing, typically seen in association to hashed passwords, that adds an additional value to the end of the password that changes the hash value produced.
    This is better for password storage. Eg. bcrypt and scrypt.
SHA-256 vs MD5
    Both are hashing algos which are used to check file integrity.
    SHA-256 https://www.baeldung.com/sha-256-hashing-java
        Secure Hash algorithm is 256 bit
    MD5 is 128 bit and hence faster but less secure
Base64 32 etc are encoding techniques for reducing size and have no encryption in it. not for security    

Authorization/Authentication types
- HTTP is stateless, needs all info all the time
- HTTPS is HTTP with a secure mechanism i.e either SSL or TLS. 
- TLS is the successor to SSL and TLS 1.3 is the latest and the fastest with one round trip for the handshake using Deffie Hellman algo
- Banking needs to be stateful 
- Authentication is login, Authorization is granting access to a 3rd party
- Basic
    - Basic Base64(username:password)
    - Over https, not good for banking etc
- SAML Security Assertion Markup Language
    - XML, complex, used by large companies. Service provider and identity provider, supports single sign on
- OAuth 1.0 
    Sign each request every time
- OAuth 2.0 (Stateless)
    - It is an authorization technique(framework) for granting access to another party
    - Basic call to get token -> Bearer token
    - Access token, refresh token. Access token expires. Refresh is longer
    - Refresh token call will additionally have grant_type=refresh_token
- JWT JSON Web Tokens (Stateless)
    - is a Protocol, structure- Header, Payload, Signature(HMAC256 signed with a secret)
    - is sent in header as bearer token
    - used for authorization after authenticating with may be OAuth
    - No sensitive info should be in payload
    - Can be JWE encrypted
- Sessions (Stateful)
    - After logging in the server issues a session id via cookie. On logout it destroys the session and clears the cookie from the client
    - 2 types of session management sticky sessions or distributed session management
    - Sticky sessions is fast but not fault tolerant. DSS is scalable and fault tolerant with a bit of latency
    - DSS with replication makes it fault tolerant 
    - Cookies are signed(HMAC) so it cannot be tampered
    - Used in session management, personalization, tracking 
- Cookie
    - 50 cookies per domain, all together 4KB max size                  
 
Web sockets vs Server sent events (SSE)
- bidirectional vs unidirectional
- chat apps vs push notifications, newsletters and news feeds.
- Web sockets tough are more future proof
   
    
Consistent hashing  https://www.youtube.com/watch?v=bBK_So1u9ew
- Mostly Used for storing data for quick searches in DS like distributed caching systems
- Choose random keys for servers -> Keep them in a ring form -> Hash the incoming request id(dont mod it with servers) -> choose the next clockwise server id to store it 
- To distribute load uniformly set many virtual instances of the servers. By using different hash function(s)
- Adding or removing servers makes the new keys go to the next server and only affected keys(keys of adjacent servers) to be rehashed
- Code - https://www.acodersjourney.com/system-design-interview-consistent-hashing/
    
Sharding (DB servers)
- it is technique of distributing data in a relational database on a particular field
- Indexes can be created on another field so that queries are more optimised 
- Consistent hashing can be used to allocate new shards
- Master slave configs provide better availability and consistency as writes happen only to master and then it fans out, read can happen anywhere
- Drawbacks - Joins, Shards are fixed, hierarchical sharding further divides shards into smaller shards
- While sharding, its important to remember how yr putting, getting and most frequent get/filter query so as to optimise sharding
- Choosing the key to shard should help achieve a balanced load

Load balancing helps you scale horizontally across an ever-increasing number of servers
    - Any part of the system that's distributed requires a load balancer
    - Load balancer should also have master slave design to prevent SPF
    - Helps prevent requests from going to unhealthy servers
    - Encrypt and decrypt
    - X.509 Certf management
    - Session persistence
    
Count min sketch algo https://www.youtube.com/watch?v=ibxXO-b14j4
    - It is a probabilistic algo, to count frequencies in O(1) space
    - A sketch(matrix) will have the hash functions as row and col as max value of the hash function
    - Each input should have a unique value from the hash functions
    - The minimum value of the values in the matrix is the frequency
    - can give a higher count due to hash collisions. Then use more hash functions


Caching
    - Caching is done at all levels but often closer to the front end
    - Additional caching in the node can make it even faster 
    Cache invalidation/write policy types
        Write-through cache 
            - Put into cache and db simultaneously.
            - 2 write calls so slower. but very persistent
            - used where latency is not an issue and cache hits are more important
        Write-around 
            - First write to db then later cache
            - Leads to initial cache misses. but persistent
            - Used where persistence is more important
        Write-back 
            - First write to cache then later to db
            - Very fast. But not very persistent
            - Used where data is not very critical and reads need to be quick
    Cache eviction policies - LRU,etc
    
Reliability is to do with business operations. Availability is being online. A reliable sys is available not necessarily vice versa

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

Types of consistency
    - Weak consistency - like VOIP or video chats
    - Eventual consistency - email, timelines
    - Strong consistency - like DB transactions 

2 Phase commit
    - every commit happens to 2 DC. High latency, full consistency
    - NASDAQ uses it

Availability metrics https://kvaes.wordpress.com/2012/05/16/system-reliability-availability/
- System Availability = MTBF / ( MTBF + MTTR )
    MTBF (Mean time between failure) and MTTR (Mean time to repair) 
- Parallel Availability = 1 - ( (1 - Availability X) * (1- Availability Y) * (1 - Availability Z) )
- Serial Availability = Availability X * Availability Y * Availability Z

                 
Server crash use heartbeats to the service not box and restart nodes

Pessimistic concurrency lock - Lock the resource when accessed
                                Helpful for multiple simultaneous access  
Optimistic concurrency lock - No locks, while committing a change check whether the previous read state == current read state 
                              Helpful for infrequent multiple simultaneous access  

- Idempotent - No matter how many times you call the operation, the result will be the same.

ACID 
    - Atomicity, 
    - Consistency, 
    - Isolation, and 
    - Durability
Data integrity - is accuracy and consistency of data
NoSQL vs SQL https://www.youtube.com/watch?v=p4C0n3afZdk
    performance & scalability vs transaction(ACID compliant)
    scaling horiz vs joins
    
Types of NoSQL db - key Value - Redis, Vodemort, Dynamodb.
                  - Document based - MongoDB. can do nested queries
                  - Wide-Column - For big data as they look at column families instead of all columns. Cassandra, Hbase, Bigtable
                  - Graph - best for many relations. Neo4j    
RDBMS offer CA, HBase and Mongo offer CP, Casandra offers AP
Hbase is preferred in historical analysis, Casandra in IoT, recommendation systems(Netflix), messaging systems(Twitter)

- Kafka vs Message queues
    - https://hackernoon.com/a-super-quick-comparison-between-kafka-and-message-queues-e69742d855a8
    - https://kafka.apache.org/intro.html
    - Messaging traditionally has two models: queuing and publish-subscribe
    - queues aren't multi-subscriber—once, once a process reads the data it's gone
    - Publish-subscribe allows you broadcast data to multiple processes, but has no way of scaling processing since every message goes to every subscriber
    - Kafka's model is that every topic has both these properties—it can scale processing and is also multi-subscriber
    - Kafka messages are retained even after they are consumed

Kafka definitions
- Producer, Consumer, topic, Broker
- topic is a queue, broker is the server holding the queue
- A topic broker system can be made into a distributed system for scale


Zookeper 
- is used for coordination in distributed systems
- Leader election for failure of a leader node
 
Some DS design patterns
- Sharded
- Lambda
- Kafka Streaming pattern  
 
HTTP Methods
    GET - only to get info not update
    POST - to update or create
    PUT - idempotent, put multiple times shouldn't affect the state
    DELETE - to only delete. Its idempotent
    HEAD - HEAD requests to find update time
    PATCH - similar to put and post but only for partial updates
    OPTIONS - to find available options on the endpoint              
HTTP status “429 - Too many requests"

Redis can be in master/slave or cluster mode 
Hosted vs Cloud services- In hosted there may not be multiple tenants or scale can be limited.

**DB Design**

- 1st Normal form
    - Data should be atomic. No grouping of data in one coloumn
- 2nd Normal form
    - Data should be functionally dependent on the PK. If some data is dependent on another key then the table should be split
        If it is not functionally dependent it causes data redundancy leading to Insertion, deletion and updation anomalies.
- 3rd Normal form
    - Data shouldnt be stored at multiple places. If done so, modifiying it would happen at different places and could lead to inconsistencies
    




**Design Patterns**

Abstract class is so that no object can be created of it and you can have common functions defined so that inherited classes can reuse.
Abstract classes can have abstract functions which will have no body so the inherited classes must define it
When abstract class and when interface - abstract class when you have common functions also, interfaces when function names/process only might be same not function definitions

Singleton - Creational
- static getInstance and synchronise to prevent multiple initial creations
- private constructor
    
Factory - Creational
- Class to create objects so that the creation logic is not handled by clients
- so client doesnt need to be recompiled
- Also there is loose coupling in the client cuz of using the interface class   
- A factory class with a method to return new objects based on the input parameter with return type of the interface
  
Template - Behavioral
- a process flow that needs to be done for many base classes
- Abstract template class, final template method, that contains abstract methods which each sub class will define separately
            
Strategy design pattern - Behavioral
- https://www.geeksforgeeks.org/strategy-pattern-set-1/
- https://www.geeksforgeeks.org/strategy-pattern-set-2/
- Used for optional behaviours
- If a behaviour definition is common and required for all classes use abstract classes
- But, If a behaviour definition is common but not required for all classes use Strategy pattern
- Assign an interface to a base class and have concrete implementation of the interfaces
    
Observer - Behavioral
- Used when multiple objects(Observers) are dependent on the state of one object(Subject)
- Eg. Followers get notified, subscriptions, whatsapp group, anything that involves broadcasting a state
- Coding to interfaces helps generalize stuff and can add more classes later on

Adapter - Structural
- Used to take some existing/legacy code and modify a part of it in the adapter for the new code
- Eg. Android to iphone charger, US car speed in m/hr to UK speed km/hr
- To convert A into an object B having some A functionality. Pass A to the constructor of the Adapter and use that object in a function coming from B's interface
- Adapter pattern improves compatibility between 2 incompatible interfaces
- https://stackify.com/design-patterns-explained-adapter-pattern-with-code-examples/

Builder - Creational
- Should be used only when you want to build different IMMUTABLE objects using same object building process.
- Instead of giving all values in the constructor as a must or telescopic constructors we use builder pattern.
- one inner static class with public methods to set values, no setters for outer class, all final members for outer class(immutability), one build method in the inner class which creates an object of the outer class with itself as a parameter so that
    values can be transferred from inner to outer class  
- Inner static class cuz it doesnt need access to the outer class variables
- Eg. StringBuilder, MockMvcBuilder
- https://www.youtube.com/watch?v=YmEVYvELt28&t=822s

Decorator - Structural
- https://www.youtube.com/watch?v=vqy8BL0xV0c&t=352s
- Keep an interface which will be general to all types 
  Keep a basic object to be created as a must. 
  The decorator class is abstract and has the common interface 
  Classes that extend the decorator will call super and add functionality/decorate it.
- At run time we can add features by decorating each object
- Pizza and their toppings, nokia android phone


**Java**


Stream https://www.geeksforgeeks.org/stream-in-java/
- Intermediate Operations: map, filter, sorted
    They return a stream
- Terminal Operations: collect, forEach, reduce
    collect - returns another collection
    forEach - void return. Can be used to modify a list
    reduce - reduce to one value  


Abstract class - 
    Doesnt have to have one abstract method - this method would differ for the sub classes hence abstract
    increases reuseability through inheritance using common non-abstract method definitions
    has to be extended. Cant create an object cuz there are abstract methods in it
    Not good to keep uncommon functions in abstract class(use Strategy pattern instead)
     
Interface 
    All methods are abstract 
    All methods must be implemented in implementing class
    Cant create object cuz all methods are abstract
    
String buffer - is synchronized, slow
String builder - is not synchronized, twice as fast
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
    @Data - provides getter, setter, toString, hascode

try-finally combination is used to free up resources. BoundedBlockingQueueReentrantLock
 
 
 
**Spring**

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
- In case of many MS, debugging can be done better with a correlation id per request(originating timestamp_threadname)

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