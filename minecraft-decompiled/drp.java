import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class drp extends dpz {
   public static final MapCodec<dpz> a = mm.e.q().fieldOf("dead");
   public static final MapCodec<drp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(a.forGetter($$0x -> $$0x.c), t()).apply($$0, drp::new));
   private final dpz c;

   public drp(dpz $$0, eea.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   public MapCodec<drp> a() {
      return b;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if (!this.a($$1, $$2)) {
         $$1.a($$2, this.c.m(), 2);
      }
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if (!this.a($$1, $$3)) {
         $$2.a($$3, this, 60 + $$7.a(40));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected boolean a(dly $$0, jb $$1) {
      for (jh $$2 : jh.values()) {
         fal $$3 = $$0.b_($$1.a($$2));
         if ($$3.a(azu.a)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      if (!this.a($$0.q(), $$0.a())) {
         $$0.q().a($$0.a(), this, 60 + $$0.q().H_().a(40));
      }

      return this.m();
   }
}
