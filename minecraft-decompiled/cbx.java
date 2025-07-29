import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class cbx extends ccd<cmd> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bzv<? extends cmd> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public cbx(bzv<? extends cmd> $$0) {
      this($$0, 1.0F, 2);
   }

   public cbx(bzv<? extends cmd> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cjo.h, cjp.a, cjo.s, cjp.b, cjo.n, cjp.c, cjo.o, cjp.c, cjo.aa, cjp.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aub $$0, cmd $$1) {
      return $$1.gR() && this.c($$1).isPresent();
   }

   protected void a(aub $$0, cmd $$1, long $$2) {
      cmd $$3 = this.c($$1).get();
      $$1.eh().a(cjo.s, $$3);
      $$3.eh().a(cjo.s, $$1);
      ccf.a($$1, (cam)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ec().a(50);
      this.j = $$2 + $$4;
   }

   protected boolean b(aub $$0, cmd $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cmd $$3 = this.a($$1);
         return $$3.bO() && $$1.a($$3) && ccf.a($$1.eh(), $$3) && $$2 <= this.j && !$$1.gE() && !$$3.gE();
      }
   }

   protected void c(aub $$0, cmd $$1, long $$2) {
      cmd $$3 = this.a($$1);
      ccf.a($$1, (cam)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.eh().b(cjo.s);
            $$3.eh().b(cjo.s);
         }
      }
   }

   protected void d(aub $$0, cmd $$1, long $$2) {
      $$1.eh().b(cjo.s);
      $$1.eh().b(cjo.n);
      $$1.eh().b(cjo.o);
      this.j = 0L;
   }

   private cmd a(cmd $$0) {
      return (cmd)$$0.eh().c(cjo.s).get();
   }

   private boolean b(cmd $$0) {
      cbm<?> $$1 = $$0.eh();
      return $$1.a(cjo.s) && $$1.c(cjo.s).get().ap() == this.f;
   }

   private Optional<? extends cmd> c(cmd $$0) {
      return $$0.eh().c(cjo.h).get().a($$1 -> $$1.ap() == this.f && $$1 instanceof cmd $$2 && $$0.a($$2) && !$$2.gE()).map(cmd.class::cast);
   }
}
