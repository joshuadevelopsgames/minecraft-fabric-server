import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.List;

public class git extends get {
   private static final int a = 20;
   private static final int b = 5;
   private static final int c = 20;
   private final xo d;
   private final List<xo> e;
   private final ImmutableList<git.a> f;
   private fyi u = fyi.a;
   private int v;
   private int w;

   protected git(xo $$0, List<xo> $$1, ImmutableList<git.a> $$2) {
      super($$0);
      this.e = $$1;
      this.d = xn.a($$0, xr.a($$1, xn.a));
      this.f = $$2;
   }

   @Override
   public xo i() {
      return this.d;
   }

   @Override
   public void aV_() {
      UnmodifiableIterator $$1 = this.f.iterator();

      while ($$1.hasNext()) {
         git.a $$0 = (git.a)$$1.next();
         this.w = Math.max(this.w, 20 + this.q.a($$0.a) + 20);
      }

      int $$1x = 5 + this.w + 5;
      int $$2 = $$1x * this.f.size();
      this.u = fyi.a(this.q, $$2, this.e.toArray(new xo[0]));
      int $$3 = this.u.a() * 9;
      this.v = (int)(this.p / 2.0 - $$3 / 2.0);
      int $$4 = this.v + $$3 + 9 * 2;
      int $$5 = (int)(this.o / 2.0 - $$2 / 2.0);

      for (UnmodifiableIterator var6 = this.f.iterator(); var6.hasNext(); $$5 += $$1x) {
         git.a $$6 = (git.a)var6.next();
         this.c(fxo.a($$6.a, $$6.b).a($$5, $$4, this.w, 20).a());
      }
   }

   @Override
   public void a(fxb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.q, this.m, this.o / 2, this.v - 9 * 2, -1);
      this.u.a($$0, this.o / 2, this.v);
   }

   @Override
   public boolean aG_() {
      return false;
   }

   public static final class a {
      final xo a;
      final fxo.c b;

      public a(xo $$0, fxo.c $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
