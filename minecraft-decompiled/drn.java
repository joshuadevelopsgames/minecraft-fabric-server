import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drn extends dpl implements dxl {
   public static final MapCodec<drn> a = b(drn::new);
   public static final ees b = eer.I;
   private static final fjm c = dpz.a(6.0);

   @Override
   public MapCodec<drn> a() {
      return a;
   }

   public drn(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, true));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ebm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return a($$2, ebb.A, $$0.C ? ebm::a : ebm::b);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fjm a(eeb $$0, dly $$1, jb $$2, fix $$3) {
      return c;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, $$1.a(azu.a) && $$1.e() == 8);
   }

   @Override
   protected boolean a(eeb $$0, fba $$1) {
      return false;
   }
}
