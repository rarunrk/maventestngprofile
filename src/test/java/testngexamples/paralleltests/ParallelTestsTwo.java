package testngexamples.paralleltests;

import org.testng.annotations.Test;

public class ParallelTestsTwo {
	
	@Test
	public void test5() {
		System.out.println("test5 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test6() {
		System.out.println("test6 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test7() {
		System.out.println("test7 is invoked. The thread is : "+ Thread.currentThread().getId());
	}
	
	@Test
	public void test8() {
		System.out.println("test8 is invoked. The thread is : "+ Thread.currentThread().getId());
	}

}

