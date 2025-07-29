import com.mojang.serialization.Codec;

public record cc(jp<bzv<?>> b) {
   public static final Codec<cc> a = ka.a(mn.D).xmap(cc::new, cc::a);

   public static cc a(jm<bzv<?>> $$0, bzv<?> $$1) {
      return new cc(jp.a($$1.r()));
   }

   public static cc a(jm<bzv<?>> $$0, bae<bzv<?>> $$1) {
      return new cc($$0.b($$1));
   }

   public boolean a(bzv<?> $$0) {
      return $$0.a(this.b);
   }

   public jp<bzv<?>> a() {
      return this.b;
   }
}
