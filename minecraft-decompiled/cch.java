import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.ints.IntList;
import java.util.List;
import javax.annotation.Nullable;

public class cch extends ccd<cuf> {
   @Nullable
   private cwj c;

   public cch(int $$0, int $$1) {
      super(ImmutableMap.of(), $$0, $$1);
   }

   protected boolean a(aub $$0, cuf $$1) {
      jb $$2 = $$1.dx();
      this.c = $$0.d($$2);
      return this.c != null && this.c.e() && cdm.a($$0, $$1, $$2);
   }

   protected boolean a(aub $$0, cuf $$1, long $$2) {
      return this.c != null && !this.c.d();
   }

   protected void b(aub $$0, cuf $$1, long $$2) {
      this.c = null;
      $$1.eh().a($$0.af(), $$0.ae());
   }

   protected void c(aub $$0, cuf $$1, long $$2) {
      bck $$3 = $$1.ec();
      if ($$3.a(100) == 0) {
         $$1.gM();
      }

      if ($$3.a(200) == 0 && cdm.a($$0, $$1, $$1.dx())) {
         dbt $$4 = ag.a(dbt.values(), $$3);
         int $$5 = $$3.a(3);
         dcv $$6 = this.a($$4, $$5);
         cvo.a(new cvj($$1.ai(), $$1, $$1.dC(), $$1.dG(), $$1.dI(), $$6), $$0, $$6);
      }
   }

   private dcv a(dbt $$0, int $$1) {
      dcv $$2 = new dcv(dcz.vW);
      $$2.b(kq.aj, new dfk((byte)$$1, List.of(new dfj(dfj.a.e, IntList.of($$0.f()), IntList.of(), false, false))));
      return $$2;
   }
}
