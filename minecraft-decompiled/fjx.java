import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectMap;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.slf4j.Logger;

public class fjx {
   public static final String b = "#";
   private static final Logger a = LogUtils.getLogger();
   private final Object2ObjectMap<String, fjp> c = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Reference2ObjectMap<fka, List<fjp>> d = new Reference2ObjectOpenHashMap();
   private final Map<String, fjr> e = new Object2ObjectOpenHashMap(16, 0.5F);
   private final Map<fjo, fjp> f = new EnumMap<>(fjo.class);
   private final Object2ObjectMap<String, fjs> g = new Object2ObjectOpenHashMap();
   private final Object2ObjectMap<String, fjs> h = new Object2ObjectOpenHashMap();

   @Nullable
   public fjp a(@Nullable String $$0) {
      return (fjp)this.c.get($$0);
   }

   public fjp a(String $$0, fka $$1, xo $$2, fka.a $$3, boolean $$4, @Nullable ze $$5) {
      if (this.c.containsKey($$0)) {
         throw new IllegalArgumentException("An objective with the name '" + $$0 + "' already exists!");
      } else {
         fjp $$6 = new fjp(this, $$0, $$1, $$2, $$3, $$4, $$5);
         ((List)this.d.computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$6);
         this.c.put($$0, $$6);
         this.a($$6);
         return $$6;
      }
   }

   public final void a(fka $$0, fjw $$1, Consumer<fjv> $$2) {
      ((List)this.d.getOrDefault($$0, Collections.emptyList())).forEach($$2x -> $$2.accept(this.a($$1, $$2x, true)));
   }

   private fjr f(String $$0) {
      return this.e.computeIfAbsent($$0, $$0x -> new fjr());
   }

   public fjv c(fjw $$0, fjp $$1) {
      return this.a($$0, $$1, false);
   }

   public fjv a(final fjw $$0, final fjp $$1, boolean $$2) {
      final boolean $$3 = $$2 || !$$1.d().e();
      fjr $$4 = this.f($$0.cM());
      final MutableBoolean $$5 = new MutableBoolean();
      final fju $$6 = $$4.a($$1, $$1x -> $$5.setTrue());
      return new fjv() {
         @Override
         public int a() {
            return $$6.a();
         }

         @Override
         public void a(int $$0x) {
            if (!$$3) {
               throw new IllegalStateException("Cannot modify read-only score");
            } else {
               boolean $$1x = $$5.isTrue();
               if ($$1.f()) {
                  xo $$2x = $$0.Q_();
                  if ($$2x != null && !$$2x.equals($$6.d())) {
                     $$6.a($$2x);
                     $$1x = true;
                  }
               }

               if ($$0 != $$6.a()) {
                  $$6.a($$0);
                  $$1x = true;
               }

               if ($$1x) {
                  this.h();
               }
            }
         }

         @Nullable
         @Override
         public xo g() {
            return $$6.d();
         }

         @Override
         public void a(@Nullable xo $$0x) {
            if ($$5.isTrue() || !Objects.equals($$0, $$6.d())) {
               $$6.a($$0);
               this.h();
            }
         }

         @Override
         public void a(@Nullable ze $$0x) {
            $$6.b($$0);
            this.h();
         }

         @Override
         public boolean d() {
            return $$6.b();
         }

         @Override
         public void e() {
            this.a(false);
         }

         @Override
         public void f() {
            this.a(true);
         }

         private void a(boolean $$0x) {
            $$6.a($$0);
            if ($$5.isTrue()) {
               this.h();
            }

            fjx.this.a($$0, $$1);
         }

         private void h() {
            fjx.this.a($$0, $$1, $$6);
            $$5.setFalse();
         }
      };
   }

   @Nullable
   public fjt d(fjw $$0, fjp $$1) {
      fjr $$2 = this.e.get($$0.cM());
      return $$2 != null ? $$2.a($$1) : null;
   }

   public Collection<fjq> i(fjp $$0) {
      List<fjq> $$1 = new ArrayList<>();
      this.e.forEach(($$2, $$3) -> {
         fju $$4 = $$3.a($$0);
         if ($$4 != null) {
            $$1.add(new fjq($$2, $$4.a(), $$4.d(), $$4.c()));
         }
      });
      return $$1;
   }

   public Collection<fjp> b() {
      return this.c.values();
   }

   public Collection<String> c() {
      return this.c.keySet();
   }

   public Collection<fjw> d() {
      return this.e.keySet().stream().map(fjw::c).toList();
   }

   public void b(fjw $$0) {
      fjr $$1 = this.e.remove($$0.cM());
      if ($$1 != null) {
         this.a($$0);
      }
   }

   public void e(fjw $$0, fjp $$1) {
      fjr $$2 = this.e.get($$0.cM());
      if ($$2 != null) {
         boolean $$3 = $$2.b($$1);
         if (!$$2.a()) {
            fjr $$4 = this.e.remove($$0.cM());
            if ($$4 != null) {
               this.a($$0);
            }
         } else if ($$3) {
            this.b($$0, $$1);
         }
      }
   }

