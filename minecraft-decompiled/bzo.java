import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class bzo {
   private final Map<bzn, List<fis>> a;

   bzo(Map<bzn, List<fis>> $$0) {
      this.a = $$0;
   }

   public static bzo a(float $$0, float $$1) {
      return a().a($$0, $$1);
   }

   public static bzo.a a() {
      return new bzo.a();
   }

   public bzo a(float $$0, float $$1, float $$2) {
      return new bzo(ag.a(bzn.class, $$3 -> {
         List<fis> $$4 = new ArrayList<>();

         for (fis $$5 : this.a.get($$3)) {
            $$4.add($$5.d($$0, $$1, $$2));
         }

         return $$4;
      }));
   }

   @Nullable
   public fis a(bzn $$0, int $$1, float $$2) {
      List<fis> $$3 = this.a.get($$0);
      return $$1 >= 0 && $$1 < $$3.size() ? a($$3.get($$1), $$2) : null;
   }

   public fis b(bzn $$0, int $$1, float $$2) {
      fis $$3 = this.a($$0, $$1, $$2);
      if ($$3 == null) {
         throw new IllegalStateException("Had no attachment point of type: " + $$0 + " for index: " + $$1);
      } else {
         return $$3;
      }
   }

   public fis a(bzn $$0) {
      List<fis> $$1 = this.a.get($$0);
      if ($$1 != null && !$$1.isEmpty()) {
         fis $$2 = fis.c;

         for (fis $$3 : $$1) {
            $$2 = $$2.e($$3);
         }

         return $$2.c((double)(1.0F / $$1.size()));
      } else {
         throw new IllegalStateException("No attachment points of type: PASSENGER");
      }
   }

   public fis c(bzn $$0, int $$1, float $$2) {
      List<fis> $$3 = this.a.get($$0);
      if ($$3.isEmpty()) {
         throw new IllegalStateException("Had no attachment points of type: " + $$0);
      } else {
         fis $$4 = $$3.get(bcb.a($$1, 0, $$3.size() - 1));
         return a($$4, $$2);
      }
   }

   private static fis a(fis $$0, float $$1) {
      return $$0.b(-$$1 * (float) (Math.PI / 180.0));
   }

   public static class a {
      private final Map<bzn, List<fis>> a = new EnumMap<>(bzn.class);

      a() {
      }

      public bzo.a a(bzn $$0, float $$1, float $$2, float $$3) {
         return this.a($$0, new fis($$1, $$2, $$3));
      }

      public bzo.a a(bzn $$0, fis $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>(1)).add($$1);
         return this;
      }

      public bzo a(float $$0, float $$1) {
         Map<bzn, List<fis>> $$2 = ag.a(bzn.class, $$2x -> {
            List<fis> $$3 = this.a.get($$2x);
            return $$3 == null ? $$2x.a($$0, $$1) : List.copyOf($$3);
         });
         return new bzo($$2);
      }
   }
}
