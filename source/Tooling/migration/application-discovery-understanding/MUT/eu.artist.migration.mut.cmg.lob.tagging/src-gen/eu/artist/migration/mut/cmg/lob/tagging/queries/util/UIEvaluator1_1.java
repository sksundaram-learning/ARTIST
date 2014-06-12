package eu.artist.migration.mut.cmg.lob.tagging.queries.util;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.incquery.runtime.extensibility.IMatchChecker;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * A xbase xexpression evaluator tailored for the eu.artist.migration.mut.cmg.lob.tagging.queries.UI pattern.
 */
@SuppressWarnings("all")
public class UIEvaluator1_1 implements IMatchChecker {
  /**
   * The raw java code generated from the xbase xexpression by xtext.
   */
  private Boolean evaluateXExpressionGenerated(final String supname) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _equals = Objects.equal(supname, "LayoutsPageBase");
    if (_equals) {
      _or_1 = true;
    } else {
      boolean _equals_1 = Objects.equal(supname, "UserControl");
      _or_1 = (_equals || _equals_1);
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _equals_2 = Objects.equal(supname, "BasePage");
      _or = (_or_1 || _equals_2);
    }
    return Boolean.valueOf(_or);
  }
  
  /**
   * A wrapper method for calling the generated java method with the correct attributes.
   */
  @Override
  public Boolean evaluateXExpression(final Tuple tuple, final Map<String,Integer> tupleNameMap) {
    int supnamePosition = tupleNameMap.get("supname");
    java.lang.String supname = (java.lang.String) tuple.get(supnamePosition);
    return evaluateXExpressionGenerated(supname);
  }
}
