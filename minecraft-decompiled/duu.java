import com.mojang.serialization.MapCodec;
import java.util.function.ToIntFunction;

public class duu extends dpz implements dxl {
   public static final MapCodec<duu> a = b(duu::new);
   public static final int b = 15;
   public static final efb c = eer.aS;
   public static final ees d = eer.I;
   public static final ToIntFunction<eeb> e = $$0 -> $$0.c(c);

   @Override
   public MapCodec<duu> a() {
      return a;
   }

   public duu(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, 15).b(d, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (!$$1.C && $$3.gQ()) {
         $$1.a($$2, $$0.a(c), 2);
         return bxj.b;
      } else {
         return bxj.c;
      }
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return $$3.a(dcz.ig) ? fjj.b() : fjj.a();
   }

   @Override
   protected boolean e_(eeb $$0) {
      return $$0.y().c();
   }

   @Override
   protected dwn a_(eeb $$0) {
      return dwn.a;
   }

   @Override
   protected float c(eeb $$0, dly $$1, jb $$2) {
      return 1.0F;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(d) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return a(super.a($$0, $$1, $$2, $$3), $$2.c(c));
   }

   public static dcv a(dcv $$0, int $$1) {
      $$0.b(kq.aq, dev.a.a(c, $$1));
      return $$0;
   }
}
