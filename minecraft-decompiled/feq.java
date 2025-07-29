import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class feq extends few {
   public static final MapCodec<feq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(fdj.b.e.fieldOf("entity").forGetter($$0x -> $$0x.b)).apply($$0, feq::new)
   );
   private final fdj.b b;

   public feq(List<fgs> $$0, fdj.b $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<feq> b() {
      return fez.B;
   }

   @Override
   public Set<bdn<?>> a() {
      return Set.of(this.b.a());
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      if ($$0.a(dcz.vP) && $$1.c(this.b.a()) instanceof cut $$2) {
         $$0.b(kq.ak, new dfv($$2.gr()));
      }

      return $$0;
   }

   public static few.a<?> a(fdj.b $$0) {
      return a($$1 -> new feq($$1, $$0));
   }
}
