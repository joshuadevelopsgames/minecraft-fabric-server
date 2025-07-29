import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class gjb {
   private final awz a;
   final List<aww> b;
   final List<aww> c;
   final Function<aww, ame> d;
   final Runnable e;
   private final Consumer<awz> f;

   public gjb(Runnable $$0, Function<aww, ame> $$1, awz $$2, Consumer<awz> $$3) {
      this.e = $$0;
      this.d = $$1;
      this.a = $$2;
      this.b = Lists.newArrayList($$2.g());
      Collections.reverse(this.b);
      this.c = Lists.newArrayList($$2.d());
      this.c.removeAll(this.b);
      this.f = $$3;
   }

   public Stream<gjb.a> a() {
      return this.c.stream().map($$0 -> new gjb.d($$0));
   }

   public Stream<gjb.a> b() {
      return this.b.stream().map($$0 -> new gjb.c($$0));
   }

   void e() {
      this.a.b(Lists.reverse(this.b).stream().map(aww::g).collect(ImmutableList.toImmutableList()));
   }

   public void c() {
      this.e();
      this.f.accept(this.a);
   }

   public void d() {
      this.a.a();
      this.b.retainAll(this.a.d());
      this.c.clear();
      this.c.addAll(this.a.d());
      this.c.removeAll(this.b);
   }

   public interface a {
      ame a();

      awx b();

      String c();

      xo d();

      xo e();

      axa f();

      default xo g() {
         return this.f().a(this.e());
      }

      boolean h();

      boolean i();

      void j();

      void k();

      void l();

      void m();

      boolean n();

      default boolean o() {
         return !this.n();
      }

      default boolean p() {
         return this.n() && !this.i();
      }

      boolean q();

      boolean r();
   }

   abstract class b implements gjb.a {
      private final aww b;

      public b(final aww $$0) {
         this.b = $$0;
      }

      protected abstract List<aww> s();

      protected abstract List<aww> t();

      @Override
      public ame a() {
         return gjb.this.d.apply(this.b);
      }

      @Override
      public awx b() {
         return this.b.d();
      }

      @Override
      public String c() {
         return this.b.g();
      }

      @Override
      public xo d() {
         return this.b.b();
      }

      @Override
      public xo e() {
         return this.b.c();
      }

      @Override
      public axa f() {
         return this.b.l();
      }

      @Override
      public boolean h() {
         return this.b.j();
      }

      @Override
      public boolean i() {
         return this.b.i();
      }

      protected void u() {
         this.s().remove(this.b);
         this.b.k().a(this.t(), this.b, aww::h, true);
         gjb.this.e.run();
         gjb.this.e();
         this.v();
      }

      private void v() {
         if (this.b.g().equals("high_contrast")) {
            fuh<Boolean> $$0 = fue.R().n.v();
            $$0.a(!$$0.c());
         }
      }

      protected void a(int $$0) {
         List<aww> $$1 = this.s();
         int $$2 = $$1.indexOf(this.b);
         $$1.remove($$2);
         $$1.add($$2 + $$0, this.b);
         gjb.this.e.run();
      }

      @Override
      public boolean q() {
         List<aww> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 > 0 && !$$0.get($$1 - 1).j();
      }

      @Override
      public void l() {
         this.a(-1);
      }

      @Override
      public boolean r() {
         List<aww> $$0 = this.s();
         int $$1 = $$0.indexOf(this.b);
         return $$1 >= 0 && $$1 < $$0.size() - 1 && !$$0.get($$1 + 1).j();
      }

      @Override
      public void m() {
         this.a(1);
      }
   }

   class c extends gjb.b {
      public c(final aww $$0) {
         super($$0);
      }

      @Override
      protected List<aww> s() {
         return gjb.this.b;
      }

      @Override
      protected List<aww> t() {
         return gjb.this.c;
      }

      @Override
      public boolean n() {
         return true;
      }

      @Override
      public void j() {
      }

      @Override
      public void k() {
         this.u();
      }
   }

   class d extends gjb.b {
      public d(final aww $$0) {
         super($$0);
      }

      @Override
      protected List<aww> s() {
         return gjb.this.c;
      }

      @Override
      protected List<aww> t() {
         return gjb.this.b;
      }

      @Override
      public boolean n() {
         return false;
      }

      @Override
      public void j() {
         this.u();
      }

      @Override
      public void k() {
      }
   }
}
