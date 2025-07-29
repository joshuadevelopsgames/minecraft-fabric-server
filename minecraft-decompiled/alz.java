import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Decoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class alz {
   private static final Logger d = LogUtils.getLogger();
   private static final Comparator<amd<?>> e = Comparator.<amd<?>, ame>comparing(amd::b).thenComparing(amd::a);
   private static final jx f = new jx(Optional.empty(), Lifecycle.experimental());
   private static final Function<Optional<awv>, jx> g = ag.b($$0 -> {
      Lifecycle $$1 = $$0.<Boolean>map(awv::a).map($$0x -> Lifecycle.stable()).orElse(Lifecycle.experimental());
      return new jx($$0, $$1);
   });
   public static final List<alz.d<?>> a = List.of(
      new alz.d<>(mn.aU, ehy.h),
      new alz.d<>(mn.aK, dnx.a),
      new alz.d<>(mn.aM, xk.a),
      new alz.d<>(mn.aO, eme.a),
      new alz.d<>(mn.aP, ems.a),
      new alz.d<>(mn.bg, euc.a),
      new alz.d<>(mn.bj, euy.a),
      new alz.d<>(mn.bi, eve.a),
      new alz.d<>(mn.bh, eyz.c),
      new alz.d<>(mn.bk, ewi.a),
      new alz.d<>(mn.bc, ekf.a),
      new alz.d<>(mn.bd, ezo.a.a),
      new alz.d<>(mn.aS, ejt.b),
      new alz.d<>(mn.bt, eun.a),
      new alz.d<>(mn.aX, esz.a),
      new alz.d<>(mn.bq, dlk.a),
      new alz.d<>(mn.bp, dli.a),
      new alz.d<>(mn.bn, edd.b),
      new alz.d<>(mn.br, cpm.a, true),
      new alz.d<>(mn.bs, cpk.a, true),
      new alz.d<>(mn.bf, cnb.a, true),
      new alz.d<>(mn.aY, coe.a, true),
      new alz.d<>(mn.aL, cmh.a, true),
      new alz.d<>(mn.aQ, cmo.a, true),
      new alz.d<>(mn.aN, cmk.a, true),
      new alz.d<>(mn.be, cqv.a, true),
      new alz.d<>(mn.aR, byd.a),
      new alz.d<>(mn.bb, dol.a),
      new alz.d<>(mn.aJ, eao.a),
      new alz.d<>(mn.aW, dji.b),
      new alz.d<>(mn.aV, dkq.a),
      new alz.d<>(mn.ba, ddb.a),
      new alz.d<>(mn.aZ, dco.a),
      new alz.d<>(mn.bl, tu.a),
      new alz.d<>(mn.bm, ta.b),
      new alz.d<>(mn.aT, art.c)
   );
   public static final List<alz.d<?>> b = List.of(new alz.d<>(mn.bv, ehz.a));
   public static final List<alz.d<?>> c = List.of(
      new alz.d<>(mn.aK, dnx.b),
      new alz.d<>(mn.aM, xk.a),
      new alz.d<>(mn.bq, dlk.a),
      new alz.d<>(mn.bp, dli.a),
      new alz.d<>(mn.br, cpm.b, true),
      new alz.d<>(mn.bs, cpk.b, true),
      new alz.d<>(mn.bf, cnb.b, true),
      new alz.d<>(mn.aY, coe.b, true),
      new alz.d<>(mn.aL, cmh.b, true),
      new alz.d<>(mn.aQ, cmo.b, true),
      new alz.d<>(mn.aN, cmk.b, true),
      new alz.d<>(mn.be, cqv.a, true),
      new alz.d<>(mn.aU, ehy.h),
      new alz.d<>(mn.aR, byd.a),
      new alz.d<>(mn.aJ, eao.a),
      new alz.d<>(mn.aW, dji.b),
      new alz.d<>(mn.ba, ddb.a),
      new alz.d<>(mn.aZ, dco.a),
      new alz.d<>(mn.bl, tu.a),
      new alz.d<>(mn.bm, ta.b),
      new alz.d<>(mn.aT, art.c)
   );

   public static jz.b a(axo $$0, List<jn.b<?>> $$1, List<alz.d<?>> $$2) {
      return a(($$1x, $$2x) -> $$1x.a($$0, $$2x), $$1, $$2);
   }

   public static jz.b a(Map<amd<? extends jy<?>>, alz.c> $$0, axr $$1, List<jn.b<?>> $$2, List<alz.d<?>> $$3) {
      return a(($$2x, $$3x) -> $$2x.a($$0, $$1, $$3x), $$2, $$3);
   }

   private static jz.b a(alz.b $$0, List<jn.b<?>> $$1, List<alz.d<?>> $$2) {
      Map<amd<?>, Exception> $$3 = new HashMap<>();
      List<alz.a<?>> $$4 = $$2.stream().map($$1x -> $$1x.a(Lifecycle.stable(), $$3)).collect(Collectors.toUnmodifiableList());
      amc.c $$5 = a($$1, $$4);
      $$4.forEach($$2x -> $$0.apply($$2x, $$5));
      $$4.forEach($$1x -> {
         jy<?> $$2x = $$1x.b();

         try {
            $$2x.n();
         } catch (Exception var4x) {
            $$3.put($$2x.g(), var4x);
         }

         if ($$1x.a.c && $$2x.d() == 0) {
            $$3.put($$2x.g(), new IllegalStateException("Registry must be non-empty: " + $$2x.g().a()));
         }
      });
      if (!$$3.isEmpty()) {
         throw a($$3);
      } else {
         return new jz.c($$4.stream().map(alz.a::b).toList()).e();
      }
   }

   private static amc.c a(List<jn.b<?>> $$0, List<alz.a<?>> $$1) {
      final Map<amd<? extends jy<?>>, amc.b<?>> $$2 = new HashMap<>();
      $$0.forEach($$1x -> $$2.put($$1x.g(), a($$1x)));
      $$1.forEach($$1x -> $$2.put($$1x.b.g(), a($$1x.b)));
      return new amc.c() {
         @Override
         public <T> Optional<amc.b<T>> a(amd<? extends jy<? extends T>> $$0) {
            return Optional.ofNullable((amc.b<T>)$$2.get($$0));
         }
      };
   }

   private static <T> amc.b<T> a(kh<T> $$0) {
      return new amc.b<>($$0, $$0.p(), $$0.h());
   }

   private static <T> amc.b<T> a(jn.b<T> $$0) {
      return new amc.b<>($$0, $$0, $$0.h());
   }

   private static aa a(Map<amd<?>, Exception> $$0) {
      b($$0);
      return c($$0);
   }

   private static void b(Map<amd<?>, Exception> $$0) {
      StringWriter $$1 = new StringWriter();
      PrintWriter $$2 = new PrintWriter($$1);
      Map<ame, Map<ame, Exception>> $$3 = $$0.entrySet()
         .stream()
         .collect(Collectors.groupingBy($$0x -> ((amd)$$0x.getKey()).b(), Collectors.toMap($$0x -> ((amd)$$0x.getKey()).a(), Entry::getValue)));
      $$3.entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1x -> {
         $$2.printf("> Errors in registry %s:%n", $$1x.getKey());
         ((Map)$$1x.getValue()).entrySet().stream().sorted(Entry.comparingByKey()).forEach($$1xx -> {
            $$2.printf(">> Errors in element %s:%n", $$1xx.getKey());
            ((Exception)$$1xx.getValue()).printStackTrace($$2);
         });
      });
      $$2.flush();
      d.error("Registry loading errors:\n{}", $$1);
   }

   private static aa c(Map<amd<?>, Exception> $$0) {
      p $$1 = p.a(new IllegalStateException("Failed to load registries due to errors"), "Registry Loading");
      q $$2 = $$1.a("Loading info");
      $$2.a(
         "Errors",
         () -> {
            StringBuilder $$1x = new StringBuilder();
            $$0.entrySet()
               .stream()
               .sorted(Entry.comparingByKey(e))
               .forEach(
                  $$1xx -> $$1x.append("\n\t\t")
                     .append(((amd)$$1xx.getKey()).b())
                     .append("/")
                     .append(((amd)$$1xx.getKey()).a())
                     .append(": ")
                     .append(((Exception)$$1xx.getValue()).getMessage())
               );
            return $$1x.toString();
         }
      );
      return new aa($$1);
   }

   private static <E> void a(kh<E> $$0, Decoder<E> $$1, amc<JsonElement> $$2, amd<E> $$3, axm $$4, jx $$5) throws IOException {
      try (Reader $$6 = $$4.e()) {
         JsonElement $$7 = bcy.a($$6);
         DataResult<E> $$8 = $$1.parse($$2, $$7);
         E $$9 = (E)$$8.getOrThrow();
         $$0.a($$3, $$9, $$5);
      }
   }

   static <E> void a(axo $$0, amc.c $$1, kh<E> $$2, Decoder<E> $$3, Map<amd<?>, Exception> $$4) {
      alx $$5 = alx.a($$2.g());
      amc<JsonElement> $$6 = amc.a(JsonOps.INSTANCE, $$1);

      for (Entry<ame, axm> $$7 : $$5.a($$0).entrySet()) {
         ame $$8 = $$7.getKey();
         amd<E> $$9 = amd.a($$2.g(), $$5.b($$8));
         axm $$10 = $$7.getValue();
         jx $$11 = g.apply($$10.c());

         try {
            a($$2, $$3, $$6, $$9, $$10, $$11);
         } catch (Exception var14) {
            $$4.put($$9, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse %s from pack %s", $$8, $$10.b()), var14));
         }
      }

      baf.a($$0, $$2);
   }

   static <E> void a(Map<amd<? extends jy<?>>, alz.c> $$0, axr $$1, amc.c $$2, kh<E> $$3, Decoder<E> $$4, Map<amd<?>, Exception> $$5) {
      alz.c $$6 = $$0.get($$3.g());
      if ($$6 != null) {
         amc<vi> $$7 = amc.a(uw.a, $$2);
         amc<JsonElement> $$8 = amc.a(JsonOps.INSTANCE, $$2);
         alx $$9 = alx.a($$3.g());

         for (kc.a $$10 : $$6.a) {
            amd<E> $$11 = amd.a($$3.g(), $$10.a());
            Optional<vi> $$12 = $$10.b();
            if ($$12.isPresent()) {
               try {
                  DataResult<E> $$13 = $$4.parse($$7, $$12.get());
                  E $$14 = (E)$$13.getOrThrow();
                  $$3.a($$11, $$14, f);
               } catch (Exception var16) {
                  $$5.put($$11, new IllegalStateException(String.format(Locale.ROOT, "Failed to parse value %s from server", $$12.get()), var16));
               }
            } else {
               ame $$16 = $$9.a($$10.a());

               try {
                  axm $$17 = $$1.getResourceOrThrow($$16);
                  a($$3, $$4, $$8, $$11, $$17, f);
               } catch (Exception var17) {
                  $$5.put($$11, new IllegalStateException("Failed to parse local data", var17));
               }
            }
         }

         baf.a($$6.b, $$3);
      }
   }

   record a<T>(alz.d<T> a, kh<T> b, Map<amd<?>, Exception> c) {

      public void a(axo $$0, amc.c $$1) {
         alz.a($$0, $$1, this.b, this.a.b, this.c);
      }

      public void a(Map<amd<? extends jy<?>>, alz.c> $$0, axr $$1, amc.c $$2) {
         alz.a($$0, $$1, $$2, this.b, this.a.b, this.c);
      }
   }

   @FunctionalInterface
   interface b {
      void apply(alz.a<?> var1, amc.c var2);
   }

   public record c(List<kc.a> a, bag.a b) {
   }

   public record d<T>(amd<? extends jy<T>> a, Codec<T> b, boolean c) {

      d(amd<? extends jy<T>> $$0, Codec<T> $$1) {
         this($$0, $$1, false);
      }

      alz.a<T> a(Lifecycle $$0, Map<amd<?>, Exception> $$1) {
         kh<T> $$2 = new jt<>(this.a, $$0);
         return new alz.a<>(this, $$2, $$1);
      }

      public void a(BiConsumer<amd<? extends jy<T>>, Codec<T>> $$0) {
         $$0.accept(this.a, this.b);
      }
   }
}
