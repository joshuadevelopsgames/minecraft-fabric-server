import com.google.common.collect.Sets;
import java.util.Set;
import java.util.function.ToIntFunction;

class byy extends byo {
   private final ToIntFunction<bck> c;

   protected byy(byp $$0, int $$1, ToIntFunction<bck> $$2) {
      super($$0, $$1, me.Y);
      this.c = $$2;
   }

   @Override
   public void a(aub $$0, cam $$1, int $$2, bzm.e $$3) {
      if ($$3 == bzm.e.a && ($$1 instanceof cut || $$0.P().c(dmq.d))) {
         this.a($$0, $$1.ec(), $$1.dx());
      }
   }

   private void a(aub $$0, bck $$1, jb $$2) {
      Set<jb> $$3 = Sets.newHashSet();
      int $$4 = this.c.applyAsInt($$1);

      for (jb $$5 : jb.a($$1, 15, $$2, 1)) {
         jb $$6 = $$5.e();
         if (!$$3.contains($$5) && $$0.a_($$5).v() && $$0.a_($$6).c($$0, $$6, jh.b)) {
            $$3.add($$5.j());
            if ($$3.size() >= $$4) {
               break;
            }
         }
      }

      for (jb $$7 : $$3) {
         $$0.a($$7, dqb.bz.m(), 3);
         $$0.c(3018, $$7, 0);
      }
   }
}
