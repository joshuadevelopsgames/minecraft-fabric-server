import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class drs extends dpk {
   public static final MapCodec<drs> e = RecordCodecBuilder.mapCodec($$0 -> $$0.group(drp.a.forGetter($$0x -> $$0x.f), t()).apply($$0, drs::new));
   private final dpz f;

   @Override
   public MapCodec<drs> a() {
      return e;
   }

   protected drs(dpz $$0, eea.d $$1) {
      super($$1);
      this.f = $$0;
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, eeb $$3, boolean $$4) {
      this.a($$0, $$1, $$1, $$1.A, $$2);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!d($$0, $$1, $$2)) {
         $$1.a($$2, this.f.m().b(b, false).b(d, $$0.c(d)), 2);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$4.g() == $$0.c(d) && !$$0.a($$1, $$3)) {
         return dqb.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, fam.c, fam.c.a($$1));
         }

         this.a($$0, $$1, $$2, $$7, $$3);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
