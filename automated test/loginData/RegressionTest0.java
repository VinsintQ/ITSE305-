
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("");
    boolean b4 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b10 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    loginData loginData_instance0 = new loginData();
    boolean b3 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b6 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b7 = loginData_instance0.thisUserExist("hi!");
    boolean b9 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("hi!");
    boolean b7 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b9 = loginData_instance0.thisUserExist("");
    boolean b11 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b18 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b21 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b17 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.thisUserExist("");
    boolean b22 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b17 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b17 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("hi!");
    boolean b14 = loginData_instance0.thisUserExist("");
    boolean b16 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b10 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b18 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b18 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b18 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b21 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    loginData loginData_instance0 = new loginData();
    boolean b3 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b6 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b8 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b15 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b16 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b16 = loginData_instance0.thisUserExist("");
    boolean b18 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b17 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    loginData loginData_instance0 = new loginData();
    boolean b3 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("");
    boolean b15 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b16 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b9 = loginData_instance0.thisUserExist("hi!");
    boolean b11 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    loginData loginData_instance0 = new loginData();
    boolean b3 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b5 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.thisUserExist("hi!");
    boolean b9 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b17 = loginData_instance0.thisUserExist("");
    boolean b20 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b17 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.thisUserExist("hi!");
    boolean b21 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b16 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b16 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b18 = loginData_instance0.thisUserExist("hi!");
    boolean b20 = loginData_instance0.thisUserExist("");
    boolean b23 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b16 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b18 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    loginData loginData_instance0 = new loginData();
    boolean b3 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b6 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b9 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b9 = loginData_instance0.thisUserExist("");
    boolean b12 = loginData_instance0.accountAndPassConfirm("", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b10 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b12 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b4 = loginData_instance0.thisUserExist("");
    boolean b7 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b10 = loginData_instance0.accountAndPassConfirm("", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b17 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.thisUserExist("");
    boolean b21 = loginData_instance0.thisUserExist("");
    boolean b23 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b16 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b21 = loginData_instance0.thisUserExist("hi!");
    boolean b24 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b27 = loginData_instance0.accountAndPassConfirm("hi!", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b10 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b16 = loginData_instance0.thisUserExist("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b14 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    boolean b13 = loginData_instance0.thisUserExist("hi!");
    boolean b15 = loginData_instance0.thisUserExist("");
    boolean b17 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.thisUserExist("hi!");
    boolean b22 = loginData_instance0.accountAndPassConfirm("hi!", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    loginData loginData_instance0 = new loginData();
    boolean b2 = loginData_instance0.thisUserExist("hi!");
    boolean b5 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b8 = loginData_instance0.accountAndPassConfirm("hi!", "");
    boolean b11 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b14 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b16 = loginData_instance0.thisUserExist("");
    boolean b19 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b21 = loginData_instance0.thisUserExist("hi!");
    boolean b24 = loginData_instance0.accountAndPassConfirm("", "hi!");
    boolean b26 = loginData_instance0.thisUserExist("");
    boolean b29 = loginData_instance0.accountAndPassConfirm("", "");
    boolean b31 = loginData_instance0.thisUserExist("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

}
