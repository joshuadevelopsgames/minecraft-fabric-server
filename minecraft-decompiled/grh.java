import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class grh implements aae {
   private static final xo j = xo.c("disconnect.lost");
   private static final Logger k = LogUtils.getLogger();
   protected final fue a;
   protected final wd b;
   @Nullable
   protected final grz c;
   @Nullable
   protected String d;
   protected final hxk e;
   @Nullable
   protected final get f;
   protected boolean g;
   private final List<grh.a> l = new ArrayList<>();
   protected final Map<ame, byte[]> h;
   protected Map<String, String> i;
   private amw m;

   protected grh(fue $$0, wd $$1, grp $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2.f();
      this.d = $$2.e();
      this.e = $$2.b();
      this.f = $$2.g();
      this.h = $$2.h();
      this.i = $$2.j();
      this.m = $$2.k();
   }

   public amw a() {
      return this.m;
   }

   @Override
   public void a(zw $$0, Exception $$1) {
      k.error("Failed to handle packet {}, disconnecting", $$0, $$1);
      Optional<Path> $$2 = this.a($$0, (Throwable)$$1);
      Optional<URI> $$3 = this.m.a(amw.b.a).map(amw.a::c);
      this.b.a(new wf(xo.c("disconnect.packetError"), $$2, $$3));
   }

   @Override
   public wf a(xo $$0, Throwable $$1) {
      Optional<Path> $$2 = this.a(null, $$1);
      Optional<URI> $$3 = this.m.a(amw.b.a).map(amw.a::c);
      return new wf($$0, $$2, $$3);
   }

   private Optional<Path> a(@Nullable zw $$0, Throwable $$1) {
      p $$2 = p.a($$1, "Packet handling error");
      zz.a($$2, this, $$0);
      Path $$3 = this.a.q.toPath().resolve("debug");
      Path $$4 = $$3.resolve("disconnect-" + ag.f() + "-client.txt");
      Optional<amw.a> $$5 = this.m.a(amw.b.a);
      List<String> $$6 = $$5.<List<String>>map($$0x -> List.of("Server bug reporting link: " + $$0x.c())).orElse(List.of());
      return $$2.a($$4, z.d, $$6) ? Optional.of($$4) : Optional.empty();
   }

   @Override
   public boolean a(zw<?> $$0) {
      return aae.super.a($$0) ? true : this.g && ($$0 instanceof aap || $$0 instanceof aaq);
   }

   @Override
   public void a(aaj $$0) {
      this.a(new aax($$0.b()), () -> !RenderSystem.isFrozenAtPollEvents(), Duration.ofMinutes(1L));
   }

   @Override
   public void a(aak $$0) {
      zz.a($$0, this, this.a);
      this.b(new aay($$0.b()));
   }

   @Override
   public void a(aag $$0) {
      abe $$1 = $$0.b();
      if (!($$1 instanceof abf)) {
         zz.a($$0, this, this.a);
         if ($$1 instanceof abc $$2) {
            this.d = $$2.b();
            this.e.a($$2.b());
         } else {
            this.a($$1);
         }
      }
   }

   protected abstract void a(abe var1);

   @Override
   public void a(aam $$0) {
      zz.a($$0, this, this.a);
      UUID $$1 = $$0.b();
      URL $$2 = a($$0.e());
      if ($$2 == null) {
         this.b.a(new aaz($$1, aaz.a.f));
      } else {
         String $$3 = $$0.f();
         boolean $$4 = $$0.g();
         grz.a $$5 = this.c != null ? this.c.b() : grz.a.c;
         if ($$5 != grz.a.c && (!$$4 || $$5 != grz.a.b)) {
            this.a.ag().a($$1, $$2, $$3);
         } else {
            this.a.a(this.a($$1, $$2, $$3, $$4, $$0.h().orElse(null)));
         }
      }
   }

   @Override
   public void a(aal $$0) {
      zz.a($$0, this, this.a);
      $$0.b().ifPresentOrElse($$0x -> this.a.ag().a($$0x), () -> this.a.ag().e());
   }

   static xo a(xo $$0, @Nullable xo $$1) {
      return (xo)($$1 == null ? $$0 : xo.a("multiplayer.texturePrompt.serverPrompt", $$0, $$1));
   }

   @Nullable
   private static URL a(String $$0) {
      try {
         URL $$1 = new URL($$0);
         String $$2 = $$1.getProtocol();
         return !"http".equals($$2) && !"https".equals($$2) ? null : $$1;
      } catch (MalformedURLException var3) {
         return null;
      }
   }

   @Override
   public void a(acl $$0) {
      zz.a($$0, this, this.a);
      this.b.a(new aco($$0.b(), this.h.get($$0.b())));
   }

   @Override
   public void a(aap $$0) {
      zz.a($$0, this, this.a);
      this.h.put($$0.b(), $$0.e());
   }

   @Override
   public void a(aah $$0) {
      zz.a($$0, this, this.a);
      this.i = $$0.b();
   }

   @Override
   public void a(aan $$0) {
      zz.a($$0, this, this.a);
      List<amw.c> $$1 = $$0.b();
      Builder<amw.a> $$2 = ImmutableList.builderWithExpectedSize($$1.size());

      for (amw.c $$3 : $$1) {
         try {
            URI $$4 = ag.a($$3.b());
            $$2.add(new amw.a($$3.a(), $$4));
         } catch (Exception var7) {
            k.warn("Received invalid link for type {}:{}", new Object[]{$$3.a(), $$3.b(), var7});
         }
      }

      this.m = new amw($$2.build());
   }

   @Override
   public void a(aao $$0) {
      zz.a($$0, this, this.a);
      this.a($$0.b(), this.a.z);
   }

   protected abstract gfi e();

   public void a(jl<art> $$0, @Nullable get $$1) {
      this.a($$0, this.e(), $$1);
   }

   protected void a(jl<art> $$0, gfi $$1, @Nullable get $$2) {
      if ($$2 instanceof gfl.a $$3) {
         get $$4 = $$3.l();
         get $$6 = $$4 instanceof gfl<?> $$5 ? $$5.n() : $$4;
         gfl<?> $$7 = gfm.a($$0.a(), $$6, $$1);
         if ($$7 != null) {
            $$3.a($$7);
         } else {
            k.warn("Failed to show dialog for data {}", $$0);
         }
      } else {
         get $$9;
         if ($$2 instanceof gfl<?> $$8) {
            $$9 = $$8.n();
         } else if ($$2 instanceof gfq $$10) {
            $$9 = $$10.l();
         } else {
            $$9 = $$2;
         }

         get $$13 = gfm.a($$0.a(), $$9, $$1);
         if ($$13 != null) {
            this.a.a($$13);
         } else {
            k.warn("Failed to show dialog for data {}", $$0);
         }
      }
   }

   @Override
   public void a(aaf $$0) {
      zz.a($$0, this, this.a);
      this.f();
   }

   public void f() {
      if (this.a.z instanceof gfl.a $$0) {
         if ($$0.l() instanceof gfl<?> $$2) {
            $$0.a($$2.n());
         }
      } else if (this.a.z instanceof gfl<?> $$3) {
         this.a.a($$3.n());
      }
   }

   @Override
   public void a(aaq $$0) {
      this.g = true;
      zz.a($$0, this, this.a);
      if (this.c == null) {
         throw new IllegalStateException("Cannot transfer to server from singleplayer");
      } else {
         this.b.a(xo.c("disconnect.transfer"));
         this.b.m();
         this.b.n();
         gtc $$1 = new gtc($$0.b(), $$0.e());
         gds.a(Objects.requireNonNullElseGet(this.f, gev::new), this.a, $$1, this.c, false, new gsd(this.h));
      }
   }

   @Override
   public void a(aai $$0) {
      this.b.a($$0.b());
   }

   protected void g() {
      Iterator<grh.a> $$0 = this.l.iterator();

      while ($$0.hasNext()) {
         grh.a $$1 = $$0.next();
         if ($$1.b().getAsBoolean()) {
            this.b($$1.a);
            $$0.remove();
         } else if ($$1.c() <= ag.c()) {
            $$0.remove();
         }
      }
   }

   public void b(zw<?> $$0) {
      this.b.a($$0);
   }

   @Override
   public void a(wf $$0) {
      this.e.c();
      this.a.a(this.b($$0), this.g);
      k.warn("Client disconnected with reason: {}", $$0.a().getString());
   }

   @Override
   public void a(p $$0, q $$1) {
      $$1.a("Is Local", () -> String.valueOf(this.b.e()));
      $$1.a("Server type", () -> this.c != null ? this.c.f().toString() : "<none>");
      $$1.a("Server brand", () -> this.d);
      if (!this.i.isEmpty()) {
         q $$2 = $$0.a("Custom Server Details");
         this.i.forEach($$2::a);
      }
   }

   protected get b(wf $$0) {
      get $$1 = Objects.requireNonNullElseGet(this.f, () -> new gid(new gev()));
      return this.c != null && this.c.e() ? new gea($$1, j, $$0, xn.k) : new gea($$1, j, $$0);
   }

   @Nullable
   public String h() {
      return this.d;
   }

   private void a(zw<? extends wy> $$0, BooleanSupplier $$1, Duration $$2) {
      if ($$1.getAsBoolean()) {
         this.b($$0);
      } else {
         this.l.add(new grh.a($$0, $$1, ag.c() + $$2.toMillis()));
      }
   }

   private get a(UUID $$0, URL $$1, String $$2, boolean $$3, @Nullable xo $$4) {
      get $$5 = this.a.z;
      return $$5 instanceof grh.b $$6 ? $$6.a(this.a, $$0, $$1, $$2, $$3, $$4) : new grh.b(this.a, $$5, List.of(new grh.b.a($$0, $$1, $$2)), $$3, $$4);
   }

   record a(zw<? extends wy> a, BooleanSupplier b, long c) {
   }

   class b extends gdr {
      private final List<grh.b.a> v;
      @Nullable
      private final get w;

      b(final fue $$0, @Nullable final get $$1, final List<grh.b.a> $$2, final boolean $$3, @Nullable final xo $$4) {
         super(
            $$5 -> {
               $$0.a($$1);
               hus $$6 = $$0.ag();
               if ($$5) {
                  if (grh.this.c != null) {
                     grh.this.c.a(grz.a.a);
                  }

                  $$6.g();
               } else {
                  $$6.h();
                  if ($$3) {
                     grh.this.b.a(xo.c("multiplayer.requiredTexturePrompt.disconnect"));
                  } else if (grh.this.c != null) {
                     grh.this.c.a(grz.a.b);
                  }
               }

               for (grh.b.a $$7 : $$2) {
                  $$6.a($$7.a, $$7.b, $$7.c);
               }

               if (grh.this.c != null) {
                  gsa.b(grh.this.c);
               }
            },
            $$3 ? xo.c("multiplayer.requiredTexturePrompt.line1") : xo.c("multiplayer.texturePrompt.line1"),
            grh.a($$3 ? xo.c("multiplayer.requiredTexturePrompt.line2").a(o.o, o.r) : xo.c("multiplayer.texturePrompt.line2"), $$4),
            $$3 ? xn.i : xn.f,
            $$3 ? xn.p : xn.g
         );
         this.v = $$2;
         this.w = $$1;
      }

      public grh.b a(fue $$0, UUID $$1, URL $$2, String $$3, boolean $$4, @Nullable xo $$5) {
         List<grh.b.a> $$6 = ImmutableList.builderWithExpectedSize(this.v.size() + 1).addAll(this.v).add(new grh.b.a($$1, $$2, $$3)).build();
         return grh.this.new b($$0, this.w, $$6, $$4, $$5);
      }

      record a(UUID a, URL b, String c) {
      }
   }
}
