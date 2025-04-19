package vn.edu.iuh.fit;

import vn.edu.iuh.fit.Impl.TVContext;
import vn.edu.iuh.fit.Impl.TVStartState;
import vn.edu.iuh.fit.Impl.TVStopState;

public class Main {
    public static void main(String[] args) {
        TVContext context = new TVContext();
        State tvStartState = new TVStartState();
        State tvStopState = new TVStopState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}