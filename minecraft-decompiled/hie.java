import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class hie {
   private static final int a = 0;
   private final hty b;
   private final Function<hie.a, ame> c;
   private final Function<hie.b, hrs> d;

   public hie(hty $$0, hrr $$1) {
      this.b = $$0;
      this.c = ag.b($$0x -> $$0x.b.a($$0x.a));
      this.d = ag.b($$1x -> $$1.a($$1x.a()));
   }

   public void a(htz.d $$0, amd<dlc> $$1, gof $$2, dcv $$3, fod $$4, gxn $$5, int $$6) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, null);
   }

   public void a(htz.d $$0, amd<dlc> $$1, gof $$2, dcv $$3, fod $$4, gxn $$5, int $$6, @Nullable ame $$7) {
      List<htz.c> $$8 = this.b.a($$1).a($$0);
      if (!$$8.isEmpty()) {
         int $$9 = dfi.a($$3, 0);
         boolean $$10 = $$3.C();

         for (htz.c $$11 : $$8) {
            int $$12 = a($$11, $$9);
            if ($$12 != 0) {
               ame $$13 = $$11.c() && $$7 != null ? $$7 : this.c.apply(new hie.a($$0, $$11));
               fog $$14 = hfd.a($$5, gxz.a($$13), $$10);
               $$2.a($$4, $$14, $$6, hri.d, $$12);
               $$10 = false;
            }
         }

         dlg $$15 = $$3.a(kq.W);
         if ($$15 != null) {
            hrs $$16 = this.d.apply(new hie.b($$15, $$0, $$1));
            fog $$17 = $$16.a($$5.getBuffer(gyi.a($$15.b().a().c())));
            $$2.a($$4, $$17, $$6, hri.d);
         }
      }
   }

   private static int a(htz.c $$0, int $$1) {
      Optional<htz.b> $$2 = $$0.b();
      if ($$2.isPresent()) {
         int $$3 = $$2.get().a().map(baj::f).orElse(0);
         return $$1 != 0 ? $$1 : $$3;
      } else {
         return -1;
      }
   }

   record a(htz.d a, htz.c b) {
   }

   record b(dlg a, htz.d b, amd<dlc> c) {
      public ame a() {
         return this.a.a(this.b.a(), this.c);
      }

      public dlg b() {
         return this.a;
      }

      public htz.d c() {
         return this.b;
      }

      public amd<dlc> d() {
         return this.c;
      }
   }
}
