package com.example.greekmyth.explosion;

/**
 * Thread-local flag to indicate we are currently processing an explosion.
 * Used by mixins to suppress block changes inside protected zones only during explosions.
 */
public final class ExplosionGuard {
    private static final ThreadLocal<Boolean> IN_EXPLOSION = ThreadLocal.withInitial(() -> Boolean.FALSE);

    private ExplosionGuard() {}

    public static void enable() {
        IN_EXPLOSION.set(Boolean.TRUE);
    }

    public static void disable() {
        IN_EXPLOSION.set(Boolean.FALSE);
    }

    public static boolean isActive() {
        return IN_EXPLOSION.get();
    }
}

