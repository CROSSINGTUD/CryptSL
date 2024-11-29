package crysl.rule;

import java.util.Collection;

public interface Transition<State> {
    State from();

    State to();

    Collection<CrySLMethod> getLabel();
}
