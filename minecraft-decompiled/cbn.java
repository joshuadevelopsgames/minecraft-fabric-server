import com.mojang.serialization.Codec;

public class cbn {
   public static final Codec<jl<cbn>> a = mm.s.r();
   public static final zm<wx, jl<cbn>> b = zk.b(mn.c);
   private final double c;
   private boolean d;
   private final String e;
   private cbn.a f = cbn.a.a;

   protected cbn(String $$0, double $$1) {
      this.c = $$1;
      this.e = $$0;
   }

   public double a() {
      return this.c;
   }

   public boolean b() {
      return this.d;
   }

   public cbn a(boolean $$0) {
      this.d = $$0;
      return this;
   }

   public cbn a(cbn.a $$0) {
      this.f = $$0;
      return this;
   }

   public double a(double $$0) {
      return $$0;
   }

   public String c() {
      return this.e;
   }

   public o b(boolean $$0) {
      return this.f.a($$0);
   }

   public static enum a {
      a,
      b,
      c;

      public o a(boolean $$0) {
         return switch (this) {
            case a -> $$0 ? o.j : o.m;
            case b -> o.h;
            case c -> $$0 ? o.m : o.j;
         };
      }
   }
}
