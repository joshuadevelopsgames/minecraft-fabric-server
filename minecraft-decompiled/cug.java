import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cug(jl<cuk> e, jl<cui> f, int g) {
   public static final int a = 1;
   public static final int b = 5;
   private static final int[] h = new int[]{0, 10, 70, 150, 250};
   public static final Codec<cug> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            mm.w.r().fieldOf("type").orElseGet(() -> mm.w.b(cuk.c)).forGetter($$0x -> $$0x.e),
            mm.x.r().fieldOf("profession").orElseGet(() -> mm.x.b(cui.b)).forGetter($$0x -> $$0x.f),
            Codec.INT.fieldOf("level").orElse(1).forGetter($$0x -> $$0x.g)
         )
         .apply($$0, cug::new)
   );
   public static final zm<wx, cug> d = zm.a(zk.b(mn.aI), cug::a, zk.b(mn.aH), cug::b, zk.h, cug::c, cug::new);

   public cug(jl<cuk> e, jl<cui> f, int g) {
      g = Math.max(1, g);
      this.e = e;
      this.f = f;
      this.g = g;
   }

   public cug a(jl<cuk> $$0) {
      return new cug($$0, this.f, this.g);
   }

   public cug a(jm.a $$0, amd<cuk> $$1) {
      return this.a($$0.d($$1));
   }

   public cug b(jl<cui> $$0) {
      return new cug(this.e, $$0, this.g);
   }

   public cug b(jm.a $$0, amd<cui> $$1) {
      return this.b($$0.d($$1));
   }

   public cug a(int $$0) {
      return new cug(this.e, this.f, $$0);
   }

   public static int b(int $$0) {
      return d($$0) ? h[$$0 - 1] : 0;
   }

   public static int c(int $$0) {
      return d($$0) ? h[$$0] : 0;
   }

   public static boolean d(int $$0) {
      return $$0 >= 1 && $$0 < 5;
   }

   public jl<cuk> a() {
      return this.e;
   }

   public jl<cui> b() {
      return this.f;
   }

   public int c() {
      return this.g;
   }
}
