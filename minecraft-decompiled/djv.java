import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record djv(djp d) implements djz {
   public static final MapCodec<djv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(djp.b.fieldOf("amount").forGetter($$0x -> $$0x.d)).apply($$0, djv::new));

   @Override
   public void a(aub $$0, int $$1, djh $$2, bzm $$3, fis $$4) {
      dcv $$5 = $$2.a();
      if ($$5.c(kq.d) && $$5.c(kq.e)) {
         auc $$7 = $$2.c() instanceof auc $$6 ? $$6 : null;
         int $$8 = (int)this.d.a($$1);
         $$5.a($$8, $$0, $$7, $$2.d());
      }
   }

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   public djp b() {
      return this.d;
   }
}
