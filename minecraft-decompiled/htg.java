import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;

public record htg(Optional<List<htf>> c, Optional<Integer> d, Optional<Integer> e, int f, boolean g) {
   public static final Codec<htg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            htf.b.listOf().optionalFieldOf("frames").forGetter(htg::a),
            bbi.p.optionalFieldOf("width").forGetter(htg::b),
            bbi.p.optionalFieldOf("height").forGetter(htg::c),
            bbi.p.optionalFieldOf("frametime", 1).forGetter(htg::d),
            Codec.BOOL.optionalFieldOf("interpolate", false).forGetter(htg::e)
         )
         .apply($$0, htg::new)
   );
   public static final awo<htg> b = new awo<>("animation", a);

   public hth a(int $$0, int $$1) {
      if (this.d.isPresent()) {
         return this.e.isPresent() ? new hth(this.d.get(), this.e.get()) : new hth(this.d.get(), $$1);
      } else if (this.e.isPresent()) {
         return new hth($$0, this.e.get());
      } else {
         int $$2 = Math.min($$0, $$1);
         return new hth($$2, $$2);
      }
   }

   public Optional<List<htf>> a() {
      return this.c;
   }

   public Optional<Integer> b() {
      return this.d;
   }

   public Optional<Integer> c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }

   public boolean e() {
      return this.g;
   }
}
