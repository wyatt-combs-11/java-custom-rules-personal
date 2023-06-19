package org.sonar.samples.java.checks;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;
import org.sonar.plugins.java.api.tree.VariableTree;
import java.util.Collections;
import java.util.List;

@Rule(key = "VariableNameLengthMinimumRule")
public class VariableNameLengthMinimumRule extends IssuableSubscriptionVisitor {
  @Override
  public List<Kind> nodesToVisit() {
    return Collections.singletonList(Kind.VARIABLE);
  }

  @Override
  public void visitNode(Tree tree) {
    VariableTree variables = (VariableTree) tree;
    if (variables.simpleName().name().length() < 4) {
      reportIssue(variables.simpleName(), "Variable name must be at least 4 characters!");
    }
  }
}
