import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dpv extends dpl {
   public static final MapCodec<dpv> a = b(dpv::new);
   public static final eez<jh> b = dub.f;
   public static final eez<eep> c = eer.Y;
   public static final ees d = eer.A;
   private static final fjm f = fjj.a(dpz.b(6.0, 6.0, 13.0), dpz.b(8.0, 4.0, 6.0));
   private static final fjm g = fjj.a(f, dpz.b(2.0, 13.0, 16.0));
   private static final Map<jh.a, fjm> h = fjj.a(dpz.a(16.0, 16.0, 8.0));
   private static final Map<jh.a, fjm> i = fjj.a(fjj.a(f, dpz.a(2.0, 16.0, 13.0, 15.0)));
   private static final Map<jh, fjm> D = fjj.c(fjj.a(f, dpz.a(2.0, 13.0, 15.0, 0.0, 13.0)));
   public static final int e = 1;

   @Override
   public MapCodec<dpv> a() {
      return a;
   }

   public dpv(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jh.c).b(c, eep.a).b(d, false));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      boolean $$6 = $$1.E($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.b(d, $$6), 3);
      }
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      cut $$6 = $$3.ah_() instanceof cut $$5 ? $$5 : null;
      this.a($$0, $$1, $$2, $$6, true);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      return (bxj)(this.a($$1, $$0, $$4, $$3, true) ? bxj.a : bxj.e);
   }

   public boolean a(dmu $$0, eeb $$1, fio $$2, @Nullable cut $$3, boolean $$4) {
      jh $$5 = $$2.c();
      jb $$6 = $$2.b();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.g().e - $$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(azj.aA);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(eeb $$0, jh $$1, double $$2) {
      if ($$1.o() != jh.a.b && !($$2 > 0.8124F)) {
         jh $$3 = $$0.c(b);
         eep $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(dmu $$0, jb $$1, @Nullable jh $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bzm $$0, dmu $$1, jb $$2, @Nullable jh $$3) {
      eaz $$4 = $$1.c_($$2);
      if (!$$1.C && $$4 instanceof eax) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((eax)$$4).a($$3);
         $$1.a(null, $$2, ayz.bZ, aza.e, 2.0F, 1.0F);
         $$1.a($$0, ejb.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private fjm o(eeb $$0) {
      jh $$1 = $$0.c(b);

      return switch ((eep)$$0.c(c)) {
         case a -> (fjm)h.get($$1.o());
         case c -> (fjm)D.get($$1);
         case d -> (fjm)i.get($$1.o());
         case b -> g;
      };
   }

   @Override
   protected fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.o($$0);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.o($$0);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.k();
      jb $$2 = $$0.a();
      dmu $$3 = $$0.q();
      jh.a $$4 = $$1.o();
      if ($$4 == jh.a.b) {
         eeb $$5 = this.m().b(c, $$1 == jh.a ? eep.b : eep.a).b(b, $$0.g());
         if ($$5.a((dmx)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == jh.a.a && $$3.a_($$2.h()).c($$3, $$2.h(), jh.f) && $$3.a_($$2.i()).c($$3, $$2.i(), jh.e)
            || $$4 == jh.a.c && $$3.a_($$2.f()).c($$3, $$2.f(), jh.d) && $$3.a_($$2.g()).c($$3, $$2.g(), jh.c);
         eeb $$7 = this.m().b(b, $$1.g()).b(c, $$6 ? eep.d : eep.c);
         if ($$7.a((dmx)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.e()).c($$3, $$2.e(), jh.b);
         $$7 = $$7.b(c, $$8 ? eep.a : eep.b);
         if ($$7.a((dmx)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dmn $$3, BiConsumer<dcv, jb> $$4) {
      if ($$3.g()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      eep $$8 = $$0.c(c);
      jh $$9 = q($$0).g();
      if ($$9 == $$4 && !$$0.a($$1, $$3) && $$8 != eep.d) {
         return dqb.a.m();
      } else {
         if ($$4.o() == $$0.c(b).o()) {
            if ($$8 == eep.d && !$$6.c($$1, $$5, $$4)) {
               return $$0.b(c, eep.c).b(b, $$4.g());
            }

            if ($$8 == eep.c && $$9.g() == $$4 && $$6.c($$1, $$5, $$0.c(b))) {
               return $$0.b(c, eep.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jh $$3 = q($$0).g();
      return $$3 == jh.b ? dpz.a($$1, $$2.d(), jh.a) : dsw.b($$1, $$2, $$3);
   }

   private static jh q(eeb $$0) {
      switch ((eep)$$0.c(c)) {
         case a:
            return jh.b;
         case b:
            return jh.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new eax($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.F, $$0.C ? eax::a : eax::b);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   public eeb a(eeb $$0, dwu $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public eeb a(eeb $$0, dvd $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
