import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtj extends dud {
   public static final MapCodec<dtj> a = b(dtj::new);
   public static final int b = 3;
   public static final efb c = eer.av;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dtj> a() {
      return a;
   }

   public dtj(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 0));
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      $$1.a($$2, this, bcb.a($$1.H_(), 60, 120));
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.C($$2) > 11 - $$0.c(c) - $$0.g() && this.e($$0, $$1, $$2)) {
         jb.a $$4 = new jb.a();

         for (jh $$5 : jh.values()) {
            $$4.a($$2, $$5);
            eeb $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, bcb.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, bcb.a($$3, 20, 40));
      }
   }

   private boolean e(eeb $$0, dmu $$1, jb $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.b(c, $$3 + 1), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if ($$3.m().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(dly $$0, jb $$1, int $$2) {
      int $$3 = 0;
      jb.a $$4 = new jb.a();

      for (jh $$5 : jh.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return dcv.l;
   }
}
