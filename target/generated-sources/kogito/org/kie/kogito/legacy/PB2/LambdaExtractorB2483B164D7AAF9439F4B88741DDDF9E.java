package org.kie.kogito.legacy.PB2;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E implements org.drools.model.functions.Function1<org.kie.kogito.legacy.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "65EEA0D96D129EC652A80982CA536D1F";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.legacy.LoanApplication _this) {
        return _this.getApplicant().getAge();
    }
}
