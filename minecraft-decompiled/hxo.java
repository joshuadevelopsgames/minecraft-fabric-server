import javax.annotation.Nullable;

public class hxo {
   private boolean a;
   @Nullable
   private hxi.b b;
   @Nullable
   private String c;
   @Nullable
   private final String d;

   public hxo(@Nullable String $$0) {
      this.d = $$0;
   }

   public void a(hxj.a $$0) {
      if (this.c != null) {
         $$0.a(hxi.j, !this.c.equals("vanilla"));
      }

      $$0.a(hxi.k, this.a());
   }

   private hxi.c a() {
      grz $$0 = fue.R().T();
      if ($$0 != null && $$0.e()) {
         return hxi.c.a;
      } else {
         return fue.R().V() ? hxi.c.b : hxi.c.c;
      }
   }

   public boolean a(hxf $$0) {
      if (!this.a && this.b != null && this.c != null) {
         this.a = true;
         $$0.send(hxg.b, $$0x -> {
            $$0x.a(hxi.n, this.b);
            if (this.d != null) {
               $$0x.a(hxi.o, this.d);
            }
         });
         return true;
      } else {
         return false;
      }
   }

   public void a(dmr $$0, boolean $$1) {
      this.b = switch ($$0) {
         case a -> $$1 ? hxi.b.e : hxi.b.a;
         case b -> hxi.b.b;
         case c -> hxi.b.c;
         case d -> hxi.b.d;
      };
   }

   public void a(String $$0) {
      this.c = $$0;
   }
}
