import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class ffo extends few {
   public static final MapCodec<ffo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(fhp.a.fieldOf("count").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("add").orElse(false).forGetter($$0x -> $$0x.c)))
         .apply($$0, ffo::new)
   );
   private final fho b;
   private final boolean c;

   private ffo(List<fgs> $$0, fho $$1, boolean $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fey<ffo> b() {
      return fez.e;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      int $$2 = this.c ? $$0.M() : 0;
      $$0.e($$2 + this.b.a($$1));
      return $$0;
   }

   public static few.a<?> a(fho $$0) {
      return a($$1 -> new ffo($$1, $$0, false));
   }

   public static few.a<?> a(fho $$0, boolean $$1) {
      return a($$2 -> new ffo($$2, $$0, $$1));
   }
}
