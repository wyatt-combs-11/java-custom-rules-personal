package org.sonar.samples.java.checks;

import org.junit.jupiter.api.Test;
import org.sonar.java.checks.verifier.CheckVerifier;

class VariableNameLengthMinimumRuleTest {

  @Test
  void test() {
    CheckVerifier.newVerifier()
      .onFile("src/test/files/VariableNameLengthMinimumRule.java")
      .withCheck(new VariableNameLengthMinimumRule())
      .verifyIssues();
  }

}
