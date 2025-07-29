import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffi extends few {
   public static final MapCodec<ffi> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(vj.f.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ffi::new));
   private final ui b;

   private ffi(List<fgs> $$0, ui $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public fey<ffi> b() {
      return fez.j;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      dfd.a(kq.b, $$0, $$0x -> $$0x.a(this.b));
      return $$0;
   }

   @Deprecated
   public static few.a<?> a(ui $$0) {
      return a($$1 -> new ffi($$1, $$0));
   }
}
