import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drq extends dph {
   public static final MapCodec<drq> c = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drp.a.forGetter($$0x -> $$0x.d), t()).apply($$0, drq::new));
   private final dpz d;

   @Override
   public MapCodec<drq> a() {
      return c;
   }

   protected drq(dpz $$0, eea.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.d.m().b(b, false), 2);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4 == jh.a && !$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         this.a($$0, $$1, $$2, $$7, $$3);
         if ($$0.c(b)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
