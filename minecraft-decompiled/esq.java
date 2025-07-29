import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BiConsumer;

public class esq extends esu {
   public static final MapCodec<esq> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).apply($$0, esq::new));

   public esq(int $$0, int $$1, int $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected esv<?> a() {
      return esv.b;
   }

   @Override
   public List<eqy.a> a(dna $$0, BiConsumer<jb, eeb> $$1, bck $$2, int $$3, jb $$4, eqi $$5) {
      a($$0, $$1, $$2, $$4.e(), $$5);
      List<eqy.a> $$6 = Lists.newArrayList();
      jh $$7 = jh.c.a.a($$2);
      int $$8 = $$3 - $$2.a(4) - 1;
      int $$9 = 3 - $$2.a(3);
      jb.a $$10 = new jb.a();
      int $$11 = $$4.u();
      int $$12 = $$4.w();
      OptionalInt $$13 = OptionalInt.empty();

      for (int $$14 = 0; $$14 < $$3; $$14++) {
         int $$15 = $$4.v() + $$14;
         if ($$14 >= $$8 && $$9 > 0) {
            $$11 += $$7.j();
            $$12 += $$7.l();
            $$9--;
         }

         if (this.b($$0, $$1, $$2, $$10.d($$11, $$15, $$12), $$5)) {
            $$13 = OptionalInt.of($$15 + 1);
         }
      }

      if ($$13.isPresent()) {
         $$6.add(new eqy.a(new jb($$11, $$13.getAsInt(), $$12), 1, false));
      }

      $$11 = $$4.u();
      $$12 = $$4.w();
      jh $$16 = jh.c.a.a($$2);
      if ($$16 != $$7) {
         int $$17 = $$8 - $$2.a(2) - 1;
         int $$18 = 1 + $$2.a(3);
         $$13 = OptionalInt.empty();

         for (int $$19 = $$17; $$19 < $$3 && $$18 > 0; $$18--) {
            if ($$19 >= 1) {
               int $$20 = $$4.v() + $$19;
               $$11 += $$16.j();
               $$12 += $$16.l();
               if (this.b($$0, $$1, $$2, $$10.d($$11, $$20, $$12), $$5)) {
                  $$13 = OptionalInt.of($$20 + 1);
               }
            }

            $$19++;
         }

         if ($$13.isPresent()) {
            $$6.add(new eqy.a(new jb($$11, $$13.getAsInt(), $$12), 0, false));
         }
      }

      return $$6;
   }
}
