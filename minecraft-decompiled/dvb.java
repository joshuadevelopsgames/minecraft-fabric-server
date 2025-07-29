import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class dvb extends dww implements dxl {
   public static final MapCodec<dvb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(edp.a.fieldOf("tree").forGetter($$0x -> $$0x.g), t()).apply($$0, dvb::new)
   );
   public static final efb b = eer.aw;
   public static final int c = 4;
   private static final int[] h = new int[]{13, 10, 7, 3, 0};
   private static final fjm[] i = dpz.a(4, $$0 -> dpz.b(2.0, h[$$0], 16.0));
   private static final ees D = eer.I;
   public static final ees d = eer.m;

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   public dvb(edp $$0, eea.d $$1) {
      super($$0, $$1);
      this.l(this.C.b().b(f, 0).b(b, 0).b(D, false).b(d, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(f).a(b).a(D).a(d);
   }

   @Override
   protected boolean b(eeb $$0, dly $$1, jb $$2) {
      return super.b($$0, $$1, $$2) || $$0.a(dqb.ei);
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      return super.a($$0).b(D, $$2).b(b, 4);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      int $$4 = $$0.c(d) ? $$0.c(b) : 4;
      return i[$$4].a($$0.a($$2));
   }

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return o($$0) ? $$1.a_($$2.d()).a(dqb.aS) : super.a($$0, $$1, $$2);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(D)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return $$4 == jh.b && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(D) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!o($$0)) {
         if ($$3.a(7) == 0) {
            this.a($$1, $$2, $$0, $$3);
         }
      } else {
         if (!q($$0)) {
            $$1.a($$2, $$0.a(b), 2);
         }
      }
   }

   @Override
   public boolean a(dmx $$0, jb $$1, eeb $$2) {
      return !o($$2) || !q($$2);
   }

   @Override
   public boolean a(dmu $$0, bck $$1, jb $$2, eeb $$3) {
      return o($$3) ? !q($$3) : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(aub $$0, bck $$1, jb $$2, eeb $$3) {
      if (o($$3) && !q($$3)) {
         $$0.a($$2, $$3.a(b), 2);
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   private static boolean o(eeb $$0) {
      return $$0.c(d);
   }

   private static boolean q(eeb $$0) {
      return $$0.c(b) == 4;
   }

   public static eeb c() {
      return b(0);
   }

   public static eeb b(int $$0) {
      return dqb.H.m().b(d, true).b(b, $$0);
   }
}
