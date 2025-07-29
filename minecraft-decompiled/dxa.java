import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dxa extends dpl {
   public static final MapCodec<dxa> a = b(dxa::new);
   public static final ees b = eer.c;
   private final bwo c = bwl.a(5);

   @Override
   public MapCodec<dxa> a() {
      return a;
   }

   public dxa(eea.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, false));
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.b(b, false), 3);
      }
   }

   @Nullable
   @Override
   public eaz a(jb $$0, eeb $$1) {
      return new ecj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends eaz> eba<T> a(dmu $$0, eeb $$1, ebb<T> $$2) {
      return $$0.C ? null : a($$2, ebb.L, ecj::a);
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.c);
      }
   }
}
