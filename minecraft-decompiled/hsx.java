import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record hsx(int d, int e, List<ame> f, List<ame> g) {
   public static final int a = 128;
   public static final int b = 332;
   private static final Codec<Integer> h = Codec.intRange(0, 60000000);
   public static final Codec<hsx> c = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               h.optionalFieldOf("near_distance", 128).forGetter(hsx::a),
               h.optionalFieldOf("far_distance", 332).forGetter(hsx::b),
               bbi.b(ame.a.listOf()).fieldOf("sprites").forGetter(hsx::c)
            )
            .apply($$0, hsx::new)
      )
      .validate(hsx::e);

   public hsx(int $$0, int $$1, List<ame> $$2) {
      this($$0, $$1, $$2, $$2.stream().map($$0x -> $$0x.f("hud/locator_bar_dot/")).toList());
   }

   private DataResult<hsx> e() {
      return this.d >= this.e
         ? DataResult.error(() -> "Far distance (" + this.e + ") cannot be closer or equal to near distance (" + this.d + ")")
         : DataResult.success(this);
   }

   public ame a(float $$0) {
      if ($$0 <= this.d) {
         return this.g.getFirst();
      } else if ($$0 >= this.e) {
         return this.g.getLast();
      } else {
         int $$1 = bcb.a(($$0 - this.d) / (this.e - this.d), 0, this.g.size());
         return this.g.get($$1);
      }
   }

   public int a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public List<ame> c() {
      return this.f;
   }

   public List<ame> d() {
      return this.g;
   }
}
