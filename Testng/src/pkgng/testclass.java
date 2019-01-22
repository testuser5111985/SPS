package pkgng;

import org.testng.annotations.Test;

public class testclass {

@Test(groups="Regression")
public void tc1()
{
	
	System.out.println("Regression test case1");
}
@Test(dependsOnMethods= {"tc3"})
public void tc2()
{
	
	System.out.println("Regression test case2");
}
@Test(enabled=false)
public void tc3()
{
	
	System.out.println("Regression test case3");
}
@Test(enabled=false)
public void tc4()
{
	
	System.out.println("smoke test case1");
}
@Test(groups="smoke")
public void tc5()
{
	
	System.out.println("smoke test case2");
}
@Test(groups="smoke")
public void tc6()
{
	
	System.out.println("smoke test case3");
}
@Test(groups= {"smoke","regression"})
public void tc7()
{
	
	System.out.println("smoke and regression test case1");
}
@Test(groups= {"smoke","regression"})
public void tc8()
{
	
	System.out.println("smoke and regression test case2");
}
}
