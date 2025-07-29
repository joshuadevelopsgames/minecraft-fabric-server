import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class drt extends dpl {
   public static final MapCodec<drt> a = b(drt::new);
   public static final ees b = eer.bB;
   public static final ees c = eer.G;
   private static final eez<jj> d = eer.W;
   private static final int e = 6;
   private static final int f = 4;
   private static final dhq g = new dhq(10);
   private static final int h = 17;

   public drt(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, jj.k).b(c, false).b(b, false));
   }

   @Override
   protected MapCodec<drt> a() {
      return a;
   }

   @Override
   protected boolean c_(eeb $$0) {
      return true;
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$1.c_($$2) instanceof ebo $$4 ? $$4.u() : 0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      boolean $$6 = $$1.E($$2);
      boolean $$7 = $$0.c(c);
      eaz $$8 = $$1.c_($$2);
      if ($$6 && !$$7) {
         $$1.a($$2, this, 4);
         $$1.a($$2, $$0.b(c, true), 2);
         this.a($$8, true);
      } else if (!$$6 && $$7) {
         $$1.a($$2, $$0.b(c, false).b(b, false), 2);
         this.a($$8, false);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      this.a($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? null : a($$2, ebb.Q, ebo::a);
   }

   private void a(@Nullable eaz $$0, boolean $$1) {
      if ($$0 instanceof ebo $$2) {
         $$2.a($$1);
      }
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      ebo $$2 = new ebo($$0, $$1);
      $$2.a($$1.b(c) && $$1.c(c));
      return $$2;
   }

   @Override
   public eeb a(dgo $$0) {
      jh $$1 = $$0.d().g();

      jh $$2 = switch ($$1) {
         case a -> $$0.g().g();
         case b -> $$0.g();
         case c, d, e, f -> jh.b;
      };
      return this.m().b(d, jj.a($$1, $$2)).b(c, $$0.q().E($$0.a()));
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
      if ($$2.c(c)) {
         $$0.a($$1, this, 4);
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      bxf.a($$0, $$1, $$2);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof ebo $$5) {
         $$3.a($$5);
      }

      return bxj.a;
   }

   protected void a(eeb $$0, aub $$1, jb $$2) {
      if ($$1.c_($$2) instanceof ebo $$3) {
         dha var11 = $$3.aB_();
         Optional<dhr<dhb>> $$6 = a($$1, var11);
         if ($$6.isEmpty()) {
            $$1.c(1050, $$2, 0);
         } else {
            dhr<dhb> $$7 = $$6.get();
            dcv $$8 = $$7.b().a(var11, $$1.K_());
            if ($$8.f()) {
               $$1.c(1050, $$2, 0);
            } else {
               $$3.d(6);
               $$1.a($$2, $$0.b(b, true), 2);
               $$8.a($$1);
               this.a($$1, $$2, $$3, $$8, $$0, $$7);

               for (dcv $$9 : $$7.b().a(var11)) {
                  if (!$$9.f()) {
                     this.a($$1, $$2, $$3, $$9, $$0, $$7);
                  }
               }

               $$3.f().forEach($$0x -> {
                  if (!$$0x.f()) {
                     $$0x.h(1);
                  }
               });
               $$3.e();
            }
         }
      }
   }

   public static Optional<dhr<dhb>> a(aub $$0, dha $$1) {
      return g.a($$0, $$1);
   }

   private void a(aub $$0, jb $$1, ebo $$2, dcv $$3, eeb $$4, dhr<?> $$5) {
      jh $$6 = $$4.c(d).a();
      bxc $$7 = ecc.a($$0, $$1.a($$6));
      dcv $$8 = $$3.v();
      if ($$7 != null && ($$7 instanceof ebo || $$3.M() > $$7.f_($$3))) {
         while (!$$8.f()) {
            dcv $$9 = $$8.c(1);
            dcv $$10 = ecc.a($$2, $$7, $$9, $$6.g());
            if (!$$10.f()) {
               break;
            }

            $$8.h(1);
         }
      } else if ($$7 != null) {
         while (!$$8.f()) {
            int $$11 = $$8.M();
            $$8 = ecc.a($$2, $$7, $$8, $$6.g());
            if ($$11 == $$8.M()) {
               break;
            }
         }
      }

      if (!$$8.f()) {
         fis $$12 = fis.b($$1);
         fis $$13 = $$12.a($$6, 0.7);
         lm.a($$0, $$8, 6, $$6, $$13);

         for (auc $$14 : $$0.a(auc.class, fin.a($$12, 17.0, 17.0, 17.0))) {
            aq.ae.a($$14, $$5.a(), $$2.f());
         }

         $$0.c(1049, $$1, 0);
         $$0.c(2010, $$1, $$6.d());
      }
   }

   @Override
   protected eeb a(eeb $$0, dwu $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected eeb a(eeb $$0, dvd $$1) {
      return $$0.b(d, $$1.a().a($$0.c(d)));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(d, c, b);
   }
}
