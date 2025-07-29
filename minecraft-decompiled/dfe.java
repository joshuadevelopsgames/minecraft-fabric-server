import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import javax.annotation.Nullable;

public record dfe(List<Float> d, List<Boolean> e, List<String> f, List<Integer> g) {
   public static final dfe a = new dfe(List.of(), List.of(), List.of(), List.of());
   public static final Codec<dfe> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
            Codec.FLOAT.listOf().optionalFieldOf("floats", List.of()).forGetter(dfe::a),
            Codec.BOOL.listOf().optionalFieldOf("flags", List.of()).forGetter(dfe::b),
            Codec.STRING.listOf().optionalFieldOf("strings", List.of()).forGetter(dfe::c),
            bbi.l.listOf().optionalFieldOf("colors", List.of()).forGetter(dfe::d)
         )
         .apply($$0, dfe::new)
   );
   public static final zm<ByteBuf, dfe> c = zm.a(zk.l.a(zk.a()), dfe::a, zk.b.a(zk.a()), dfe::b, zk.p.a(zk.a()), dfe::c, zk.g.a(zk.a()), dfe::d, dfe::new);

   @Nullable
   private static <T> T a(List<T> $$0, int $$1) {
      return $$1 >= 0 && $$1 < $$0.size() ? $$0.get($$1) : null;
   }

   @Nullable
   public Float a(int $$0) {
      return a(this.d, $$0);
   }

   @Nullable
   public Boolean b(int $$0) {
      return a(this.e, $$0);
   }

   @Nullable
   public String c(int $$0) {
      return a(this.f, $$0);
   }

   @Nullable
   public Integer d(int $$0) {
      return a(this.g, $$0);
   }

   public List<Float> a() {
      return this.d;
   }

   public List<Boolean> b() {
      return this.e;
   }

   public List<String> c() {
      return this.f;
   }

   public List<Integer> d() {
      return this.g;
   }
}
