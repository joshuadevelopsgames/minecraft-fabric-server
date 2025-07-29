import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public final class fal extends eed<fak, fal> {
   public static final Codec<fal> a = a(mm.c.q(), fak::g).stable();
   public static final int f = 9;
   public static final int g = 8;

   public fal(fak $$0, Reference2ObjectArrayMap<efe<?>, Comparable<?>> $$1, MapCodec<fal> $$2) {
      super($$0, $$1, $$2);
   }

   public fak a() {
      return this.d;
   }

   public boolean b() {
      return this.a().c(this);
   }

   public boolean a(fak $$0) {
      return this.d == $$0 && this.d.c(this);
   }

   public boolean c() {
      return this.a().b();
   }

   public float a(dly $$0, jb $$1) {
      return this.a().a(this, $$0, $$1);
   }

   public float d() {
      return this.a().a(this);
   }

   public int e() {
      return this.a().d(this);
   }

   public boolean b(dly $$0, jb $$1) {
      for (int $$2 = -1; $$2 <= 1; $$2++) {
         for (int $$3 = -1; $$3 <= 1; $$3++) {
            jb $$4 = $$1.b($$2, 0, $$3);
            fal $$5 = $$0.b_($$4);
            if (!$$5.a().a(this.a()) && !$$0.a_($$4).s()) {
               return true;
            }
         }
      }

      return false;
   }

   public void a(aub $$0, jb $$1, eeb $$2) {
      this.a().b($$0, $$1, $$2, this);
   }

   public void a(dmu $$0, jb $$1, bck $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public boolean f() {
      return this.a().i();
   }

   public void a(aub $$0, jb $$1, bck $$2) {
      this.a().a($$0, $$1, this, $$2);
   }

   public fis c(dly $$0, jb $$1) {
      return this.a().a($$0, $$1, this);
   }

   public eeb g() {
      return this.a().b(this);
   }

   @Nullable
   public mc h() {
      return this.a().h();
   }

   public boolean a(bae<fak> $$0) {
      return this.a().k().a($$0);
   }

   public boolean a(jp<fak> $$0) {
      return $$0.a(this.a().k());
   }

   public boolean b(fak $$0) {
      return this.a() == $$0;
   }

   public float i() {
      return this.a().c();
   }

   public boolean a(dly $$0, jb $$1, fak $$2, jh $$3) {
      return this.a().a(this, $$0, $$1, $$2, $$3);
   }

   public fjm d(dly $$0, jb $$1) {
      return this.a().b(this, $$0, $$1);
   }

   @Nullable
   public fin e(dly $$0, jb $$1) {
      return this.a().c(this, $$0, $$1);
   }

   public jl<fak> j() {
      return this.d.k();
   }

   public Stream<bae<fak>> k() {
      return this.d.k().c();
   }

   public void a(dmu $$0, jb $$1, bzm $$2, cae $$3) {
      this.a().a($$0, $$1, $$2, $$3);
   }
}
