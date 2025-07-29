import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddb(jl<ayy> e, xo f, float g, int h) {
   public static final Codec<ddb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            ayy.b.fieldOf("sound_event").forGetter(ddb::b),
            xq.a.fieldOf("description").forGetter(ddb::c),
            bbi.r.fieldOf("length_in_seconds").forGetter(ddb::d),
            bbi.a(0, 15).fieldOf("comparator_output").forGetter(ddb::e)
         )
         .apply($$0, ddb::new)
   );
   public static final zm<wx, ddb> b = zm.a(ayy.d, ddb::b, xq.b, ddb::c, zk.l, ddb::d, zk.h, ddb::e, ddb::new);
   public static final Codec<jl<ddb>> c = amb.a(mn.ba);
   public static final zm<wx, jl<ddb>> d = zk.a(mn.ba, b);
   private static final int i = 20;

   public int a() {
      return bcb.f(this.g * 20.0F);
   }

   public boolean a(long $$0) {
      return $$0 >= this.a() + 20;
   }

   public static Optional<jl<ddb>> a(jn.a $$0, dcv $$1) {
      dda $$2 = $$1.a(kq.ae);
      return $$2 != null ? $$2.a().a($$0) : Optional.empty();
   }

   public jl<ayy> b() {
      return this.e;
   }

   public xo c() {
      return this.f;
   }

   public float d() {
      return this.g;
   }

   public int e() {
      return this.h;
   }
}
