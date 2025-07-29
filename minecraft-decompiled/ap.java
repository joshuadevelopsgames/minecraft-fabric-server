import com.mojang.serialization.Codec;

public enum ap implements bda {
   a("task", o.k),
   b("challenge", o.f),
   c("goal", o.k);

   public static final Codec<ap> d = bda.a(ap::values);
   private final String e;
   private final o f;
   private final xo g;

   private ap(final String $$0, final o $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xo.c("advancements.toast." + $$0);
   }

   public o a() {
      return this.f;
   }

   public xo b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public yc a(aj $$0, auc $$1) {
      return xo.a("chat.type.advancement." + this.e, $$1.Q_(), ai.a($$0));
   }
}
