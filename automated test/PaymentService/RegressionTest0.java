
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test01"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)10, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test02"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)10, "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test03"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0.0f, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test04"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test05"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1), "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test06"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)10, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test07"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(1.0d, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test08"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)' ', "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test09"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test10"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)-1, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test11"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test12"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)10, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test13"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0L, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test14"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)1, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test15"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)0, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test16"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((-1.0d), "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test17"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0.0f, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test18"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'a', "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test19"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)1, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test20"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test21"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'#', "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test22"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)0, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test23"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'a', "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test24"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1.0f, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test25"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)0, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test26"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test27"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'a', "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test28"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((-1.0d), "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test29"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(1.0d, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test30"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test31() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test31"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test32() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test32"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100L, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test33() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test33"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10L, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test34() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test34"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10.0f, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test35() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test35"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)10, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test36() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test36"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test37() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test37"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10.0f, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test38() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test38"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100L, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test39() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test39"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1.0f), "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test40() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test40"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1.0f, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test41() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test41"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0.0f, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test42() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test42"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)100, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test43() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test43"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)-1, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test44() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test44"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test45() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test45"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)-1, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test46() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test46"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)' ', "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test47() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test47"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)1, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test48() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test48"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test49() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test49"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10L, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test50() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test50"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test51() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test51"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test52() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test52"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'4', "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test53() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test53"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)-1, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test54() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test54"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test55() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test55"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1L, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test56() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test56"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)1, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test57() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test57"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(10.0d, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test58() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test58"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test59() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test59"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100.0f, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test60() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test60"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)100, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test61() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test61"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test62() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test62"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1L, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test63() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test63"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)100, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test64() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test64"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test65() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test65"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)' ', "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test66() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test66"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)0, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test67() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test67"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test68() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test68"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test69() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test69"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)0, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test70() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test70"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)100, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test71() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test71"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)'#', "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test72() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test72"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((-1.0d), "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test73() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test73"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(10.0d, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test74() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test74"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10L, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test75() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test75"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1.0f), "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test76() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test76"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100.0f, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test77() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test77"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10.0f, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test78() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test78"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1.0f, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test79() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test79"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(10.0d, "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test80() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test80"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(10.0d, "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test81() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test81"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100.0f, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test82() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test82"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(10.0d, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test83() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test83"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1.0f, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test84() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test84"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test85() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test85"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0.0f, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test86() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test86"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0L, "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test87() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test87"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(1.0d, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test88() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test88"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test89() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test89"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)1L, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test90() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test90"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment(0.0d, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test91() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test91"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)0.0f, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test92() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test92"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1), "", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test93() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test93"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(-1L), "hi!", "", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test94() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test94"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(short)0, "", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test95() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test95"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)100L, "", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test96() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test96"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10.0f, "hi!", "hi!", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test97() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test97"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)10L, "hi!", "hi!", "hi!");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

  @Test
  public void test98() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test98"); }

    PaymentService paymentService0 = new PaymentService();
    // The following exception was thrown during execution in test generation
    try {
    paymentService0.processPayment((double)(byte)-1, "hi!", "", "");
      org.junit.Assert.fail("Expected exception of type PaymentException");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }

  }

}
