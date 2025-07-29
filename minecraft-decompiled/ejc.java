import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ejc {
   private final aub a;

   public ejc(aub $$0) {
      this.a = $$0;
   }

   public void a(jl<ejb> $$0, fis $$1, ejb.a $$2) {
      int $$3 = $$0.a().a();
      jb $$4 = jb.a((jv)$$1);
      int $$5 = ke.a($$4.u() - $$3);
      int $$6 = ke.a($$4.v() - $$3);
      int $$7 = ke.a($$4.w() - $$3);
      int $$8 = ke.a($$4.u() + $$3);
      int $$9 = ke.a($$4.v() + $$3);
      int $$10 = ke.a($$4.w() + $$3);
      List<ejb.b> $$11 = new ArrayList<>();
      eje.a $$12 = ($$4x, $$5x) -> {
         if ($$4x.c() == ejd.a.b) {
            $$11.add(new ejb.b($$0, $$1, $$2, $$4x, $$5x));
         } else {
            $$4x.a(this.a, $$0, $$2, $$1);
         }
      };
      boolean $$13 = false;

      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$7; $$15 <= $$10; $$15++) {
            efy $$16 = this.a.n().a($$14, $$15);
            if ($$16 != null) {
               for (int $$17 = $$6; $$17 <= $$9; $$17++) {
                  $$13 |= $$16.a($$17).a($$0, $$1, $$2, $$12);
               }
            }
         }
      }

      if (!$$11.isEmpty()) {
         this.a($$11);
      }

      if ($$13) {
         ahj.a(this.a, $$0, $$1);
      }
   }

   private void a(List<ejb.b> $$0) {
      Collections.sort($$0);

      for (ejb.b $$1 : $$0) {
         ejd $$2 = $$1.d();
         $$2.a(this.a, $$1.a(), $$1.c(), $$1.b());
      }
   }
}
