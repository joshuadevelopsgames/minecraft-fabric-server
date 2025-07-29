import com.mojang.serialization.Codec;

public record dgc(dcv c) {
   public static final Codec<dgc> a = dcv.b.xmap(dgc::new, dgc::a);
   public static final zm<wx, dgc> b = zm.a(dcv.j, dgc::a, dgc::new);

   public dcv a(dcv $$0, int $$1, boolean $$2, dgc.a $$3) {
      if ($$2) {
         return $$0;
      } else if ($$0.M() >= $$1) {
         return $$0;
      } else {
         dcv $$4 = this.c.v();
         if ($$0.f()) {
            return $$4;
         } else {
            $$3.apply($$4);
            return $$0;
         }
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         dgc $$1 = (dgc)$$0;
         return dcv.a(this.c, $$1.c);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return dcv.b(this.c);
   }

   public dcv a() {
      return this.c;
   }

   @FunctionalInterface
   public interface a {
      void apply(dcv var1);
   }
}
