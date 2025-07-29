import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record dfy(List<dfy.a> c, float d, int e, boolean f) {
   public static final Codec<dfy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            dfy.a.a.listOf().fieldOf("rules").forGetter(dfy::a),
            Codec.FLOAT.optionalFieldOf("default_mining_speed", 1.0F).forGetter(dfy::b),
            bbi.o.optionalFieldOf("damage_per_block", 1).forGetter(dfy::c),
            Codec.BOOL.optionalFieldOf("can_destroy_blocks_in_creative", true).forGetter(dfy::d)
         )
         .apply($$0, dfy::new)
   );
   public static final zm<wx, dfy> b = zm.a(dfy.a.b.a(zk.a()), dfy::a, zk.l, dfy::b, zk.h, dfy::c, zk.b, dfy::d, dfy::new);

   public float a(eeb $$0) {
      for (dfy.a $$1 : this.c) {
         if ($$1.d.isPresent() && $$0.a($$1.c)) {
            return $$1.d.get();
         }
      }

      return this.d;
   }

   public boolean b(eeb $$0) {
      for (dfy.a $$1 : this.c) {
         if ($$1.e.isPresent() && $$0.a($$1.c)) {
            return $$1.e.get();
         }
      }

      return false;
   }

   public List<dfy.a> a() {
      return this.c;
   }

   public float b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public boolean d() {
      return this.f;
   }

   public record a(jp<dpz> c, Optional<Float> d, Optional<Boolean> e) {
      public static final Codec<dfy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               ka.a(mn.i).fieldOf("blocks").forGetter(dfy.a::a),
               bbi.r.optionalFieldOf("speed").forGetter(dfy.a::b),
               Codec.BOOL.optionalFieldOf("correct_for_drops").forGetter(dfy.a::c)
            )
            .apply($$0, dfy.a::new)
      );
      public static final zm<wx, dfy.a> b = zm.a(zk.c(mn.i), dfy.a::a, zk.l.a(zk::a), dfy.a::b, zk.b.a(zk::a), dfy.a::c, dfy.a::new);

      public static dfy.a a(jp<dpz> $$0, float $$1) {
         return new dfy.a($$0, Optional.of($$1), Optional.of(true));
      }

      public static dfy.a a(jp<dpz> $$0) {
         return new dfy.a($$0, Optional.empty(), Optional.of(false));
      }

      public static dfy.a b(jp<dpz> $$0, float $$1) {
         return new dfy.a($$0, Optional.of($$1), Optional.empty());
      }

      public jp<dpz> a() {
         return this.c;
      }

      public Optional<Float> b() {
         return this.d;
      }

      public Optional<Boolean> c() {
         return this.e;
      }
   }
}
