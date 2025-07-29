import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

public final class edp {
   private static final Map<String, edp> l = new Object2ObjectArrayMap();
   public static final Codec<edp> a = Codec.stringResolver($$0 -> $$0.m, l::get);
   public static final edp b = new edp(
      "oak", 0.1F, Optional.empty(), Optional.empty(), Optional.of(rw.g), Optional.of(rw.q), Optional.of(rw.F), Optional.of(rw.M)
   );
   public static final edp c = new edp(
      "spruce", 0.5F, Optional.of(rw.t), Optional.of(rw.u), Optional.of(rw.n), Optional.empty(), Optional.empty(), Optional.empty()
   );
   public static final edp d = new edp(
      "mangrove", 0.85F, Optional.empty(), Optional.empty(), Optional.of(rw.A), Optional.of(rw.B), Optional.empty(), Optional.empty()
   );
   public static final edp e = new edp("azalea", Optional.empty(), Optional.of(rw.z), Optional.empty());
   public static final edp f = new edp("birch", Optional.empty(), Optional.of(rw.l), Optional.of(rw.J));
   public static final edp g = new edp("jungle", Optional.of(rw.s), Optional.of(rw.r), Optional.empty());
   public static final edp h = new edp("acacia", Optional.empty(), Optional.of(rw.m), Optional.empty());
   public static final edp i = new edp("cherry", Optional.empty(), Optional.of(rw.C), Optional.of(rw.O));
   public static final edp j = new edp("dark_oak", Optional.of(rw.h), Optional.empty(), Optional.empty());
   public static final edp k = new edp("pale_oak", Optional.of(rw.j), Optional.empty(), Optional.empty());
   private final String m;
   private final float n;
   private final Optional<amd<ems<?, ?>>> o;
   private final Optional<amd<ems<?, ?>>> p;
   private final Optional<amd<ems<?, ?>>> q;
   private final Optional<amd<ems<?, ?>>> r;
   private final Optional<amd<ems<?, ?>>> s;
   private final Optional<amd<ems<?, ?>>> t;

   public edp(String $$0, Optional<amd<ems<?, ?>>> $$1, Optional<amd<ems<?, ?>>> $$2, Optional<amd<ems<?, ?>>> $$3) {
      this($$0, 0.0F, $$1, Optional.empty(), $$2, Optional.empty(), $$3, Optional.empty());
   }

   public edp(
      String $$0,
      float $$1,
      Optional<amd<ems<?, ?>>> $$2,
      Optional<amd<ems<?, ?>>> $$3,
      Optional<amd<ems<?, ?>>> $$4,
      Optional<amd<ems<?, ?>>> $$5,
      Optional<amd<ems<?, ?>>> $$6,
      Optional<amd<ems<?, ?>>> $$7
   ) {
      this.m = $$0;
      this.n = $$1;
      this.o = $$2;
      this.p = $$3;
      this.q = $$4;
      this.r = $$5;
      this.s = $$6;
      this.t = $$7;
      l.put($$0, this);
   }

   @Nullable
   private amd<ems<?, ?>> a(bck $$0, boolean $$1) {
      if ($$0.i() < this.n) {
         if ($$1 && this.t.isPresent()) {
            return this.t.get();
         }

         if (this.r.isPresent()) {
            return this.r.get();
         }
      }

      return $$1 && this.s.isPresent() ? this.s.get() : this.q.orElse(null);
   }

   @Nullable
   private amd<ems<?, ?>> a(bck $$0) {
      return this.p.isPresent() && $$0.i() < this.n ? this.p.get() : this.o.orElse(null);
   }

   public boolean a(aub $$0, efz $$1, jb $$2, eeb $$3, bck $$4) {
      amd<ems<?, ?>> $$5 = this.a($$4);
      if ($$5 != null) {
         jl<ems<?, ?>> $$6 = $$0.K_().f(mn.aP).a($$5).orElse(null);
         if ($$6 != null) {
            for (int $$7 = 0; $$7 >= -1; $$7--) {
               for (int $$8 = 0; $$8 >= -1; $$8--) {
                  if (a($$3, $$0, $$2, $$7, $$8)) {
                     ems<?, ?> $$9 = $$6.a();
                     eeb $$10 = dqb.a.m();
                     $$0.a($$2.b($$7, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$10, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$10, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$10, 260);
                     if ($$9.a($$0, $$1, $$4, $$2.b($$7, 0, $$8))) {
                        return true;
                     }

                     $$0.a($$2.b($$7, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8), $$3, 260);
                     $$0.a($$2.b($$7, 0, $$8 + 1), $$3, 260);
                     $$0.a($$2.b($$7 + 1, 0, $$8 + 1), $$3, 260);
                     return false;
                  }
               }
            }
         }
      }

      amd<ems<?, ?>> $$11 = this.a($$4, this.a($$0, $$2));
      if ($$11 == null) {
         return false;
      } else {
         jl<ems<?, ?>> $$12 = $$0.K_().f(mn.aP).a($$11).orElse(null);
         if ($$12 == null) {
            return false;
         } else {
            ems<?, ?> $$13 = $$12.a();
            eeb $$14 = $$0.b_($$2).g();
            $$0.a($$2, $$14, 260);
            if ($$13.a($$0, $$1, $$4, $$2)) {
               if ($$0.a_($$2) == $$14) {
                  $$0.a($$2, $$3, $$14, 2);
               }

               return true;
            } else {
               $$0.a($$2, $$3, 260);
               return false;
            }
         }
      }
   }

   private static boolean a(eeb $$0, dly $$1, jb $$2, int $$3, int $$4) {
      dpz $$5 = $$0.b();
      return $$1.a_($$2.b($$3, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4)).a($$5)
         && $$1.a_($$2.b($$3, 0, $$4 + 1)).a($$5)
         && $$1.a_($$2.b($$3 + 1, 0, $$4 + 1)).a($$5);
   }

   private boolean a(dmv $$0, jb $$1) {
      for (jb $$2 : jb.a.c($$1.e().d(2).f(2), $$1.d().e(2).g(2))) {
         if ($$0.a_($$2).a(azo.P)) {
            return true;
         }
      }

      return false;
   }
}
