package org.kie.kogito.legacy.P72;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate726FA0E6F3970683836F178D9CD71320 implements org.drools.model.functions.Predicate1<org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5AD734508C62D1F0E4299486F1DDA7B7";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.lessThanNumbers(_this.getDeposit(), 1000);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("deposit < 1000", "SmallDepositReject", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
