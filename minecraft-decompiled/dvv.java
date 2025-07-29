import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dvv extends dsi implements dqc {
   public static final MapCodec<dvv> c = b(dvv::new);
   public static final int d = 4;
   public static final efb e = eer.aw;
   public static final eez<eex> f = dsi.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fjm i = dpz.b(6.0, -1.0, 3.0);
   private static final fjm D = dpz.b(10.0, -1.0, 5.0);
   private final Function<eeb, fjm> R = this.b();

   @Override
   public MapCodec<dvv> a() {
      return c;
   }

   public dvv(eea.d $$0) {
      super($$0);
   }

   private Function<eeb, fjm> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((eex)$$1.c(f)) {
            case b -> dpz.b($$3, -1.0, Math.min(16, -1 + $$2));
            case a -> dpz.b($$3, 0.0, Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return this.m();
   }

   @Override
   public fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return this.R.apply($$0);
   }

   @Override
   public fjm b(eeb $$0, dly $$1, jb $$2, fix $$3) {
      if ($$0.c(f) == eex.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return fjj.a();
      }
   }

   @Override
   public eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dqb.a.m();
      }
   }

   @Override
   public boolean a(eeb $$0, dmx $$1, jb $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return $$0.a(dqb.cN);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$1 instanceof aub $$5 && $$3 instanceof csa && $$5.P().c(dmq.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(eeb $$0, dgo $$1) {
      return false;
   }

   @Override
   public void a(dmu $$0, jb $$1, eeb $$2, cam $$3, dcv $$4) {
   }

   @Override
   public boolean f(eeb $$0) {
      return $$0.c(f) == eex.b && !this.q($$0);
   }

   @Override
   public void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      float $$4 = drw.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(aub $$0, eeb $$1, jb $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         eeb $$5 = $$1.b(e, $$4);
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, eex.a), 3);
         }
      }
   }

   private static boolean a(dmx $$0, jb $$1) {
      eeb $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dqb.lh);
   }

   private static boolean b(dmx $$0, jb $$1) {
      return drw.a($$0, $$1);
   }

   private static boolean o(eeb $$0) {
      return $$0.a(dqb.lh) && $$0.c(f) == eex.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dmx $$0, jb $$1, eeb $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(eeb $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dvv.a c(dmx $$0, jb $$1, eeb $$2) {
      if (o($$2)) {
         return new dvv.a($$1, $$2);
      } else {
         jb $$3 = $$1.e();
         eeb $$4 = $$0.a_($$3);
         return o($$4) ? new dvv.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      dvv.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return true;
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      dvv.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   record a(jb a, eeb b) {
   }
}
