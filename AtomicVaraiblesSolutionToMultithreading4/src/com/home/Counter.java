package com.home;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
	
	private AtomicInteger count = new AtomicInteger();

	public void increment() {
		/*count++; // it's a trap!
		// a single "line" is not atomic
		 */
		count.getAndIncrement();	
	}

	public int getValue() {
		return count.intValue();
	}
}

/*The reason this implementation is now thread-safe is something called
CAS. CAS stands for Compare And Swap. Most modern CPUs have a set of CAS
instructions. A basic outline of what is happening now is as follows:
1. The value stored in count is copied to a temporary variable.
2. The temporary variable is incremented.
3. Compare the value currently in count with the original value. If it is
unchanged, then swap the old value for the new value.
Step 3 happens atomically. If step 3 finds that some other thread has already
modified the value of count, then repeat steps 1–3 until we increment the field
without interference.
The central method in a class like AtomicInteger is the boolean
compareAndSet(int expect, int update) method, which provides the CAS
behavior. Other atomic methods delegate to the compareAndSet method. The
getAndIncrement method implementation is simply:
public final int getAndIncrement() {
for (;;) {
int current = get();
int next = current + 1;
if (compareAndSet(current, next))
return current;
}
}*/