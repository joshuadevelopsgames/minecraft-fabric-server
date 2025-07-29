import java.util.List;
import java.util.Optional;

public interface dqc {
   boolean a(dmx var1, jb var2, eeb var3);

   boolean a(dmu var1, bck var2, jb var3, eeb var4);

   void a(aub var1, bck var2, jb var3, eeb var4);

   static boolean a_(dmx $$0, jb $$1, eeb $$2) {
      return a(jh.c.a.a().toList(), $$0, $$1, $$2).isPresent();
   }

   static Optional<jb> a(dmu $$0, jb $$1, eeb $$2) {
      return a(jh.c.a.c($$0.A), $$0, $$1, $$2);
   }

   private static Optional<jb> a(List<jh> $$0, dmx $$1, jb $$2, eeb $$3) {
      for (jh $$4 : $$0) {
         jb $$5 = $$2.a($$4);
         if ($$1.w($$5) && $$3.a($$1, $$5)) {
            return Optional.of($$5);
         }
      }

      return Optional.empty();
   }

   default jb a(jb $$0) {
      return switch (this.aq_()) {
         case a -> $$0.d();
         case b -> $$0;
      };
   }

   default dqc.a aq_() {
      return dqc.a.b;
   }

   public static enum a {
      a,
      b;
   }
}
