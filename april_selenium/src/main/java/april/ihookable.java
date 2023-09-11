package april;

public class ihookable {
	import org.testng.IHookCallBack;
	import org.testng.IHookable;
	import org.testng.ITestResult;
	import org.testng.annotations.Test;

	public class SampleTestClass implements IHookable {

	  @Override
	  public void run(IHookCallBack callBack, ITestResult testResult) {
	    System.err.println("run() before-invocation before running " + testResult.getMethod().getMethodName() + "()");
	    callBack.runTestMethod(testResult);
	    System.err.println("run() after-invocation before running " + testResult.getMethod().getMethodName() + "()");
	  }

	  @Test
	  public void a() {}

	  @Test
	  public void b() {}
	}

}
