import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record epc(List<epc.a> b, jh c, elh d, boolean e) implements epm {
   public static final Codec<epc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            epc.a.a.listOf().fieldOf("layers").forGetter(epc::a),
            jh.g.fieldOf("direction").forGetter(epc::b),
            elh.b.fieldOf("allowed_placement").forGetter(epc::c),
            Codec.BOOL.fieldOf("prioritize_tip").forGetter(epc::d)
         )
         .apply($$0, epc::new)
   );

   public static epc.a a(bwo $$0, ern $$1) {
      return new epc.a($$0, $$1);
   }

   public static epc b(bwo $$0, ern $$1) {
      return new epc(List.of(a($$0, $$1)), jh.b, elh.c, false);
   }

   public List<epc.a> a() {
      return this.b;
   }

   public jh b() {
      return this.c;
   }

   public elh c() {
      return this.d;
   }

   public boolean d() {
      return this.e;
   }

   public record a(bwo b, ern c) {
      public static final Codec<epc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(bwo.d.fieldOf("height").forGetter(epc.a::a), ern.a.fieldOf("provider").forGetter(epc.a::b)).apply($$0, epc.a::new)
      );

      public bwo a() {
         return this.b;
      }

      public ern b() {
         return this.c;
      }
   }
}
