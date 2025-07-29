import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class fer extends few {
   public static final MapCodec<fer> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
         .and($$0.group(cn.a.fieldOf("item_filter").forGetter($$0x -> $$0x.b), fez.c.fieldOf("modifier").forGetter($$0x -> $$0x.c)))
         .apply($$0, fer::new)
   );
   private final cn b;
   private final fex c;

   private fer(List<fgs> $$0, cn $$1, fex $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public fey<fer> b() {
      return fez.v;
   }

   @Override
   public dcv a(dcv $$0, fdj $$1) {
      return this.b.a($$0) ? this.c.apply($$0, $$1) : $$0;
   }

   @Override
   public void a(fdp $$0) {
      super.a($$0);
      this.c.a($$0.a(new bci.c("modifier")));
   }
}
