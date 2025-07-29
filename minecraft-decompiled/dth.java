import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;

public class dth extends dpz {
   public static final MapCodec<dth> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(mm.e.q().fieldOf("potted").forGetter($$0x -> $$0x.d), t()).apply($$0, dth::new)
   );
   private static final Map<dpz, dpz> b = Maps.newHashMap();
   private static final fjm c = dpz.b(6.0, 0.0, 6.0);
   private final dpz d;

   @Override
   public MapCodec<dth> a() {
      return a;
   }

   public dth(dpz $$0, eea.d $$1) {
      super($$1);
      this.d = $$0;
      b.put($$0, this);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Override
   protected bxj a(dcv $$0, eeb $$1, dmu $$2, jb $$3, cut $$4, bxi $$5, fio $$6) {
      eeb $$8 = ($$0.h() instanceof dbd $$7 ? b.getOrDefault($$7.c(), dqb.a) : dqb.a).m();
      if ($$8.l()) {
         return bxj.f;
      } else if (!this.q()) {
         return bxj.c;
      } else {
         $$2.a($$3, $$8, 3);
         $$2.a($$4, ejb.c, $$3);
         $$4.a(azj.ai);
         $$0.a(1, $$4);
         return bxj.a;
      }
   }

   @Override
   protected bxj a(eeb $$0, dmu $$1, jb $$2, cut $$3, fio $$4) {
      if (this.q()) {
         return bxj.c;
      } else {
         dcv $$5 = new dcv(this.d);
         if (!$$3.h($$5)) {
            $$3.a($$5, false);
         }

         $$1.a($$2, dqb.gq.m(), 3);
         $$1.a($$3, ejb.c, $$2);
         return bxj.a;
      }
   }

   @Override
   protected dcv a(dmx $$0, jb $$1, eeb $$2, boolean $$3) {
      return this.q() ? super.a($$0, $$1, $$2, $$3) : new dcv(this.d);
   }

   private boolean q() {
      return this.d == dqb.a;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return $$4 == jh.a && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public dpz b() {
      return this.d;
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }

   @Override
   protected boolean f(eeb $$0) {
      return $$0.a(dqb.uk) || $$0.a(dqb.ul);
   }

   @Override
   protected void b(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (this.f($$0) && $$1.G_().j()) {
         boolean $$4 = this.d == dqb.ui;
         boolean $$5 = drv.a($$1);
         if ($$4 != $$5) {
            $$1.a($$2, this.o($$0), 3);
            dsv.a $$6 = dsv.a.a($$4).c();
            $$6.a($$1, $$2, $$3);
            $$1.a(null, $$2, $$6.e(), aza.e, 1.0F, 1.0F);
         }
      }

      super.b($$0, $$1, $$2, $$3);
   }

   public eeb o(eeb $$0) {
      if ($$0.a(dqb.uk)) {
         return dqb.ul.m();
      } else {
         return $$0.a(dqb.ul) ? dqb.uk.m() : $$0;
      }
   }
}
