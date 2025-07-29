import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.security.PrivateKey;
import java.time.Instant;

public record cuw(PrivateKey b, cux c, Instant d) {
   public static final Codec<cuw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            bax.g.fieldOf("private_key").forGetter(cuw::b), cux.c.fieldOf("public_key").forGetter(cuw::c), bbi.t.fieldOf("refreshed_after").forGetter(cuw::d)
         )
         .apply($$0, cuw::new)
   );

   public boolean a() {
      return this.d.isBefore(Instant.now());
   }
}
