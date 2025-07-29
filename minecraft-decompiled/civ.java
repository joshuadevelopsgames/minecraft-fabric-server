import javax.annotation.Nullable;

public class civ extends cif {
   public static final float i = 0.001F;
   protected final float j;

   public civ(cau $$0, double $$1) {
      this($$0, $$1, 0.001F);
   }

   public civ(cau $$0, double $$1, float $$2) {
      super($$0, $$1);
      this.j = $$2;
   }

   @Nullable
   @Override
   protected fis h() {
      if (this.b.bm()) {
         fis $$0 = clj.a(this.b, 15, 7);
         return $$0 == null ? super.h() : $$0;
      } else {
         return this.b.ec().i() >= this.j ? clj.a(this.b, 10, 7) : super.h();
      }
   }
}
