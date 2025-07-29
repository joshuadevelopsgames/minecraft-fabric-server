import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ekw(eky b, ekv c) {
   public static final Codec<ekw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eky.a.forGetter(ekw::a), ekv.a.forGetter(ekw::b)).apply($$0, $$0.stable(ekw::new))
   );

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eky $$1, ekv $$2) {
      return a.encodeStart($$0, new ekw($$1, $$2));
   }

   public static <T> DataResult<T> a(DynamicOps<T> $$0, eky $$1, jz $$2) {
      return a($$0, $$1, new ekv($$2.f(mn.bv)));
   }

   public eky a() {
      return this.b;
   }

   public ekv b() {
      return this.c;
   }
}
