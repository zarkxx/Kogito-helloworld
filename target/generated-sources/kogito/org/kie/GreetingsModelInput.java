package org.kie;

import java.util.Map;
import java.util.HashMap;

@org.kie.internal.kogito.codegen.Generated(value = "kogito-codegen", reference = "greetings", name = "Greetings", hidden = true)
public class GreetingsModelInput implements org.kie.kogito.Model {

    @Override
    public Map<String, Object> toMap() {
        Map<String, Object> params = new HashMap();
        return params;
    }

    @Override
    public void fromMap(Map<String, Object> params) {
        fromMap(null, params);
    }

    @Override
    public void update(Map<String, Object> params) {
        fromMap(params);
    }

    public void fromMap(String id, Map<String, Object> params) {
    }

    public GreetingsModel toModel() {
        GreetingsModel result = new GreetingsModel();
        return result;
    }
}
