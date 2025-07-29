import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dpn extends dpz {
   private static final fjm c = dpz.b(14.0, 0.0, 0.5);
   private static final fjm d = dpz.b(14.0, 0.0, 1.0);
   protected static final fin a = dpz.b(14.0, 0.0, 4.0).e().getFirst();
   protected final eeq b;

   protected dpn(eea.d $$0, eeq $$1) {
      super($$0.a($$1.g()));
      this.b = $$1;
   }

   @Override
   protected abstract MapCodec<? extends dpn> a();

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.h($$0) > 0 ? c : d;
   }

   protected int b() {
      return 20;
   }

   @Override
   public boolean a(eeb $$0) {
      return true;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      jb $$3 = $$2.e();
      return c($$1, $$3) || a($$1, $$3, jh.b);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      int $$4 = this.h($$0);
      if ($$4 > 0) {
         this.a(null, $$1, $$2, $$0, $$4);
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if (!$$1.C) {
         int $$5 = this.h($$0);
         if ($$5 == 0) {
            this.a($$3, $$1, $$2, $$0, $$5);
         }
      }
   }

   private void a(@Nullable bzm $$0, dmu $$1, jb $$2, eeb $$3, int $$4) {
      int $$5 = this.b($$1, $$2);
      boolean $$6 = $$4 > 0;
      boolean $$7 = $$5 > 0;
      if ($$4 != $$5) {
         eeb $$8 = this.a($$3, $$5);
         $$1.a($$2, $$8, 2);
         this.a($$1, $$2);
         $$1.b($$2, $$3, $$8);
      }

      if (!$$7 && $$6) {
         $$1.a(null, $$2, this.b.l(), aza.e);
         $$1.a($$0, ejb.e, $$2);
      } else if ($$7 && !$$6) {
         $$1.a(null, $$2, this.b.m(), aza.e);
         $$1.a($$0, ejb.a, $$2);
      }

      if ($$7) {
         $$1.a(new jb($$2), this, this.b());
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, boolean $$3) {
      if (!$$3 && this.h($$0) > 0) {
         this.a($$1, $$2);
      }
   }

   protected void a(dmu $$0, jb $$1) {
      $$0.a($$1, this);
      $$0.a($$1.e(), this);
   }

   @Override
   protected int a(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return this.h($$0);
   }

   @Override
   protected int b(eeb $$0, dly $$1, jb $$2, jh $$3) {
      return $$3 == jh.b ? this.h($$0) : 0;
   }

   @Override
   protected boolean f_(eeb $$0) {
      return true;
   }

   protected static int a(dmu $$0, fin $$1, Class<? extends bzm> $$2) {
      return $$0.a($$2, $$1, bzt.f.and($$0x -> !$$0x.n_())).size();
   }

   protected abstract int b(dmu var1, jb var2);

   protected abstract int h(eeb var1);

   protected abstract eeb a(eeb var1, int var2);
}
