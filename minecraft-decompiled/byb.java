import javax.annotation.Nullable;

public class byb {
   private final jl<byd> a;
   @Nullable
   private final bzm b;
   @Nullable
   private final bzm c;
   @Nullable
   private final fis d;

   @Override
   public String toString() {
      return "DamageSource (" + this.k().a() + ")";
   }

   public float a() {
      return this.k().c();
   }

   public boolean b() {
      return this.b == this.c;
   }

   private byb(jl<byd> $$0, @Nullable bzm $$1, @Nullable bzm $$2, @Nullable fis $$3) {
      this.a = $$0;
      this.b = $$2;
      this.c = $$1;
      this.d = $$3;
   }

   public byb(jl<byd> $$0, @Nullable bzm $$1, @Nullable bzm $$2) {
      this($$0, $$1, $$2, null);
   }

   public byb(jl<byd> $$0, fis $$1) {
      this($$0, null, null, $$1);
   }

   public byb(jl<byd> $$0, @Nullable bzm $$1) {
      this($$0, $$1, $$1);
   }

   public byb(jl<byd> $$0) {
      this($$0, null, null, null);
   }

   @Nullable
   public bzm c() {
      return this.c;
   }

   @Nullable
   public bzm d() {
      return this.b;
   }

   @Nullable
   public dcv e() {
      return this.c != null ? this.c.ed() : null;
   }

   public xo a(cam $$0) {
      String $$1 = "death.attack." + this.k().a();
      if (this.b == null && this.c == null) {
         cam $$5 = $$0.eZ();
         String $$6 = $$1 + ".player";
         return $$5 != null ? xo.a($$6, $$0.Q_(), $$5.Q_()) : xo.a($$1, $$0.Q_());
      } else {
         xo $$2 = this.b == null ? this.c.Q_() : this.b.Q_();
         dcv $$4 = this.b instanceof cam $$3 ? $$3.fh() : dcv.l;
         return !$$4.f() && $$4.c(kq.g) ? xo.a($$1 + ".item", $$0.Q_(), $$2, $$4.K()) : xo.a($$1, $$0.Q_(), $$2);
      }
   }

   public String f() {
      return this.k().a();
   }

   public boolean g() {
      return switch (this.k().b()) {
         case a -> false;
         case b -> this.b instanceof cam && !(this.b instanceof cut);
         case c -> true;
      };
   }

   public boolean h() {
      return this.d() instanceof cut $$0 && $$0.gt().d;
   }

   @Nullable
   public fis i() {
      if (this.d != null) {
         return this.d;
      } else {
         return this.c != null ? this.c.dv() : null;
      }
   }

   @Nullable
   public fis j() {
      return this.d;
   }

   public boolean a(bae<byd> $$0) {
      return this.a.a($$0);
   }

   public boolean a(amd<byd> $$0) {
      return this.a.a($$0);
   }

   public byd k() {
      return this.a.a();
   }

   public jl<byd> l() {
      return this.a;
   }
}
