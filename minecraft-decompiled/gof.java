import java.util.List;
import java.util.function.Function;

public abstract class gof {
   protected final gqn v;
   protected final Function<ame, gxz> w;
   private final List<gqn> a;

   public gof(gqn $$0, Function<ame, gxz> $$1) {
      this.v = $$0;
      this.w = $$1;
      this.a = $$0.e();
   }

   public final gxz a(ame $$0) {
      return this.w.apply($$0);
   }

   public final void a(fod $$0, fog $$1, int $$2, int $$3, int $$4) {
      this.e().a($$0, $$1, $$2, $$3, $$4);
   }

   public final void a(fod $$0, fog $$1, int $$2, int $$3) {
      this.a($$0, $$1, $$2, $$3, -1);
   }

   public final gqn e() {
      return this.v;
   }

   public final List<gqn> f() {
      return this.a;
   }

   public final void g() {
      for (gqn $$0 : this.a) {
         $$0.c();
      }
   }

   public static class a extends gof {
      public a(gqn $$0, Function<ame, gxz> $$1) {
         super($$0, $$1);
      }
   }
}
