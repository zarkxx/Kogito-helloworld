package org.kie.kogito.app;

@javax.enterprise.context.ApplicationScoped
public class RuleUnits extends org.kie.kogito.rules.units.impl.AbstractRuleUnits {

    @javax.inject.Inject
    javax.enterprise.inject.Instance<org.kie.kogito.rules.RuleUnit<? extends org.kie.kogito.rules.RuleUnitData>> ruleUnits;

    private java.util.Map<String, org.kie.kogito.rules.RuleUnit<? extends org.kie.kogito.rules.RuleUnitData>> mappedRuleUnits = new java.util.HashMap<>();

    private final org.kie.kogito.rules.KieRuntimeBuilder ruleRuntimeBuilder = new org.drools.project.model.ProjectRuntime();

    public org.kie.kogito.rules.KieRuntimeBuilder ruleRuntimeBuilder() {
        return this.ruleRuntimeBuilder;
    }

    @javax.annotation.PostConstruct
    public void setup() {
        for (org.kie.kogito.rules.RuleUnit<? extends org.kie.kogito.rules.RuleUnitData> ruleUnit : ruleUnits) {
            mappedRuleUnits.put(ruleUnit.id(), ruleUnit);
        }
    }

    protected org.kie.kogito.rules.RuleUnit<?> create(String fqcn) {
        return mappedRuleUnits.get(fqcn);
    }
}
