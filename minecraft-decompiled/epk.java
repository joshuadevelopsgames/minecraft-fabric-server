import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class epk implements epm {
   public static final Codec<epk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jb.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, epk::new)
   );
   private final Optional<jb> b;
   private final boolean c;

   private epk(Optional<jb> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static epk a(jb $$0, boolean $$1) {
      return new epk(Optional.of($$0), $$1);
   }

   public static epk a() {
      return new epk(Optional.empty(), false);
   }

   public Optional<jb> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
