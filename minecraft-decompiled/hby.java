import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

public class hby implements hbz.a {
   private final fue a;
   private double b = Double.MIN_VALUE;
   private List<fjm> c = Collections.emptyList();

   public hby(fue $$0) {
      this.a = $$0;
   }

   @Override
   public void a(fod $$0, gxn $$1, double $$2, double $$3, double $$4) {
      double $$5 = ag.d();
      if ($$5 - this.b > 1.0E8) {
         this.b = $$5;
         bzm $$6 = this.a.j.l().i();
         this.c = ImmutableList.copyOf($$6.ai().d($$6, $$6.cV().g(6.0)));
      }

      fog $$7 = $$1.getBuffer(gxz.v());

      for (fjm $$8 : this.c) {
         hbz.a($$0, $$7, $$8, -$$2, -$$3, -$$4, 1.0F, 1.0F, 1.0F, 1.0F, true);
      }
   }
}
