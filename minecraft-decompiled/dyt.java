import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyt extends dpl implements dtm {
   public static final MapCodec<dyt> a = b(dyt::new);
   public static final eez<efm> b = eer.bG;

   public dyt(eea.d $$0) {
      super($$0);
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ect($$0, $$1);
   }

   @Override
   public eeb a(dgo $$0) {
      dev $$1 = $$0.n().a(kq.aq);
      eeb $$2 = this.m();
      if ($$1 != null) {
         efm $$3 = $$1.a(b);
         if ($$3 != null) {
            $$2 = $$2.b(b, $$3);
         }
      }

      return $$2;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.c_($$2) instanceof ect $$6) {
         if (!$$3.gQ()) {
            return bxj.e;
         } else {
            if ($$1.C) {
               $$3.a($$6);
            }

            return bxj.a;
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      ect $$4 = a($$1, $$2);
      if ($$4 != null) {
         $$4.f();
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      ect $$6 = a($$1, $$2);
      if ($$6 != null) {
         if ($$6.d() != efm.a) {
            boolean $$7 = $$1.E($$2);
            boolean $$8 = $$6.c();
            if ($$7 && !$$8) {
               $$6.a(true);
               $$6.j();
            } else if (!$$7 && $$8) {
               $$6.a(false);
            }
         }
      }
   }

   @Nullable
   private static ect a(dmu $$0, jb $$1) {
      return $$0 instanceof aub $$2 && $$2.c_($$1) instanceof ect $$3 ? $$3 : null;
   }

   @Override
   public int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      if ($$0.c(b) != efm.a) {
         return 0;
      } else if ($$1.c_($$2) instanceof ect $$5) {
         return $$5.c() ? 15 : 0;
      } else {
         return 0;
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      dcv $$4 = super.a($$0, $$1, $$2, $$3);
      return a($$4, $$2.c(b));
   }

   public static dcv a(dcv $$0, efm $$1) {
      $$0.b(kq.aq, $$0.a(kq.aq, dev.a).a(b, $$1));
      return $$0;
   }

   @Override
   protected MapCodec<dyt> a() {
      return a;
   }
}
