import com.mojang.serialization.Codec;

public class epe implements epm {
   public static final Codec<epe> a = eeb.a.fieldOf("state").xmap(epe::new, $$0 -> $$0.b).codec();
   public final eeb b;

   public epe(eeb $$0) {
      this.b = $$0;
   }
}
