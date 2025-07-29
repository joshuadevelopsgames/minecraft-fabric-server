import com.google.common.collect.Sets;
import java.util.Set;

public record aeh(int b, boolean c, Set<amd<dmu>> d, int e, int f, int g, boolean h, boolean i, boolean j, ahh k, boolean l) implements zw<acq> {
   public static final zm<wx, aeh> a = zw.a(aeh::a, aeh::new);

   private aeh(wx $$0) {
      this(
         $$0.readInt(),
         $$0.readBoolean(),
         $$0.a(Sets::newHashSetWithExpectedSize, $$0x -> $$0x.a(mn.bu)),
         $$0.l(),
         $$0.l(),
         $$0.l(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         $$0.readBoolean(),
         new ahh($$0),
         $$0.readBoolean()
      );
   }

   private void a(wx $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.a(this.d, wg::b);
      $$0.c(this.e);
      $$0.c(this.f);
      $$0.c(this.g);
      $$0.a(this.h);
      $$0.a(this.i);
      $$0.a(this.j);
      this.k.a($$0);
      $$0.a(this.l);
   }

   @Override
   public zy<aeh> a() {
      return ahk.O;
   }

   public void a(acq $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }

   public Set<amd<dmu>> f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }

   public int i() {
      return this.g;
   }

   public boolean j() {
      return this.h;
   }

   public boolean k() {
      return this.i;
   }

   public boolean l() {
      return this.j;
   }

   public ahh m() {
      return this.k;
   }

   public boolean n() {
      return this.l;
   }
}
