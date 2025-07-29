import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dyx extends dpz {
   public static final MapCodec<dyx> a = b(dyx::new);
   public static final ees b = eer.H;

   @Override
   public MapCodec<dyx> a() {
      return a;
   }

   public dyx(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, false));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.E($$2) && a($$1, $$2)) {
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$1.E($$2) && a($$1, $$2)) {
         $$1.a($$2, false);
      }
   }

   @Override
   public eeb a(dmu $$0, jb $$1, eeb $$2, cut $$3) {
      if (!$$0.B_() && !$$3.gt().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aub $$0, jb $$1, dmn $$2) {
      if ($$0.P().c(dmq.ad)) {
         cra $$3 = new cra($$0, $$1.u() + 0.5, $$1.v(), $$1.w() + 0.5, $$2.c());
         int $$4 = $$3.f();
         $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
         $$0.b($$3);
      }
   }

   public static boolean a(dmu $$0, jb $$1) {
      return a($$0, $$1, null);
   }

   private static boolean a(dmu $$0, jb $$1, @Nullable cam $$2) {
      if ($$0 instanceof aub $$3 && $$3.P().c(dmq.ad)) {
         cra $$5 = new cra($$0, $$1.u() + 0.5, $$1.v(), $$1.w() + 0.5, $$2);
         $$0.b($$5);
         $$0.a(null, $$5.dC(), $$5.dE(), $$5.dI(), ayz.Bb, aza.e, 1.0F, 1.0F);
         $$0.a($$2, ejb.I, $$1);
         return true;
      } else {
         return false;
      }
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if (!$$0.a(dcz.px) && !$$0.a(dcz.vy)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         if (a($$2, $$3, $$4)) {
            $$2.a($$3, dqb.a.m(), 11);
            dcr $$7 = $$0.h();
            if ($$0.a(dcz.px)) {
               $$0.a(1, $$4, cam.d($$5));
            } else {
               $$0.a(1, $$4);
            }

            $$4.b(azj.c.b($$7));
         } else if ($$2 instanceof aub $$8 && !$$8.P().c(dmq.ad)) {
            $$4.a(xo.c("block.minecraft.tnt.disabled"), true);
            return bxj.e;
         }

         return bxj.a;
      }
   }

   @Override
   protected void a(dmu $$0, eeb $$1, fio $$2, cvo $$3) {
      if ($$0 instanceof aub $$4) {
         jb $$5 = $$2.b();
         bzm $$6 = $$3.ah_();
         if ($$3.cb() && $$3.c($$4, $$5) && a($$0, $$5, $$6 instanceof cam ? (cam)$$6 : null)) {
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dmn $$0) {
      return false;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
