import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eqs extends eqy {
   public static final MapCodec<eqs> a = RecordCodecBuilder.mapCodec($$0 -> b($$0).apply($$0, eqs::new));

   public eqs(bwo $$0, bwo $$1) {
      super($$0, $$1);
   }

   @Override
   protected eqz<?> a() {
      return eqz.d;
   }

   @Override
   protected void a(dna $$0, eqy.b $$1, bck $$2, eqi $$3, int $$4, eqy.a $$5, int $$6, int $$7, int $$8) {
      boolean $$9 = $$5.c();
      jb $$10 = $$5.a().b($$8);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b(), -1 - $$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 - 1, -$$6, $$9);
      this.a($$0, $$1, $$2, $$3, $$10, $$7 + $$5.b() - 1, 0, $$9);
   }

   @Override
   public int a(bck $$0, int $$1, eqi $$2) {
      return 0;
   }

   @Override
   protected boolean a(bck $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$2 == 0 ? ($$1 > 1 || $$3 > 1) && $$1 != 0 && $$3 != 0 : $$1 == $$4 && $$3 == $$4 && $$4 > 0;
   }
}
