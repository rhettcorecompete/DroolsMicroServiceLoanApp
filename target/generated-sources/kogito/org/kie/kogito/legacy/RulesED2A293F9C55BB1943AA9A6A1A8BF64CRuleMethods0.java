package org.kie.kogito.legacy;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.kie.kogito.legacy.LoanApplication;
import static org.kie.kogito.legacy.RulesED2A293F9C55BB1943AA9A6A1A8BF64C.*;

public class RulesED2A293F9C55BB1943AA9A6A1A8BF64CRuleMethods0 {

    /**
     * Rule name: SmallDepositApprove
     */
    public static org.drools.model.Rule rule_SmallDepositApprove() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "SmallDepositApprove").build(D.pattern(var_$l).expr("GENERATED_085F0B863E90347D117BD907694A122E",
                                                                                                org.kie.kogito.legacy.PFA.LambdaPredicateFA003DD75DD71A8AFC1AE0631584EB90.INSTANCE,
                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                 -1,
                                                                                                                 org.kie.kogito.legacy.PB2.LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E.INSTANCE,
                                                                                                                 20),
                                                                                                D.reactOn("applicant")).expr("GENERATED_D4A4CE61FBC80961F803B73B57D90DBA",
                                                                                                                             org.kie.kogito.legacy.P72.LambdaPredicate726FA0E6F3970683836F178D9CD71320.INSTANCE,
                                                                                                                             D.alphaIndexedBy(int.class,
                                                                                                                                              org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                              DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                              org.kie.kogito.legacy.PA3.LambdaExtractorA32B8CB1183D0F49BCC4780851D79C38.INSTANCE,
                                                                                                                                              1000),
                                                                                                                             D.reactOn("deposit")).expr("GENERATED_5FE6707E25EC9EB52DDE48F023A79872",
                                                                                                                                                        org.kie.kogito.legacy.P7A.LambdaPredicate7A4FBB6D507A813FDF137344532D2DCC.INSTANCE,
                                                                                                                                                        D.alphaIndexedBy(int.class,
                                                                                                                                                                         org.drools.model.Index.ConstraintType.LESS_OR_EQUAL,
                                                                                                                                                                         DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                         org.kie.kogito.legacy.PE7.LambdaExtractorE7AC7861C0CAFC6F617FD43B3B32B4DC.INSTANCE,
                                                                                                                                                                         2000),
                                                                                                                                                        D.reactOn("amount")),
                                                                         D.on(var_$l).execute(org.kie.kogito.legacy.P05.LambdaConsequence0524946D1EE0E05309E02C1E7873F07A.INSTANCE));
        return rule;
    }

    /**
     * Rule name: SmallDepositReject
     */
    public static org.drools.model.Rule rule_SmallDepositReject() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "SmallDepositReject").build(D.pattern(var_$l).expr("GENERATED_085F0B863E90347D117BD907694A122E",
                                                                                               org.kie.kogito.legacy.PFA.LambdaPredicateFA003DD75DD71A8AFC1AE0631584EB90.INSTANCE,
                                                                                               D.alphaIndexedBy(int.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                -1,
                                                                                                                org.kie.kogito.legacy.PB2.LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E.INSTANCE,
                                                                                                                20),
                                                                                               D.reactOn("applicant")).expr("GENERATED_D4A4CE61FBC80961F803B73B57D90DBA",
                                                                                                                            org.kie.kogito.legacy.P72.LambdaPredicate726FA0E6F3970683836F178D9CD71320.INSTANCE,
                                                                                                                            D.alphaIndexedBy(int.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                                             DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                             org.kie.kogito.legacy.PA3.LambdaExtractorA32B8CB1183D0F49BCC4780851D79C38.INSTANCE,
                                                                                                                                             1000),
                                                                                                                            D.reactOn("deposit")).expr("GENERATED_5F3F8C5544DE152E5587B244B3282FFF",
                                                                                                                                                       org.kie.kogito.legacy.PE2.LambdaPredicateE23A1A157577F8829336EB65038A266A.INSTANCE,
                                                                                                                                                       D.alphaIndexedBy(int.class,
                                                                                                                                                                        org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("amount"),
                                                                                                                                                                        org.kie.kogito.legacy.PE7.LambdaExtractorE7AC7861C0CAFC6F617FD43B3B32B4DC.INSTANCE,
                                                                                                                                                                        2000),
                                                                                                                                                       D.reactOn("amount")),
                                                                        D.on(var_$l).execute(org.kie.kogito.legacy.P06.LambdaConsequence068339985C9FFF822EA43E9560647E27.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LargeDepositApprove
     */
    public static org.drools.model.Rule rule_LargeDepositApprove() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "LargeDepositApprove").build(D.pattern(var_$l).expr("GENERATED_085F0B863E90347D117BD907694A122E",
                                                                                                org.kie.kogito.legacy.PFA.LambdaPredicateFA003DD75DD71A8AFC1AE0631584EB90.INSTANCE,
                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                 org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                 -1,
                                                                                                                 org.kie.kogito.legacy.PB2.LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E.INSTANCE,
                                                                                                                 20),
                                                                                                D.reactOn("applicant")).expr("GENERATED_DFF94DC5B427C8A70F9D2E3416B5A4A6",
                                                                                                                             org.kie.kogito.legacy.PCC.LambdaPredicateCCCF5A20811B0BD1AE174734463FB9C5.INSTANCE,
                                                                                                                             D.alphaIndexedBy(int.class,
                                                                                                                                              org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                              DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                              org.kie.kogito.legacy.PA3.LambdaExtractorA32B8CB1183D0F49BCC4780851D79C38.INSTANCE,
                                                                                                                                              1000),
                                                                                                                             D.reactOn("deposit")).expr("GENERATED_60F555374A3640A442D6728EF49A5C1A",
                                                                                                                                                        var_maxAmount,
                                                                                                                                                        org.kie.kogito.legacy.PA2.LambdaPredicateA210705944C1AC77382ACC4B2673649C.INSTANCE,
                                                                                                                                                        D.reactOn("amount")),
                                                                         D.on(var_$l).execute(org.kie.kogito.legacy.P05.LambdaConsequence0524946D1EE0E05309E02C1E7873F07A.INSTANCE));
        return rule;
    }

    /**
     * Rule name: LargeDepositReject
     */
    public static org.drools.model.Rule rule_LargeDepositReject() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "LargeDepositReject").build(D.pattern(var_$l).expr("GENERATED_085F0B863E90347D117BD907694A122E",
                                                                                               org.kie.kogito.legacy.PFA.LambdaPredicateFA003DD75DD71A8AFC1AE0631584EB90.INSTANCE,
                                                                                               D.alphaIndexedBy(int.class,
                                                                                                                org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                -1,
                                                                                                                org.kie.kogito.legacy.PB2.LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E.INSTANCE,
                                                                                                                20),
                                                                                               D.reactOn("applicant")).expr("GENERATED_DFF94DC5B427C8A70F9D2E3416B5A4A6",
                                                                                                                            org.kie.kogito.legacy.PCC.LambdaPredicateCCCF5A20811B0BD1AE174734463FB9C5.INSTANCE,
                                                                                                                            D.alphaIndexedBy(int.class,
                                                                                                                                             org.drools.model.Index.ConstraintType.GREATER_OR_EQUAL,
                                                                                                                                             DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE.getPropertyIndex("deposit"),
                                                                                                                                             org.kie.kogito.legacy.PA3.LambdaExtractorA32B8CB1183D0F49BCC4780851D79C38.INSTANCE,
                                                                                                                                             1000),
                                                                                                                            D.reactOn("deposit")).expr("GENERATED_7B1A62418028A12A33424E33756EBC32",
                                                                                                                                                       var_maxAmount,
                                                                                                                                                       org.kie.kogito.legacy.PF9.LambdaPredicateF975ECF13767B588174A73E0BD0FAB10.INSTANCE,
                                                                                                                                                       D.reactOn("amount")),
                                                                        D.on(var_$l).execute(org.kie.kogito.legacy.P06.LambdaConsequence068339985C9FFF822EA43E9560647E27.INSTANCE));
        return rule;
    }

    /**
     * Rule name: NotAdultApplication
     */
    public static org.drools.model.Rule rule_NotAdultApplication() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        final org.drools.model.BitMask mask_$l = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                         "approved");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "NotAdultApplication").build(D.pattern(var_$l).expr("GENERATED_DAB05A3BAEDCE7704CAAE1D58603B01B",
                                                                                                org.kie.kogito.legacy.P80.LambdaPredicate8039950C8717114DBFDF57F2277D70AE.INSTANCE,
                                                                                                D.alphaIndexedBy(int.class,
                                                                                                                 org.drools.model.Index.ConstraintType.LESS_THAN,
                                                                                                                 -1,
                                                                                                                 org.kie.kogito.legacy.PB2.LambdaExtractorB2483B164D7AAF9439F4B88741DDDF9E.INSTANCE,
                                                                                                                 20),
                                                                                                D.reactOn("applicant")),
                                                                         D.on(var_$l).execute(org.kie.kogito.legacy.P06.LambdaConsequence068339985C9FFF822EA43E9560647E27.INSTANCE));
        return rule;
    }

    /**
     * Rule name: CollectApprovedApplication
     */
    public static org.drools.model.Rule rule_CollectApprovedApplication() {
        final org.drools.model.Variable<org.kie.kogito.legacy.LoanApplication> var_$l = D.declarationOf(org.kie.kogito.legacy.LoanApplication.class,
                                                                                                        DomainClassesMetadataED2A293F9C55BB1943AA9A6A1A8BF64C.org_kie_kogito_legacy_LoanApplication_Metadata_INSTANCE,
                                                                                                        "$l");
        org.drools.model.Rule rule = D.rule("org.kie.kogito.legacy",
                                            "CollectApprovedApplication").build(D.pattern(var_$l).expr("GENERATED_B2BDD9BCDA825301A5DF76E773E481D6",
                                                                                                       org.kie.kogito.legacy.P17.LambdaPredicate1702A1229C9B57E6CCF625095E9793B3.INSTANCE,
                                                                                                       D.reactOn("approved")),
                                                                                D.on(var_approvedApplications,
                                                                                     var_$l).execute(org.kie.kogito.legacy.PD7.LambdaConsequenceD70F86FFCBCE3F4C6B087AA75DA0C5F1.INSTANCE));
        return rule;
    }
}
