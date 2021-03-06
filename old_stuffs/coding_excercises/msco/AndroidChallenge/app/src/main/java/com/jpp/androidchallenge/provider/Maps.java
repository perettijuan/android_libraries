package com.jpp.androidchallenge.provider;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Utility extracted from Android Developers Site:
 * https://developer.android.com/samples/BasicSyncAdapter/src/com.example.android.common/db/SelectionBuilder.html
 */
public class Maps {
    /**
     * Creates a {@code HashMap} instance.
     *
     * @return a newly-created, initially-empty {@code HashMap}
     */
    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<K, V>();
    }

    /**
     * Creates a {@code LinkedHashMap} instance.
     *
     * @return a newly-created, initially-empty {@code HashMap}
     */
    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<K, V>();
    }
}