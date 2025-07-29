import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class ta {
   public static final Codec<ta> b = mm.aC.q().dispatch(ta::a, $$0 -> $$0);
   private final tt<jl<tu>> a;

   public static MapCodec<? extends ta> a(jy<MapCodec<? extends ta>> $$0) {
      a($$0, "block_based", sl.a);
      return a($$0, "function", sp.a);
   }

   private static MapCodec<? extends ta> a(jy<MapCodec<? extends ta>> $$0, String $$1, MapCodec<? extends ta> $$2) {
      return jy.a($$0, amd.a(mn.aD, ame.b($$1)), $$2);
   }

   protected ta(tt<jl<tu>> $$0) {
      this.a = $$0;
   }

   public abstract void a(sy var1);

   public abstract MapCodec<? extends ta> a();

   public jl<tu> d() {
      return this.a.a();
   }

   public ame e() {
      return this.a.b();
   }

   public int f() {
      return this.a.c();
   }

   public int g() {
      return this.a.d();
   }

   public boolean h() {
      return this.a.e();
   }

   public boolean i() {
      return this.a.g();
   }

   public int j() {
      return this.a.h();
   }

   public int k() {
      return this.a.i();
   }

   public boolean l() {
      return this.a.j();
   }

   public dwu m() {
      return this.a.f();
   }

   protected tt<jl<tu>> n() {
      return this.a;
   }

   protected abstract yc b();

   public xo c() {
      return this.o().b(this.p());
   }

   protected yc o() {
      return this.a("test_instance.description.type", this.b());
   }

   protected xo p() {
      return this.a("test_instance.description.structure", this.a.b().toString()).b(this.a("test_instance.description.batch", this.a.a().g()));
   }

   protected yc a(String $$0, String $$1) {
      return this.a($$0, xo.b($$1));
   }

   protected yc a(String $$0, yc $$1) {
      return xo.a($$0, $$1.a(o.j)).b(xo.b("\n"));
   }
}
