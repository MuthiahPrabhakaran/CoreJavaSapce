# Multi-threading

## Synchronized
Multi-threaded programs may often come to a situation where multiple threads try to access the same resources and finally produce erroneous and unforeseen results.

So it needs to be made sure by some synchronization method that only one thread can access the resource at a given point of time.

Java provides a way of creating threads and synchronizing their task by using synchronized blocks. Synchronized blocks in Java are marked with the synchronized keyword. A synchronized block in Java is synchronized on some object. All synchronized blocks synchronized on the same object can only have one thread executing inside them at a time. All other threads attempting to enter the synchronized block are blocked until the thread inside the synchronized block exits the block.

~~~~
// Only one thread can execute at a time. 
// sync_object is a reference to an object
// whose lock associates with the monitor.
// The code is said to be synchronized on
// the monitor object
synchronized(sync_object)
{
   // Access shared variables and other
   // shared resources
}
~~~~

This synchronization is implemented in Java with a concept called monitors. Only one thread can own a monitor at a given time. When a thread acquires a lock, it is said to have entered the monitor. All other threads attempting to enter the locked monitor will be suspended until the first thread exits the monitor.

### Examples
- [example 1](https://github.com/MuthiahPrabhakaran/corejava/blob/master/multi-threading/src/main/java/com/java/multithreading/workouts/SynchronizedExample_1.java)
- [example 2](https://github.com/MuthiahPrabhakaran/corejava/blob/master/multi-threading/src/main/java/com/java/multithreading/workouts/SynchronizedExample_2.java)
## Inter Thread Communication

**What is Polling and what are problems with it?**  
The process of testing a condition repeatedly till it becomes true is known as polling.

Polling is usually implemented with the help of loops to check whether a particular condition is true or not. If it is true, certain action is taken. This waste many CPU cycles and makes the implementation inefficient.  
For example, in a classic queuing problem where one thread is producing data and other is consuming it.

**How Java multi threading tackles this problem?**  
To avoid polling, Java uses three methods, namely, **wait(), notify() and notifyAll().**  
All these methods belong to object class as final so that all classes have them. They must be used within a synchronized block only.

-   **wait()** - It tells the calling thread to give up the lock and go to sleep until some other thread enters the same monitor and calls notify().
-   **notify()** - It wakes up one single thread that called wait() on the same object. It should be noted that calling notify() does not actually give up a lock on a resource.
-   **notifyAll()** - It wakes up all the threads that called wait() on the same object.

[example](https://github.com/MuthiahPrabhakaran/corejava/blob/master/multi-threading/src/main/java/com/java/multithreading/workouts/ThreadCommunication.java)

## Joining Threads

**java.lang.Thread** class provides the join() method which allows one thread to wait until another thread completes its execution. If **t** is a Thread object whose thread is currently executing, then **t.join()** will make sure that **t** is terminated before the next instruction is executed by the program.  
If there are multiple threads calling the join() methods that means overloading on join allows the programmer to specify a waiting period. However, as with sleep, join is dependent on the OS for timing, so you should not assume that join will wait exactly as long as you specify.  
There are three overloaded join functions.

1.  **join():** It will put the current thread on wait until the thread on which it is called is dead. If thread is interrupted then it will throw InterruptedException.  
    **Syntax:**
    ~~~~
    public final void join()
    ~~~~
2.  **join(long millis)** :It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds).  
    **Syntax:**
    ~~~~
    public final synchronized void join(long millis)
    ~~~~
3.  **join(long millis, int nanos):** It will put the current thread on wait until the thread on which it is called is dead or wait for specified time (milliseconds + nanos).  
    **Syntax:**
    ~~~~
    public final synchronized void join(long millis, int nanos)
    ~~~~
[example](https://github.com/MuthiahPrabhakaran/corejava/blob/master/multi-threading/src/main/java/com/java/multithreading/workouts/ThreadCommunication.java)

## Producer-Consumer Problem
In computing, the producer–consumer problem (also known as the bounded-buffer problem) is a classic example of a multi-process synchronization problem. The problem describes two processes, the producer and the consumer, which share a common, fixed-size buffer used as a queue.

-   The producer’s job is to generate data, put it into the buffer, and start again.
-   At the same time, the consumer is consuming the data (i.e. removing it from the buffer), one piece at a time.

**Problem**  
To make sure that the producer won’t try to add data into the buffer if it’s full and that the consumer won’t try to remove data from an empty buffer.

**Solution**  
The producer is to either go to sleep or discard data if the buffer is full. The next time the consumer removes an item from the buffer, it notifies the producer, who starts to fill the buffer again. In the same way, the consumer can go to sleep if it finds the buffer to be empty. The next time the producer puts data into the buffer, it wakes up the sleeping consumer.  
An inadequate solution could result in a deadlock where both processes are waiting to be awakened.

[example](https://github.com/MuthiahPrabhakaran/corejava/blob/master/multi-threading/src/main/java/com/java/multithreading/workouts/ProducerConsumer.java)
