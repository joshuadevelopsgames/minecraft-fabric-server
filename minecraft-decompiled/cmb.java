import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class cmb extends clz {
   @Nullable
   private cmb a;
   private int b = 1;

   public cmb(bzv<? extends cmb> $$0, dmu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void H() {
      super.H();
      this.ch.a(5, new che(this));
   }

   @Override
   public int gk() {
      return this.gI();
   }

   public int gI() {
      return super.gk();
   }

   @Override
   protected boolean t() {
      return !this.gJ();
   }

   public boolean gJ() {
      return this.a != null && this.a.bO();
   }

   public cmb a(cmb $$0) {
      this.a = $$0;
      $$0.gP();
      return $$0;
   }

   public void gK() {
      this.a.gQ();
      this.a = null;
   }

   private void gP() {
      this.b++;
   }

   private void gQ() {
      this.b--;
   }

   public boolean gL() {
      return this.gM() && this.b < this.gI();
   }

   @Override
   public void g() {
      super.g();
      if (this.gM() && this.ai().A.a(200) == 1) {
         List<? extends clz> $$0 = this.ai().a((Class<? extends clz>)this.getClass(), this.cV().c(8.0, 8.0, 8.0));
         if ($$0.size() <= 1) {
            this.b = 1;
         }
      }
   }

   public boolean gM() {
      return this.b > 1;
   }

   public boolean gN() {
      return this.g(this.a) <= 121.0;
   }

   public void gO() {
      if (this.gJ()) {
         this.S().a(this.a, 1.0);
      }
   }

   public void a(Stream<? extends cmb> $$0) {
      $$0.limit(this.gI() - this.b).filter($$0x -> $$0x != this).forEach($$0x -> $$0x.a(this));
   }

   @Nullable
   @Override
   public cbe a(dnl $$0, bxh $$1, bzu $$2, @Nullable cbe $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$3 == null) {
         $$3 = new cmb.a(this);
      } else {
         this.a(((cmb.a)$$3).a);
      }

      return $$3;
   }

   public static class a implements cbe {
      public final cmb a;

      public a(cmb $$0) {
         this.a = $$0;
      }
   }
}
