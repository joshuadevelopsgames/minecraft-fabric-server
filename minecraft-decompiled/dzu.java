import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dzu extends dza implements dxl {
   public static final MapCodec<dzu> a = b(dzu::new);
   public static final ees c = eer.I;

   @Override
   protected MapCodec<? extends dzu> a() {
      return a;
   }

   protected dzu(eea.d $$0) {
      super($$0);
      this.l(this.m().b(c, false));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return super.a($$0).b(c, $$1.b(fam.c));
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(c) ? fam.c.a(true) : super.b_($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(c);
   }
}
