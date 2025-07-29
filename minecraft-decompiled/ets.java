import com.mojang.serialization.Codec;

public enum ets implements bda {
   a(jh.b, 1, "ceiling"),
   b(jh.a, -1, "floor");

   public static final Codec<ets> c = bda.a(ets::values);
   private final jh d;
   private final int e;
   private final String f;

   private ets(final jh $$0, final int $$1, final String $$2) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
   }

   public jh a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   @Override
   public String c() {
      return this.f;
   }
}
