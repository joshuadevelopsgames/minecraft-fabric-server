import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;

public class epl implements epm {
   public static final Codec<epl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ern.a.fieldOf("trunk_provider").forGetter($$0x -> $$0x.b),
            bwo.b(0, 16).fieldOf("log_length").forGetter($$0x -> $$0x.c),
            esi.h.listOf().fieldOf("stump_decorators").forGetter($$0x -> $$0x.d),
            esi.h.listOf().fieldOf("log_decorators").forGetter($$0x -> $$0x.e)
         )
         .apply($$0, epl::new)
   );
   public final ern b;
   public final bwo c;
   public final List<esi> d;
   public final List<esi> e;

   protected epl(ern $$0, bwo $$1, List<esi> $$2, List<esi> $$3) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
   }

   public static class a {
      private final ern a;
      private final bwo b;
      private List<esi> c = new ArrayList<>();
      private List<esi> d = new ArrayList<>();

      public a(ern $$0, bwo $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public epl.a a(List<esi> $$0) {
         this.c = $$0;
         return this;
      }

      public epl.a b(List<esi> $$0) {
         this.d = $$0;
         return this;
      }

      public epl a() {
         return new epl(this.a, this.b, this.c, this.d);
      }
   }
}
