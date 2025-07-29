import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class drd extends dot<ebh> implements dxl {
   public static final MapCodec<drd> b = b($$0 -> new drd(() -> ebb.b, $$0));
   public static final eez<jh> c = dub.f;
   public static final eez<eet> d = eer.bg;
   public static final ees e = eer.I;
   public static final int f = 1;
   private static final fjm g = dpz.b(14.0, 0.0, 14.0);
   private static final Map<jh, fjm> h = fjj.c(dpz.a(14.0, 0.0, 14.0, 0.0, 15.0));
   private static final dsh.b<ebh, Optional<bxc>> i = new dsh.b<ebh, Optional<bxc>>() {
      public Optional<bxc> a(ebh $$0, ebh $$1) {
         return Optional.of(new bxb($$0, $$1));
      }

      public Optional<bxc> a(ebh $$0) {
         return Optional.of($$0);
      }

      public Optional<bxc> a() {
         return Optional.empty();
      }
   };
   private static final dsh.b<ebh, Optional<bxm>> D = new dsh.b<ebh, Optional<bxm>>() {
      public Optional<bxm> a(final ebh $$0, final ebh $$1) {
         final bxc $$2 = new bxb($$0, $$1);
         return Optional.of(new bxm() {
            @Nullable
            @Override
            public cym createMenu(int $$0x, cus $$1x, cut $$2x) {
               if ($$0.d($$2) && $$1.d($$2)) {
                  $$0.f_($$1.j);
                  $$1.f_($$1.j);
                  return cyv.b($$0, $$1, $$2);
               } else {
                  return null;
               }
            }

            @Override
            public xo Q_() {
               if ($$0.i_()) {
                  return $$0.Q_();
               } else {
                  return (xo)($$1.i_() ? $$1.Q_() : xo.c("container.chestDouble"));
               }
            }
         });
      }

      public Optional<bxm> a(ebh $$0) {
         return Optional.of($$0);
      }

      public Optional<bxm> a() {
         return Optional.empty();
      }
   };

   @Override
   public MapCodec<? extends drd> a() {
      return b;
   }

   protected drd(Supplier<ebb<? extends ebh>> $$0, eea.d $$1) {
      super($$1, $$0);
      this.l(this.C.b().b(c, jh.c).b(d, eet.a).b(e, false));
   }

   public static dsh.a h(eeb $$0) {
      eet $$1 = $$0.c(d);
      if ($$1 == eet.a) {
         return dsh.a.a;
      } else {
         return $$1 == eet.c ? dsh.a.b : dsh.a.c;
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      if ($$6.a(this) && $$4.o().d()) {
         eet $$8 = $$6.c(d);
         if ($$0.c(d) == eet.a && $$8 != eet.a && $$0.c(c) == $$6.c(c) && i($$6) == $$4.g()) {
            return $$0.b(d, $$8.a());
         }
      } else if (i($$0) == $$4) {
         return $$0.b(d, eet.a);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return switch ((eet)$$0.c(d)) {
         case a -> g;
         case b, c -> (fjm)h.get(i($$0));
      };
   }

   public static jh i(eeb $$0) {
      jh $$1 = $$0.c(c);
      return $$0.c(d) == eet.b ? $$1.h() : $$1.i();
   }

   @Override
   public eeb a(dgo $$0) {
      eet $$1 = eet.a;
      jh $$2 = $$0.g().g();
      fal $$3 = $$0.q().b_($$0.a());
      boolean $$4 = $$0.h();
      jh $$5 = $$0.k();
      if ($$5.o().d() && $$4) {
         jh $$6 = this.a($$0, $$5.g());
         if ($$6 != null && $$6.o() != $$5.o()) {
            $$2 = $$6;
            $$1 = $$6.i() == $$5.g() ? eet.c : eet.b;
         }
      }

      if ($$1 == eet.a && !$$4) {
         if ($$2 == this.a($$0, $$2.h())) {
            $$1 = eet.b;
         } else if ($$2 == this.a($$0, $$2.i())) {
            $$1 = eet.c;
         }
      }

      return this.m().b(c, $$2).b(d, $$1).b(e, $$3.a() == fam.c);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(e) ? fam.c.a(false) : super.b_($$0);
   }

   @Nullable
   private jh a(dgo $$0, jh $$1) {
      eeb $$2 = $$0.q().a_($$0.a().a($$1));
      return $$2.a(this) && $$2.c(d) == eet.a ? $$2.c(c) : null;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1 instanceof aub $$5) {
         bxm $$6 = this.b($$0, $$1, $$2);
         if ($$6 != null) {
            $$3.a($$6);
            $$3.b(this.c());
            ctj.a($$5, $$3, true);
         }
      }

      return bxj.a;
   }

   protected azg<ame> c() {
      return azj.i.b(azj.ap);
   }

   public ebb<? extends ebh> d() {
      return this.a.get();
   }

   @Nullable
   public static bxc a(drd $$0, eeb $$1, dmu $$2, jb $$3, boolean $$4) {
      return $$0.a($$1, $$2, $$3, $$4).apply(i).orElse(null);
   }

   @Override
   public dsh.c<? extends ebh> a(eeb $$0, dmu $$1, jb $$2, boolean $$3) {
      BiPredicate<dmv, jb> $$4;
      if ($$3) {
         $$4 = ($$0x, $$1x) -> false;
      } else {
         $$4 = drd::a;
      }

      return dsh.a(this.a.get(), drd::h, drd::i, c, $$0, $$1, $$2, $$4);
   }

   @Nullable
   @Override
   protected bxm b(eeb $$0, dmu $$1, jb $$2) {
      return this.a($$0, $$1, $$2, false).apply(D).orElse(null);
   }

   public static dsh.b<ebh, Float2FloatFunction> a(final ecg $$0) {
      return new dsh.b<ebh, Float2FloatFunction>() {
         public Float2FloatFunction a(ebh $$0x, ebh $$1) {
            return $$2 -> Math.max($$0.a($$2), $$1.a($$2));
         }

         public Float2FloatFunction a(ebh $$0x) {
            return $$0::a;
         }

         public Float2FloatFunction a() {
            return $$0::a;
         }
      };
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebh($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? a($$2, this.d(), ebh::a) : null;
   }

   public static boolean a(dmv $$0, jb $$1) {
      return a((dly)$$0, $$1) || b($$0, $$1);
   }

   private static boolean a(dly $$0, jb $$1) {
      jb $$2 = $$1.d();
      return $$0.a_($$2).d($$0, $$2);
   }

   private static boolean b(dmv $$0, jb $$1) {
      List<cmg> $$2 = $$0.a(cmg.class, new fin($$1.u(), $$1.v() + 1, $$1.w(), $$1.u() + 1, $$1.v() + 2, $$1.w() + 1));
      if (!$$2.isEmpty()) {
         for (cmg $$3 : $$2) {
            if ($$3.t()) {
               return true;
            }
         }
      }

      return false;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return cym.b(a(this, $$0, $$1, $$2, false));
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d, e);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      eaz $$4 = $$1.c_($$2);
      if ($$4 instanceof ebh) {
         ((ebh)$$4).k();
      }
   }
}
