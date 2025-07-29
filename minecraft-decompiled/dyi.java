import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyi extends dpl implements dtm {
   public static final MapCodec<dyi> a = b(dyi::new);
   public static final eez<efl> b = eer.bn;

   @Override
   public MapCodec<dyi> a() {
      return a;
   }

   protected dyi(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, efl.b));
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecs($$0, $$1);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      eaz $$5 = $$1.c_($$2);
      if ($$5 instanceof ecs) {
         return (bxj)(((ecs)$$5).a($$3) ? bxj.a : bxj.e);
      } else {
         return bxj.e;
      }
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, @Nullable cam $$3, dcv $$4) {
      if (!$$0.C) {
         if ($$3 != null) {
            eaz $$5 = $$0.c_($$1);
            if ($$5 instanceof ecs) {
               ((ecs)$$5).a($$3);
            }
         }
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$1 instanceof aub) {
         if ($$1.c_($$2) instanceof ecs $$7) {
            boolean $$8 = $$1.E($$2);
            boolean $$9 = $$7.G();
            if ($$8 && !$$9) {
               $$7.d(true);
               this.a((aub)$$1, $$7);
            } else if (!$$8 && $$9) {
               $$7.d(false);
            }
         }
      }
   }

   private void a(aub $$0, ecs $$1) {
      switch ($$1.x()) {
         case a:
            $$1.c(false);
            break;
         case b:
            $$1.c($$0);
            break;
         case c:
            $$1.E();
         case d:
      }
   }
}
