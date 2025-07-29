import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class gkp extends get {
   private static final xo a = xo.c("selectWorld.experiments");
   private static final xo b = xo.c("selectWorld.experiments.info").a(o.m);
   private static final int c = 310;
   private static final int d = 130;
   private final gbk e = new gbk(this);
   private final get f;
   private final awz u;
   private final Consumer<awz> v;
   private final Object2BooleanMap<aww> w = new Object2BooleanLinkedOpenHashMap();
   @Nullable
   private fyt x;

   public gkp(get $$0, awz $$1, Consumer<awz> $$2) {
      super(a);
      this.f = $$0;
      this.u = $$1;
      this.v = $$2;

      for (aww $$3 : $$1.d()) {
         if ($$3.l() == axa.d) {
            this.w.put($$3, $$1.g().contains($$3));
         }
      }
   }

   @Override
   protected void aV_() {
      this.e.a(a, this.q);
      gbo $$0 = this.e.c(gbo.d());
      $$0.a(new fyj(b, this.q).d(310), $$0x -> $$0x.e(15));
      gku.a $$1 = gku.a(299).a(2, true).b(4);
      this.w.forEach(($$1x, $$2x) -> $$1.a(a($$1x), () -> this.w.getBoolean($$1x), $$1xx -> this.w.put($$1x, $$1xx)).a($$1x.c()));
      gbl $$2 = $$1.a().a();
      this.x = new fyt(this.n, $$2, 130);
      this.x.a(310);
      $$0.a(this.x);
      gbo $$3 = this.e.b(gbo.e().a(8));
      $$3.a(fxo.a(xn.d, $$0x -> this.l()).a());
      $$3.a(fxo.a(xn.e, $$0x -> this.aP_()).a());
      this.e.a($$1x -> {
         fxm var10000 = this.c($$1x);
      });
      this.c();
   }

   private static xo a(aww $$0) {
      String $$1 = "dataPack." + $$0.g() + ".name";
      return (xo)(htb.a($$1) ? xo.c($$1) : $$0.b());
   }

   @Override
   protected void c() {
      this.x.b(130);
      this.e.a();
      int $$0 = this.p - this.e.b() - this.x.I().c();
      this.x.b(this.x.y() + $$0);
   }

   @Override
   public xo i() {
      return xn.a(super.i(), b);
   }

   @Override
   public void aP_() {
      this.n.a(this.f);
   }

   private void l() {
      List<aww> $$0 = new ArrayList<>(this.u.g());
      List<aww> $$1 = new ArrayList<>();
      this.w.forEach(($$2, $$3) -> {
         $$0.remove($$2);
         if ($$3) {
            $$1.add($$2);
         }
      });
      $$0.addAll(Lists.reverse($$1));
      this.u.b($$0.stream().map(aww::g).toList());
      this.v.accept(this.u);
   }
}
