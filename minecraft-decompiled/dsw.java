import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dsw extends dub {
   public static final eez<eem> c = eer.X;

   protected dsw(eea.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dsw> a();

   @Override
   protected boolean a(eeb $$0, dmx $$1, jb $$2) {
      return b($$1, $$2, n($$0).g());
   }

   public static boolean b(dmx $$0, jb $$1, jh $$2) {
      jb $$3 = $$1.a($$2);
      return $$0.a_($$3).c($$0, $$3, $$2.g());
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      for (jh $$1 : $$0.f()) {
         eeb $$2;
         if ($$1.o() == jh.a.b) {
            $$2 = this.m().b(c, $$1 == jh.b ? eem.c : eem.a).b(f, $$0.g());
         } else {
            $$2 = this.m().b(c, eem.b).b(f, $$1.g());
         }

         if ($$2.a((dmx)$$0.q(), $$0.a())) {
            return $$2;
         }
      }

      return null;
   }

   @Override
   protected eeb a(eeb $$0, dmx $$1, dnj $$2, jb $$3, jh $$4, jb $$5, eeb $$6, bck $$7) {
      return n($$0).g() == $$4 && !$$0.a($$1, $$3) ? dqb.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   protected static jh n(eeb $$0) {
      switch ((eem)$$0.c(c)) {
         case c:
            return jh.a;
         case a:
            return jh.b;
         default:
            return $$0.c(f);
      }
   }
}
