import com.mojang.serialization.Codec;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class eng extends enh<epl> {
   private static final int a = 1;
   private static final int b = 2;
   private static final int c = 5;
   private static final int d = 2;
   private static final int ap = 2;
   private static final int aq = 19;

   public eng(Codec<epl> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<epl> $$0) {
      this.a($$0.f(), $$0.e(), $$0.b(), $$0.d());
      return true;
   }

   private void a(epl $$0, jb $$1, dnt $$2, bck $$3) {
      this.a($$0, $$2, $$3, $$1.k());
      jh $$4 = jh.c.a.a($$3);
      int $$5 = $$0.c.a($$3) - 2;
      jb.a $$6 = $$1.a($$4, 2 + $$3.a(2)).k();
      this.a($$2, $$6);
      if (this.a($$2, $$5, $$6, $$4)) {
         this.a($$0, $$2, $$3, $$5, $$6, $$4);
      }
   }

   private void a(dnt $$0, jb.a $$1) {
      $$1.c(jh.b, 1);

      for (int $$2 = 0; $$2 < 6; $$2++) {
         if (this.a((dmv)$$0, (jb)$$1)) {
            return;
         }

         $$1.c(jh.a);
      }
   }

   private void a(epl $$0, dnt $$1, bck $$2, jb.a $$3) {
      jb $$4 = this.a($$0, $$1, $$2, $$3, Function.identity());
      this.a($$1, $$2, Set.of($$4), $$0.d);
   }

   private boolean a(dnt $$0, int $$1, jb.a $$2, jh $$3) {
      int $$4 = 0;

      for (int $$5 = 0; $$5 < $$1; $$5++) {
         if (!eot.d($$0, $$2)) {
            return false;
         }

         if (!this.b($$0, $$2)) {
            if (++$$4 > 2) {
               return false;
            }
         } else {
            $$4 = 0;
         }

         $$2.c($$3);
      }

      $$2.c($$3.g(), $$1);
      return true;
   }

   private void a(epl $$0, dnt $$1, bck $$2, int $$3, jb.a $$4, jh $$5) {
      Set<jb> $$6 = new HashSet<>();

      for (int $$7 = 0; $$7 < $$3; $$7++) {
         $$6.add(this.a($$0, $$1, $$2, $$4, a($$5)));
         $$4.c($$5);
      }

      this.a($$1, $$2, $$6, $$0.e);
   }

   private boolean a(dmv $$0, jb $$1) {
      return eot.d($$0, $$1) && this.b($$0, $$1);
   }

   private boolean b(dmv $$0, jb $$1) {
      return $$0.a_($$1.e()).c($$0, $$1, jh.b);
   }

   private jb a(epl $$0, dnt $$1, bck $$2, jb.a $$3, Function<eeb, eeb> $$4) {
      $$1.a($$3, $$4.apply($$0.b.a($$2, $$3)), 3);
      this.a($$1, (jb)$$3);
      return $$3.j();
   }

   private void a(dnt $$0, bck $$1, Set<jb> $$2, List<esi> $$3) {
      if (!$$3.isEmpty()) {
         esi.a $$4 = new esi.a($$0, this.a($$0), $$1, $$2, Set.of(), Set.of());
         $$3.forEach($$1x -> $$1x.a($$4));
      }
   }

   private BiConsumer<jb, eeb> a(dnt $$0) {
      return ($$1, $$2) -> $$0.a($$1, $$2, 19);
   }

   private static Function<eeb, eeb> a(jh $$0) {
      return $$1 -> $$1.c(dwt.d, $$0.o());
   }
}
