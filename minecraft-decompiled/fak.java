import java.util.Optional;
import javax.annotation.Nullable;

public abstract class fak {
   public static final jr<fal> c = new jr<>();
   protected final eec<fak, fal> d;
   private fal a;
   private final jl.c<fak> b = mm.c.f(this);

   protected fak() {
      eec.a<fak, fal> $$0 = new eec.a<>(this);
      this.a($$0);
      this.d = $$0.a(fak::g, fal::new);
      this.f(this.d.b());
   }

   protected void a(eec.a<fak, fal> $$0) {
   }

   public eec<fak, fal> f() {
      return this.d;
   }

   protected final void f(fal $$0) {
      this.a = $$0;
   }

   public final fal g() {
      return this.a;
   }

   public abstract dcr a();

   protected void a(dmu $$0, jb $$1, fal $$2, bck $$3) {
   }

   protected void b(aub $$0, jb $$1, eeb $$2, fal $$3) {
   }

   protected void a(aub $$0, jb $$1, fal $$2, bck $$3) {
   }

   protected void a(dmu $$0, jb $$1, bzm $$2, cae $$3) {
   }

   @Nullable
   protected mc h() {
      return null;
   }

   protected abstract boolean a(fal var1, dly var2, jb var3, fak var4, jh var5);

   protected abstract fis a(dly var1, jb var2, fal var3);

   public abstract int a(dmx var1);

   protected boolean i() {
      return false;
   }

   protected boolean b() {
      return false;
   }

   protected abstract float c();

   public abstract float a(fal var1, dly var2, jb var3);

   public abstract float a(fal var1);

   protected abstract eeb b(fal var1);

   public abstract boolean c(fal var1);

   public abstract int d(fal var1);

   public boolean a(fak $$0) {
      return $$0 == this;
   }

   @Deprecated
   public boolean a(bae<fak> $$0) {
      return this.b.a($$0);
   }

   public abstract fjm b(fal var1, dly var2, jb var3);

   @Nullable
   public fin c(fal $$0, dly $$1, jb $$2) {
      if (this.b()) {
         return null;
      } else {
         float $$3 = $$0.a($$1, $$2);
         return new fin($$2.u(), $$2.v(), $$2.w(), $$2.u() + 1.0, $$2.v() + $$3, $$2.w() + 1.0);
      }
   }

   public Optional<ayy> j() {
      return Optional.empty();
   }

   @Deprecated
   public jl.c<fak> k() {
      return this.b;
   }
}
