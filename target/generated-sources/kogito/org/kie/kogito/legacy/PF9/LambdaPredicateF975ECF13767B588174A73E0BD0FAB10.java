package org.kie.kogito.legacy.PF9;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateF975ECF13767B588174A73E0BD0FAB10 implements org.drools.model.functions.Predicate2<org.kie.kogito.legacy.LoanApplication, java.lang.Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A5967CA0F0C913D79CFE515CDC73480E";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this, java.lang.Integer maxAmount) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAmount(), maxAmount);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("amount > maxAmount", "LargeDepositReject", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
