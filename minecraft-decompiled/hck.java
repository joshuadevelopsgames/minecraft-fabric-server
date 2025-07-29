import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.joml.Vector3f;

public class hck implements hbz.a {
   public static final int a = 200;
   private final fue b;
   private final List<abs> c = Lists.newArrayList();

   hck(fue $$0) {
      this.b = $$0;
   }

   public void a(abs $$0) {
      this.c.add($$0);
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      fog $$5 = $$1.getBuffer(gxz.v());
      long $$6 = this.b.s.ae();
      Iterator<abs> $$7 = this.c.iterator();

      while ($$7.hasNext()) {
         abs $$8 = $$7.next();
         long $$9 = $$6 - $$8.b();
         if ($$9 > 200L) {
            $$7.remove();
         } else {
            for (abs.a $$10 : $$8.c()) {
               Vector3f $$11 = $$10.a().c().a($$2, $$3 - 0.1, $$4).l();
               fbt $$12 = $$10.b();
               gyh.a($$0, $$5, $$11, $$12.b().r().c(0.5), -16776961);
               gyh.a($$0, $$5, $$11, $$12.c().r().c(0.4), -65536);
               gyh.a($$0, $$5, $$11, $$12.d().r().c(0.3), -256);
            }
         }
      }
   }
}
