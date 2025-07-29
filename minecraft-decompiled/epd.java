import com.mojang.serialization.Codec;

public class epd implements epm {
   public static final Codec<epd> a = ern.a.fieldOf("state_provider").xmap(epd::new, $$0 -> $$0.b).codec();
   public final ern b;

   public epd(ern $$0) {
      this.b = $$0;
   }
}
