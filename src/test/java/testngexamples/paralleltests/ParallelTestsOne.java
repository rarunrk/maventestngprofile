package testngexamples.paralleltests;

import org.testng.annotations.Test;

public class ParallelTestsOne {
	
	@Test
	public void test1() {
		System.out.println("test1 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test2() {
		System.out.println("test2 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test3() {
		System.out.println("test3 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test4() {
		System.out.println("test4 is invoked. The thread is : "+ Thread.currentThread().getId());
	}

}
