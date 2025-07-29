import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class exv extends euy {
   public static final MapCodec<exv> d = a(exv::new);

   public exv(euy.c $$0) {
      super($$0);
   }

   @Override
   public Optional<euy.b> a(euy.a $$0) {
      dwu $$1 = dwu.a($$0.f());
      jb $$2 = this.a($$0, $$1);
      return $$2.v() < 60 ? Optional.empty() : Optional.of(new euy.b($$2, (Consumer<evq>)($$3 -> this.a($$3, $$0, $$2, $$1))));
   }

   private void a(evq $$0, euy.a $$1, jb $$2, dwu $$3) {
      List<exu.i> $$4 = Lists.newLinkedList();
      exu.a($$1.e(), $$2, $$3, $$4, $$1.f());
      $$4.forEach($$0::a);
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, evn $$6) {
      jb.a $$7 = new jb.a();
      int $$8 = $$0.L_();
      euq $$9 = $$6.b();
      int $$10 = $$9.i();

      for (int $$11 = $$4.h(); $$11 <= $$4.k(); $$11++) {
         for (int $$12 = $$4.j(); $$12 <= $$4.m(); $$12++) {
            $$7.d($$11, $$10, $$12);
            if (!$$0.w($$7) && $$9.b($$7) && $$6.a($$7)) {
               for (int $$13 = $$10 - 1; $$13 > $$8; $$13--) {
                  $$7.q($$13);
                  if (!$$0.w($$7) && !$$0.a_($$7).n()) {
                     break;
                  }

                  $$0.a($$7, dqb.m.m(), 2);
               }
            }
         }
      }
   }

   @Override
   public evh<?> e() {
      return evh.p;
   }
}
