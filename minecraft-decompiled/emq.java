import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import java.util.stream.IntStream;

public class emq extends enh<ept> {
   public emq(Codec<ept> $$0) {
      super($$0);
   }

   @Override
   public boolean a(enj<ept> $$0) {
      bck $$1 = $$0.d();
      dnt $$2 = $$0.b();
      dlz $$3 = new dlz($$0.e());
      IntArrayList $$4 = ag.a(IntStream.rangeClosed($$3.d(), $$3.f()), $$1);
      IntArrayList $$5 = ag.a(IntStream.rangeClosed($$3.e(), $$3.g()), $$1);
      jb.a $$6 = new jb.a();
      IntListIterator var8 = $$4.iterator();

      while (var8.hasNext()) {
         Integer $$7 = (Integer)var8.next();
         IntListIterator var10 = $$5.iterator();

         while (var10.hasNext()) {
            Integer $$8 = (Integer)var10.next();
            $$6.d($$7, 0, $$8);
            jb $$9 = $$2.a(eka.a.f, $$6);
            if ($$2.w($$9) || $$2.a_($$9).g($$2, $$9).c()) {
               $$2.a($$9, dqb.cG.m(), 2);
               bxq.a($$2, $$1, $$9, fdf.a);
               eeb $$10 = dqb.cz.m();

               for (jh $$11 : jh.c.a) {
                  jb $$12 = $$9.a($$11);
                  if ($$10.a($$2, $$12)) {
                     $$2.a($$12, $$10, 2);
                  }
               }

               return true;
            }
         }
      }

      return false;
   }
}
