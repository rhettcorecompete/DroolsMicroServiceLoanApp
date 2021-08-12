package org.kie.kogito.legacy.PE7;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorE7AC7861C0CAFC6F617FD43B3B32B4DC implements org.drools.model.functions.Function1<org.kie.kogito.legacy.LoanApplication, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "8ADD269A8469EDE03075457D4A9555A5";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.kie.kogito.legacy.LoanApplication _this) {
        return _this.getAmount();
    }
}
