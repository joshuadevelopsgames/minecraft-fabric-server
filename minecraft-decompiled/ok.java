import javax.annotation.Nullable;

public interface ok {
   ame a = ame.b("recipes/root");

   ok a(String var1, ar<?> var2);

   ok a(@Nullable String var1);

   dcr a();

   void a(om var1, amd<dhm<?>> var2);

   default void a(om $$0) {
      this.a($$0, amd.a(mn.bA, a(this.a())));
   }

   default void a(om $$0, String $$1) {
      ame $$2 = a(this.a());
      ame $$3 = ame.a($$1);
      if ($$3.equals($$2)) {
         throw new IllegalStateException("Recipe " + $$1 + " should remove its 'save' argument as it is equal to default one");
      } else {
         this.a($$0, amd.a(mn.bA, $$3));
      }
   }

   static ame a(dmt $$0) {
      return mm.g.b($$0.h());
   }

   static dgz a(ol $$0) {
      return switch ($$0) {
         case a -> dgz.a;
         case e, f -> dgz.c;
         case c -> dgz.b;
         default -> dgz.d;
      };
   }
}
