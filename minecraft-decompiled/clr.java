import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class clr {
   private static final Logger a = LogUtils.getLogger();
   private final Short2ObjectMap<clq> b = new Short2ObjectOpenHashMap();
   private final Map<jl<cls>, Set<clq>> c = Maps.newHashMap();
   private final Runnable d;
   private boolean e;

   public clr(Runnable $$0) {
      this($$0, true, ImmutableList.of());
   }

   clr(Runnable $$0, boolean $$1, List<clq> $$2) {
      this.d = $$0;
      this.e = $$1;
      $$2.forEach(this::a);
   }

   public clr.a a() {
      return new clr.a(this.e, this.b.values().stream().map(clq::a).toList());
   }

   public Stream<clq> a(Predicate<jl<cls>> $$0, clp.b $$1) {
      return this.c.entrySet().stream().filter($$1x -> $$0.test((jl<cls>)$$1x.getKey())).flatMap($$0x -> ((Set)$$0x.getValue()).stream()).filter($$1.a());
   }

   public void a(jb $$0, jl<cls> $$1) {
      if (this.a(new clq($$0, $$1, this.d))) {
         a.debug("Added POI of type {} @ {}", $$1.g(), $$0);
         this.d.run();
      }
   }

   private boolean a(clq $$0) {
      jb $$1 = $$0.g();
      jl<cls> $$2 = $$0.h();
      short $$3 = ke.b($$1);
      clq $$4 = (clq)this.b.get($$3);
      if ($$4 != null) {
         if ($$2.equals($$4.h())) {
            return false;
         }

         ag.b("POI data mismatch: already registered at " + $$1);
      }

      this.b.put($$3, $$0);
      this.c.computeIfAbsent($$2, $$0x -> Sets.newHashSet()).add($$0);
      return true;
   }

   public void a(jb $$0) {
      clq $$1 = (clq)this.b.remove(ke.b($$0));
      if ($$1 == null) {
         a.error("POI data mismatch: never registered at {}", $$0);
      } else {
         this.c.get($$1.h()).remove($$1);
         a.debug("Removed POI of type {} @ {}", LogUtils.defer($$1::h), LogUtils.defer($$1::g));
         this.d.run();
      }
   }

   @Deprecated
   @bdl
   public int b(jb $$0) {
      return this.e($$0).map(clq::b).orElse(0);
   }

   public boolean c(jb $$0) {
      clq $$1 = (clq)this.b.get(ke.b($$0));
      if ($$1 == null) {
         throw (IllegalStateException)ag.b(new IllegalStateException("POI never registered at " + $$0));
      } else {
         boolean $$2 = $$1.d();
         this.d.run();
         return $$2;
      }
   }

   public boolean a(jb $$0, Predicate<jl<cls>> $$1) {
      return this.d($$0).filter($$1).isPresent();
   }

   public Optional<jl<cls>> d(jb $$0) {
      return this.e($$0).map(clq::h);
   }

   private Optional<clq> e(jb $$0) {
      return Optional.ofNullable((clq)this.b.get(ke.b($$0)));
   }

   public void a(Consumer<BiConsumer<jb, jl<cls>>> $$0) {
      if (!this.e) {
         Short2ObjectMap<clq> $$1 = new Short2ObjectOpenHashMap(this.b);
         this.c();
         $$0.accept(($$1x, $$2) -> {
            short $$3 = ke.b($$1x);
            clq $$4 = (clq)$$1.computeIfAbsent($$3, $$2x -> new clq($$1x, $$2, this.d));
            this.a($$4);
         });
         this.e = true;
         this.d.run();
      }
   }

   private void c() {
      this.b.clear();
      this.c.clear();
   }

   boolean b() {
      return this.e;
   }

   public record a(boolean b, List<clq.a> c) {
      public static final Codec<clr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(Codec.BOOL.lenientOptionalFieldOf("Valid", false).forGetter(clr.a::a), clq.a.a.listOf().fieldOf("Records").forGetter(clr.a::b))
            .apply($$0, clr.a::new)
      );

      public clr a(Runnable $$0) {
         return new clr($$0, this.b, this.c.stream().map($$1 -> $$1.a($$0)).toList());
      }

      public boolean a() {
         return this.b;
      }

      public List<clq.a> b() {
         return this.c;
      }
   }
}
