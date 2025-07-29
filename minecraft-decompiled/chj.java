import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class chj {
   private static final ciw a = new ciw(Integer.MAX_VALUE, new chi() {
      @Override
      public boolean b() {
         return false;
      }
   }) {
      @Override
      public boolean h() {
         return false;
      }
   };
   private final Map<chi.a, ciw> b = new EnumMap<>(chi.a.class);
   private final Set<ciw> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<chi.a> d = EnumSet.noneOf(chi.a.class);

   public void a(int $$0, chi $$1) {
      this.c.add(new ciw($$0, $$1));
   }

   public void a(Predicate<chi> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(chi $$0) {
      for (ciw $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(ciw $$0, EnumSet<chi.a> $$1) {
      for (chi.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(ciw $$0, Map<chi.a, ciw> $$1) {
      for (chi.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      btt $$0 = bts.a();
      $$0.a("goalCleanup");

      for (ciw $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((ciw)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (ciw $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (chi.a $$3 : $$2.j()) {
               ciw $$4 = this.b.getOrDefault($$3, a);
               $$4.e();
               this.b.put($$3, $$2);
            }

            $$2.d();
         }
      }

      $$0.c();
      this.a(true);
   }

   public void a(boolean $$0) {
      btt $$1 = bts.a();
      $$1.a("goalTick");

      for (ciw $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.X_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<ciw> b() {
      return this.c;
   }

   public void a(chi.a $$0) {
      this.d.add($$0);
   }

   public void b(chi.a $$0) {
      this.d.remove($$0);
   }

   public void a(chi.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
