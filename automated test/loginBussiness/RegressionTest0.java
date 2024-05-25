
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isValidPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b6 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("");
    boolean b6 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isValidPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("");
    boolean b18 = loginBuissness_instance0.isValidPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isValidPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b6 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("");
    boolean b20 = loginBuissness_instance0.isValidPassword("");
    boolean b22 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isValidPassword("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b20 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("");
    boolean b20 = loginBuissness_instance0.isAlphanumeric("");
    boolean b22 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isValidPassword("");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("");
    boolean b20 = loginBuissness_instance0.isValidPassword("");
    boolean b22 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b6 = loginBuissness_instance0.isValidPassword("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b20 = loginBuissness_instance0.isValidPassword("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isValidPassword("");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b4 = loginBuissness_instance0.isValidPassword("");
    boolean b6 = loginBuissness_instance0.isAlphanumeric("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b18 = loginBuissness_instance0.isAlphanumeric("");
    boolean b20 = loginBuissness_instance0.isAlphanumeric("");
    boolean b22 = loginBuissness_instance0.isAlphanumeric("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    loginBuissness loginBuissness_instance0 = new loginBuissness();
    boolean b2 = loginBuissness_instance0.isValidPassword("");
    boolean b4 = loginBuissness_instance0.isAlphanumeric("");
    boolean b6 = loginBuissness_instance0.isValidPassword("");
    boolean b8 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b10 = loginBuissness_instance0.isValidPassword("hi!");
    boolean b12 = loginBuissness_instance0.isAlphanumeric("hi!");
    boolean b14 = loginBuissness_instance0.isAlphanumeric("");
    boolean b16 = loginBuissness_instance0.isAlphanumeric("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

}
