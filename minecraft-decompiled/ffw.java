import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ffw extends few {
   public static final MapCodec<ffw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and($$0.group(dge.d.fieldOf("pages").forGetter($$0x -> $$0x.b), fev.a(100).forGetter($$0x -> $$0x.c))).apply($$0, ffw::new)
   );
   private final List<aut<String>> b;
   private final fev c;

   protected ffw(List<fgs> $$0, List<aut<String>> $$1, fev $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   protected dcv a(dcv $$0, fdj $$1) {
      $$0.a(kq.U, dge.a, this::a);
      return $$0;
   }

   public dge a(dge $$0) {
      List<aut<String>> $$1 = this.c.a($$0.a(), this.b, 100);
      return $$0.b($$1);
   }

   @Override
   public fey<ffw> b() {
      return fez.O;
   }
}
