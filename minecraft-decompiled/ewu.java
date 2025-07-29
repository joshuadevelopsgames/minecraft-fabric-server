import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Set;

public class ewu extends eux {
   public static final MapCodec<ewu> d = a(ewu::new);

   public ewu(euy.c $$0) {
      super(ewt::new, 21, 21, $$0);
   }

   @Override
   public void a(dnt $$0, dnq $$1, efz $$2, bck $$3, euq $$4, dlz $$5, evn $$6) {
      Set<jb> $$7 = bcv.a(kg::i);

      for (evc $$8 : $$6.c()) {
         if ($$8 instanceof ewt $$9) {
            $$7.addAll($$9.b());
            a($$4, $$0, $$9.c());
         }
      }

      ObjectArrayList<jb> $$10 = new ObjectArrayList($$7.stream().toList());
      bck $$11 = bck.a($$0.F()).e().a($$6.b().g());
      ag.c($$10, $$11);
      int $$12 = Math.min($$7.size(), $$11.b(5, 8));
      ObjectListIterator var12 = $$10.iterator();

      while (var12.hasNext()) {
         jb $$13 = (jb)var12.next();
         if ($$12 > 0) {
            $$12--;
            a($$4, $$0, $$13);
         } else if ($$4.b($$13)) {
            $$0.a($$13, dqb.L.m(), 2);
         }
      }
   }

   private static void a(euq $$0, dnt $$1, jb $$2) {
      if ($$0.b($$2)) {
         $$1.a($$2, dqb.M.m(), 2);
         $$1.a($$2, ebb.O).ifPresent($$1x -> $$1x.a(fdf.aY, $$2.a()));
      }
   }

   @Override
   public evh<?> e() {
      return evh.b;
   }
}
