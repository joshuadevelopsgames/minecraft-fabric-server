import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import java.util.function.Function;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class emf extends emd {
   public emf(Codec<emc> $$0) {
      super($$0);
      this.h = ImmutableSet.of(fam.e, fam.c);
   }

   @Override
   protected int a() {
      return 10;
   }

   @Override
   protected float a(bck $$0) {
      return ($$0.i() * 2.0F + $$0.i()) * 2.0F;
   }

   @Override
   protected double b() {
      return 5.0;
   }

   protected boolean a(emb $$0, emc $$1, efy $$2, Function<jb, jl<dnx>> $$3, efx $$4, jb.a $$5, jb.a $$6, ejm $$7, MutableBoolean $$8) {
      if (this.a($$1, $$2.a_($$5))) {
         eeb $$9;
         if ($$5.v() <= $$0.a() + 31) {
            $$9 = g.g();
         } else {
            $$9 = e;
         }

         $$2.a($$5, $$9);
         return true;
      } else {
         return false;
      }
   }
}
