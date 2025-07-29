import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.Sets.SetView;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ayv implements fku<fkx> {
   private final Set<fkx> a = new HashSet<>();
   private final Set<auc> b = new HashSet<>();
   private final Table<auc, fkx, fkx.c> c = HashBasedTable.create();

   public void a(fkx $$0) {
      this.a.add($$0);

      for (auc $$1 : this.b) {
         this.a($$1, $$0);
      }
   }

   public void b(fkx $$0) {
      if (this.a.contains($$0)) {
         Map<auc, fkx.c> $$1 = Tables.transpose(this.c).row($$0);
         SetView<auc> $$2 = Sets.difference(this.b, $$1.keySet());
         UnmodifiableIterator var4 = ImmutableSet.copyOf($$1.entrySet()).iterator();

         while (var4.hasNext()) {
            Entry<auc, fkx.c> $$3 = (Entry<auc, fkx.c>)var4.next();
            this.a($$3.getKey(), $$0, $$3.getValue());
         }

         var4 = $$2.iterator();

         while (var4.hasNext()) {
            auc $$4 = (auc)var4.next();
            this.a($$4, $$0);
         }
      }
   }

   public void c(fkx $$0) {
      this.c.column($$0).forEach(($$0x, $$1) -> $$1.d());
      Tables.transpose(this.c).row($$0).clear();
      this.a.remove($$0);
   }

   public void a(auc $$0) {
      this.b.add($$0);

      for (fkx $$1 : this.a) {
         this.a($$0, $$1);
      }

      if ($$0.ge()) {
         this.a((fkx)$$0);
      }
   }

   public void b(auc $$0) {
      Map<fkx, fkx.c> $$1 = this.c.row($$0);
      SetView<fkx> $$2 = Sets.difference(this.a, $$1.keySet());
      UnmodifiableIterator var4 = ImmutableSet.copyOf($$1.entrySet()).iterator();

      while (var4.hasNext()) {
         Entry<fkx, fkx.c> $$3 = (Entry<fkx, fkx.c>)var4.next();
         this.a($$0, $$3.getKey(), $$3.getValue());
      }

      var4 = $$2.iterator();

      while (var4.hasNext()) {
         fkx $$4 = (fkx)var4.next();
         this.a($$0, $$4);
      }
   }

   public void c(auc $$0) {
      this.c.row($$0).values().removeIf($$0x -> {
         $$0x.d();
         return true;
      });
      this.c((fkx)$$0);
      this.b.remove($$0);
   }

   public void a() {
      this.c.values().forEach(fkx.c::d);
      this.c.clear();
   }

   public void d(fkx $$0) {
      for (auc $$1 : this.b) {
         this.a($$1, $$0);
      }
   }

   public Set<fkx> b() {
      return this.a;
   }

   private static boolean d(auc $$0) {
      return $$0.y().q().aL().c(dmq.ae);
   }

   private void a(auc $$0, fkx $$1) {
      if ($$0 != $$1) {
         if (d($$0)) {
            $$1.f($$0).ifPresentOrElse($$2 -> {
               this.c.put($$0, $$1, $$2);
               $$2.c();
            }, () -> {
               fkx.c $$2 = (fkx.c)this.c.remove($$0, $$1);
               if ($$2 != null) {
                  $$2.d();
               }
            });
         }
      }
   }

   private void a(auc $$0, fkx $$1, fkx.c $$2) {
      if ($$0 != $$1) {
         if (d($$0)) {
            if (!$$2.b()) {
               $$2.e();
            } else {
               $$1.f($$0).ifPresentOrElse($$2x -> {
                  $$2x.c();
                  this.c.put($$0, $$1, $$2x);
               }, () -> {
                  $$2.d();
                  this.c.remove($$0, $$1);
               });
            }
         }
      }
   }
}
