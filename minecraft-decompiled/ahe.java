import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ahe implements zw<acq> {
   public static final zm<wx, ahe> a = zm.a(zk.h, ahe::b, ahe.a.b.a(zk.a()), ahe::e, ahe::new);
   private final int b;
   private final List<ahe.a> c;

   public ahe(int $$0, Collection<cbo> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (cbo $$2 : $$1) {
         this.c.add(new ahe.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private ahe(int $$0, List<ahe.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zy<ahe> a() {
      return ahk.bg;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<ahe.a> e() {
      return this.c;
   }

   public record a(jl<cbn> c, double d, Collection<cbq> e) {
      public static final zm<ByteBuf, cbq> a = zm.a(ame.b, cbq::a, zk.m, cbq::b, cbq.a.e, cbq::c, cbq::new);
      public static final zm<wx, ahe.a> b = zm.a(cbn.b, ahe.a::a, zk.m, ahe.a::b, a.a(zk.a(ArrayList::new)), ahe.a::c, ahe.a::new);

      public jl<cbn> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<cbq> c() {
         return this.e;
      }
   }
}
