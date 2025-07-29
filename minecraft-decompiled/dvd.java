import com.mojang.serialization.Codec;

public enum dvd implements bda {
   a("none", h.a),
   b("left_right", h.B),
   c("front_back", h.z);

   public static final Codec<dvd> d = bda.a(dvd::values);
   @Deprecated
   public static final Codec<dvd> e = bbi.c(dvd::valueOf);
   private final String f;
   private final xo g;
   private final h h;

   private dvd(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = xo.c("mirror." + $$0);
      this.h = $$1;
   }

   public int a(int $$0, int $$1) {
      int $$2 = $$1 / 2;
      int $$3 = $$0 > $$2 ? $$0 - $$1 : $$0;
      switch (this) {
         case b:
            return ($$2 - $$3 + $$1) % $$1;
         case c:
            return ($$1 - $$3) % $$1;
         default:
            return $$0;
      }
   }

   public dwu a(jh $$0) {
      jh.a $$1 = $$0.o();
      return (this != b || $$1 != jh.a.c) && (this != c || $$1 != jh.a.a) ? dwu.a : dwu.c;
   }

   public jh b(jh $$0) {
      if (this == c && $$0.o() == jh.a.a) {
         return $$0.g();
      } else {
         return this == b && $$0.o() == jh.a.c ? $$0.g() : $$0;
      }
   }

   public h a() {
      return this.h;
   }

   public xo b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.f;
   }
}
