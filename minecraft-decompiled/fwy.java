import javax.annotation.Nullable;

public interface fwy {
   static fwy a(fzn $$0) {
      return new fwy.a($$0);
   }

   @Nullable
   static fwy a(fzm $$0, @Nullable fwy $$1) {
      return $$1 == null ? null : new fwy.b($$0, $$1);
   }

   static fwy a(fzn $$0, fzm... $$1) {
      fwy $$2 = a($$0);

      for (fzm $$3 : $$1) {
         $$2 = a($$3, $$2);
      }

      return $$2;
   }

   fzn a();

   void a(boolean var1);

   public record a(fzn a) implements fwy {
      @Override
      public void a(boolean $$0) {
         this.a.a($$0);
      }
   }

   public record b(fzm a, fwy b) implements fwy {
      @Override
      public void a(boolean $$0) {
         if (!$$0) {
            this.a.a(null);
         } else {
            this.a.a(this.b.a());
         }

         this.b.a($$0);
      }

      public fzm b() {
         return this.a;
      }

      public fwy c() {
         return this.b;
      }
   }
}
