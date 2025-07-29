import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import org.slf4j.Logger;

public record fgj(amd<fgs> b) implements fgs {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<fgj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(amd.a(mn.by).fieldOf("name").forGetter(fgj::c)).apply($$0, fgj::new));

   @Override
   public fgt b() {
      return fgu.p;
   }

   @Override
   public void a(fdp $$0) {
      if (!$$0.b()) {
         $$0.a(new fdp.d(this.b));
      } else if ($$0.a(this.b)) {
         $$0.a(new fdp.c(this.b));
      } else {
         fgs.super.a($$0);
         $$0.a().c(this.b).ifPresentOrElse($$1 -> $$1.a().a($$0.a(new bci.b(this.b), this.b)), () -> $$0.a(new fdp.a(this.b)));
      }
   }

   public boolean a(fdj $$0) {
      fgs $$1 = $$0.a().c(this.b).map(jl.c::a).orElse(null);
      if ($$1 == null) {
         c.warn("Tried using unknown condition table called {}", this.b.a());
         return false;
      } else {
         fdj.c<?> $$2 = fdj.a($$1);
         if ($$0.b($$2)) {
            boolean var4;
            try {
               var4 = $$1.test($$0);
            } finally {
               $$0.c($$2);
            }

            return var4;
         } else {
            c.warn("Detected infinite loop in loot tables");
            return false;
         }
      }
   }

   public static fgs.a a(amd<fgs> $$0) {
      return () -> new fgj($$0);
   }

   public amd<fgs> c() {
      return this.b;
   }
}
