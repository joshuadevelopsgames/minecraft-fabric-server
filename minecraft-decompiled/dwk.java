import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwk extends dpz {
   public static final MapCodec<dwk> a = b(dwk::new);
   public static final ees b = dwl.b;

   @Override
   public MapCodec<dwk> a() {
      return a;
   }

   public dwk(eea.d $$0) {
      super($$0);
      this.l(this.m().b(b, false));
   }

   @Nullable
   @Override
   public eeb a(dgo $$0) {
      return this.m().b(b, $$0.q().E($$0.a()));
   }

   @Override
   protected void a(eeb $$0, dmu $$1, jb $$2, dpz $$3, @Nullable fbt $$4, boolean $$5) {
      if (!$$1.C) {
         boolean $$6 = $$0.c(b);
         if ($$6 != $$1.E($$2)) {
            if ($$6) {
               $$1.a($$2, this, 4);
            } else {
               $$1.a($$2, $$0.a(b), 2);
            }
         }
      }
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, bck $$3) {
      if ($$0.c(b) && !$$1.E($$2)) {
         $$1.a($$2, $$0.a(b), 2);
      }
   }

   @Override
   protected void a(eec.a<dpz, eeb> $$0) {
      $$0.a(b);
   }
}
