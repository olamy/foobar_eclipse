
package org.foobar.test.suite;

import org.foobar.test.FoobarTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
      FoobarTest.class
      })
public class TestSuite
{
  // the class remains completely empty,
  // being used only as a holder for the above annotations
}
