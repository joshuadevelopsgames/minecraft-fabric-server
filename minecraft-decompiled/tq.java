import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

public class tq implements te.c {
   private static final int c = 5;
   private static final int d = 6;
   private final int e;
   private int f;
   private fin g;
   private final jb.a h;
   private final jb i;
   private final boolean j;
   private float k = -1.0F;
   private final Collection<sz> l = new ArrayList<>();

   public tq(jb $$0, int $$1, boolean $$2) {
      this.e = $$1;
      this.h = $$0.k();
      this.g = new fin(this.h);
      this.i = $$0;
      this.j = $$2;
   }

   @Override
   public void a(aub $$0) {
      if (this.j) {
         this.l.forEach($$1 -> {
            euq $$2 = $$1.f().d();
            tr.a($$2, $$0);
         });
         this.l.clear();
         this.g = new fin(this.i);
         this.h.g(this.i);
      }
   }

   @Override
   public Optional<sz> spawnStructure(sz $$0) {
      jb $$1 = new jb(this.h);
      $$0.a($$1);
      sz $$2 = $$0.o();
      if ($$2 == null) {
         return Optional.empty();
      } else {
         $$2.a(1);
         fin $$3 = $$0.f().f();
         this.g = this.g.b($$3);
         this.h.e((int)$$3.b() + 5, 0, 0);
         if (this.h.u() > this.k) {
            this.k = this.h.u();
         }

         if (++this.f >= this.e) {
            this.f = 0;
            this.h.e(0, 0, (int)this.g.d() + 6);
            this.h.p(this.i.u());
            this.g = new fin(this.h);
         }

         this.l.add($$0);
         return Optional.of($$0);
      }
   }
}
