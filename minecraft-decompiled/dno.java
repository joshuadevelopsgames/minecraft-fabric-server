import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dno(ui d, Optional<dno.a> e, Optional<bzy> f) {
   public static final String a = "entity";
   public static final Codec<dno> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ui.a.fieldOf("entity").forGetter($$0x -> $$0x.d),
            dno.a.a.optionalFieldOf("custom_spawn_rules").forGetter($$0x -> $$0x.e),
            bzy.b.optionalFieldOf("equipment").forGetter($$0x -> $$0x.f)
         )
         .apply($$0, dno::new)
   );
   public static final Codec<bvt<dno>> c = bvt.a(b);

   public dno() {
      this(new ui(), Optional.empty(), Optional.empty());
   }

   public dno(ui d, Optional<dno.a> e, Optional<bzy> f) {
      Optional<ame> $$3 = d.a("id", ame.a);
      if ($$3.isPresent()) {
         d.a("id", ame.a, $$3.get());
      } else {
         d.r("id");
      }

      this.d = d;
      this.e = e;
      this.f = f;
   }

   public ui a() {
      return this.d;
   }

   public Optional<dno.a> b() {
      return this.e;
   }

   public Optional<bzy> c() {
      return this.f;
   }

   public record a(bbt<Integer> b, bbt<Integer> c) {
      private static final bbt<Integer> d = new bbt<>(0, 15);
      public static final Codec<dno.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(a("block_light_limit").forGetter($$0x -> $$0x.b), a("sky_light_limit").forGetter($$0x -> $$0x.c)).apply($$0, dno.a::new)
      );

      private static DataResult<bbt<Integer>> a(bbt<Integer> $$0) {
         return !d.a($$0) ? DataResult.error(() -> "Light values must be withing range " + d) : DataResult.success($$0);
      }

      private static MapCodec<bbt<Integer>> a(String $$0) {
         return bbt.a.lenientOptionalFieldOf($$0, d).validate(dno.a::a);
      }

      public boolean a(jb $$0, aub $$1) {
         return this.b.a($$1.a(dnd.b, $$0)) && this.c.a($$1.a(dnd.a, $$0));
      }

      public bbt<Integer> a() {
         return this.b;
      }

      public bbt<Integer> b() {
         return this.c;
      }
   }
}
