# **💡  GeeksForGeeks**
**POTD Solution**

**QUEUE OPERATIONS - JUNE 17**

```java
//QUEUE OPERATIONS - JUNE 17
class Geeks{
    static void insert(Queue<Integer> q, int k){
        q.add(k);
    }
    static int findFrequency(Queue<Integer> q, int k){
        return Collections.frequency(q, k);
    }
}
```
