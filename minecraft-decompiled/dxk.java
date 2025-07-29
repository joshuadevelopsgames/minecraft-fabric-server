import com.mojang.serialization.MapCodec;
import java.util.Arrays;
import java.util.UUID;
import javax.annotation.Nullable;

public abstract class dxk extends dpl implements dxl {
   public static final ees d = eer.I;
   private static final fjm a = dpz.b(8.0, 0.0, 16.0);
   private final efp b;

   protected dxk(efp $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dxk> a();

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return a;
   }

   @Override
   public boolean a(eeb $$0) {
      return true;
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecn($$0, $$1);
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      if ($$2.c_($$3) instanceof ecn $$7) {
         ddx $$10 = $$0.h() instanceof ddx $$9 ? $$9 : null;
         boolean $$11 = $$10 != null && $$4.gF();
         if ($$2 instanceof aub $$12) {
            if ($$11 && !$$7.w() && !this.a($$4, $$7)) {
               boolean $$14 = $$7.a($$4);
               if ($$10.a($$7.a($$14), $$4) && $$10.a($$12, $$7, $$14, $$4)) {
                  $$7.a($$12, $$4, $$3, $$14);
                  $$4.b(azj.c.b($$0.h()));
                  $$12.a(ejb.c, $$7.aA_(), ejb.a.a($$4, $$7.m()));
                  $$0.a(1, $$4);
                  return bxj.a;
               } else {
                  return bxj.f;
               }
            } else {
               return bxj.f;
            }
         } else {
            return !$$11 && !$$7.w() ? bxj.c : bxj.a;
         }
      } else {
         return bxj.e;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if ($$1.c_($$2) instanceof ecn $$5) {
         if ($$1 instanceof aub $$7) {
            boolean $$9 = $$5.a($$3);
            boolean $$10 = $$5.a($$7, $$3, $$2, $$9);
            if ($$5.w()) {
               $$7.a(null, $$5.aA_(), $$5.d(), aza.e);
               return bxj.b;
            } else if ($$10) {
               return bxj.b;
            } else if (!this.a($$3, $$5) && $$3.gF() && this.b($$3, $$5, $$9)) {
               this.a($$3, $$5, $$9);
               return bxj.b;
            } else {
               return bxj.e;
            }
         } else {
            ag.b(new IllegalStateException("Expected to only call this on server"));
            return bxj.c;
         }
      } else {
         return bxj.e;
      }
   }

   private boolean b(cut $$0, ecn $$1, boolean $$2) {
      eco $$3 = $$1.a($$2);
      return Arrays.stream($$3.b($$0.X())).allMatch($$0x -> $$0x.equals(xn.a) || $$0x.b() instanceof yv);
   }

   public abstract float h(eeb var1);

   public fis o(eeb $$0) {
      return new fis(0.5, 0.5, 0.5);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   public efp d() {
      return this.b;
   }

   public static efp a(dpz $$0) {
      efp $$1;
      if ($$0 instanceof dxk) {
         $$1 = ((dxk)$$0).d();
      } else {
         $$1 = efp.b;
      }

      return $$1;
   }

   public void a(cut $$0, ecn $$1, boolean $$2) {
      $$1.a($$0.cK());
      $$0.a($$1, $$2);
   }

   private boolean a(cut $$0, ecn $$1) {
      UUID $$2 = $$1.v();
      return $$2 != null && !$$2.equals($$0.cK());
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.h, ecn::a);
   }
}
