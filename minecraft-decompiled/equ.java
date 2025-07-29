import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class equ extends eqt {
   public static final MapCodec<equ> c = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, equ::new));

   public equ(bwo $$0, bwo $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected eqz<?> a() {
      return eqz.e;
   }

   @Override
   protected void a(dna $$0, eqy.b $$1, bck $$2, eqi $$3, int $$4, eqy.a $$5, int $$6, int $$7, int $$8) {
      for (int $$9 = $$8; $$9 >= $$8 - $$6; $$9--) {
         int $$10 = $$7 + $$5.b() - 1 - $$9;
         this.a($$0, $$1, $$2, $$3, $$5.a(), $$10, $$9, $$5.c());
      }
   }

   @Override
   protected boolean a(bck $$0, int $$1, int $$2, int $$3, int $$4, boolean $$5) {
      return $$1 == $$4 && $$3 == $$4 && $$0.a(2) == 0;
   }
}
