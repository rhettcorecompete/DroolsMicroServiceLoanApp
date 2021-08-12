package org.kie.kogito.legacy.P17;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate1702A1229C9B57E6CCF625095E9793B3 implements org.drools.model.functions.Predicate1<org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "F89A479BB1620C19D1EBD2A888F30694";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this) throws java.lang.Exception {
        return (org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.isApproved(), true) || org.drools.modelcompiler.util.EvaluationUtil.areNullSafeEquals(_this.isApproved(), false));
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("approved==true || approved==false", "CollectApprovedApplication", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