   public Object2IntMap<fjp> c(fjw $$0) {
      fjr $$1 = this.e.get($$0.cM());
      return $$1 != null ? $$1.b() : Object2IntMaps.emptyMap();
   }

   public void j(fjp $$0) {
      this.c.remove($$0.c());

      for (fjo $$1 : fjo.values()) {
         if (this.a($$1) == $$0) {
            this.a($$1, null);
         }
      }

      List<fjp> $$2 = (List<fjp>)this.d.get($$0.d());
      if ($$2 != null) {
         $$2.remove($$0);
      }

      for (fjr $$3 : this.e.values()) {
         $$3.b($$0);
      }

      this.c($$0);
   }

   public void a(fjo $$0, @Nullable fjp $$1) {
      this.f.put($$0, $$1);
   }

   @Nullable
   public fjp a(fjo $$0) {
      return this.f.get($$0);
   }

   @Nullable
   public fjs b(String $$0) {
      return (fjs)this.g.get($$0);
   }

   public fjs c(String $$0) {
      fjs $$1 = this.b($$0);
      if ($$1 != null) {
         a.warn("Requested creation of existing team '{}'", $$0);
         return $$1;
      } else {
         $$1 = new fjs(this, $$0);
         this.g.put($$0, $$1);
         this.a($$1);
         return $$1;
      }
   }

   public void d(fjs $$0) {
      this.g.remove($$0.c());

      for (String $$1 : $$0.h()) {
         this.h.remove($$1);
      }

      this.c($$0);
   }

   public boolean a(String $$0, fjs $$1) {
      if (this.e($$0) != null) {
         this.d($$0);
      }

      this.h.put($$0, $$1);
      return $$1.h().add($$0);
   }

   public boolean d(String $$0) {
      fjs $$1 = this.e($$0);
      if ($$1 != null) {
         this.b($$0, $$1);
         return true;
      } else {
         return false;
      }
   }

   public void b(String $$0, fjs $$1) {
      if (this.e($$0) != $$1) {
         throw new IllegalStateException("Player is either on another team or not on any team. Cannot remove from team '" + $$1.c() + "'.");
      } else {
         this.h.remove($$0);
         $$1.h().remove($$0);
      }
   }

   public Collection<String> e() {
      return this.g.keySet();
   }

   public Collection<fjs> f() {
      return this.g.values();
   }

   @Nullable
   public fjs e(String $$0) {
      return (fjs)this.h.get($$0);
   }

   public void a(fjp $$0) {
   }

   public void b(fjp $$0) {
   }

   public void c(fjp $$0) {
   }

   protected void a(fjw $$0, fjp $$1, fju $$2) {
   }

   protected void a(fjw $$0, fjp $$1) {
   }

   public void a(fjw $$0) {
   }

   public void b(fjw $$0, fjp $$1) {
   }

   public void a(fjs $$0) {
   }

   public void b(fjs $$0) {
   }

   public void c(fjs $$0) {
   }

   public void a(bzm $$0) {
      if (!($$0 instanceof cut) && !$$0.bO()) {
         this.b($$0);
         this.d($$0.cM());
      }
   }

   protected List<fjx.a> g() {
      return this.e.entrySet().stream().flatMap($$0 -> {
         String $$1 = $$0.getKey();
         return $$0.getValue().c().entrySet().stream().map($$1x -> new fjx.a($$1, ((fjp)$$1x.getKey()).c(), (fju)$$1x.getValue()));
      }).toList();
   }

   protected void a(fjx.a $$0) {
      fjp $$1 = this.a($$0.c);
      if ($$1 == null) {
         a.error("Unknown objective {} for name {}, ignoring", $$0.c, $$0.b);
      } else {
         this.f($$0.b).a($$1, $$0.d);
      }
   }

   protected void a(fjs.a $$0) {
      fjs $$1 = this.c($$0.a());
      $$0.b().ifPresent($$1::a);
      $$0.c().ifPresent($$1::a);
      $$1.a($$0.d());
      $$1.b($$0.e());
      $$1.b($$0.f());
      $$1.c($$0.g());
      $$1.a($$0.h());
      $$1.b($$0.i());
      $$1.a($$0.j());

      for (String $$2 : $$0.k()) {
         this.a($$2, $$1);
      }
   }

   protected void a(fjp.a $$0) {
      this.a($$0.a(), $$0.b(), $$0.c(), $$0.d(), $$0.e(), $$0.f().orElse(null));
   }

   public record a(String b, String c, fju d) {
      public static final Codec<fjx.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.STRING.fieldOf("Name").forGetter(fjx.a::a), Codec.STRING.fieldOf("Objective").forGetter(fjx.a::b), fju.a.forGetter(fjx.a::c))
            .apply($$0, fjx.a::new)
      );

      public String a() {
         return this.b;
      }

      public String b() {
         return this.c;
      }

      public fju c() {
         return this.d;
      }
   }
}
