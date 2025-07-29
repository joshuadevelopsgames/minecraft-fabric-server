import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class fft extends few {
   static final MapCodec<fft> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fhp.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, fft::new));
   private final fho b;

   private fft(List<fgs> $$0, fho $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<bdn<?>> a() {
      return this.b.a();
   }

   @Override
   public fey<fft> b() {
      return fez.Q;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      int $$2 = bcb.a(this.b.a($$1), 0, 4);
      $$0.b(kq.ad, new dft($$2));
      return $$0;
   }

   public fho c() {
      return this.b;
   }

   public static few.a<?> a(fho $$0) {
      return a($$1 -> new fft($$1, $$0));
   }
}
