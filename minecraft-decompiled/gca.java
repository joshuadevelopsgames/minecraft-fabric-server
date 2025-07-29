public enum gca {
   a,
   b;

   public gca a() {
      return switch (this) {
         case a -> b;
         case b -> a;
      };
   }

   public gcb b() {
      return switch (this) {
         case a -> gcb.d;
         case b -> gcb.b;
      };
   }

   public gcb c() {
      return switch (this) {
         case a -> gcb.c;
         case b -> gcb.a;
      };
   }

   public gcb a(boolean $$0) {
      return $$0 ? this.b() : this.c();
   }
}
