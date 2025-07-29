import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntFunction;

public class ecu extends eaz implements eat, ebc {
   private static final xo a = xo.c("test_instance_block.invalid_test");
   private static final List<eat.a> b = List.of();
   private static final List<eat.a> c = List.of(new eat.a(baj.a(128, 128, 128)));
   private static final List<eat.a> d = List.of(new eat.a(baj.a(0, 255, 0)));
   private static final List<eat.a> e = List.of(new eat.a(baj.a(255, 0, 0)));
   private static final List<eat.a> f = List.of(new eat.a(baj.a(255, 128, 0)));
   private static final kg g = new kg(0, 1, 1);
   private ecu.a h = new ecu.a(Optional.empty(), kg.i, dwu.a, false, ecu.b.a, Optional.empty());

   public ecu(jb $$0, eeb $$1) {
      super(ebb.U, $$0, $$1);
   }

   public void a(ecu.a $$0) {
      this.h = $$0;
      this.e();
   }

   public static Optional<kg> a(aub $$0, amd<ta> $$1) {
      return b($$0, $$1).map(eza::a);
   }

   public euq d() {
      jb $$0 = this.B();
      jb $$1 = $$0.a(this.H()).b(-1, -1, -1);
      return euq.a($$0, $$1);
   }

   public fin f() {
      return fin.a(this.d());
   }

   private static Optional<eza> b(aub $$0, amd<ta> $$1) {
      return $$0.K_().c($$1).map($$0x -> ((ta)$$0x.a()).e()).flatMap($$1x -> $$0.s().b($$1x));
   }

   public Optional<amd<ta>> j() {
      return this.h.a();
   }

   public xo k() {
      return this.j().map($$0 -> xo.b($$0.a().toString())).orElse(a);
   }

   private Optional<jl.c<ta>> G() {
      return this.j().flatMap(this.n.K_()::c);
   }

   public boolean u() {
      return this.h.d();
   }

   public kg v() {
      return this.h.b();
   }

   public dwu w() {
      return this.G().map(jl::a).map(ta::m).orElse(dwu.a).a(this.h.c());
   }

   public Optional<xo> x() {
      return this.h.f();
   }

   public void a(xo $$0) {
      this.a(this.h.a($$0));
   }

   public void y() {
      this.a(this.h.a(ecu.b.c));
      this.F();
   }

   public void z() {
      this.a(this.h.a(ecu.b.b));
   }

   @Override
   public void e() {
      super.e();
      if (this.n instanceof aub) {
         this.n.a(this.aA_(), dqb.a.m(), this.m(), 3);
      }
   }

   public acw A() {
      return acw.a(this);
   }

   @Override
   public ui a(jn.a $$0) {
      return this.d($$0);
   }

   @Override
   protected void a(fda $$0) {
      $$0.<ecu.a>a("data", ecu.a.a).ifPresent(this::a);
   }

   @Override
   protected void a(fdc $$0) {
      $$0.a("data", ecu.a.a, this.h);
   }

   @Override
   public ebc.a b() {
      return ebc.a.b;
   }

   public jb B() {
      return a(this.aA_());
   }

   public static jb a(jb $$0) {
      return $$0.a(g);
   }

   @Override
   public ebc.b c() {
      return new ebc.b(new jb(g), this.H());
   }

   @Override
   public List<eat.a> a() {
      return switch (this.h.e()) {
         case a -> b;
         case b -> c;
         case c -> this.x().isEmpty() ? d : (this.G().map(jl::a).map(ta::h).orElse(true) ? e : f);
      };
   }

   private kg H() {
      kg $$0 = this.v();
      dwu $$1 = this.w();
      boolean $$2 = $$1 == dwu.b || $$1 == dwu.d;
      int $$3 = $$2 ? $$0.w() : $$0.u();
      int $$4 = $$2 ? $$0.u() : $$0.w();
      return new kg($$3, $$0.v(), $$4);
   }

