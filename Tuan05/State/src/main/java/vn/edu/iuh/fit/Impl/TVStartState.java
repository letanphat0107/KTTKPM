package vn.edu.iuh.fit.Impl;

import vn.edu.iuh.fit.State;

public class TVStartState implements State {
    @Override
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}
