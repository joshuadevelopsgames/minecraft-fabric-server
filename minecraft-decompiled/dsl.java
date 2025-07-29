import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dsl extends dpz {
   public static final MapCodec<dsl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(bwo.b(0, 10).fieldOf("experience").forGetter($$0x -> $$0x.b), t()).apply($$0, dsl::new)
   );
   private final bwo b;

   @Override
   public MapCodec<? extends dsl> a() {
      return a;
   }

   public dsl(bwo $$0, eea.d $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   protected void a(eeb $$0, aub $$1, jb $$2, dcv $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, this.b);
      }
   }
}
