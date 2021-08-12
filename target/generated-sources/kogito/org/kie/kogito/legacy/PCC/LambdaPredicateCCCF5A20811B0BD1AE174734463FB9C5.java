package org.kie.kogito.legacy.PCC;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateCCCF5A20811B0BD1AE174734463FB9C5 implements org.drools.model.functions.Predicate1<org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "C54DA0C38F6F39AF9D91CEBBC8B711BD";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getDeposit(), 1000);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("deposit >= 1000", "LargeDepositReject", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
