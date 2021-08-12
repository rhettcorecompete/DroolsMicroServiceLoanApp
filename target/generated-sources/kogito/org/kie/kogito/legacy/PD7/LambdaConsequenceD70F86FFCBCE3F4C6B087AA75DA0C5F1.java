package org.kie.kogito.legacy.PD7;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceD70F86FFCBCE3F4C6B087AA75DA0C5F1 implements org.drools.model.functions.Block2<java.util.List, org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "CA34BCD33DDAA89E96848F4A310F97F3";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public void execute(java.util.List approvedApplications, org.kie.kogito.legacy.LoanApplication $l) throws java.lang.Exception {
        approvedApplications.add($l);
    }
}
