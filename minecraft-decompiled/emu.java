import com.mojang.serialization.Codec;
import java.util.Optional;

public abstract class emu extends enh<ept> {
   public emu(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      bck $$1 = $$0.d();
      dnt $$2 = $$0.b();
      jb $$3 = $$0.e();
      Optional<dpz> $$4 = mm.e.a(azo.ay, $$1).map(jl::a);
      return $$4.isEmpty() ? false : this.a($$2, $$1, $$3, $$4.get().m());
   }

   protected abstract boolean a(dmv var1, bck var2, jb var3, eeb var4);

   protected boolean b(dmv $$0, bck $$1, jb $$2, eeb $$3) {
      jb $$4 = $$2.d();
      eeb $$5 = $$0.a_($$2);
      if (($$5.a(dqb.J) || $$5.a(azo.aB)) && $$0.a_($$4).a(dqb.J)) {
         $$0.a($$2, $$3, 3);
         if ($$1.i() < 0.25F) {
            mm.e.a(azo.aB, $$1).map(jl::a).ifPresent($$2x -> $$0.a($$4, $$2x.m(), 2));
         } else if ($$1.i() < 0.05F) {
            $$0.a($$4, dqb.nC.m().b(dxf.c, $$1.a(4) + 1), 2);
         }

         for (jh $$6 : jh.c.a) {
            if ($$1.i() < 0.2F) {
               jb $$7 = $$2.a($$6);
               if ($$0.a_($$7).a(dqb.J)) {
                  mm.e.a(azo.az, $$1).map(jl::a).ifPresent($$3x -> {
                     eeb $$4x = $$3x.m();
                     if ($$4x.b(dpk.d)) {
                        $$4x = $$4x.b(dpk.d, $$6);
                     }

                     $$0.a($$7, $$4x, 2);
                  });
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
