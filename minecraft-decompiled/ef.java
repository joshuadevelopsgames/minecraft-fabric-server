import com.mojang.serialization.Codec;
import java.util.Optional;

public class ef {
   public static final Codec<ef> a = ame.a.xmap(ef::new, ef::a);
   private final ame b;
   private boolean c;
   private Optional<ib<ek>> d = Optional.empty();

   public ef(ame $$0) {
      this.b = $$0;
   }

   public Optional<ib<ek>> a(amt $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public ame a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      return $$0 == this ? true : $$0 instanceof ef $$1 && this.a().equals($$1.a());
   }
}
