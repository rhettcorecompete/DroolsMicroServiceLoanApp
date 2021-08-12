package org.kie.kogito.legacy.PE2;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateE23A1A157577F8829336EB65038A266A implements org.drools.model.functions.Predicate1<org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "B608A9055F43A075CF85B3F1DE64677E";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAmount(), 2000);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("amount > 2000", "SmallDepositReject", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
