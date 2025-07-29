import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class duo extends dos {
   public static final MapCodec<duo> d = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dnx.c.d.fieldOf("precipitation").forGetter($$0x -> $$0x.R), ki.b.fieldOf("interactions").forGetter($$0x -> $$0x.c), t())
         .apply($$0, duo::new)
   );
   public static final int e = 1;
   public static final int f = 3;
   public static final efb g = eer.aN;
   private static final int h = 6;
   private static final double i = 3.0;
   private static final fjm[] D = ag.a(() -> dpz.a(2, $$0 -> fjj.a(dos.b, dpz.b(12.0, 4.0, b($$0 + 1)))));
   private final dnx.c R;

   @Override
   public MapCodec<duo> a() {
      return d;
   }

   public duo(dnx.c $$0, ki.a $$1, eea.d $$2) {
      super($$2, $$1);
      this.R = $$0;
      this.l(this.C.b().b(g, 1));
   }

   @Override
   public boolean d(eeb $$0) {
      return $$0.c(g) == 3;
   }

   @Override
   protected boolean a(fak $$0) {
      return $$0 == fam.c && this.R == dnx.c.b;
   }

   @Override
   protected double b(eeb $$0) {
      return b($$0.c(g)) / 16.0;
   }

   private static double b(int $$0) {
      return 6.0 + $$0 * 3.0;
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, bzm $$3) {
      return D[$$0.c(g) - 1];
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, bzm $$3, cae $$4) {
      if ($$1 instanceof aub $$5) {
         jb $$6 = $$2.j();
         $$4.a(caf.d, $$4x -> {
            if ($$4x.cb() && $$4x.c($$5, $$6)) {
               this.e($$0, $$1, $$6);
            }
         });
      }

      $$4.a(caf.d);
   }

   private void e(eeb $$0, dmu $$1, jb $$2) {
      if (this.R == dnx.c.c) {
         d(dqb.fT.m().b(g, $$0.c(g)), $$1, $$2);
      } else {
         d($$0, $$1, $$2);
      }
   }

   public static void d(eeb $$0, dmu $$1, jb $$2) {
      int $$3 = $$0.c(g) - 1;
      eeb $$4 = $$3 == 0 ? dqb.fS.m() : $$0.b(g, $$3);
      $$1.c($$2, $$4);
      $$1.a(ejb.c, $$2, ejb.a.a($$4));
   }

   @Override
   public void a(eeb $$0, dmu $$1, jb $$2, dnx.c $$3) {
      if (dqw.a($$1, $$3) && $$0.c(g) != 3 && $$3 == this.R) {
         eeb $$4 = $$0.a(g);
         $$1.c($$2, $$4);
         $$1.a(ejb.c, $$2, ejb.a.a($$4));
      }
   }

   @Override
   protected int a(eeb $$0, dmu $$1, jb $$2) {
      return $$0.c(g);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(g);
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, fak $$3) {
      if (!this.d($$0)) {
         eeb $$4 = $$0.b(g, $$0.c(g) + 1);
         $$1.c($$2, $$4);
         $$1.a(ejb.c, $$2, ejb.a.a($$4));
         $$1.c(1047, $$2, 0);
      }
   }
}
