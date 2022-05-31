package dev.thihup.my.incubator.module.api;

import dev.thihup.my.incubator.module.internal.IncubatorImpl;

public sealed interface MyIncubatorAPI permits
    IncubatorImpl {

    static MyIncubatorAPI newMyAPI() {
        return new IncubatorImpl();
    }

}
