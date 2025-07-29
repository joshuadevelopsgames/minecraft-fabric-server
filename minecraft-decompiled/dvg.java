import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dvg extends dpz implements dxl {
   public static final MapCodec<dvg> b = b(dvg::new);
   public static final ees c = eer.I;
   private static final Map<jh, ees> a = dvu.h;
   protected static final jh[] d = jh.values();
   private final Function<eeb, fjm> e;
   private final boolean f;
   private final boolean g;
   private final boolean h;

   @Override
   protected MapCodec<? extends dvg> a() {
      return b;
   }

   public dvg(eea.d $$0) {
      super($$0);
      this.l(a(this.C));
      this.e = this.q();
      this.f = jh.c.a.a().allMatch(this::a);
      this.g = jh.c.a.a().filter(jh.a.a).filter(this::a).count() % 2L == 0L;
      this.h = jh.c.a.a().filter(jh.a.c).filter(this::a).count() % 2L == 0L;
   }

   private Function<eeb, fjm> q() {
      Map<jh, fjm> $$0 = fjj.d(dpz.c(16.0, 0.0, 1.0));
      return this.a($$1 -> {
         fjm $$2 = fjj.a();

         for (jh $$3 : d) {
            if (a($$1, $$3)) {
               $$2 = fjj.a($$2, $$0.get($$3));
            }
         }

         return $$2.c() ? fjj.b() : $$2;
      }, new efe[]{c});
   }

   public static Set<jh> o(eeb $$0) {
      if (!($$0.b() instanceof dvg)) {
         return Set.of();
      } else {
         Set<jh> $$1 = EnumSet.noneOf(jh.class);

         for (jh $$2 : jh.values()) {
            if (a($$0, $$2)) {
               $$1.add($$2);
            }
         }

         return $$1;
      }
   }

   public static Set<jh> a(byte $$0) {
      Set<jh> $$1 = EnumSet.noneOf(jh.class);

      for (jh $$2 : jh.values()) {
         if (($$0 & (byte)(1 << $$2.ordinal())) > 0) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public static byte a(Collection<jh> $$0) {
      byte $$1 = 0;

      for (jh $$2 : $$0) {
         $$1 = (byte)($$1 | 1 << $$2.ordinal());
      }

      return $$1;
   }

   protected boolean a(jh $$0) {
      return true;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      for (jh $$1 : d) {
         if (this.a($$1)) {
            $$0.a(b($$1));
         }
      }

      $$0.a(c);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      if (!q($$0)) {
         return dqb.a.m();
      } else {
         return a($$0, $$4) && !a($$1, $$4, $$5, $$6) ? a($$0, b($$4)) : $$0;
      }
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.e.apply($$0);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      boolean $$3 = false;

      for (jh $$4 : d) {
         if (a($$0, $$4)) {
            if (!a($$1, $$2, $$4)) {
               return false;
            }

            $$3 = true;
         }
      }

      return $$3;
   }

   @Override
   protected boolean a(eeb $$0, dgo $$1) {
      return !$$1.n().a(this.h()) || r($$0);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      dmu $$1 = $$0.q();
      jb $$2 = $$0.a();
      eeb $$3 = $$1.a_($$2);
      return Arrays.stream($$0.f()).map($$3x -> this.c($$3, $$1, $$2, $$3x)).filter(Objects::nonNull).findFirst().orElse(null);
   }

   public boolean a(dly $$0, eeb $$1, jb $$2, jh $$3) {
      if (this.a($$3) && (!$$1.a(this) || !a($$1, $$3))) {
         jb $$4 = $$2.a($$3);
         return a($$0, $$3, $$4, $$0.a_($$4));
      } else {
         return false;
      }
   }

   @Nullable
   public eeb c(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if (!this.a($$1, $$0, $$2, $$3)) {
         return null;
      } else {
         eeb $$4;
         if ($$0.a(this)) {
            $$4 = $$0;
         } else if ($$0.y().a(fam.c)) {
            $$4 = this.m().b(eer.I, true);
         } else {
            $$4 = this.m();
         }

         return $$4.b(b($$3), true);
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return !this.f ? $$0 : this.a($$0, $$1::a);
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      if ($$1 == dvd.c && !this.g) {
         return $$0;
      } else {
         return $$1 == dvd.b && !this.h ? $$0 : this.a($$0, $$1::b);
      }
   }

   private eeb a(eeb $$0, Function<jh, jh> $$1) {
      eeb $$2 = $$0;

      for (jh $$3 : d) {
         if (this.a($$3)) {
            $$2 = $$2.b(b($$1.apply($$3)), $$0.c(b($$3)));
         }
      }

      return $$2;
   }

   public static boolean a(eeb $$0, jh $$1) {
      ees $$2 = b($$1);
      return $$0.a($$2, false);
   }

   public static boolean a(dly $$0, jb $$1, jh $$2) {
      jb $$3 = $$1.a($$2);
      eeb $$4 = $$0.a_($$3);
      return a($$0, $$2, $$3, $$4);
   }

   public static boolean a(dly $$0, jh $$1, jb $$2, eeb $$3) {
      return dpz.a($$3.h($$0, $$2), $$1.g()) || dpz.a($$3.g($$0, $$2), $$1.g());
   }

   private static eeb a(eeb $$0, ees $$1) {
      eeb $$2 = $$0.b($$1, false);
      return q($$2) ? $$2 : dqb.a.m();
   }

   public static ees b(jh $$0) {
      return a.get($$0);
   }

   private static eeb a(eec<dpz, eeb> $$0) {
      eeb $$1 = $$0.b().b(c, false);

      for (ees $$2 : a.values()) {
         $$1 = $$1.c($$2, false);
      }

      return $$1;
   }

   protected static boolean q(eeb $$0) {
      for (jh $$1 : d) {
         if (a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   private static boolean r(eeb $$0) {
      for (jh $$1 : d) {
         if (!a($$0, $$1)) {
            return true;
         }
      }

      return false;
   }
}
