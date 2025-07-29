import java.util.Locale;

public enum hbb {
   a(hba.a, hba.b, hba.c),
   b(hba.d),
   c(hba.e);

   private final String d;
   private final hba[] e;

   private hbb(final hba... $$0) {
      this.e = $$0;
      this.d = this.toString().toLowerCase(Locale.ROOT);
   }

   public String a() {
      return this.d;
   }

   public hba[] b() {
      return this.e;
   }

   public fmr c() {
      fue $$0 = fue.R();

      fmr $$1 = switch (this) {
         case b -> $$0.f.r();
         case c -> $$0.f.u();
         default -> $$0.h();
      };
      return $$1 != null ? $$1 : $$0.h();
   }
}
