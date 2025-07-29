import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvc extends dpz implements dxl {
   public static final MapCodec<dvc> a = b(dvc::new);
   public static final ees b = eer.I;

   @Override
   public MapCodec<dvc> a() {
      return a;
   }

   protected dvc(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false));
   }

   @Override
   protected boolean b(eeb $$0, eeb $$1, jh $$2) {
      return $$1.a(dqb.ag) && $$2.o() == jh.a.b;
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      fal $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == fam.c;
      return super.a($$0).b(b, $$2);
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, fam.c, fam.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected fal b_(eeb $$0) {
      return $$0.c(b) ? fam.c.a(false) : super.b_($$0);
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
