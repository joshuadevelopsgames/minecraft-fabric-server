public record fzd(ame a, ame b, ame c, ame d) {
   public fzd(ame $$0, ame $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public fzd(ame $$0, ame $$1, ame $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public ame a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
