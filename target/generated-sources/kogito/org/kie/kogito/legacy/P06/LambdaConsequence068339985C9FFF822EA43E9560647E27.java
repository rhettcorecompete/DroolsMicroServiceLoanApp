package org.kie.kogito.legacy.P06;

import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;
import org.kie.kogito.legacy.*;
import org.kie.kogito.legacy.LoanApplication;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence068339985C9FFF822EA43E9560647E27 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.kie.kogito.legacy.LoanApplication>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "32258943E3E214C07C7B8DE20FF7D947";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE, "approved");

    @Override()
    public void execute(org.drools.model.Drools drools, org.kie.kogito.legacy.LoanApplication $l) throws java.lang.Exception {
        {
            {
                ($l).setApproved(false);
            }
            drools.update($l, mask_$l);
        }
    }
}
