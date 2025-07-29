import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import org.joml.Vector3f;

public class fuu {
   private final fus a;
   private final List<fuu.a> b;
   private final Vector3f c = new Vector3f();

   private fuu(fus $$0, List<fuu.a> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   static fuu a(gqn $$0, fus $$1) {
      List<fuu.a> $$2 = new ArrayList<>();
      Function<String, gqn> $$3 = $$0.f();

      for (Entry<String, List<fur>> $$4 : $$1.c().entrySet()) {
         String $$5 = $$4.getKey();
         List<fur> $$6 = $$4.getValue();
         gqn $$7 = $$3.apply($$5);
         if ($$7 == null) {
            throw new IllegalArgumentException("Cannot animate " + $$5 + ", which does not exist in model");
         }

         for (fur $$8 : $$6) {
            $$2.add(new fuu.a($$7, $$8.a(), $$8.b()));
         }
      }

      return new fuu($$1, List.copyOf($$2));
   }

   public void a() {
      this.a(0L, 1.0F);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      long $$4 = (long)($$0 * 50.0F * $$2);
      float $$5 = Math.min($$1 * $$3, 1.0F);
      this.a($$4, $$5);
   }

   public void a(bzd $$0, float $$1) {
      this.a($$0, $$1, 1.0F);
   }

   public void a(bzd $$0, float $$1, float $$2) {
      $$0.a($$2x -> this.a((long)((float)$$2x.a($$1) * $$2), 1.0F));
   }

   public void a(long $$0, float $$1) {
      float $$2 = this.a($$0);

      for (fuu.a $$3 : this.b) {
         $$3.a($$2, $$1, this.c);
      }
   }

   private float a(long $$0) {
      float $$1 = (float)$$0 / 1000.0F;
      return this.a.b() ? $$1 % this.a.a() : $$1;
   }

   record a(gqn a, fur.c b, fut[] c) {
      public void a(float $$0, float $$1, Vector3f $$2) {
         int $$3 = Math.max(0, bcb.a(0, this.c.length, $$1x -> $$0 <= this.c[$$1x].a()) - 1);
         int $$4 = Math.min(this.c.length - 1, $$3 + 1);
         fut $$5 = this.c[$$3];
         fut $$6 = this.c[$$4];
         float $$7 = $$0 - $$5.a();
         float $$8;
         if ($$4 != $$3) {
            $$8 = bcb.a($$7 / ($$6.a() - $$5.a()), 0.0F, 1.0F);
         } else {
            $$8 = 0.0F;
         }

         $$6.c().apply($$2, $$8, this.c, $$3, $$4, $$1);
         this.b.apply(this.a, $$2);
      }
   }
}
