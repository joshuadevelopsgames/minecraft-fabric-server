import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record erv(ern b, List<erv.a> c) {
   public static final Codec<erv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ern.a.fieldOf("fallback").forGetter(erv::a), erv.a.a.listOf().fieldOf("rules").forGetter(erv::b)).apply($$0, erv::new)
   );

   public static erv a(ern $$0) {
      return new erv($$0, List.of());
   }

   public static erv a(dpz $$0) {
      return a(ern.a($$0));
   }

   public eeb a(dnt $$0, bck $$1, jb $$2) {
      for (erv.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ern a() {
      return this.b;
   }

   public List<erv.a> b() {
      return this.c;
   }

   public record a(elh b, ern c) {
      public static final Codec<erv.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(elh.b.fieldOf("if_true").forGetter(erv.a::a), ern.a.fieldOf("then").forGetter(erv.a::b)).apply($$0, erv.a::new)
      );

      public elh a() {
         return this.b;
      }

      public ern b() {
         return this.c;
      }
   }
}
