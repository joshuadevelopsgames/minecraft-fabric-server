import java.util.List;
import java.util.function.Function;

public class him<S extends hlq, M extends gnh<S>> extends hit<S, M> {
   private final ame a;
   private final him.a<S> b;
   private final him.b<S, M> c;
   private final Function<ame, gxz> d;
   private final boolean e;

   public him(hgc<S, M> $$0, ame $$1, him.a<S> $$2, him.b<S, M> $$3, Function<ame, gxz> $$4, boolean $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public void a(fod $$0, gxn $$1, int $$2, S $$3, float $$4, float $$5) {
      if (!$$3.A || this.e) {
         if (this.a($$3)) {
            fog $$6 = $$1.getBuffer(this.d.apply(this.a));
            float $$7 = this.b.apply($$3, $$3.v);
            int $$8 = baj.a(bcb.d($$7 * 255.0F), 255, 255, 255);
            this.d().a($$0, $$6, $$2, hfg.a($$3, 0.0F), $$8);
            this.a();
         }
      }
   }

   private boolean a(S $$0) {
      List<gqn> $$1 = this.c.getPartsToDraw(this.d(), $$0);
      if ($$1.isEmpty()) {
         return false;
      } else {
         this.d().f().forEach($$0x -> $$0x.l = true);
         $$1.forEach($$0x -> $$0x.l = false);
         return true;
      }
   }

   private void a() {
      this.d().f().forEach($$0 -> $$0.l = false);
   }

   public interface a<S extends hlq> {
      float apply(S var1, float var2);
   }

   public interface b<S extends hlq, M extends gnh<S>> {
      List<gqn> getPartsToDraw(M var1, S var2);
   }
}
