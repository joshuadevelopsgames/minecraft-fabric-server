import javax.annotation.Nullable;

public class agt implements zw<acq> {
   public static final zm<wg, agt> a = zw.a(agt::a, agt::new);
   private static final int b = 1;
   private static final int c = 2;
   @Nullable
   private final ame d;
   @Nullable
   private final aza e;

   public agt(@Nullable ame $$0, @Nullable aza $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   private agt(wg $$0) {
      int $$1 = $$0.readByte();
      if (($$1 & 1) > 0) {
         this.e = $$0.b(aza.class);
      } else {
         this.e = null;
      }

      if (($$1 & 2) > 0) {
         this.d = $$0.q();
      } else {
         this.d = null;
      }
   }

   private void a(wg $$0) {
      if (this.e != null) {
         if (this.d != null) {
            $$0.l(3);
            $$0.a(this.e);
            $$0.a(this.d);
         } else {
            $$0.l(1);
            $$0.a(this.e);
         }
      } else if (this.d != null) {
         $$0.l(2);
         $$0.a(this.d);
      } else {
         $$0.l(0);
      }
   }

   @Override
   public zy<agt> a() {
      return ahk.aY;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   @Nullable
   public ame b() {
      return this.d;
   }

   @Nullable
   public aza e() {
      return this.e;
   }
}
