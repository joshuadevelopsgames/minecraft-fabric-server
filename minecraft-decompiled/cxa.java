import com.mojang.serialization.Codec;
import java.util.List;

public record cxa(List<cww.a<cwz, cwx>> c) {
   public static final cxa a = new cxa(List.of());
   public static final Codec<cxa> b = cww.a.a(cwx.b).listOf().xmap(cxa::new, cxa::a);

   public static cxa a(cwx $$0, int $$1) {
      return new cxa(cww.a($$0, $$1));
   }

   public static cxa a(int $$0) {
      return new cxa(cww.a($$0));
   }

   public List<cww.a<cwz, cwx>> a() {
      return this.c;
   }
}