   public void a(Consumer<xo> $$0) {
      this.F();
      boolean $$1 = this.C();
      if ($$1) {
         $$0.accept(xo.a("test_instance_block.reset_success", this.k()).a(o.k));
      }

      this.a(this.h.a(ecu.b.a));
   }

   public Optional<ame> b(Consumer<xo> $$0) {
      Optional<jl.c<ta>> $$1 = this.G();
      Optional<ame> $$2;
      if ($$1.isPresent()) {
         $$2 = Optional.of($$1.get().a().e());
      } else {
         $$2 = this.j().map(amd::a);
      }

      if ($$2.isEmpty()) {
         jb $$4 = this.aA_();
         $$0.accept(xo.a("test_instance_block.error.unable_to_save", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         return $$2;
      } else {
         if (this.n instanceof aub $$5) {
            ecs.a($$5, $$2.get(), this.B(), this.v(), this.u(), "", true, List.of(dqb.a));
         }

         return $$2;
      }
   }

   public boolean c(Consumer<xo> $$0) {
      Optional<ame> $$1 = this.b($$0);
      return !$$1.isEmpty() && this.n instanceof aub $$2 ? a($$2, $$1.get(), $$0) : false;
   }

   public static boolean a(aub $$0, ame $$1, Consumer<xo> $$2) {
      Path $$3 = tr.c;
      Path $$4 = $$0.s().a($$1, ".nbt");
      Path $$5 = pe.a(mr.a, $$4, $$1.a(), $$3.resolve($$1.b()).resolve("structure"));
      if ($$5 == null) {
         $$2.accept(xo.b("Failed to export " + $$4).a(o.m));
         return true;
      } else {
         try {
            w.c($$5.getParent());
         } catch (IOException var7) {
            $$2.accept(xo.b("Could not create folder " + $$5.getParent()).a(o.m));
            return true;
         }

         $$2.accept(xo.b("Exported " + $$1 + " to " + $$5.toAbsolutePath()));
         return false;
      }
   }

   public void d(Consumer<xo> $$0) {
      if (this.n instanceof aub $$1) {
         Optional var7 = this.G();
         jb $$4 = this.aA_();
         if (var7.isEmpty()) {
            $$0.accept(xo.a("test_instance_block.error.no_test", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else if (!this.C()) {
            $$0.accept(xo.a("test_instance_block.error.no_test_structure", $$4.u(), $$4.v(), $$4.w()).a(o.m));
         } else {
            te.a($$1);
            th.a.a();
            so.b();
            $$0.accept(xo.a("test_instance_block.starting", ((jl.c)var7.get()).g()));
            sz $$5 = new sz((jl.c<ta>)var7.get(), this.h.c(), $$1, tp.a());
            $$5.a($$4);
            te $$6 = te.a.b(List.of($$5), $$1).a();
            ts.a($$1.q().aH(), $$6);
         }
      }
   }

   public boolean C() {
      if (this.n instanceof aub $$0) {
         Optional<eza> $$1 = this.h.a().flatMap($$1x -> b($$0, (amd<ta>)$$1x));
         if ($$1.isPresent()) {
            this.a($$0, $$1.get());
            return true;
         }
      }

      return false;
   }

   private void a(aub $$0, eza $$1) {
      eyw $$2 = new eyw().a(this.w()).a(this.h.d()).b(true);
      jb $$3 = this.D();
      this.J();
      this.I();
      $$1.a($$0, $$3, $$3, $$2, $$0.H_(), 818);
   }

   private void I() {
      this.n.a_(null, this.f()).stream().filter($$0 -> !($$0 instanceof cut)).forEach(bzm::at);
   }

   private void J() {
      if (this.n instanceof aub $$0) {
         this.d().b().forEach($$1 -> $$0.a($$1.h, $$1.i, true));
      }
   }

   public jb D() {
      kg $$0 = this.v();
      dwu $$1 = this.w();
      jb $$2 = this.B();

      return switch ($$1) {
         case a -> $$2;
         case b -> $$2.b($$0.w() - 1, 0, 0);
         case c -> $$2.b($$0.u() - 1, 0, $$0.w() - 1);
         case d -> $$2.b(0, 0, $$0.u() - 1);
      };
   }

   public void E() {
      this.e($$0 -> {
         if (!this.n.a_($$0).a(dqb.pK)) {
            this.n.c($$0, dqb.iy.m());
         }
      });
   }

   public void F() {
      this.e($$0 -> {
         if (this.n.a_($$0).a(dqb.iy)) {
            this.n.c($$0, dqb.a.m());
         }
      });
   }

   public void e(Consumer<jb> $$0) {
      fin $$1 = this.f();
      boolean $$2 = !this.G().map($$0x -> ((ta)$$0x.a()).l()).orElse(false);
      jb $$3 = jb.a($$1.a, $$1.b, $$1.c).b(-1, -1, -1);
      jb $$4 = jb.a($$1.d, $$1.e, $$1.f);
      jb.d($$3, $$4).forEach($$4x -> {
         boolean $$5 = $$4x.u() == $$3.u() || $$4x.u() == $$4.u() || $$4x.w() == $$3.w() || $$4x.w() == $$4.w() || $$4x.v() == $$3.v();
         boolean $$6 = $$4x.v() == $$4.v();
         if ($$5 || $$6 && $$2) {
            $$0.accept($$4x);
         }
      });
   }

   public record a(Optional<amd<ta>> c, kg d, dwu e, boolean f, ecu.b g, Optional<xo> h) {
      public static final Codec<ecu.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(
               amd.a(mn.bm).optionalFieldOf("test").forGetter(ecu.a::a),
               kg.g.fieldOf("size").forGetter(ecu.a::b),
               dwu.f.fieldOf("rotation").forGetter(ecu.a::c),
               Codec.BOOL.fieldOf("ignore_entities").forGetter(ecu.a::d),
               ecu.b.d.fieldOf("status").forGetter(ecu.a::e),
               xq.a.optionalFieldOf("error_message").forGetter(ecu.a::f)
            )
            .apply($$0, ecu.a::new)
      );
      public static final zm<wx, ecu.a> b = zm.a(
         zk.a(amd.b(mn.bm)), ecu.a::a, kg.h, ecu.a::b, dwu.g, ecu.a::c, zk.b, ecu.a::d, ecu.b.e, ecu.a::e, zk.a(xq.b), ecu.a::f, ecu.a::new
      );

      public ecu.a a(kg $$0) {
         return new ecu.a(this.c, $$0, this.e, this.f, this.g, this.h);
      }

      public ecu.a a(ecu.b $$0) {
         return new ecu.a(this.c, this.d, this.e, this.f, $$0, Optional.empty());
      }

      public ecu.a a(xo $$0) {
         return new ecu.a(this.c, this.d, this.e, this.f, ecu.b.c, Optional.of($$0));
      }

      public Optional<amd<ta>> a() {
         return this.c;
      }

      public kg b() {
         return this.d;
      }

      public dwu c() {
         return this.e;
      }

      public boolean d() {
         return this.f;
      }

      public ecu.b e() {
         return this.g;
      }

      public Optional<xo> f() {
         return this.h;
      }
   }

   public static enum b implements bda {
      a("cleared", 0),
      b("running", 1),
      c("finished", 2);

      private static final IntFunction<ecu.b> f = baq.a($$0 -> $$0.h, values(), baq.a.a);
      public static final Codec<ecu.b> d = bda.a(ecu.b::values);
      public static final zm<ByteBuf, ecu.b> e = zk.a(ecu.b::a, $$0 -> $$0.h);
      private final String g;
      private final int h;

      private b(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      @Override
      public String c() {
         return this.g;
      }

      public static ecu.b a(int $$0) {
         return f.apply($$0);
      }
   }
}
