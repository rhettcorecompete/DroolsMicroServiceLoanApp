package org.kie.kogito.legacy.PFA;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateFA003DD75DD71A8AFC1AE0631584EB90 implements org.drools.model.functions.Predicate1<org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7957E1BDA895714016778CACEE79F458";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.kie.kogito.legacy.LoanApplication _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterOrEqualNumbers(_this.getApplicant().getAge(), 20);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        return new org.drools.model.functions.PredicateInformation("applicant.age >= 20", "LargeDepositReject", "C:\\Users\\rhett.a.smith\\Downloads\\kogito\\rules-legacy-springboot-example\\src\\main\\resources\\org\\kie\\kogito\\legacy\\LoanRules.drl");
    }
}
