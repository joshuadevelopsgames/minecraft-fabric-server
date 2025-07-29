import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record aba(aba.a c) implements abe {
   public static final zm<wg, aba> a = abe.a(aba::a, aba::new);
   public static final abe.b<aba> b = abe.a("debug/bee");

   private aba(wg $$0) {
      this(new aba.a($$0));
   }

   private void a(wg $$0) {
      this.c.a($$0);
   }

   @Override
   public abe.b<aba> a() {
      return b;
   }

   public aba.a b() {
      return this.c;
   }

   public record a(UUID a, int b, fis c, @Nullable faz d, @Nullable jb e, @Nullable jb f, int g, Set<String> h, List<jb> i) {
      public a(wg $$0) {
         this($$0.n(), $$0.readInt(), $$0.k(), $$0.c(faz::b), $$0.c(jb.b), $$0.c(jb.b), $$0.readInt(), $$0.a(HashSet::new, wg::p), $$0.a(jb.b));
      }

      public void a(wg $$0) {
         $$0.a(this.a);
         $$0.q(this.b);
         $$0.a(this.c);
         $$0.a(this.d, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.e, jb.b);
         $$0.a(this.f, jb.b);
         $$0.q(this.g);
         $$0.a(this.h, wg::a);
         $$0.a(this.i, jb.b);
      }

      public boolean a(jb $$0) {
         return Objects.equals($$0, this.e);
      }

      public String a() {
         return ahi.a(this.a);
      }

      @Override
      public String toString() {
         return this.a();
      }

      public UUID b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public fis d() {
         return this.c;
      }

      @Nullable
      public faz e() {
         return this.d;
      }

      @Nullable
      public jb f() {
         return this.e;
      }

      @Nullable
      public jb g() {
         return this.f;
      }

      public int h() {
         return this.g;
      }

      public Set<String> i() {
         return this.h;
      }

      public List<jb> j() {
         return this.i;
      }
   }
}
