import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record le(Optional<jp<ddb>> e) implements dm<dda> {
   public static final Codec<le> a = RecordCodecBuilder.create($$0 -> $$0.group(ka.a(mn.ba).optionalFieldOf("song").forGetter(le::c)).apply($$0, le::new));

   @Override
   public kp<dda> a() {
      return kq.ae;
   }

   public boolean a(dda $$0) {
      if (!this.e.isPresent()) {
         return true;
      } else {
         boolean $$1 = false;

         for (jl<ddb> $$2 : this.e.get()) {
            Optional<amd<ddb>> $$3 = $$2.e();
            if (!$$3.isEmpty() && $$3.equals($$0.a().a())) {
               $$1 = true;
               break;
            }
         }

         return $$1;
      }
   }

   public static le b() {
      return new le(Optional.empty());
   }

   public Optional<jp<ddb>> c() {
      return this.e;
   }
}
